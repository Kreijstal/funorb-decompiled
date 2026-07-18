/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pb extends rc {
    static tf field_t;
    volatile boolean field_u;
    boolean field_q;
    static String field_o;
    static int field_r;
    static long[] field_p;
    static String field_v;
    boolean field_n;
    static int[] field_m;
    static float field_s;

    final static void a(int param0, java.awt.Color param1, boolean param2, boolean param3, String param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          try {
            L0: {
              L1: {
                var9 = f.field_kb.getGraphics();
                if (null != hh.field_a) {
                  break L1;
                } else {
                  hh.field_a = new java.awt.Font("Helvetica", 1, 13);
                  break L1;
                }
              }
              L2: {
                if (!param2) {
                  break L2;
                } else {
                  var9.setColor(java.awt.Color.black);
                  var9.fillRect(0, 0, kh.field_d, ok.field_c);
                  break L2;
                }
              }
              L3: {
                if (param1 != null) {
                  break L3;
                } else {
                  param1 = new java.awt.Color(140, 17, 17);
                  break L3;
                }
              }
              try {
                L4: {
                  L5: {
                    if (null == ff.field_a) {
                      ff.field_a = f.field_kb.createImage(304, 34);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var10 = ff.field_a.getGraphics();
                  var10.setColor(param1);
                  var10.drawRect(0, 0, 303, 33);
                  var10.fillRect(2, 2, 3 * param0, 30);
                  var10.setColor(java.awt.Color.black);
                  var10.drawRect(1, 1, 301, 31);
                  var10.fillRect(3 * param0 + 2, 2, 300 + -(3 * param0), 30);
                  var10.setFont(hh.field_a);
                  var10.setColor(java.awt.Color.white);
                  var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
                  boolean discarded$1 = var9.drawImage(ff.field_a, kh.field_d / 2 - 152, ok.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
                  break L4;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L6: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  var7 = kh.field_d / 2 + -152;
                  var8 = ok.field_c / 2 + -18;
                  var9.setColor(param1);
                  var9.drawRect(var7, var8, 303, 33);
                  var9.fillRect(var7 + 2, 2 + var8, 3 * param0, 30);
                  var9.setColor(java.awt.Color.black);
                  var9.drawRect(1 + var7, 1 + var8, 301, 31);
                  var9.fillRect(param0 * 3 + (2 + var7), 2 + var8, -(param0 * 3) + 300, 30);
                  var9.setFont(hh.field_a);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(param4, (-(6 * param4.length()) + 304) / 2 + var7, 22 + var8);
                  break L6;
                }
              }
              if (wh.field_q == null) {
                break L0;
              } else {
                var9.setFont(hh.field_a);
                var9.setColor(java.awt.Color.white);
                var9.drawString(wh.field_q, kh.field_d / 2 + -(6 * wh.field_q.length() / 2), -26 + ok.field_c / 2);
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            f.field_kb.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("pb.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',').append(false).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    abstract byte[] e(int param0);

    public static void f(int param0) {
        field_o = null;
        field_t = null;
        field_p = null;
        field_m = null;
        field_v = null;
    }

    abstract int g(int param0);

    pb() {
        ((pb) this).field_u = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new tf();
        field_o = "Type your age in years";
        field_m = new int[256];
        field_v = "Accept";
        field_p = new long[32];
    }
}
