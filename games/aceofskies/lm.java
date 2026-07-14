/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    private tl field_d;
    static byte[][][] field_c;
    private tl field_a;
    static String field_b;
    private ti field_e;

    final void a(bf param0, int param1) {
        boolean discarded$8 = ((lm) this).field_d.a(24, -116, 786336);
        if (param1 != 0) {
            ((lm) this).field_e = (ti) null;
        }
    }

    final static String a(char param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        var5 = -14 / ((param1 - -78) / 42);
        var4 = param2.length();
        var6 = param3.length();
        var7 = var4;
        var8 = var6 + -1;
        if (var8 != 0) {
          var9_int = 0;
          L0: while (true) {
            var9_int = param2.indexOf((int) param0, var9_int);
            if (0 <= var9_int) {
              var9_int++;
              var7 = var7 + var8;
              continue L0;
            } else {
              var14 = new StringBuilder(var7);
              var9 = var14;
              var10 = 0;
              L1: while (true) {
                var11 = param2.indexOf((int) param0, var10);
                if ((var11 ^ -1) > -1) {
                  StringBuilder discarded$6 = var14.append(param2.substring(var10));
                  return var14.toString();
                } else {
                  StringBuilder discarded$7 = var14.append(param2.substring(var10, var11));
                  var10 = var11 + 1;
                  StringBuilder discarded$8 = var14.append(param3);
                  continue L1;
                }
              }
            }
          }
        } else {
          var13 = new StringBuilder(var7);
          var10 = 0;
          L2: while (true) {
            var11 = param2.indexOf((int) param0, var10);
            if ((var11 ^ -1) > -1) {
              StringBuilder discarded$9 = var13.append(param2.substring(var10));
              return var13.toString();
            } else {
              StringBuilder discarded$10 = var13.append(param2.substring(var10, var11));
              var10 = var11 + 1;
              StringBuilder discarded$11 = var13.append(param3);
              continue L2;
            }
          }
        }
    }

    final static void a(int param0, ap param1, boolean param2, byte param3) {
        int var4 = 65 / ((56 - param3) / 36);
        wt.field_e.a((byte) -62, param0, !param2 ? true : false, 256, param1, 1000000);
    }

    public static void b(int param0) {
        if (param0 != -8192) {
            lm.b(63);
            field_b = null;
            field_c = (byte[][][]) null;
            return;
        }
        field_b = null;
        field_c = (byte[][][]) null;
    }

    final void a(int param0) {
        ((lm) this).field_d.a(4665);
        if (param0 < 120) {
            ap var3 = (ap) null;
            lm.a(-96, (ap) null, true, (byte) 114);
        }
    }

    lm(bf param0) {
        int var4 = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var10 = null;
        jaclib.memory.Stream var11 = null;
        jaclib.memory.Buffer var12 = null;
        jaclib.memory.Stream var13 = null;
        L0: {
          fa discarded$8 = param0.a(new pl[2], -127);
          ((lm) this).field_d = param0.a(true, (byte) 101);
          ((lm) this).field_a = param0.a(false, (byte) 81);
          boolean discarded$9 = ((lm) this).field_a.a(12, -126, 393168);
          ((lm) this).field_e = param0.c(false, 8762);
          ((lm) this).field_e.a(-12880, 49146);
          var7 = ((lm) this).field_e.a(true, 32570);
          if (var7 == null) {
            break L0;
          } else {
            var8 = param0.a(86, var7);
            if (!jaclib.memory.Stream.b()) {
              var4 = 0;
              L1: while (true) {
                if (-8192 >= (var4 ^ -1)) {
                  var8.a();
                  boolean discarded$10 = ((lm) this).field_e.a((byte) 33);
                  break L0;
                } else {
                  var5 = 4 * var4;
                  var8.b(var5);
                  var8.b(1 + var5);
                  var8.b(var5 + 2);
                  var8.b(var5 + 2);
                  var8.b(var5 + 3);
                  var8.b(var5);
                  var4++;
                  continue L1;
                }
              }
            } else {
              var4 = 0;
              L2: while (true) {
                if (8191 <= var4) {
                  var8.a();
                  boolean discarded$11 = ((lm) this).field_e.a((byte) 33);
                  var10 = ((lm) this).field_a.a(true, (byte) -87);
                  if (var10 == null) {
                  } else {
                    var11 = param0.a(-115, var10);
                    if (jaclib.memory.Stream.b()) {
                      var5 = 0;
                      L3: while (true) {
                        if (8191 <= var5) {
                          var11.a();
                          boolean discarded$12 = ((lm) this).field_a.a((byte) -60);
                        } else {
                          var11.b(0.0f);
                          var11.b(-1.0f);
                          var11.b(0.0f);
                          var11.b(0.0f);
                          var11.b(-1.0f);
                          var11.b(0.0f);
                          var11.b(0.0f);
                          var11.b(-1.0f);
                          var11.b(0.0f);
                          var11.b(0.0f);
                          var11.b(-1.0f);
                          var11.b(0.0f);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      var5 = 0;
                      L4: while (true) {
                        if (-8192 >= (var5 ^ -1)) {
                          var11.a();
                          boolean discarded$13 = ((lm) this).field_a.a((byte) -60);
                        } else {
                          var11.a(0.0f);
                          var11.a(-1.0f);
                          var11.a(0.0f);
                          var11.a(0.0f);
                          var11.a(-1.0f);
                          var11.a(0.0f);
                          var11.a(0.0f);
                          var11.a(-1.0f);
                          var11.a(0.0f);
                          var11.a(0.0f);
                          var11.a(-1.0f);
                          var11.a(0.0f);
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var5 = 4 * var4;
                  var8.a(var5);
                  var8.a(1 + var5);
                  var8.a(2 + var5);
                  var8.a(2 + var5);
                  var8.a(var5 - -3);
                  var8.a(var5);
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        var12 = ((lm) this).field_a.a(true, (byte) -87);
        if (var12 == null) {
        } else {
          var13 = param0.a(-115, var12);
          if (jaclib.memory.Stream.b()) {
            var5 = 0;
            L5: while (true) {
              if (8191 <= var5) {
                var13.a();
                boolean discarded$14 = ((lm) this).field_a.a((byte) -60);
              } else {
                var13.b(0.0f);
                var13.b(-1.0f);
                var13.b(0.0f);
                var13.b(0.0f);
                var13.b(-1.0f);
                var13.b(0.0f);
                var13.b(0.0f);
                var13.b(-1.0f);
                var13.b(0.0f);
                var13.b(0.0f);
                var13.b(-1.0f);
                var13.b(0.0f);
                var5++;
                continue L5;
              }
            }
          } else {
            var5 = 0;
            L6: while (true) {
              if (-8192 >= (var5 ^ -1)) {
                var13.a();
                boolean discarded$15 = ((lm) this).field_a.a((byte) -60);
              } else {
                var13.a(0.0f);
                var13.a(-1.0f);
                var13.a(0.0f);
                var13.a(0.0f);
                var13.a(-1.0f);
                var13.a(0.0f);
                var13.a(0.0f);
                var13.a(-1.0f);
                var13.a(0.0f);
                var13.a(0.0f);
                var13.a(-1.0f);
                var13.a(0.0f);
                var5++;
                continue L6;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading graphics";
    }
}
