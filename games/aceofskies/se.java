/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_a;
    static da field_c;
    static int field_b;

    public static void a(byte param0) {
        try {
            int var1_int = -15 / ((param0 - 79) / 44);
            field_a = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "se.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        String discarded$3 = null;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException var1 = null;
        dl var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        cl var5 = null;
        String var5_ref = null;
        String var6 = null;
        cl var6_ref = null;
        String var7 = null;
        cl var7_ref = null;
        int var8 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_57_0 = false;
        int stackIn_67_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_56_0 = false;
        int stackOut_65_0 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -64) {
                break L1;
              } else {
                se.a((byte) -70);
                break L1;
              }
            }
            var1_ref = nm.field_c;
            var2 = var1_ref.g(-58);
            if ((var2 ^ -1) == -1) {
              L2: {
                if (gi.field_g == null) {
                  gi.field_g = new es(128);
                  hl.field_a = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (1 != var1_ref.g(-60)) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_15_0 = stackOut_12_0;
                  break L3;
                }
              }
              L4: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1_ref.h(-17883);
                if (var3_int == 0) {
                  break L4;
                } else {
                  discarded$3 = var1_ref.h(-17883);
                  break L4;
                }
              }
              L5: {
                var5 = fg.a(var4_ref_String, 17680);
                var6 = var1_ref.h(-17883);
                var7 = vu.a(125, (CharSequence) ((Object) var4_ref_String));
                if (var7 != null) {
                  break L5;
                } else {
                  var7 = var4_ref_String;
                  break L5;
                }
              }
              L6: {
                if (null == var5) {
                  var5 = fg.a(var6, 17680);
                  if (null == var5) {
                    break L6;
                  } else {
                    gi.field_g.a(var5, (long)var7.hashCode(), (byte) 56);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (var5 != null) {
                  break L7;
                } else {
                  var5 = new cl();
                  gi.field_g.a(var5, (long)var7.hashCode(), (byte) 56);
                  fieldTemp$4 = hl.field_a;
                  hl.field_a = hl.field_a + 1;
                  var5.field_cb = fieldTemp$4;
                  nh.field_d.a(75, var5);
                  break L7;
                }
              }
              var5.field_I = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != 1) {
                if (2 != var2) {
                  if (-4 != (var2 ^ -1)) {
                    if (var2 == 4) {
                      eo.field_a = 1;
                      var3 = var1_ref.h(-17883);
                      ul.field_s = var3.intern();
                      var4 = var1_ref.g(-46);
                      lg.a(var4, 2);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      v.a("F1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                      te.b(true);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    L8: {
                      if (2 == eo.field_a) {
                        eo.field_a = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  L9: {
                    if ((eo.field_a ^ -1) == -2) {
                      eo.field_a = 2;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L10: {
                  if (null == pj.field_a) {
                    pj.field_a = new es(128);
                    wo.field_o = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var3 = var1_ref.h(-17883);
                  if (var3.equals("")) {
                    var3 = null;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1_ref.h(-17883);
                  var5_ref = var1_ref.h(-17883);
                  var6_ref = kg.a(var4_ref_String, (byte) 61);
                  if (null != var6_ref) {
                    break L12;
                  } else {
                    var6_ref = kg.a(var5_ref, (byte) 61);
                    if (var6_ref != null) {
                      pj.field_a.a(var6_ref, (long)vu.a(126, (CharSequence) ((Object) var4_ref_String)).hashCode(), (byte) 56);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (var6_ref == null) {
                    var6_ref = new cl();
                    pj.field_a.a(var6_ref, (long)vu.a(126, (CharSequence) ((Object) var4_ref_String)).hashCode(), (byte) 56);
                    fieldTemp$5 = wo.field_o;
                    wo.field_o = wo.field_o + 1;
                    var6_ref.field_cb = fieldTemp$5;
                    rh.field_f.a(71, var6_ref);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null != var3) {
                    var3 = var3.intern();
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var6_ref.field_bb = var3;
                var6_ref.field_I = var4_ref_String;
                var6_ref.c(-123);
                var7_ref = (cl) ((Object) rh.field_f.d(268435455));
                L15: while (true) {
                  L16: {
                    L17: {
                      L18: {
                        if (var7_ref == null) {
                          break L18;
                        } else {
                          stackOut_56_0 = cs.a(var7_ref, -115, var6_ref);
                          stackIn_67_0 = stackOut_56_0 ? 1 : 0;
                          stackIn_57_0 = stackOut_56_0;
                          if (var8 != 0) {
                            break L17;
                          } else {
                            if (!stackIn_57_0) {
                              break L18;
                            } else {
                              var7_ref = (cl) ((Object) rh.field_f.b((byte) 103));
                              if (var8 == 0) {
                                continue L15;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (null != var7_ref) {
                          break L19;
                        } else {
                          rh.field_f.a(120, var6_ref);
                          if (var8 == 0) {
                            break L16;
                          } else {
                            break L19;
                          }
                        }
                      }
                      stackOut_65_0 = -20;
                      stackIn_67_0 = stackOut_65_0;
                      break L17;
                    }
                    ml.a((byte) stackIn_67_0, var7_ref, var6_ref);
                    break L16;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "se.B(" + param0 + ')');
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
    }
}
