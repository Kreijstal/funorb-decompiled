/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends lk implements dm {
    private ho field_Bb;
    static int field_Db;
    private boolean field_Eb;
    private boolean field_yb;
    static String[] field_Ab;
    static String field_zb;
    static String field_xb;
    static boolean field_Cb;

    final static void a(String param0, int param1, byte param2) {
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              jd.field_a = false;
              s.field_f = false;
              if (null == fl.field_u) {
                break L1;
              } else {
                if (!fl.field_u.field_K) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 1;
                    if (8 == param1) {
                      L3: {
                        if (!qa.field_v) {
                          param0 = ek.field_r;
                          break L3;
                        } else {
                          param0 = fk.field_R;
                          break L3;
                        }
                      }
                      param1 = 2;
                      ao.field_c.a(true, mk.field_d);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (10 == param1) {
                      var3_int = 0;
                      hk.a((byte) -89);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (jd.field_a) {
                          param0 = sk.a(new String[]{param0}, lb.field_U, 122);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (sn.field_b) {
                          param0 = bf.field_s;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      fl.field_u.a(param0, param1, 17);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (-257 == (param1 ^ -1)) {
                    break L1;
                  } else {
                    if (-11 == (param1 ^ -1)) {
                      break L1;
                    } else {
                      if (qa.field_v) {
                        break L1;
                      } else {
                        ao.field_c.a(1379);
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L8: {
              if (param2 == 20) {
                break L8;
              } else {
                var4 = (String) null;
                fi.a(true, (String) null, (byte) -53);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("fi.NB(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (!(!this.field_yb)) {
            jd.a((byte) -71, false, true);
            return;
        }
        ud.d((byte) 58);
        if (param0 >= 0) {
            return;
        }
        try {
            this.r(-125);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "fi.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    fi(pk param0, ho param1) {
        super(param0, ab.field_V, ic.field_a, false, false);
        try {
            this.field_Bb = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_zb = null;
        int var1 = 90 / ((64 - param0) / 35);
        field_Ab = null;
        field_xb = null;
    }

    final static int a(boolean param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -68) {
              if (!param0) {
                stackIn_7_0 = dk.field_d.b(param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = cf.field_o.b(param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -51;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("fi.TB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static int a(byte param0, fj param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2_int = t.field_l;
              if (2 == param1.field_i) {
                if (param1.field_l) {
                  var2_int = t.field_l;
                  break L1;
                } else {
                  L2: {
                    if (param1.field_g != 0) {
                      break L2;
                    } else {
                      if (-1 == (param1.field_s ^ -1)) {
                        var2_int = pg.field_f[param1.field_i];
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = un.field_j[param1.field_i];
                  break L1;
                }
              } else {
                if (-5 == (param1.field_i ^ -1)) {
                  var2_int = un.field_j[param1.field_i];
                  break L1;
                } else {
                  if ((param1.field_r ^ -1L) == (oj.field_c ^ -1L)) {
                    var2_int = pg.field_f[param1.field_i];
                    break L1;
                  } else {
                    var2_int = un.field_j[param1.field_i];
                    break L1;
                  }
                }
              }
            }
            if (param0 >= 81) {
              stackIn_18_0 = var2_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_16_0 = 100;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("fi.UB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    final static byte[] a(int param0, byte[] param1, bc param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param3 == 119) {
                break L1;
              } else {
                field_Ab = (String[]) null;
                break L1;
              }
            }
            var4_int = param2.e(param0, (byte) -112);
            if (0 != var4_int) {
              L2: {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    if (var4_int == param1.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param2.e(3, (byte) -112);
                var6 = (byte)param2.e(8, (byte) -112);
                if (0 < var5) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (byte)(var6 + param2.e(var5, (byte) -112));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("fi.RB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_18_0;
        }
    }

    final static void t(int param0) {
        if (param0 != 11) {
            field_xb = (String) null;
        }
        String var2 = (String) null;
        ve.a(-1, (String) null, "");
    }

    final void s(int param0) {
        if (param0 <= 1) {
            field_Cb = false;
        }
        this.a(hj.a(wc.field_K, 248, false), 22811, true);
    }

    final static void a(int param0, int param1, String param2, int param3, String param4, String param5) {
        fj var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          L0: {
            L1: {
              var6 = new fj(param3, param2, param0, param5, param4);
              ei.a(-2792, var6);
              if (param1 == 0) {
                break L1;
              } else {
                field_zb = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var6_ref);

            stackIn_5_1 = new StringBuilder().append("fi.MB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ')');
        }
    }

    private final void a(sj param0, int param1, boolean param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ba var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 == 22811) {
                break L1;
              } else {
                field_zb = (String) null;
                break L1;
              }
            }
            L2: {
              this.field_Eb = true;
              if (!param0.field_f) {
                if (param0.field_h == null) {
                  var4 = param0.field_i;
                  if ((param0.field_d ^ -1) != -249) {
                    break L2;
                  } else {
                    L3: {
                      if (param2) {
                        break L3;
                      } else {
                        vj.a(param1 + -22810);
                        break L3;
                      }
                    }
                    var4 = wc.field_K;
                    this.field_yb = true;
                    break L2;
                  }
                } else {
                  var4 = qc.field_fb;
                  if (this.field_Bb != null) {
                    this.field_Bb.a(true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4 = te.field_N;
                break L2;
              }
            }
            L4: {
              L5: {
                var5 = new ba((lk) (this), ab.field_V, var4);
                if (param0.field_f) {
                  if (!param0.field_b) {
                    var5.a((dn) (this), param1 ^ -22896, al.field_e);
                    break L5;
                  } else {
                    this.e(new ia((fi) (this)), -27667);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L6: {
                    if (this.field_yb) {
                      var5.a((dn) (this), param1 ^ -22882, al.field_e);
                      break L6;
                    } else {
                      if ((param0.field_d ^ -1) == -6) {
                        var5.a(ml.field_hb, 11, 122);
                        var5.a(uh.field_a, 17, 95);
                        break L6;
                      } else {
                        var5.a(nb.field_T, -1, 111);
                        break L6;
                      }
                    }
                  }
                  if ((param0.field_d ^ -1) != -4) {
                    if (param0.field_d == 6) {
                      var5.a(em.field_c, 9, 115);
                      break L5;
                    } else {
                      this.e(var5, -27667);
                      break L4;
                    }
                  } else {
                    var5.a(hl.field_C, 7, 75);
                    break L5;
                  }
                }
              }
              this.e(var5, -27667);
              break L4;
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("fi.LB(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean l(int param0) {
        sj var2 = null;
        if (param0 != -1) {
            field_Ab = (String[]) null;
        }
        if (this.field_K && !this.field_Eb) {
            var2 = ik.a(127);
            if (var2 != null) {
                this.a(var2, 22811, false);
            }
        }
        return super.l(-1);
    }

    final static boolean a(long param0, int param1, String param2, byte param3, int[] param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 < -81) {
                break L1;
              } else {
                field_Cb = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == null) {
                  break L3;
                } else {
                  L4: {
                    if (-3 != (param1 ^ -1)) {
                      break L4;
                    } else {
                      if (!nl.a((byte) 127, param2, param0)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("fi.PB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    static {
        field_Db = -1;
        field_xb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_Cb = true;
        field_zb = "Players";
    }
}
