/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_a;
    static String field_b;

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hb.a(param0, -31654)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (pf.a(param0, (byte) 24)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (cg.a(-92, param0)) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-1 == (param2.length() ^ -1)) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (va.a(param2, param1 + 12075, param0)) {
                      stackIn_19_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param1 == -12076) {
                        if (!ms.a(param0, (byte) -53, param2)) {
                          if (na.a(param0, 127, param2)) {
                            stackIn_29_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return true;
                          }
                        } else {
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_22_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("gi.B(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L1;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L2;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0 != 0;
                    } else {
                      return stackIn_29_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lm[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        sq var2 = null;
        sq var3 = null;
        int var4 = 0;
        lm[] var5 = null;
        int var6 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (hm.field_q == ol.field_g) {
                if (null != ol.field_g) {
                  te.field_c = te.field_c + 16;
                  var5 = ol.field_g.field_f;
                  var1 = var5;
                  if (var1 == null) {
                    break L1;
                  } else {
                    var2_int = 0;
                    L2: while (true) {
                      if (var5.length <= var2_int) {
                        break L1;
                      } else {
                        if (0 == rg.field_f[var2_int]) {
                          L3: {
                            if (sp.a(var5[var2_int].field_c, (byte) -125)) {
                              rg.field_f[var2_int] = 1;
                              vn.a(0);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var2_int++;
                          continue L2;
                        } else {
                          var2_int++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                fieldTemp$0 = ej.field_m + 1;
                ej.field_m = ej.field_m + 1;
                if (-33 >= (fieldTemp$0 ^ -1)) {
                  js.a((byte) -10);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              L4: {
                if (sr.a(0, "unplaced")) {
                  if (qc.a("unplaced", -126)) {
                    ac.a(1, n.a("unplaced", -21502));
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  if (sr.a(0, "losegame")) {
                    ac.a(1, n.a("lose", -21502));
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                aj.field_a.a(0);
                if (ol.field_g == hm.field_q) {
                  ei.field_e = kp.field_j;
                  e.field_f = jc.field_r;
                  fk.field_k = be.field_h;
                  kl.field_o = pc.field_q;
                  break L5;
                } else {
                  e.field_f = re.a(jc.field_r, 32, ej.field_m, fe.field_B, 0);
                  fk.field_k = re.a(be.field_h, 32, ej.field_m, oi.field_a, 0);
                  ei.field_e = re.a(kp.field_j, 32, ej.field_m, jb.field_d, 0);
                  stackIn_27_0 = pc.field_q;
                  stackIn_27_1 = 32;
                  kl.field_o = re.a(stackIn_27_0, stackIn_27_1, ej.field_m, tp.field_b, 0);
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (null == oi.field_i) {
                    break L7;
                  } else {
                    var1_int = 1;
                    var6 = 0;
                    var2_int = var6;
                    L8: while (true) {
                      if (var6 >= rg.field_f.length) {
                        if (var1_int == 0) {
                          break L7;
                        } else {
                          L9: {
                            var2 = ol.field_g.field_l;
                            if (var2 != null) {
                              break L9;
                            } else {
                              if ((ge.field_i ^ -1) >= -1) {
                                break L9;
                              } else {
                                fieldTemp$1 = ge.field_i - 1;
                                ge.field_i = ge.field_i - 1;
                                var2 = js.field_b[fieldTemp$1];
                                break L9;
                              }
                            }
                          }
                          if (is.field_b) {
                            L10: {
                              is.field_b = false;
                              var3 = js.field_b[ge.field_i];
                              if (var3 == null) {
                                break L10;
                              } else {
                                if (var3 != ol.field_g) {
                                  lp.a(1546006977, var3);
                                  break L6;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            lp.a(1546006977, var2);
                            break L6;
                          } else {
                            lp.a(1546006977, var2);
                            break L6;
                          }
                        }
                      } else {
                        L11: {
                          if (rg.field_f[var6] <= 0) {
                            break L11;
                          } else {
                            rg.field_f[var6] = rg.field_f[var6] + 1;
                            break L11;
                          }
                        }
                        L12: {
                          if (rg.field_f[var6] < 48) {
                            var1_int = 0;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var6++;
                        continue L8;
                      }
                    }
                  }
                }
                break L6;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "gi.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, ms param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            qn.field_b[0] = na.field_u.nextInt();
            qn.field_b[1] = na.field_u.nextInt();
            eo.field_cb.field_j = 0;
            qn.field_b[3] = (int)w.field_I;
            qn.field_b[2] = (int)(w.field_I >> 743439264);
            eo.field_cb.e(11135, qn.field_b[0]);
            eo.field_cb.e(11135, qn.field_b[1]);
            eo.field_cb.e(11135, qn.field_b[2]);
            eo.field_cb.e(11135, qn.field_b[3]);
            jo.a(24, eo.field_cb);
            if (param3 <= -36) {
              L1: {
                eo.field_cb.d(param0, 255);
                param4.a(eo.field_cb, (byte) 118);
                js.field_f.field_j = 0;
                if (param1) {
                  js.field_f.c(18, (byte) -106);
                  break L1;
                } else {
                  js.field_f.c(16, (byte) -89);
                  break L1;
                }
              }
              L2: {
                js.field_f.field_j = js.field_f.field_j + 2;
                var5_int = js.field_f.field_j;
                js.field_f.e(11135, e.field_b);
                js.field_f.b(-16426, be.field_l);
                var6 = 0;
                if (!db.field_b) {
                  break L2;
                } else {
                  var6 = var6 | 1;
                  break L2;
                }
              }
              L3: {
                if (!ka.field_a) {
                  break L3;
                } else {
                  var6 = var6 | 4;
                  break L3;
                }
              }
              L4: {
                if (param2) {
                  var6 = var6 | 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (fr.field_H != null) {
                  var6 = var6 | 16;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                js.field_f.c(var6, (byte) -93);
                var7 = ck.a((byte) 70, kq.f((byte) 125));
                if (var7 != null) {
                  break L6;
                } else {
                  var7 = "";
                  break L6;
                }
              }
              L7: {
                js.field_f.a(var7, (byte) 0);
                if (fr.field_H == null) {
                  break L7;
                } else {
                  js.field_f.a((byte) 95, fr.field_H);
                  break L7;
                }
              }
              co.a(25050, js.field_f, hr.field_a, eo.field_cb, jl.field_V);
              js.field_f.f(-549342136, js.field_f.field_j + -var5_int);
              d.a(-1, (byte) 82);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("gi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 32) {
            String var2 = (String) null;
            gi.a((String) null, -107, (String) null);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Select destination system in the same territory or connected by hyperspace link.";
    }
}
