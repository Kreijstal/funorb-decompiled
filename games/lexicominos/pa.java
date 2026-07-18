/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static db field_a;
    static int field_d;
    static String field_c;
    static String field_b;

    final static boolean a(int param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 != (-param0 & param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "pa.A(" + param0 + ',' + 65 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void b(int param0) {
        try {
            field_a = null;
            field_c = null;
            field_b = null;
            if (param0 != 2) {
                field_d = -126;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "pa.C(" + param0 + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        th var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        hc var5 = null;
        String var5_ref = null;
        String var6 = null;
        hc var6_ref = null;
        String var7 = null;
        hc var7_ref = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var1_ref = ig.field_a;
            var2 = var1_ref.d(true);
            if (var2 != 0) {
              if (var2 != 1) {
                if (2 == var2) {
                  L1: {
                    if (1 != vl.field_b) {
                      break L1;
                    } else {
                      vl.field_b = 2;
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (var2 != 3) {
                    if (4 == var2) {
                      vl.field_b = 1;
                      var3 = var1_ref.c(false);
                      ji.field_b = var3.intern();
                      var4 = var1_ref.d(true);
                      wh.a(var4, (byte) 63);
                      return;
                    } else {
                      uj.a("F1: " + qj.h(-124), (Throwable) null, 1);
                      ck.b((byte) -45);
                      break L0;
                    }
                  } else {
                    L2: {
                      if (vl.field_b == 2) {
                        vl.field_b = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  }
                }
              } else {
                L3: {
                  if (null == pf.field_n) {
                    pf.field_n = new he(128);
                    ad.field_c = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var3 = var1_ref.c(false);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1_ref.c(false);
                  var5_ref = var1_ref.c(false);
                  var6_ref = sg.a((byte) 71, var4_ref_String);
                  if (null == var6_ref) {
                    var6_ref = sg.a((byte) 126, var5_ref);
                    if (var6_ref != null) {
                      int discarded$6 = -48;
                      pf.field_n.a((ca) (Object) var6_ref, (long)ck.a((CharSequence) (Object) var4_ref_String).hashCode(), (byte) 64);
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var6_ref == null) {
                    var6_ref = new hc();
                    int discarded$7 = -48;
                    pf.field_n.a((ca) (Object) var6_ref, (long)ck.a((CharSequence) (Object) var4_ref_String).hashCode(), (byte) 64);
                    int fieldTemp$8 = ad.field_c;
                    ad.field_c = ad.field_c + 1;
                    var6_ref.field_hb = fieldTemp$8;
                    ec.field_e.b(105, (kd) (Object) var6_ref);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var6_ref.field_jb = var3;
                var6_ref.field_R = var4_ref_String;
                var6_ref.b((byte) -117);
                var7_ref = (hc) (Object) ec.field_e.a(true);
                L8: while (true) {
                  L9: {
                    if (var7_ref == null) {
                      break L9;
                    } else {
                      if (!bl.a((byte) 111, var7_ref, var6_ref)) {
                        break L9;
                      } else {
                        var7_ref = (hc) (Object) ec.field_e.f(2);
                        if (var8 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (null == var7_ref) {
                        break L11;
                      } else {
                        vf.a((kd) (Object) var7_ref, 0, (kd) (Object) var6_ref);
                        if (var8 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    ec.field_e.b(114, (kd) (Object) var6_ref);
                    break L10;
                  }
                  return;
                }
              }
            } else {
              L12: {
                if (null != cl.field_P) {
                  break L12;
                } else {
                  cl.field_P = new he(128);
                  sc.field_b = 0;
                  break L12;
                }
              }
              L13: {
                if (var1_ref.d(true) != 1) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L13;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L13;
                }
              }
              L14: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1_ref.c(false);
                if (var3_int == 0) {
                  break L14;
                } else {
                  String discarded$9 = var1_ref.c(false);
                  break L14;
                }
              }
              L15: {
                var5 = cj.a((byte) 114, var4_ref_String);
                var6 = var1_ref.c(false);
                int discarded$10 = -48;
                var7 = ck.a((CharSequence) (Object) var4_ref_String);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (var5 != null) {
                  break L16;
                } else {
                  var5 = cj.a((byte) -109, var6);
                  if (var5 != null) {
                    cl.field_P.a((ca) (Object) var5, (long)var7.hashCode(), (byte) 64);
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (null != var5) {
                  break L17;
                } else {
                  var5 = new hc();
                  cl.field_P.a((ca) (Object) var5, (long)var7.hashCode(), (byte) 64);
                  int fieldTemp$11 = sc.field_b;
                  sc.field_b = sc.field_b + 1;
                  var5.field_hb = fieldTemp$11;
                  fk.field_i.b(101, (kd) (Object) var5);
                  break L17;
                }
              }
              var5.field_R = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "pa.B(" + 15 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 15;
        field_b = "To server list";
        field_c = "Cancel";
    }
}
