/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gma {
    private jagdx.IDirect3DSurface field_c;
    private jagdx.IDirect3DSwapChain field_a;
    private jagdx.IDirect3DSurface field_b;

    final boolean a(byte param0) {
        int var2 = 120 / ((65 - param0) / 53);
        return ((gma) this).field_a != null ? true : false;
    }

    final void a(int param0) {
        L0: {
          if (((gma) this).field_c != null) {
            ((gma) this).field_c = null;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null != ((gma) this).field_b) {
            ((gma) this).field_b = null;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((gma) this).field_a != null) {
            ((gma) this).field_a = null;
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 > -36) {
          ((gma) this).field_b = null;
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0, int param1) {
        Object var4 = null;
        if (param0) {
          var4 = null;
          ((gma) this).a(-87, (jagdx.IDirect3DSwapChain) null, (jagdx.IDirect3DSurface) null);
          return ((gma) this).field_a.Present(param1);
        } else {
          return ((gma) this).field_a.Present(param1);
        }
    }

    final void a(int param0, jagdx.IDirect3DSwapChain param1, jagdx.IDirect3DSurface param2) {
        ((gma) this).field_a = param1;
        ((gma) this).field_b = param2;
        ((gma) this).field_c = ((gma) this).field_a.a(0, param0);
    }

    gma(jagdx.IDirect3DSwapChain param0, jagdx.IDirect3DSurface param1) {
        ((gma) this).a(0, param0, param1);
    }
}
