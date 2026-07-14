/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    private jagdx.IDirect3DSurface field_a;
    private jagdx.IDirect3DSwapChain field_b;
    private jagdx.IDirect3DSurface field_c;

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((cb) this).field_b != null ? true : false;
    }

    final void a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = 96 / ((param0 - -21) / 54);
          if (null != ((cb) this).field_a) {
            ((cb) this).field_a = null;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((cb) this).field_c != null) {
            ((cb) this).field_c = null;
            break L1;
          } else {
            break L1;
          }
        }
        if (((cb) this).field_b != null) {
          ((cb) this).field_b = null;
          return;
        } else {
          return;
        }
    }

    final void a(jagdx.IDirect3DSurface param0, jagdx.IDirect3DSwapChain param1, int param2) {
        ((cb) this).field_b = param1;
        ((cb) this).field_c = param0;
        ((cb) this).field_a = ((cb) this).field_b.a(0, param2);
    }

    final int a(int param0, int param1) {
        if (param1 > -77) {
            return -97;
        }
        return ((cb) this).field_b.Present(param0);
    }

    cb(jagdx.IDirect3DSwapChain param0, jagdx.IDirect3DSurface param1) {
        ((cb) this).a(param1, param0, 0);
    }
}
