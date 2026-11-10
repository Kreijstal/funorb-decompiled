/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Path extends IntrusiveDeque {
    static long field_e;
    int field_g;
    static int field_f;

    final static void showLoginResponse(int param0, int param1, String param2) {
        int var3_int = 0;
        try {
          if (param0 != 10) {
            String var4 = (String) null;
            Path.showLoginResponse(24, 51, (String) null);
          }
          ce.field_q = false;
          mp.field_e = false;
          if (Point.field_i != null) {
            if (!Point.field_i.field_H) {
              return;
            }
            if (param1 == 8) {
              param1 = 2;
              if (nm.field_c) {
                param2 = tl.field_e;
              } else {
                param2 = fl.field_b;
              }
              he.field_a.setAccountAndClearPassword(GameLoopApplet.field_B, 20);
            }
            var3_int = 1;
            if (param1 == 10) {
              var3_int = 0;
              jp.showChooseNameDialog((byte) -70);
            }
            if (var3_int != 0) {
              if (mp.field_e) {
                param2 = s.a(1938762664, nd.field_e, new String[]{param2});
              }
              if (pk.field_J) {
                param2 = fe.field_L;
              }
              Point.field_i.showResultMessage(param2, param1, param0 ^ 27);
            }
            if (param1 != 256) {
              if (param1 == 10) {
                return;
              }
              if (!nm.field_c) {
                he.field_a.clearInputs(-123);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "qh.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    Path() {
    }

    final static void showLoadingProgress(float param0, String param1, byte param2, boolean param3) {
        if (null == vi.field_c) {
          vi.field_c = new sa(e.field_S, ed.field_c);
          e.field_S.addDialog(vi.field_c, true);
        }
        vi.field_c.setProgress(param3, param0, (byte) -97, param1);
        if (param2 >= -18) {
          return;
        }
        try {
          Rasterizer.clear();
          rc.a(true, (byte) -63);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "qh.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
