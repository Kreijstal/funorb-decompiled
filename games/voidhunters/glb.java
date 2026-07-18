/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class glb {
    private mkb field_b;
    static String[] field_c;
    static String field_a;

    final static void c(int param0) {
        qw var1 = null;
        nl var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (ms.field_y == null) {
                break L1;
              } else {
                if (ms.field_y.b(-42)) {
                  break L1;
                } else {
                  var1 = (qw) (Object) ms.field_y.d(0);
                  L2: while (true) {
                    if (var1 == null) {
                      break L1;
                    } else {
                      L3: {
                        if (!var1.field_k.b((byte) -63)) {
                          var1.b(-3846);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var1 = (qw) (Object) ms.field_y.a((byte) 77);
                      continue L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (null == gtb.field_d) {
                break L4;
              } else {
                if (!gtb.field_d.b(-74)) {
                  var1_ref = (nl) (Object) gtb.field_d.d(0);
                  L5: while (true) {
                    if (var1_ref == null) {
                      break L4;
                    } else {
                      L6: {
                        if (!var1_ref.field_h) {
                          nmb.a((byte) -91, var1_ref.field_d);
                          var1_ref.b(-3846);
                          break L6;
                        } else {
                          L7: {
                            if (!var1_ref.field_g) {
                              break L7;
                            } else {
                              var2 = uv.a(128, var1_ref.field_i);
                              var3 = pja.b((byte) 119, var1_ref.field_i, var1_ref.field_f);
                              var1_ref.field_d.a(128, var3, var2);
                              break L7;
                            }
                          }
                          var1_ref.field_h = false;
                          break L6;
                        }
                      }
                      var1_ref = (nl) (Object) gtb.field_d.a((byte) 12);
                      continue L5;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1_ref2, "glb.C(" + 17043 + ')');
        }
    }

    glb(boolean param0) {
    }

    final void a(int param0) {
        L0: {
          if (null != ((glb) this).field_b) {
            ((glb) this).field_b.a(param0 + -26459);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 26363) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Blue", "Yellow", "Neutral"};
        field_a = "Spectate";
    }
}
