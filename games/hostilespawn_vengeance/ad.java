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
                field_c = (String) null;
            }
            ui.a(0, param0, (byte) 90, 0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ad.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        int var4 = 0;
        oj var5 = null;
        int var6 = 0;
        bd stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        bd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = 0;
            L1: while (true) {
              if (var4 >= rc.field_e) {
                L2: {
                  if (param0 == -118) {
                    break L2;
                  } else {
                    ad.a(-64);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = re.field_n[var4];
                if (var5.field_i != 4) {
                  if (24 != var5.field_i) {
                    L3: {
                      if (var5.field_b) {
                        stackIn_11_0 = var5.g(-28);
                        break L3;
                      } else {
                        stackIn_11_0 = null;
                        break L3;
                      }
                    }
                    var1 = stackIn_11_0;
                    if (var1 != null) {
                      var2 = var5.f((byte) 109);
                      var3 = var5.f(-102);
                      if (95 >= (var2 ^ -1)) {
                        if (-96 <= var3) {
                          if (-737 <= (var2 ^ -1)) {
                            L4: {
                              if (576 >= var3) {
                                L5: {
                                  if (-4 != (var5.field_i ^ -1)) {
                                    var3 -= 12;
                                    var2 -= 12;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                gl.a(var2 << -524928508, var3 << 752954404, 384, 128, ni.field_c);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var4++;
                            continue L1;
                          } else {
                            var4++;
                            continue L1;
                          }
                        } else {
                          var4++;
                          continue L1;
                        }
                      } else {
                        var4++;
                        continue L1;
                      }
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "ad.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -24221) {
            field_c = (String) null;
        }
        field_c = null;
    }

    private final static void b(int param0) {
        if (param0 != 95) {
            field_d = (String) null;
        }
    }

    static {
        field_c = null;
        field_d = "CONSOLE";
    }
}
