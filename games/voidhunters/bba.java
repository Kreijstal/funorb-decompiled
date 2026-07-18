/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bba implements ntb {
    static int field_d;
    static int field_a;
    static String field_e;
    private wm[] field_b;
    private rna[] field_c;
    static String field_f;

    public final boolean a(byte param0, tv param1) {
        bba var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (bba) (Object) param1;
                var4 = -88 / ((22 - param0) / 59);
                if (dn.a((tv[]) (Object) var3.field_b, true, 1, (tv[]) (Object) ((bba) this).field_b, -4)) {
                  break L2;
                } else {
                  if (!dn.a((tv[]) (Object) var3.field_c, true, 1, (tv[]) (Object) ((bba) this).field_c, -73)) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("bba.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(rsb param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        Object var4 = null;
        wm var5_ref_wm = null;
        int var5 = 0;
        int var6_int = 0;
        rna var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 < -27) {
              L1: {
                var3_int = 1;
                if (null != ((bba) this).field_b) {
                  var4_int = 0;
                  L2: while (true) {
                    if (((bba) this).field_b.length <= var4_int) {
                      break L1;
                    } else {
                      L3: {
                        var5_ref_wm = ((bba) this).field_b[var4_int];
                        var6_int = var5_ref_wm.a(0, param0.field_e, param0.field_g) ^ var5_ref_wm.field_a ? 1 : 0;
                        if (var6_int != 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L4: {
                if (var3_int == 0) {
                  break L4;
                } else {
                  if (null == ((bba) this).field_c) {
                    break L4;
                  } else {
                    L5: {
                      var4 = null;
                      if (null == ((bba) this).field_b) {
                        break L5;
                      } else {
                        var5 = 0;
                        L6: while (true) {
                          if (var5 >= ((bba) this).field_b.length) {
                            break L5;
                          } else {
                            var4 = (Object) (Object) ((bba) this).field_b[var5].a(param0.field_g, 120, (int[]) var4);
                            var5++;
                            continue L6;
                          }
                        }
                      }
                    }
                    var8 = 0;
                    var5 = var8;
                    L7: while (true) {
                      if (var8 >= ((bba) this).field_c.length) {
                        break L4;
                      } else {
                        var6 = ((bba) this).field_c[var8];
                        var6.a(1, (int[]) var4, param0);
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("bba.N(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        Class[] var4 = null;
        dja[] var5 = null;
        Class[] var6 = null;
        dja[] var7 = null;
        Object var8 = null;
        bba var9 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var9 = (bba) (Object) param1;
              var4 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
              var5 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
              var9.field_b = (wm[]) (Object) hla.a(var4, (tv[]) (Object) ((bba) this).field_b, var5, -118, (tv[]) (Object) var9.field_b, 1, jv.field_d);
              if (param0 > 54) {
                break L1;
              } else {
                var8 = null;
                ((bba) this).a((tv) null, 121);
                break L1;
              }
            }
            var6 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
            var7 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
            var9.field_c = (rna[]) (Object) hla.a(var6, (tv[]) (Object) ((bba) this).field_c, var7, -120, (tv[]) (Object) var9.field_c, 1, nha.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bba.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(rna param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bba) this).field_c = (rna[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((bba) this).field_c, 0, nha.field_o);
              if (param1) {
                break L1;
              } else {
                var4 = null;
                ((bba) this).a((byte) 23, (wm) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bba.M(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        bba var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3 = (bba) (Object) param0;
              boolean discarded$4 = tja.a((ntb[]) (Object) var3.field_b, 1, (ntb[]) (Object) var3.field_b, true, 5547);
              boolean discarded$5 = tja.a((ntb[]) (Object) var3.field_c, 1, (ntb[]) (Object) var3.field_c, true, 5547);
              var4 = 0;
              if (!dn.a((tv[]) (Object) var3.field_b, true, 1, (tv[]) (Object) var3.field_b, -64)) {
                break L1;
              } else {
                System.out.println("MissionCondition[] conditions has changed. ");
                var4 = 1;
                break L1;
              }
            }
            if (param1 < -19) {
              L2: {
                if (dn.a((tv[]) (Object) var3.field_c, true, 1, (tv[]) (Object) var3.field_c, -13)) {
                  System.out.println("MissionAction[] actions has changed. ");
                  var4 = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  System.out.println("This instance of MissionEvent has changed");
                  break L3;
                } else {
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("bba.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        Class[] var4 = null;
        Class[] var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -109) {
                break L1;
              } else {
                ((bba) this).a(-43, -72);
                break L1;
              }
            }
            var5 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
            pjb.a(param0, (tv[]) (Object) ((bba) this).field_b, 8, 1, var5, 122);
            var4 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
            pjb.a(param0, (tv[]) (Object) ((bba) this).field_c, 8, 1, var4, 118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bba.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final wm[] a(byte param0) {
        if (param0 >= -110) {
            Object var3 = null;
            ((bba) this).a((rsb) null, -8);
        }
        return ((bba) this).field_b;
    }

    public static void b() {
        field_f = null;
        field_e = null;
    }

    final void a(byte param0, wm param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bba) this).field_b = (wm[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((bba) this).field_b, 0, jv.field_d);
              if (param0 < -97) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bba.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        dja[] var4 = null;
        Class[] var5 = null;
        dja[] var6 = null;
        Class[] var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var7 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
            var4 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
            ((bba) this).field_b = (wm[]) (Object) iq.a(var4, (tv[]) (Object) ((bba) this).field_b, var7, jv.field_d, 8, param0, 1, 108);
            if (!param1) {
              var5 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
              var6 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
              ((bba) this).field_c = (rna[]) (Object) iq.a(var6, (tv[]) (Object) ((bba) this).field_c, var5, nha.field_o, 8, param0, 1, 119);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bba.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param1 == -79) {
            break L0;
          } else {
            ((bba) this).field_b = null;
            break L0;
          }
        }
        L1: {
          if (0 > param0) {
            break L1;
          } else {
            L2: {
              if (((bba) this).field_b == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = ((bba) this).field_b.length;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_6_0;
              if (((bba) this).field_b == null) {
                break L3;
              } else {
                if (param0 < ((bba) this).field_b.length) {
                  ((bba) this).field_b = (wm[]) (Object) dt.a(jv.field_d, param0, 15667, (Object[]) (Object) ((bba) this).field_b);
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (null == ((bba) this).field_c) {
              break L1;
            } else {
              if (-var3 + param0 >= ((bba) this).field_c.length) {
                break L1;
              } else {
                ((bba) this).field_c = (rna[]) (Object) dt.a(nha.field_o, param0 - var3, 15667, (Object[]) (Object) ((bba) this).field_c);
                break L1;
              }
            }
          }
        }
    }

    final static int a(int param0, ml param1, int param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (param1.field_d == null) {
                  break L1;
                } else {
                  if (-1 == param1.field_d.length) {
                    break L1;
                  } else {
                    L2: while (true) {
                      L3: {
                        if (param3.length <= param2) {
                          break L3;
                        } else {
                          int incrementValue$4 = param2;
                          param2++;
                          var4_int = param3[incrementValue$4];
                          if (0 == param3[incrementValue$4]) {
                            break L3;
                          } else {
                            int incrementValue$5 = param2;
                            param2++;
                            var5 = param3[incrementValue$5];
                            var6 = new ml(var5);
                            param1.a(1, var4_int, var6);
                            param2 = bba.a(param0, var6, param2, param3);
                            if (var4_int == -1 + param1.field_d.length) {
                              break L3;
                            } else {
                              continue L2;
                            }
                          }
                        }
                      }
                      stackOut_13_0 = param2;
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    }
                  }
                }
              }
              stackOut_7_0 = param2;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = 41;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("bba.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    final rna[] c(byte param0) {
        if (param0 != -42) {
            return null;
        }
        return ((bba) this).field_c;
    }

    final void a(int param0, int param1) {
        if (param1 != -1) {
            rna[] discarded$0 = ((bba) this).c((byte) 14);
        }
        if (param0 >= 0) {
            if (((bba) this).field_b != null) {
                if (((bba) this).field_b.length > param0) {
                    ((bba) this).field_b[param0].field_a = !((bba) this).field_b[param0].field_a ? true : false;
                }
            }
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -113 % ((param0 - 32) / 63);
        if (0 > param1) {
            return 0;
        }
        int var5 = ((bba) this).field_b != null ? ((bba) this).field_b.length : 0;
        if (((bba) this).field_b != null) {
            if (param1 < ((bba) this).field_b.length) {
                return ((bba) this).field_b[param1].a((byte) -117, param2);
            }
        }
        if (null != ((bba) this).field_c) {
            if (param1 - var5 < ((bba) this).field_c.length) {
                return ((bba) this).field_c[-var5 + param1].a(param2, -125);
            }
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, pe param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param3 >= 0) {
                  L3: {
                    if (((bba) this).field_b != null) {
                      stackOut_4_0 = ((bba) this).field_b.length;
                      stackIn_5_0 = stackOut_4_0;
                      break L3;
                    } else {
                      stackOut_3_0 = 0;
                      stackIn_5_0 = stackOut_3_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6_int = stackIn_5_0;
                    if (null == ((bba) this).field_b) {
                      break L4;
                    } else {
                      if (param3 < ((bba) this).field_b.length) {
                        ((bba) this).field_b[param3].a(param4, -2, param2, param0);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (null == ((bba) this).field_c) {
                    break L2;
                  } else {
                    if (-var6_int + param3 < ((bba) this).field_c.length) {
                      ((bba) this).field_c[-var6_int + param3].a(param4, false, param2, param0);
                      break L2;
                    } else {
                      var6_int = -7 % ((35 - param1) / 63);
                      break L1;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var6_int = -7 % ((35 - param1) / 63);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("bba.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter name of friend to delete from list";
        field_a = 50;
        field_f = "Mode";
    }
}
