/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static int field_a;
    static String field_c;
    static String field_b;
    static String field_d;

    final static void a(java.awt.Canvas param0, boolean param1) {
        try {
            if (!(fa.field_c != 11)) {
                ad.b(95);
            }
            km.a(wi.field_c, tf.field_d, bl.field_f, (byte) 125);
            if (param1) {
                field_c = null;
            }
            ui.a(0, param0, (byte) 90, 0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ad.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        bd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        int var6 = 0;
        bd stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = 0;
            L1: while (true) {
              if (var4 >= rc.field_e) {
                break L0;
              } else {
                L2: {
                  var5 = re.field_n[var4];
                  if (var5.field_i == 4) {
                    break L2;
                  } else {
                    if (24 == var5.field_i) {
                      break L2;
                    } else {
                      L3: {
                        if (var5.field_b) {
                          stackOut_7_0 = var5.g(-28);
                          stackIn_8_0 = stackOut_7_0;
                          break L3;
                        } else {
                          stackOut_6_0 = null;
                          stackIn_8_0 = (bd) (Object) stackOut_6_0;
                          break L3;
                        }
                      }
                      var1 = stackIn_8_0;
                      if (var1 == null) {
                        break L2;
                      } else {
                        var2 = var5.f((byte) 109);
                        var3 = var5.f(-102);
                        if (var2 < -96) {
                          break L2;
                        } else {
                          if (-96 > var3) {
                            break L2;
                          } else {
                            if (var2 > 736) {
                              break L2;
                            } else {
                              if (576 >= var3) {
                                L4: {
                                  if (var5.field_i != 3) {
                                    var3 -= 12;
                                    var2 -= 12;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                gl.a(var2 << 4, var3 << 4, 384, 128, ni.field_c);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1_ref, "ad.D(" + -118 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
    }

    private final static void b(int param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_d = "CONSOLE";
    }
}
