/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_b;
    static hb[] field_e;
    static String field_c;
    static int field_d;
    static int field_a;

    final static void a(int param0, byte param1) {
        hf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_18_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_17_0 = false;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            ck.field_f = param0;
            if (param1 < -114) {
              var2 = (hf) ((Object) ba.field_b.b((byte) 117));
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var2 == null) {
                        break L4;
                      } else {
                        stackOut_5_0 = var2.field_f.b(true);
                        stackIn_18_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var3 != 0) {
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (stackIn_18_0) {
                                  break L7;
                                } else {
                                  var2.b(57);
                                  if (var3 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var2.field_h.g(128 + var2.field_j * ck.field_f >> 1257608904);
                              break L6;
                            }
                            var2 = (hf) ((Object) bg.field_a.d(853));
                            if (var2 == null) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                stackOut_17_0 = var2.field_f.b(true);
                                stackIn_18_0 = stackOut_17_0;
                                continue L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                        } else {
                          L8: {
                            if (!stackIn_6_0) {
                              var2.b(57);
                              break L8;
                            } else {
                              var2.field_h.g(128 + ck.field_f * var2.field_j >> 302902376);
                              if (var3 == 0) {
                                break L8;
                              } else {
                                var2.b(57);
                                break L8;
                              }
                            }
                          }
                          var2 = (hf) ((Object) ba.field_b.d(853));
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (null == bg.field_a) {
                      break L2;
                    } else {
                      var2 = (hf) ((Object) bg.field_a.b((byte) 116));
                      L9: while (true) {
                        if (var2 == null) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            stackOut_17_0 = var2.field_f.b(true);
                            stackIn_18_0 = stackOut_17_0;
                            L10: {
                              L11: {
                                if (stackIn_18_0) {
                                  break L11;
                                } else {
                                  var2.b(57);
                                  if (var3 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var2.field_h.g(128 + var2.field_j * ck.field_f >> 1257608904);
                              break L10;
                            }
                            var2 = (hf) ((Object) bg.field_a.d(853));
                            continue L9;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "ce.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            return;
        }
        field_e = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        int var1 = 105 / ((52 - param0) / 61);
        if (tf.field_c == -1) {
            if (!(va.a(true, 1))) {
                return false;
            }
            tf.field_c = cd.field_t.b((byte) 90);
            cd.field_t.field_i = 0;
        }
        if (!((tf.field_c ^ -1) != 1)) {
            if (va.a(true, 2)) {
                tf.field_c = cd.field_t.j(98203176);
                cd.field_t.field_i = 0;
                return va.a(true, tf.field_c);
            }
            return false;
        }
        return va.a(true, tf.field_c);
    }

    static {
        int var0 = 0;
        field_e = new hb[255];
        field_b = "Your email address is used to identify this account";
        field_c = null;
        for (var0 = 0; field_e.length > var0; var0++) {
            field_e[var0] = new hb();
        }
        field_d = -1;
    }
}
