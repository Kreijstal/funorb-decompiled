/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class glb {
    private mkb field_b;
    static String[] field_c;
    static String field_a;

    final static void c(int param0) {
        RuntimeException var1 = null;
        qw var1_ref = null;
        nl var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 17043) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (ms.field_y == null) {
                break L2;
              } else {
                if (ms.field_y.b(-42)) {
                  break L2;
                } else {
                  var1_ref = (qw) ((Object) ms.field_y.d(0));
                  L3: while (true) {
                    if (var1_ref == null) {
                      break L2;
                    } else {
                      L4: {
                        if (!var1_ref.field_k.b((byte) -63)) {
                          var1_ref.b(-3846);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var1_ref = (qw) ((Object) ms.field_y.a((byte) 77));
                      continue L3;
                    }
                  }
                }
              }
            }
            L5: {
              if (null == gtb.field_d) {
                break L5;
              } else {
                if (!gtb.field_d.b(-74)) {
                  var1_ref2 = (nl) ((Object) gtb.field_d.d(0));
                  L6: while (true) {
                    if (var1_ref2 == null) {
                      break L5;
                    } else {
                      L7: {
                        if (!var1_ref2.field_h) {
                          nmb.a((byte) -91, var1_ref2.field_d);
                          var1_ref2.b(param0 ^ -19863);
                          break L7;
                        } else {
                          L8: {
                            if (!var1_ref2.field_g) {
                              break L8;
                            } else {
                              var2 = uv.a(param0 + -16915, var1_ref2.field_i);
                              var3 = pja.b((byte) 119, var1_ref2.field_i, var1_ref2.field_f);
                              var1_ref2.field_d.a(param0 ^ 16915, var3, var2);
                              break L8;
                            }
                          }
                          var1_ref2.field_h = false;
                          break L7;
                        }
                      }
                      var1_ref2 = (nl) ((Object) gtb.field_d.a((byte) 12));
                      continue L6;
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
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "glb.C(" + param0 + ')');
        }
    }

    glb(boolean param0) {
    }

    final void a(int param0) {
        L0: {
          if (null != this.field_b) {
            this.field_b.a(param0 + -26459);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 26363) {
          field_a = (String) null;
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -17471) {
            glb.c(99);
        }
    }

    static {
        field_c = new String[]{"Blue", "Yellow", "Neutral"};
        field_a = "Spectate";
    }
}
