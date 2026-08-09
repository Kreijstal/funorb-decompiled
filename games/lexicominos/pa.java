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
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 65) {
              L1: {
                if (param0 != (-param0 & param0)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "pa.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
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
            throw ld.a((Throwable) ((Object) runtimeException), "pa.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        th var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        hc var5_ref = null;
        hc var6 = null;
        String var6_ref = null;
        hc var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var1 = ig.field_a;
            var2 = var1.d(true);
            if ((var2 ^ -1) != -1) {
              if ((var2 ^ -1) != -2) {
                if (2 == var2) {
                  L1: {
                    if (1 != vl.field_b) {
                      break L1;
                    } else {
                      vl.field_b = 2;
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var2 ^ -1) != -4) {
                    if (4 == var2) {
                      vl.field_b = 1;
                      var3 = var1.c(false);
                      ji.field_b = ((String) (var3)).intern();
                      var4 = var1.d(true);
                      wh.a(var4, (byte) 63);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L2: {
                        uj.a("F1: " + qj.h(-124), (Throwable) null, param0 ^ 14);
                        ck.b((byte) -45);
                        if (param0 == 15) {
                          break L2;
                        } else {
                          pa.b(35);
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    L3: {
                      if ((vl.field_b ^ -1) == -3) {
                        vl.field_b = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                L4: {
                  if (null == pf.field_n) {
                    pf.field_n = new he(128);
                    ad.field_c = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var3 = var1.c(false);
                  if (((String) (var3)).equals("")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1.c(false);
                  var5 = var1.c(false);
                  var6 = sg.a((byte) 71, var4_ref_String);
                  if (null == var6) {
                    var6 = sg.a((byte) 126, var5);
                    if (var6 != null) {
                      pf.field_n.a(var6, (long)ck.a((CharSequence) ((Object) var4_ref_String), (byte) -48).hashCode(), (byte) 64);
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var6 == null) {
                    var6 = new hc();
                    pf.field_n.a(var6, (long)ck.a((CharSequence) ((Object) var4_ref_String), (byte) -48).hashCode(), (byte) 64);
                    fieldTemp$0 = ad.field_c;
                    ad.field_c = ad.field_c + 1;
                    var6.field_hb = fieldTemp$0;
                    ec.field_e.b(105, var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var3 != null) {
                    var3 = ((String) (var3)).intern();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6.field_jb = (String) (var3);
                var6.field_R = var4_ref_String;
                var6.b((byte) -117);
                var7 = (hc) ((Object) ec.field_e.a(true));
                L9: while (true) {
                  L10: {
                    if (var7 == null) {
                      break L10;
                    } else {
                      if (!bl.a((byte) 111, var7, var6)) {
                        break L10;
                      } else {
                        var7 = (hc) ((Object) ec.field_e.f(2));
                        if (var8 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (null == var7) {
                        break L12;
                      } else {
                        vf.a(var7, param0 + -15, var6);
                        if (var8 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ec.field_e.b(114, var6);
                    break L11;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L13: {
                if (null != cl.field_P) {
                  break L13;
                } else {
                  cl.field_P = new he(128);
                  sc.field_b = 0;
                  break L13;
                }
              }
              L14: {
                if (-2 != (var1.d(true) ^ -1)) {
                  stackIn_11_0 = 0;
                  break L14;
                } else {
                  stackIn_11_0 = 1;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1.c(false);
                if (var3_int == 0) {
                  break L15;
                } else {
                  var1.c(false);
                  break L15;
                }
              }
              L16: {
                var5_ref = cj.a((byte) 114, var4_ref_String);
                var6_ref = var1.c(false);
                var7_ref = ck.a((CharSequence) ((Object) var4_ref_String), (byte) -48);
                if (null == var7_ref) {
                  var7_ref = var4_ref_String;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var5_ref != null) {
                  break L17;
                } else {
                  var5_ref = cj.a((byte) -109, var6_ref);
                  if (var5_ref != null) {
                    cl.field_P.a(var5_ref, (long)var7_ref.hashCode(), (byte) 64);
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (null != var5_ref) {
                  break L18;
                } else {
                  var5_ref = new hc();
                  cl.field_P.a(var5_ref, (long)var7_ref.hashCode(), (byte) 64);
                  fieldTemp$1 = sc.field_b;
                  sc.field_b = sc.field_b + 1;
                  var5_ref.field_hb = fieldTemp$1;
                  fk.field_i.b(param0 + 86, var5_ref);
                  break L18;
                }
              }
              var5_ref.field_R = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "pa.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
        field_d = 15;
        field_b = "To server list";
        field_c = "Cancel";
    }
}
