/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.yilin.xbr.xbr_gaode_navi_amap;
// Declare any non-default types here with import statements

public interface ILocationServiceAIDL extends android.os.IInterface
{
  /** Default implementation for ILocationServiceAIDL. */
  public static class Default implements ILocationServiceAIDL
  {
    /** hook when other service has already binded on it */
    @Override public void onFinishBind() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements ILocationServiceAIDL
  {
    private static final String DESCRIPTOR = "com.yilin.xbr.xbr_gaode_navi_amap.ILocationServiceAIDL";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.yilin.xbr.xbr_gaode_navi_amap.ILocationServiceAIDL interface,
     * generating a proxy if needed.
     */
    public static ILocationServiceAIDL asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof ILocationServiceAIDL))) {
        return ((ILocationServiceAIDL)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onFinishBind:
        {
          data.enforceInterface(descriptor);
          this.onFinishBind();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements ILocationServiceAIDL
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /** hook when other service has already binded on it */
      @Override public void onFinishBind() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFinishBind, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onFinishBind();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static ILocationServiceAIDL sDefaultImpl;
    }
    static final int TRANSACTION_onFinishBind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(ILocationServiceAIDL impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static ILocationServiceAIDL getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  /** hook when other service has already binded on it */
  public void onFinishBind() throws android.os.RemoteException;
}
