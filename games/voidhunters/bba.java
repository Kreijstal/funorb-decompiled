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
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (bba) ((Object) param1);
                var4 = -88 / ((22 - param0) / 59);
                if (dn.a(var3.field_b, true, 1, this.field_b, -4)) {
                  break L2;
                } else {
                  if (!dn.a(var3.field_c, true, 1, this.field_c, -73)) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("bba.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(rsb param0, int param1) {
        int var3_int = 0;
        int var4_int = 0;
        wm var5_ref_wm = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        rna var6 = null;
        int var8 = 0;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 < -27) {
              L1: {
                var3_int = 1;
                if (null != this.field_b) {
                  var4_int = 0;
                  L2: while (true) {
                    if (this.field_b.length <= var4_int) {
                      break L1;
                    } else {
                      var5_ref_wm = this.field_b[var4_int];
                      var6_int = var5_ref_wm.a(0, param0.field_e, param0.field_g) ^ var5_ref_wm.field_a ? 1 : 0;
                      if (var6_int == 0) {
                        var3_int = 0;
                        var4_int++;
                        continue L2;
                      } else {
                        var4_int++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                if (var3_int == 0) {
                  break L3;
                } else {
                  if (null == this.field_c) {
                    break L3;
                  } else {
                    L4: {
                      var4 = null;
                      if (null == this.field_b) {
                        break L4;
                      } else {
                        var5 = 0;
                        L5: while (true) {
                          if (var5 >= this.field_b.length) {
                            break L4;
                          } else {
                            var4 = this.field_b[var5].a(param0.field_g, 120, (int[]) (var4));
                            var5++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var8 = 0;
                    var5 = var8;
                    L6: while (true) {
                      if (var8 >= this.field_c.length) {
                        break L3;
                      } else {
                        var6 = this.field_c[var8];
                        var6.a(1, (int[]) (var4), param0);
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
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
          L7: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("bba.N(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        bba var9 = null;
        Class[] var4 = null;
        dja[] var5 = null;
        Class[] var6 = null;
        dja[] var7 = null;
        try {
            var9 = (bba) ((Object) param1);
            var4 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
            var5 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
            var9.field_b = (wm[]) ((Object) hla.a(var4, this.field_b, var5, -118, var9.field_b, 1, jv.field_d));
            if (param0 <= 54) {
                tv var8 = (tv) null;
                this.a((tv) null, 121);
            }
            var6 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
            var7 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
            var9.field_c = (rna[]) ((Object) hla.a(var6, this.field_c, var7, -120, var9.field_c, 1, nha.field_o));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bba.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(rna param0, boolean param1) {
        RuntimeException runtimeException = null;
        wm var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = (rna[]) ((Object) ija.a(param0, this.field_c, 0, nha.field_o));
              if (param1) {
                break L1;
              } else {
                var4 = (wm) null;
                this.a((byte) 23, (wm) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bba.M(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        bba var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = (bba) ((Object) param0);
              tja.a(var3.field_b, 1, this.field_b, true, 5547);
              tja.a(var3.field_c, 1, this.field_c, true, 5547);
              var4 = 0;
              if (!dn.a(var3.field_b, true, 1, this.field_b, -64)) {
                break L1;
              } else {
                System.out.println("MissionCondition[] conditions has changed. ");
                var4 = 1;
                break L1;
              }
            }
            if (param1 < -19) {
              L2: {
                if (dn.a(var3.field_c, true, 1, this.field_c, -13)) {
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("bba.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        Class[] var5 = null;
        Class[] var4 = null;
        try {
            if (param1 >= -109) {
                this.a(-43, -72);
            }
            var5 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
            pjb.a(param0, this.field_b, 8, 1, var5, 122);
            var4 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
            pjb.a(param0, this.field_c, 8, 1, var4, 118);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bba.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final wm[] a(byte param0) {
        if (param0 >= -110) {
            rsb var3 = (rsb) null;
            this.a((rsb) null, -8);
        }
        return this.field_b;
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 > -30) {
            return;
        }
        field_e = null;
    }

    final void a(byte param0, wm param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = (wm[]) ((Object) ija.a(param1, this.field_b, 0, jv.field_d));
              if (param0 < -97) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bba.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        Class[] var5 = null;
        dja[] var6 = null;
        Class[] var7 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
        dja[] var4 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
        this.field_b = (wm[]) ((Object) iq.a(var4, this.field_b, var7, jv.field_d, 8, param0, 1, 108));
        if (param1) {
            return;
        }
        try {
            var5 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
            var6 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
            this.field_c = (rna[]) ((Object) iq.a(var6, this.field_c, var5, nha.field_o, 8, param0, 1, 119));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bba.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3;
        int stackIn_6_0 = 0;
        L0: {
          if (param1 == -79) {
            break L0;
          } else {
            this.field_b = (wm[]) null;
            break L0;
          }
        }
        L1: {
          if (0 > param0) {
            break L1;
          } else {
            L2: {
              if (this.field_b == null) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = this.field_b.length;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_6_0;
              if (this.field_b == null) {
                break L3;
              } else {
                if (param0 < this.field_b.length) {
                  this.field_b = (wm[]) ((Object) dt.a(jv.field_d, param0, 15667, this.field_b));
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (null == this.field_c) {
              break L1;
            } else {
              if (-var3 + param0 >= this.field_c.length) {
                break L1;
              } else {
                this.field_c = (rna[]) ((Object) dt.a(nha.field_o, param0 - var3, 15667, this.field_c));
                break L1;
              }
            }
          }
        }
    }

    final static int a(int param0, ml param1, int param2, int[] param3) {
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (param1.field_d == null) {
                  break L1;
                } else {
                  if (-1 == (param1.field_d.length ^ -1)) {
                    break L1;
                  } else {
                    L2: while (true) {
                      L3: {
                        if (param3.length <= param2) {
                          break L3;
                        } else {
                          incrementValue$3 = param2;
                          param2++;
                          dupTemp$4 = param3[incrementValue$3];
                          var4_int = dupTemp$4;
                          if (0 == (dupTemp$4 ^ -1)) {
                            break L3;
                          } else {
                            incrementValue$5 = param2;
                            param2++;
                            var5 = param3[incrementValue$5];
                            var6 = new ml(var5);
                            param1.a(1, var4_int, var6);
                            param2 = bba.a(param0 ^ 0, var6, param2, param3);
                            if (var4_int == -1 + param1.field_d.length) {
                              break L3;
                            } else {
                              continue L2;
                            }
                          }
                        }
                      }
                      stackIn_14_0 = param2;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              stackIn_8_0 = param2;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 41;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("bba.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final rna[] c(byte param0) {
        if (param0 != -42) {
            return (rna[]) null;
        }
        return this.field_c;
    }

    final void a(int param0, int param1) {
        if (param1 != -1) {
            this.c((byte) 14);
        }
        if (param0 >= 0 && this.field_b != null && this.field_b.length > param0) {
            this.field_b[param0].field_a = !this.field_b[param0].field_a ? true : false;
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -113 % ((param0 - 32) / 63);
        if (0 > param1) {
            return 0;
        }
        int var5 = this.field_b != null ? this.field_b.length : 0;
        if (this.field_b != null && param1 < this.field_b.length) {
            return this.field_b[param1].a((byte) -117, param2);
        }
        if (null != this.field_c && param1 - var5 < this.field_c.length) {
            return this.field_c[-var5 + param1].a(param2, -125);
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, pe param4) {
        int var6_int = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 >= (param3 ^ -1)) {
                  L3: {
                    if (this.field_b != null) {
                      stackIn_5_0 = this.field_b.length;
                      break L3;
                    } else {
                      stackIn_5_0 = 0;
                      break L3;
                    }
                  }
                  L4: {
                    var6_int = stackIn_5_0;
                    if (null == this.field_b) {
                      break L4;
                    } else {
                      if (param3 < this.field_b.length) {
                        this.field_b[param3].a(param4, -2, param2, param0);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (null == this.field_c) {
                    break L2;
                  } else {
                    if (-var6_int + param3 < this.field_c.length) {
                      this.field_c[-var6_int + param3].a(param4, false, param2, param0);
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
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("bba.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    static {
        field_e = "Enter name of friend to delete from list";
        field_a = 50;
        field_f = "Mode";
    }
}
