/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends jj {
    private int field_m;
    private bb field_n;
    static String field_o;
    static boolean[] field_p;

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param0 != 6388) {
            return -3;
        }
        return jg.l(72);
    }

    public static void b(byte param0) {
        field_o = null;
        field_p = null;
        int var1 = -88 % ((param0 - 59) / 34);
    }

    final void a(boolean param0) {
        int var3;
        jn var4;
        var3 = Pixelate.field_H ? 1 : 0;
        t.d(0, 0, 640, 480, 12632256);
        if (param0) {
          return;
        } else {
          var4 = (jn) ((Object) this.field_n.c(1504642273));
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              sn.a(var4, 1183261192);
              var4 = (jn) ((Object) this.field_n.f(1504642273));
              continue L0;
            }
          }
        }
    }

    final void c(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        jn var2;
        int var3;
        int var4;
        jn stackIn_7_0 = null;
        jn stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        jn stackIn_10_0 = null;
        jn stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        super.c(-1);
        var2 = (jn) ((Object) this.field_n.c(1504642273));
        L0: while (true) {
          if (var2 == null) {
            fieldTemp$2 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if ((fieldTemp$2 ^ -1) <= param0) {
              return;
            } else {
              this.field_n.a(22125, new jn(od.a((byte) 41, 189440, -25600), -25600));
              this.field_m = od.a((byte) 41, 75, 25);
              return;
            }
          } else {
            L1: {
              var2.field_l = var2.field_l + var2.field_s;
              var2.field_r = var2.field_r + var2.field_y;
              fieldTemp$3 = var2.field_x + 1;
              var2.field_x = var2.field_x + 1;
              if (var2.field_w > fieldTemp$3) {
                break L1;
              } else {
                L2: {
                  var2.field_x = 0;
                  var3 = ii.c(5, (byte) -120);
                  stackIn_7_0 = (jn) (var2);

                  if (var3 != var2.field_n) {
                    stackIn_8_0 = (jn) ((Object) stackIn_7_0);
                    stackIn_8_1 = var3;
                    break L2;
                  } else {
                    stackIn_8_0 = (jn) ((Object) stackIn_7_0);
                    stackIn_8_1 = 5;
                    break L2;
                  }
                }
                L3: {
                  stackIn_8_0.field_n = stackIn_8_1;
                  stackIn_10_0 = (jn) (var2);

                  if (Math.random() >= 0.5) {
                    stackIn_11_0 = (jn) ((Object) stackIn_10_0);
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = (jn) ((Object) stackIn_10_0);
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
                stackIn_11_0.field_k = stackIn_11_1 != 0;
                break L1;
              }
            }
            L4: {
              if (-148481 > (var2.field_r ^ -1)) {
                var2.c(2779);
                break L4;
              } else {
                break L4;
              }
            }
            var2 = (jn) ((Object) this.field_n.f(param0 + 1504642274));
            continue L0;
          }
        }
    }

    qi(String param0, tf[] param1) {
        super(param0, param1);
        int var3_int = 0;
        try {
            this.field_n = new bb();
            for (var3_int = 0; 5 > var3_int; var3_int++) {
                this.field_n.a(22125, new jn(od.a((byte) 41, 189440, -25600), od.a((byte) 41, 148480, -25600)));
            }
            this.field_m = od.a((byte) 41, 75, 25);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "This game option has not yet been unlocked for use.";
        field_p = new boolean[]{false, false, true, true, true, true, true, true, true, true, true, false, true, true, true, true, false, true, false, false, false, false};
    }
}
