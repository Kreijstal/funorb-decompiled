/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends kd {
    private int field_f;
    static String field_n;
    static tf[] field_p;
    static String field_g;
    private int field_i;
    static String field_j;
    static int field_h;
    private int field_e;
    private int field_q;
    private int field_k;
    private String field_m;
    private boolean field_o;
    private jl field_l;

    final static void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, eq param6, int param7) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_36_0 = 0;
        lo[][] stackIn_41_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_116_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        lo[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        lo var13 = null;
        int var14 = 0;
        int var15 = 0;
        lo[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_25_0Lifetime1;
        int stackIn_25_1Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            boolean decompiledFrameCompleted0 = true;
            L1: {
              boolean decompiledFrameCompleted1 = true;
              if (param0 <= param7) {
                var8_int = 1;
                var9 = 0;
                while (true) {
                  stackIn_4_0 = var9;
                  stackIn_4_1 = h.field_Z.length;
                  boolean decompiledFrameRemainder0 = true;
                  if (stackIn_4_0 < stackIn_4_1) {
                    var18 = h.field_Z[var9];
                    var17 = var18;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    stackIn_36_0 = 0;
                    decompiledFrameRemainder0 = (var15 == 0);
                    if (decompiledFrameRemainder0) {
                      var12 = stackIn_36_0;
                      L8: while (true) {
                        if (var18.length > var12) {
                          var13_int = var18[var12];
                          var14 = var10_ref_int__[1 + var12];
                          stackIn_25_0 = var13_int;
                          stackIn_25_1 = -1;
                          if (stackIn_25_0 != stackIn_25_1) {
                            if (param7 == var13_int &&
                              var14 == param5) {
                              var11 = 1;
                            } else {
                              if (var13_int >= param7) {
                                break L8;
                              }
                              if ((kf.field_o[var13_int] & 255) != var14) {
                                break L8;
                              }
                            }
                          } else {
                            if (~var14 != ~ia.field_a[param4]) {
                              break L8;
                            }
                          }
                          var12 += 2;
                          continue;
                        }
                        if (var11 == 0 &&
                          fj.field_b != param7) {
                          break L8;
                        }
                        var8_int = 0;
                        var12 = 0;
                        while (true) {
                          stackIn_25_0Lifetime1 = var18.length;
                          stackIn_25_1Lifetime1 = var12;
                          if (stackIn_25_0Lifetime1 <= stackIn_25_1Lifetime1) {
                            break;
                          }
                          var13_intLifetime1 = var18[var12];
                          stackIn_4_0 = -1;
                          stackIn_4_1 = var13_intLifetime1;
                          if (stackIn_4_0 == stackIn_4_1) {
                            ib.field_b = true;
                          } else {
                            if (param7 > var13_intLifetime1) {
                              lc.field_t[var13_intLifetime1] = true;
                            }
                          }
                          var12 += 2;
                        }
                        break;
                      }
                      var9++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_36_0 = var8_int;
                  }
                  if (stackIn_36_0 != 0) {
                    pb.field_f = true;
                  }
                  if (var15 == 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                stackIn_41_0 = hc.field_L;
                if (param7 != -1) {
                  stackIn_42_1 = param7 + 4;
                } else {
                  stackIn_42_1 = 1;
                }
                var16 = stackIn_41_0[stackIn_42_1];
                var8 = var16;
                var9Lifetime1 = 1;
                if (param3) {
                  if (param7 != -1) {
                    var10 = 0;
                    L24: while (true) {
                      if (var10 < var16.length - 1) {
                        stackIn_52_0 = k.field_k[(var10 + param1) / 8] & 1 << (7 & var10 + param1);
                        if (var15 != 0) {
                          break L24;
                        }
                        if (stackIn_52_0 != 0) {
                          var9Lifetime1 = 0;
                        } else {
                          var10++;
                          continue;
                        }
                      }
                      stackIn_52_0 = param1 + (oe.field_Rb[param7] & 255);
                      break;
                    }
                    param1 = stackIn_52_0;
                  }
                  if (param7 == -1 ||
                    var15 != 0) {
                    var10Lifetime2 = 0;
                    while (!(var10Lifetime2 >= ia.field_a.length)) {
                      stackIn_110_0 = 0;
                      stackIn_110_1 = qm.field_J[var10Lifetime2 / 8] & 1 << (7 & var10Lifetime2);
                      if (var15 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_110_0 != stackIn_110_1) {
                        var9Lifetime1 = 0;
                        break;
                      }
                      var10Lifetime2++;
                    }
                  }}
                if (decompiledFrameCompleted0) {
                  var10Lifetime1 = 0;
                  var11Lifetime1 = 0;
                  while (true) {
                    boolean decompiledFrameRemainder2 = true;
                    if (param7 != -1) {
                      stackIn_65_0 = -1;
                    } else {
                      stackIn_65_0 = ia.field_a.length;
                      if (var15 == 0) {
                        stackIn_66_0 = stackIn_65_0;
                        decompiledFrameRemainder2 = false;
                      }
                    }
                    if (decompiledFrameRemainder2) {
                      stackIn_66_0 = stackIn_65_0 + var16.length;
                    }
                    if (stackIn_66_0 > var11Lifetime1) {
                      if (-1 == param7) {
                        param4 = var11Lifetime1;
                      }
                      if (-1 != param7 ||
                        var15 != 0) {
                        kf.field_o[param7] = (byte)var11Lifetime1;
                      }
                      if (param7 != -1 ||
                        ia.field_a.length != 1) {
                        var13 = var16[var11Lifetime1 + 1];
                        if (!param3) {
                          if (-1 == param7) {
                            stackIn_81_0 = (~ia.field_a[var11Lifetime1] != ~io.field_c.field_ec) ? 0 : 1;
                          } else {
                            stackIn_81_0 = (var11Lifetime1 != (io.field_c.field_Eb[param7] & 255)) ? 0 : 1;
                          }
                          var12 = stackIn_81_0;
                        }
                        if (param3 ||
                          var15 != 0) {
                          boolean decompiledFrameRemainder1 = true;
                          if (!var13.field_U && (var9Lifetime1 == 0 ||
                            !var13.field_rb)) {
                            stackIn_88_0 = 0;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            stackIn_88_0 = 1;
                          }
                          var12 = stackIn_88_0;
                        }
                        if (var15 != 0) {
                          var12 = 1;
                        }
                      } else {
                        var12 = 1;
                      }
                      if (var12 != 0) {
                        var10Lifetime1 = 1;
                        no.a(param0, param1, (byte) 124, param3, param4, param5, param6, 1 + param7);
                      }
                      if (pb.field_f) {
                        return;
                      }
                      var11Lifetime1++;
                      if (var15 == 0) {
                        continue;
                      }
                    }
                    if (var10Lifetime1 != 0) {
                      break;
                    }
                    var11Lifetime1 = 0;
                    while ((var16.length - 1) > var11Lifetime1) {
                      stackIn_110_0 = 0;
                      stackIn_110_1 = ~param7;
                      if (var15 != 0) {
                        break L0;
                      }
                      if (stackIn_110_0 != stackIn_110_1) {
                        kf.field_o[param7] = (byte)var11Lifetime1;
                      } else {
                        param4 = var11Lifetime1;
                      }
                      no.a(param0, param1, (byte) 83, param3, param4, param5, param6, param7 + 1);
                      if (pb.field_f) {
                        return;
                      }
                      var11Lifetime1++;
                    }
                    break;
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_110_0 = param2;
              stackIn_110_1 = 67;
            }
          }
          if (stackIn_110_0 <= stackIn_110_1) {
            field_g = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_115_0 = var8_ref;
          stackIn_115_1 = new StringBuilder().append("no.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_116_2 = "null";
          } else {
            stackIn_116_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_115_0), ((StringBuilder) (Object) stackIn_115_1).append(stackIn_116_2).append(',').append(param7).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_g = null;
        field_n = null;
        field_j = null;
        field_p = null;
        if (param0 != 0) {
          field_n = (String) null;
        }
    }

    final static void a(boolean param0, byte param1) {
        ui.field_i.a(param0, 0);
        if (param1 != 34) {
          field_n = (String) null;
        }
        oj var2 = td.field_b;
        if (var2 != null) {
          var2.a(ui.field_i.field_gb, ui.field_i.field_tb, 104);
        }
    }

    final void a(int param0, int param1, String param2, jl param3, int param4, int param5, int param6, int param7) {
        mn stackIn_34_0;
        mn stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        mn stackIn_35_0 = null;
        mn stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        jl stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mn var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 == ~param7) {
            param7 = param3.field_M;
          }
          if (param2 == null) {
            this.field_b = null;
            return;
          }
          if (param3 == this.field_l &&
            !this.field_o &&
            param5 == this.field_i &&
            ~param6 == ~this.field_f &&
            this.field_e == param7 &&
            this.field_q == param4 &&
            ~this.field_k == ~param0 &&
            null != this.field_m &&
            this.field_m.equals(param2)) {
            return;
          }
          this.field_q = param4;
          this.field_f = param6;
          this.field_l = param3;
          this.field_i = param5;
          this.field_e = param7;
          this.field_k = param0;
          this.field_o = false;
          this.field_m = param2;
          var16 = new String[1 + param3.b(param2, param0)];
          var17 = var16;
          var10 = Math.max(1, param3.a(param2, new int[]{param0}, var17));
          if (this.field_f == 3 &&
            var10 == 1) {
            this.field_f = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_f != 0) {
            if (1 == this.field_f) {
              var11 = (this.field_q - var10 * this.field_e >> 1) + param3.field_w;
              decompiledFrameRemainder0 = (var15 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_f != 2) {
                var12 = (this.field_q - var10 * this.field_e) / (1 + var10);
                if (0 > var12) {
                  var12 = 0;
                }
                var11 = param3.field_w + var12;
                this.field_e = this.field_e + var12;
                if (var15 != 0) {
                  var11 = -(this.field_e * var10) + this.field_q - param3.field_z;
                  var11 = param3.field_w;
                }
              } else {
                var11 = -(this.field_e * var10) + this.field_q - param3.field_z;
                if (var15 != 0) {
                  var11 = param3.field_w;
                }
              }
            }
          } else {
            var11 = param3.field_w;
          }
          this.field_b = new mn[var10];
          var12Lifetime1 = 0;
          while (var10 > var12Lifetime1) {
            var13 = var16[var12Lifetime1];
            if (var15 != 0) {
              return;
            }
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = var11 - param3.field_w;
            stackIn_34_3 = var11 + param3.field_z;
            if (var13 != null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var13.length();
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            }
            var14 = new mn(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var14.field_g[0] = 0;
            if (var13 != null) {
              var14.field_g[var13.length()] = param3.c(var13);
              stackIn_39_0 = (jl) (param3);
              if (param5 != 3) {
                stackIn_40_1 = 0;
              } else {
                stackIn_40_1 = this.a(var13, param0, param3.c(var13), 60);
              }
              an.a(stackIn_39_0, stackIn_40_1, (byte) -92, var14, var13);
            }
            var11 = var11 + param7;
            this.field_b[var12Lifetime1] = var14;
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("no.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(String param0, boolean param1, int param2, jl param3, int param4) {
        mn var8 = null;
        int var7 = 0;
        if (param0 == null) {
          this.field_b = null;
          return;
        }
        if (param1) {
          field_g = (String) null;
        }
        if (this.field_l == param3 && this.field_o && 1 == this.field_i && null != this.field_m &&
          this.field_m.equals(param0)) {
          return;
        }
        try {
          this.field_i = 1;
          this.field_o = true;
          this.field_l = param3;
          var8 = this.a(param0, 0, param3, param2);
          var7 = param3.c(param0);
          var8.field_g[0] = param4 - (var7 >> 1);
          var8.field_g[param0.length()] = param4 + (var7 >> 1);
          an.a(param3, 0, (byte) -92, var8, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "no.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        ak stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_110_0 = false;
        int stackIn_129_0 = 0;
        boolean stackIn_139_0 = false;
        boolean stackIn_155_0 = false;
        int stackIn_162_0 = 0;
        ak stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        boolean stackIn_182_2 = false;
        ak stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        boolean stackIn_187_2 = false;
        ak stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        boolean stackIn_192_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_109_0;
        boolean stackOut_138_0;
        boolean stackOut_154_0;
        RuntimeException var5 = null;
        ak var6 = null;
        ak var7 = null;
        ak var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        bb var17 = null;
        Object var18 = null;
        int var18_int = 0;
        uj var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        ak var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        ak var27 = null;
        int stackIn_51_0Lifetime1;
        int stackIn_60_0Lifetime1;
        int var13_intLifetime1;
        int var18_intLifetime1;
        int var13_intLifetime2;
        var18 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          cm.b(h.field_W, 4740);
          if (param1 != 1) {
            return;
          }
          if (io.field_c != null) {
            boolean decompiledFrameRemainder3 = true;
            gk.field_kb.field_rb = true;
            wm.field_d.field_nb = 0;
            var22 = wm.field_d;
            var27 = var22;
            var27.field_K = 0;
            var6 = ep.field_a;
            ep.field_a.field_nb = 0;
            var6.field_K = 0;
            var7 = nk.field_e;
            nk.field_e.field_nb = 0;
            var7.field_K = 0;
            if (!pl.m(param1 + 98)) {
              var9_ref_String = io.field_c.field_pc;
              vp.field_Qb.field_cb = sd.a(fk.field_q, param1 ^ 62, new String[]{var9_ref_String}).toUpperCase();
              nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, param1 + 255, ai.field_A.field_K);
              nk.field_e.field_cb = sd.a(qh.field_a, param1 + 23, new String[]{var9_ref_String});
              var8 = nk.field_e;
              decompiledFrameRemainder3 = (var19 != 0);
            }
            if (decompiledFrameRemainder3) {
              vp.field_Qb.field_cb = hk.field_g.toUpperCase();
              var9 = (ai.field_A.field_K + 2) / 2;
              wm.field_d.a(ai.field_A.field_nb - 40, 40, 0, 256, var9 - 2);
              if (io.field_c.field_ec <= io.field_c.field_mc) {
                wm.field_d.field_cb = fo.field_m.toUpperCase();
                wm.field_d.field_rb = false;
                if (var19 != 0) {
                  wm.field_d.field_cb = ca.field_k.toUpperCase();
                  wm.field_d.field_rb = true;
                }
              } else {
                wm.field_d.field_cb = ca.field_k.toUpperCase();
                wm.field_d.field_rb = true;
              }
              wm.field_d.field_zb = bf.field_k.field_zb;
              if (ka.field_X > 0) {
                boolean decompiledSharedTail1 = (ka.field_X != 1);
                if (!decompiledSharedTail1) {
                  var10_ref_String = sm.field_k;
                  decompiledSharedTail1 = (var19 != 0);
                }
                if (decompiledSharedTail1) {
                  var10_ref_String = sd.a(d.field_a, 99, new String[]{Integer.toString(ka.field_X)});
                }
                wm.field_d.field_cb = wm.field_d.field_cb + "<br>" + var10_ref_String;
                if (0 == (16 & rb.field_o) &&
                  !bm.field_o) {
                  wm.field_d.field_zb = bf.field_k.field_ab;
                }
              }
              ep.field_a.a(-40 + ai.field_A.field_nb, 40, var9, 256, -var9 + ai.field_A.field_K);
              ep.field_a.field_cb = kb.field_J.toUpperCase();
              var8 = ep.field_a;
              stackIn_21_0 = ep.field_a;
              stackIn_22_1 = (param0) && (bo.field_e == 0L);
              stackIn_21_0.field_rb = stackIn_22_1;
              var10 = 2;
              if (h.field_Z != null) {
                if (kf.field_o == null) {
                  kf.field_o = new byte[fj.field_b];
                  lc.field_t = new boolean[fj.field_b];
                }
                var11_int = 0;
                do {
                  if (!(fj.field_b > var11_int)) {
                    var10 = 0;
                    break;
                  }
                  lc.field_t[var11_int] = false;
                  var11_int++;
                } while (var19 == 0);
                L16: while (true) {
                  if (var10 < 2) {
                    var11_int = 0;
                    stackIn_66_0 = 0;
                    if (var19 != 0) {
                      break L16;
                    }
                    var12 = stackIn_66_0;
                    while (true) {
                      stackIn_36_0 = ~var12;
                      stackIn_36_1 = ~h.field_Z.length;
                      if (stackIn_36_0 > stackIn_36_1) {
                        var26 = h.field_Z[var12];
                        var23 = var26;
                        var20 = var23;
                        var13 = var20;
                        stackIn_60_0 = 0;
                        var14_int = stackIn_60_0;
                        L23: while (true) {
                          if (var14_int < var26.length) {
                            var15 = var26[var14_int];
                            var16 = var20[var14_int + 1];
                            stackIn_51_0 = ~var15;
                            if (stackIn_51_0 == 0) {
                              if (var10 == 0) {
                                stackIn_47_0 = io.field_c.field_ec;
                              } else {
                                stackIn_47_0 = io.field_c.field_mc;
                              }
                              var17_int = stackIn_47_0;
                              if (~var17_int != ~var16) {
                                break L23;
                              }
                            } else {
                              if (~var16 != ~(255 & io.field_c.field_Eb[var15])) {
                                break L23;
                              }
                            }
                            var14_int += 2;
                            continue;
                          }
                          var11_int = 1;
                          var14_int = -1;
                          stackIn_51_0Lifetime1 = 0;
                          var15 = stackIn_51_0Lifetime1;
                          while (var26.length > var15) {
                            var16 = var26[var15];
                            stackIn_36_0 = var16;
                            stackIn_36_1 = var14_int;
                            if (stackIn_36_0 > stackIn_36_1) {
                              var14_int = var16;
                            }
                            var15 += 2;
                          }
                          lc.field_t[var14_int] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_60_0Lifetime1 = var11_int;
                    if (stackIn_60_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_66_0 = ~wo.field_h;
                  break;
                }
                if (stackIn_66_0 <= -3 &&
                  bc.field_m[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder2 = true;
              if ((2 <= var10) &&
                (decompiledFrameRemainder3 = (null != jm.field_r ||
                w.field_z != null ||
                null != pa.field_a ||
                oo.field_e != null))) {
                var11_int = 0;
                var12 = 0;
                var13_int = 0;
                var14_int = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var16 < fj.field_b)))) {
                  var17_int = io.field_c.field_Eb[var16] & 255;
                  if (var19 == 0) {
                    if (jm.field_r != null &&
                      jm.field_r[var16] != null &&
                      jm.field_r[var16][var17_int]) {
                      var11_int = 1;
                    }
                    if (w.field_z != null &&
                      null != w.field_z[var16]) {
                      var18_int = w.field_z[var16][var17_int];
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                      if (var18_int != 0 &&
                        !fe.field_a) {
                        var11_int = 1;
                      }
                    }
                    if (null != pa.field_a &&
                      null != pa.field_a[var16]) {
                      var18_intLifetime1 = pa.field_a[var16][var17_int];
                      if (var14_int < var18_intLifetime1) {
                        var14_int = var18_intLifetime1;
                      }
                      if (var18_intLifetime1 != 0 &&
                        !fe.field_a) {
                        var11_int = 1;
                      }
                    }
                    if (oo.field_e != null &&
                      null != oo.field_e[var16]) {
                      var15 = var15 | oo.field_e[var16][var17_int];
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = ae.field_c.field_Fb.field_L;
                var18_ref = (uj) (var17.c(1504642273));
                L46: while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var18_ref != null) {
                    stackOut_109_0 = var18_ref.b((byte) -98);
                    stackIn_129_0 = stackOut_109_0 ? 1 : 0;
                    stackIn_110_0 = stackOut_109_0;
                    if (var19 != 0) {
                      break L46;
                    }
                    if (!stackIn_110_0) {
                      if (var11_int != 0 &&
                        !var18_ref.field_Xb) {
                        var16 = 1;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var18_ref.field_Rb < var13_int) {
                          var16 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var18_ref.field_Yb < var14_int) {
                            var16 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if ((~var18_ref.field_Ib & var15) > 0) {
                              var16 = 1;
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder0 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var18_ref = (uj) (var17.f(1504642273));
                      continue;
                    }
                  }
                  stackIn_129_0 = -3;
                  break;
                }
                if (stackIn_129_0 >= ~wo.field_h &&
                  bc.field_m[12]) {
                  var16 = 0;
                }
                if ((var16 == 0) &&
                  (decompiledFrameRemainder3 = (var19 != 0))) {
                  ep.field_a.field_rb = false;
                  decompiledFrameRemainder3 = !(!ep.field_a.field_R);
                  if (decompiledFrameRemainder3) {
                    var11 = null;
                    var12 = 0;
                    var13_intLifetime2 = 0;
                    decompiledFrameRemainder2 = !(var13_intLifetime2 >= fj.field_b);
                    if (decompiledFrameRemainder2) {
                      stackOut_138_0 = lc.field_t[var13_intLifetime2];
                      stackIn_162_0 = stackOut_138_0 ? 1 : 0;
                      stackIn_139_0 = stackOut_138_0;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  ep.field_a.field_rb = false;
                  if (ep.field_a.field_R) {
                    boolean decompiledSharedTail0 = (0 != nd.field_b.field_g.field_Jb);
                    if (!decompiledSharedTail0) {
                      up.field_o = pc.field_u;
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      up.field_o = sd.a(li.field_b, 107, new String[]{fb.field_Gb});
                    }
                  }
                  decompiledFrameRemainder3 = (var19 != 0);
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                ep.field_a.field_rb = false;
                decompiledFrameRemainder3 = !(!ep.field_a.field_R);
                if (decompiledFrameRemainder3) {
                  var11 = null;
                  var12 = 0;
                  var13_intLifetime1 = 0;
                  while (!(var13_intLifetime1 >= fj.field_b)) {
                    stackOut_154_0 = lc.field_t[var13_intLifetime1];
                    stackIn_162_0 = stackOut_154_0 ? 1 : 0;
                    stackIn_155_0 = stackOut_154_0;
                    if (var19 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_155_0) {
                      var25 = "<col=A00000>" + jk.field_e[var13_intLifetime1] + "</col>";
                      if (var11 != null) {
                        var11 = (String) (var11) + ", " + var25;
                        var12 = 1;
                      } else {
                        var11 = var25;
                      }
                    }
                    var13_intLifetime1++;
                  }
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameCompleted0)) {
                stackIn_162_0 = 0;
              }
              if (decompiledFrameRemainder3) {
                if (stackIn_162_0 == var10) {
                  var13_ref = ji.field_a;
                  if (var12 == 0) {
                    var14 = sd.a(sm.field_n, 80, new String[]{(String) (var11)});
                    if (var19 != 0) {
                      var14 = cf.field_x + (String) (var11);
                    }
                  } else {
                    var14 = cf.field_x + (String) (var11);
                  }
                } else {
                  var13_ref = aq.field_c;
                  if (var12 == 0) {
                    var14 = sd.a(ff.field_b, 31, new String[]{(String) (var11)});
                    if (var19 != 0) {
                      var14 = fg.field_b + (String) (var11);
                    }
                  } else {
                    var14 = fg.field_b + (String) (var11);
                  }
                }
                up.field_o = "<col=A00000>" + var13_ref + "<br>" + var14;
              }
            }
            if (0L != bo.field_e) {
              var9 = (int)(-hm.a(64) + bo.field_e);
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_cb = sd.a(ao.field_i, 100, new String[]{Integer.toString(var9)});
            }
            qo.field_q.field_cb = sd.a(oe.field_Gb, param1 + 68, new String[]{Integer.toString(io.field_c.field_mc), Integer.toString(io.field_c.field_ec)});
          }
          stackIn_181_0 = ff.field_h;
          stackIn_181_1 = -28476;
          stackIn_182_2 = (param4) && (!param3) && (!bm.field_o);
          ((ak) (Object) stackIn_181_0).a(stackIn_181_1, stackIn_182_2);
          stackIn_186_0 = ai.field_A;
          stackIn_186_1 = -28476;
          stackIn_187_2 = (param4) && (!param3) && (!bm.field_o);
          ((ak) (Object) stackIn_186_0).a(stackIn_186_1, stackIn_187_2);
          stackIn_191_0 = ra.field_e;
          stackIn_191_1 = -28476;
          stackIn_192_2 = (param4) && (!param3) && (bm.field_o);
          ((ak) (Object) stackIn_191_0).a(stackIn_191_1, stackIn_192_2);
          nd.field_b.field_g.b((byte) -122);
          if (null != io.field_c) {
            if (0 != gk.field_kb.field_P) {
              qg.a(io.field_c.c((byte) 8), param2, false);
            }
            if (0 != wm.field_d.field_P) {
              bm.field_o = true;
            }
            if (ep.field_a.field_P != 0) {
              of.field_c = true;
            }
            if (0 != hb.field_eb.field_P) {
              bm.field_o = false;
            }
            be.a(false, io.field_c, param2, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "no.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void e(int param0) {
        Object stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        tf var5 = null;
        tf var6 = null;
        tf var7 = null;
        int var3Lifetime1;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          t.a(243, 197, 369, 143, 16777215);
          t.d(244, 198, 367, 141, 0);
          if (wg.field_g == null) {
            if (null != qe.field_A) {
              qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          if (param0 != -19308) {
            field_p = (tf[]) null;
          }
          var5 = wg.field_g[ae.field_b];
          boolean decompiledSharedTail1 = (var5 == null);
          if (!decompiledSharedTail1) {
            var5.b(245, 199);
            decompiledSharedTail1 = (var4 != 0);
          }
          if ((decompiledSharedTail1) &&
            (qe.field_A != null)) {
            qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
          }
          if (ui.field_k > jn.field_q) {
            var6 = wg.field_g[jc.field_b];
            if (var6 != null) {
              var2_int = jn.field_q * (var6.field_A + 60) / ui.field_k;
              var3 = var2_int - 30;
              boolean decompiledSharedTail0 = !(pm.field_e);
              if (!decompiledSharedTail0) {
                kj.a(var3 * -256 / 30, var6, 245, -123, 199, (var6.field_A - var3) * 256 / 30);
                decompiledSharedTail0 = (var4 != 0);
              }
              if (decompiledSharedTail0) {
                kj.a(256 * (-var3 + var6.field_A) / 30, var6, 245, 89, 199, -256 * var3 / 30);
              }
            }
          }
          if (null != qe.field_A) {
            var2 = null;
            var3Lifetime1 = 0;
            while (true) {
              if (var3Lifetime1 < wg.field_g.length) {
                var7 = wg.field_g[var3Lifetime1];
                stackIn_33_0 = null;
                if (var4 == 0) {
                  if (stackIn_33_0 != var7 && (var7.field_A != 365 ||
                    var7.field_B != 139)) {
                    if (var2 != null) {
                      var2 = (String) (var2) + ", " + var3Lifetime1;
                    } else {
                      var2 = Integer.toString(var3Lifetime1);
                    }
                  }
                  var3Lifetime1++;
                  continue;
                }
              } else {
                stackIn_33_0 = null;
              }
              break;
            }
            if (stackIn_33_0 == var2) {
              return;
            }
            qe.field_A.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "no.P(" + param0 + ')');
        }
    }

    final static long d(int param0) {
        if (param0 != 8) {
          field_j = (String) null;
        }
        return -jc.field_c + hm.a(64);
    }

    final void a(jl param0, int param1, int param2, boolean param3, String param4) {
        mn var8 = null;
        mn var9 = null;
        if (param4 == null) {
          this.field_b = null;
          return;
        }
        if (this.field_l == param0 &&
          this.field_o &&
          this.field_i == 2 &&
          this.field_m != null &&
          this.field_m.equals(param4)) {
          return;
        }
        this.field_m = param4;
        this.field_i = 2;
        this.field_o = true;
        this.field_l = param0;
        if (param3) {
          return;
        }
        try {
          var8 = this.a(param4, 0, param0, param1);
          var9 = var8;
          var9.field_g[0] = -param0.c(param4) + param2;
          var9.field_g[param4.length()] = param2;
          an.a(param0, 0, (byte) -92, var9, param4);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "no.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final mn a(String param0, int param1, jl param2, int param3) {
        mn var5 = null;
        RuntimeException var5_ref = null;
        mn var6 = null;
        mn stackIn_2_0 = null;
        mn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new mn(-param2.field_w + param3, param3 + param2.field_z, param0.length());
          var5 = var6;
          if (param1 != 0) {
            stackIn_2_0 = (mn) null;
            return stackIn_2_0;
          }
          this.field_b = new mn[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("no.T(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, int param1, jl param2, int param3, int param4) {
        mn var7 = null;
        int var6_int = -72 % ((param4 + 70) / 49);
        if (param0 == null) {
          this.field_b = null;
          return;
        }
        if (this.field_l == param2 &&
          this.field_o &&
          0 == this.field_i &&
          this.field_m != null &&
          this.field_m.equals(param0)) {
          return;
        }
        try {
          this.field_o = true;
          this.field_l = param2;
          this.field_i = 0;
          this.field_m = param0;
          var7 = this.a(param0, 0, param2, param1);
          var7.field_g[0] = param3;
          var7.field_g[param0.length()] = param2.c(param0) + param3;
          an.a(param2, 0, (byte) -92, var7, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "no.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public no() {
    }

    static {
        field_n = "Asking for or providing contact information";
        field_g = "Unpacking graphics";
        field_h = 0;
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
