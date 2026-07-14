/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static int field_a;
    static String field_c;
    static String field_b;
    static String field_d;

    final static void a(java.awt.Canvas param0, boolean param1) {
        if (!(fa.field_c != 11)) {
            ad.b(95);
        }
        km.a(wi.field_c, tf.field_d, bl.field_f, (byte) 125);
        if (param1) {
            field_c = null;
        }
        ui.a(0, param0, (byte) 90, 0);
    }

    final static void a(byte param0) {
        bd var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        int var6 = 0;
        bd stackIn_9_0 = null;
        bd stackOut_8_0 = null;
        Object stackOut_7_0 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= rc.field_e) {
            L1: {
              if (param0 == -118) {
                break L1;
              } else {
                ad.a(-64);
                break L1;
              }
            }
            return;
          } else {
            var5 = re.field_n[var4];
            if (var5.field_i != 4) {
              if (24 != var5.field_i) {
                L2: {
                  if (var5.field_b) {
                    stackOut_8_0 = var5.g(-28);
                    stackIn_9_0 = stackOut_8_0;
                    break L2;
                  } else {
                    stackOut_7_0 = null;
                    stackIn_9_0 = (bd) (Object) stackOut_7_0;
                    break L2;
                  }
                }
                var1 = stackIn_9_0;
                if (var1 != null) {
                  var2 = var5.f((byte) 109);
                  var3 = var5.f(-102);
                  if (95 >= var2) {
                    if (-96 <= var3) {
                      if (-737 >= var2) {
                        if (576 >= var3) {
                          L3: {
                            if (-4 != (var5.field_i ^ -1)) {
                              var3 -= 12;
                              var2 -= 12;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          gl.a(var2 << -524928508, var3 << 752954404, 384, 128, ni.field_c);
                          var4++;
                          continue L0;
                        } else {
                          var4++;
                          continue L0;
                        }
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -24221) {
            field_c = null;
        }
        field_c = null;
    }

    private final static void b(int param0) {
        if (param0 != 95) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_d = "CONSOLE";
    }
}
