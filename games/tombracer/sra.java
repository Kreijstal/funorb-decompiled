/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sra implements eb {
    static boolean field_t;
    private boolean field_c;
    private cn field_g;
    private cn field_p;
    private cn field_e;
    private cn field_m;
    private static String[] field_v;
    private cn field_j;
    private cn field_o;
    private cn field_k;
    private cn field_d;
    private cn field_f;
    private cn field_h;
    static String field_i;
    private cn field_q;
    private cn field_a;
    private cn field_b;
    static String[] field_u;
    private boolean field_n;
    private cn field_s;
    private cn field_l;
    private cn field_r;

    public final void a(byte param0) {
        ina dupTemp$1 = null;
        cn var3 = null;
        ina var4 = null;
        cn var6 = null;
        cn var7 = null;
        L0: {
          if (null != oqa.field_v) {
            pfa.a(oqa.field_v, param0 + 157);
            oqa.field_v = null;
            ea.a(-33);
            break L0;
          } else {
            break L0;
          }
        }
        this.field_h = dd.a(16, param0 ^ -37);
        this.field_q = dd.a(17, param0 ^ -37);
        this.field_p = dd.a(18, param0 + 39);
        this.field_j = dd.a(19, 1);
        this.field_g = dd.a(20, 1);
        this.field_f = dd.a(21, 1);
        this.field_a = dd.a(22, param0 + 39);
        this.field_r = dd.a(23, 1);
        this.field_m = dd.a(24, 1);
        this.field_k = dd.a(26, 1);
        this.field_l = dd.a(27, 1);
        this.field_o = dd.a(28, 1);
        this.field_b = dd.a(29, 1);
        this.field_d = dd.a(30, 1);
        this.field_s = dd.a(ea.field_i.field_c, 1);
        if (param0 == -38) {
          this.field_e = dd.a(kn.field_j.field_c, param0 ^ -37);
          var6 = oma.field_G;
          var7 = var6;
          var3 = ota.field_b;
          dupTemp$1 = new ina(55);
          lba.field_r = dupTemp$1;
          var4 = dupTemp$1;
          var4.a(256, this.field_k, fv.field_d[0], hca.field_U[0]);
          var4.a(256, this.field_l, fv.field_d[1], hca.field_U[1]);
          var4.a(256, this.field_o, fv.field_d[2], hca.field_U[2]);
          var4.a(256, this.field_b, fv.field_d[3], hca.field_U[3]);
          var4.a(256, this.field_h, fv.field_d[4], hca.field_U[4]);
          var4.a(param0 ^ -294, this.field_p, fv.field_d[5], hca.field_U[5]);
          var4.a(256, this.field_s, fv.field_d[6], hca.field_U[6]);
          var4.a(hca.field_U[7], (byte) -36, "basic", var7, fv.field_d[7]);
          var4.a(hca.field_U[8], (byte) -36, "lobby", var7, fv.field_d[8]);
          var4.a(hca.field_U[9], (byte) -36, "lobby", var3, fv.field_d[9]);
          var4.a(256, this.field_d, fv.field_d[10], hca.field_U[10]);
          var4.a(256, this.field_e, fv.field_d[11], hca.field_U[11]);
          var4.a(256, this.field_q, fv.field_d[12], hca.field_U[12]);
          var4.a(256, this.field_r, fv.field_d[13], hca.field_U[13]);
          var4.a(256, this.field_m, fv.field_d[14], hca.field_U[14]);
          var4.a(param0 + 294, this.field_j, fv.field_d[15], hca.field_U[15]);
          var4.a(256, this.field_f, fv.field_d[16], hca.field_U[16]);
          var4.a(param0 ^ -294, this.field_g, fv.field_d[17], hca.field_U[17]);
          var4.a(param0 ^ -294, this.field_a, fv.field_d[18], hca.field_U[18]);
          return;
        } else {
          return;
        }
    }

    final static String[][] a(byte param0, uia param1) {
        vna var2 = null;
        RuntimeException var2_ref = null;
        String[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vna var7 = null;
        vna stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        vna stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        String[][] stackIn_10_0 = null;
        String[][] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        vna stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        vna stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        String[][] stackOut_9_0 = null;
        String[][] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = new vna();
            var2 = var7;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1.field_h >= param1.field_g.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = (vna) (var2);
                    stackOut_3_1 = -72;
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_7_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      ((vna) (Object) stackIn_4_0).b((byte) stackIn_4_1, new gba(pe.a(param1, (byte) 73)));
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_6_0 = (vna) (var2);
                stackOut_6_1 = -16;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              }
              var3 = new String[((vna) (Object) stackIn_7_0).a((byte) stackIn_7_1)][];
              var4 = -92 / ((param0 - -9) / 51);
              var5 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3.length <= var5) {
                      break L6;
                    } else {
                      stackOut_9_0 = (String[][]) (var3);
                      stackIn_13_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var6 != 0) {
                        break L5;
                      } else {
                        stackIn_10_0[var5] = ((gba) ((Object) var7.c(44))).field_g;
                        var5++;
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = (String[][]) (var3);
                  stackIn_13_0 = stackOut_12_0;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2_ref);
            stackOut_14_1 = new StringBuilder().append("sra.H(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final void a(int param0, byte param1, String param2) {
        try {
            if (param1 != 47) {
                this.field_e = (cn) null;
            }
            ima.a((float)param0, param2, -106);
            ad.field_j.c(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sra.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 5 / ((55 - param0) / 58);
        if (this.field_e == null) {
          if (this.field_d == null) {
            if (this.field_h == null) {
              if (this.field_j == null) {
                if (null == this.field_f) {
                  L0: {
                    if (this.field_k == null) {
                      break L0;
                    } else {
                      if (this.field_l == null) {
                        break L0;
                      } else {
                        if (this.field_b == null) {
                          break L0;
                        } else {
                          if (this.field_o != null) {
                            sb.a(-70, this.field_k, this.field_o, this.field_l, this.field_b);
                            var3 = 0;
                            L1: while (true) {
                              L2: {
                                if (237 <= var3) {
                                  var3 = 0;
                                  break L2;
                                } else {
                                  fea.a(false, var3);
                                  var3++;
                                  if (var4 != 0) {
                                    break L2;
                                  } else {
                                    if (var4 == 0) {
                                      continue L1;
                                    } else {
                                      var3 = 0;
                                      L3: while (true) {
                                        if (-5 >= (var3 ^ -1)) {
                                          ab.field_n.field_y.e(0);
                                          this.field_o = null;
                                          this.field_k = null;
                                          this.field_l = null;
                                          this.field_b = null;
                                          return;
                                        } else {
                                          paa.a(false, var3);
                                          var3++;
                                          if (var4 != 0) {
                                            return;
                                          } else {
                                            if (var4 == 0) {
                                              continue L3;
                                            } else {
                                              ab.field_n.field_y.e(0);
                                              this.field_o = null;
                                              this.field_k = null;
                                              this.field_l = null;
                                              this.field_b = null;
                                              return;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L4: while (true) {
                                if (-5 >= (var3 ^ -1)) {
                                  ab.field_n.field_y.e(0);
                                  this.field_o = null;
                                  this.field_k = null;
                                  this.field_l = null;
                                  this.field_b = null;
                                  return;
                                } else {
                                  paa.a(false, var3);
                                  var3++;
                                  if (var4 != 0) {
                                    return;
                                  } else {
                                    if (var4 == 0) {
                                      continue L4;
                                    } else {
                                      ab.field_n.field_y.e(0);
                                      this.field_o = null;
                                      this.field_k = null;
                                      this.field_l = null;
                                      this.field_b = null;
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (baa.field_d != null) {
                              ih.D(17229);
                              if (null == baa.field_d.field_i) {
                                return;
                              } else {
                                this.field_c = true;
                                return;
                              }
                            } else {
                              this.a(95, (byte) 47, uba.field_g[9]);
                              bha.e((byte) -33);
                              baa.field_d = new di(qra.field_l, rc.field_a);
                              ih.D(17229);
                              if (null == baa.field_d.field_i) {
                                return;
                              } else {
                                this.field_c = true;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (baa.field_d != null) {
                    ih.D(17229);
                    if (null == baa.field_d.field_i) {
                      return;
                    } else {
                      this.field_c = true;
                      return;
                    }
                  } else {
                    this.a(95, (byte) 47, uba.field_g[9]);
                    bha.e((byte) -33);
                    baa.field_d = new di(qra.field_l, rc.field_a);
                    ih.D(17229);
                    if (null == baa.field_d.field_i) {
                      return;
                    } else {
                      this.field_c = true;
                      return;
                    }
                  }
                } else {
                  nfa.a(this.field_f, uba.field_g[8], false, 90, this.field_g, this.field_a);
                  this.field_g = null;
                  this.field_a = null;
                  this.field_f = null;
                  ea.a(-33);
                  return;
                }
              } else {
                ui.a(this.field_j, uba.field_g[7], 80, -79);
                this.field_j = null;
                ea.a(-33);
                return;
              }
            } else {
              if (null == this.field_p) {
                if (this.field_j == null) {
                  if (null == this.field_f) {
                    if (this.field_k != null) {
                      if (this.field_l != null) {
                        L5: {
                          if (this.field_b == null) {
                            break L5;
                          } else {
                            if (this.field_o != null) {
                              sb.a(-70, this.field_k, this.field_o, this.field_l, this.field_b);
                              var3 = 0;
                              L6: while (true) {
                                L7: {
                                  if (237 <= var3) {
                                    var3 = 0;
                                    break L7;
                                  } else {
                                    fea.a(false, var3);
                                    var3++;
                                    if (var4 != 0) {
                                      break L7;
                                    } else {
                                      continue L6;
                                    }
                                  }
                                }
                                L8: while (true) {
                                  if (-5 < (var3 ^ -1)) {
                                    paa.a(false, var3);
                                    var3++;
                                    if (var4 == 0) {
                                      continue L8;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    ab.field_n.field_y.e(0);
                                    this.field_o = null;
                                    this.field_k = null;
                                    this.field_l = null;
                                    this.field_b = null;
                                    return;
                                  }
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (baa.field_d != null) {
                          ih.D(17229);
                          if (null == baa.field_d.field_i) {
                            return;
                          } else {
                            this.field_c = true;
                            return;
                          }
                        } else {
                          this.a(95, (byte) 47, uba.field_g[9]);
                          bha.e((byte) -33);
                          baa.field_d = new di(qra.field_l, rc.field_a);
                          ih.D(17229);
                          if (null == baa.field_d.field_i) {
                            return;
                          } else {
                            this.field_c = true;
                            return;
                          }
                        }
                      } else {
                        L9: {
                          if (baa.field_d != null) {
                            break L9;
                          } else {
                            this.a(95, (byte) 47, uba.field_g[9]);
                            bha.e((byte) -33);
                            baa.field_d = new di(qra.field_l, rc.field_a);
                            break L9;
                          }
                        }
                        ih.D(17229);
                        if (null == baa.field_d.field_i) {
                          return;
                        } else {
                          this.field_c = true;
                          return;
                        }
                      }
                    } else {
                      L10: {
                        if (baa.field_d != null) {
                          break L10;
                        } else {
                          this.a(95, (byte) 47, uba.field_g[9]);
                          bha.e((byte) -33);
                          baa.field_d = new di(qra.field_l, rc.field_a);
                          break L10;
                        }
                      }
                      ih.D(17229);
                      if (null == baa.field_d.field_i) {
                        return;
                      } else {
                        this.field_c = true;
                        return;
                      }
                    }
                  } else {
                    nfa.a(this.field_f, uba.field_g[8], false, 90, this.field_g, this.field_a);
                    this.field_g = null;
                    this.field_a = null;
                    this.field_f = null;
                    ea.a(-33);
                    return;
                  }
                } else {
                  ui.a(this.field_j, uba.field_g[7], 80, -79);
                  this.field_j = null;
                  ea.a(-33);
                  return;
                }
              } else {
                fp.a(uba.field_g[1], 40, this.field_h, (byte) 17);
                bja.a((byte) -105, this.field_p, 50, uba.field_g[2]);
                this.field_p = null;
                mj.a((byte) -86, uba.field_g[3], this.field_q, this.field_h, 60);
                this.a(65, (byte) 47, uba.field_g[4]);
                dqa.a(this.field_r, this.field_m, (byte) 55, this.field_h);
                this.a(70, (byte) 47, uba.field_g[5]);
                this.d(-10242);
                this.a(75, (byte) 47, uba.field_g[6]);
                this.field_r = null;
                this.field_m = null;
                this.field_h = null;
                ea.a(-33);
                return;
              }
            }
          } else {
            wca.a(-18035);
            this.a(30, (byte) 47, uba.field_g[0]);
            gda.a(this.field_d, 17572);
            uo.b((byte) -125);
            this.field_d = null;
            ea.a(-33);
            return;
          }
        } else {
          csa.a(1048576, new kra(this.field_e.a("", (byte) 113, "huffman")));
          this.field_e = null;
          ea.a(-33);
          return;
        }
    }

    public final boolean a(int param0) {
        if (!this.field_n) {
          if (lga.b(false)) {
            this.field_n = true;
            if (param0 > -124) {
              this.field_a = (cn) null;
              return this.field_n;
            } else {
              return this.field_n;
            }
          } else {
            if (param0 > -124) {
              this.field_a = (cn) null;
              return this.field_n;
            } else {
              return this.field_n;
            }
          }
        } else {
          if (param0 > -124) {
            this.field_a = (cn) null;
            return this.field_n;
          } else {
            return this.field_n;
          }
        }
    }

    final static String a(String param0, int param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            Exception var5 = null;
            int var5_int = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            kh var9 = null;
            kh var11 = null;
            esa var12 = null;
            byte[] var15 = null;
            String stackIn_10_0 = null;
            String stackIn_16_0 = null;
            String stackIn_18_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_9_0 = null;
            String stackOut_15_0 = null;
            String stackOut_17_0 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            var8 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                var9 = new kh(128);
                var9.field_h = var9.field_h + 2;
                var3 = var9.field_h;
                var9.i(8);
                try {
                  L1: {
                    var4_int = 0;
                    L2: while (true) {
                      L3: {
                        if (param0.length() <= var4_int) {
                          break L3;
                        } else {
                          var5_int = param0.charAt(var4_int);
                          if (var8 != 0) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            L4: {
                              if (Character.isWhitespace((char) var5_int)) {
                                break L4;
                              } else {
                                var6 = Character.digit((char) var5_int, 16);
                                var9.j(var6, 4);
                                break L4;
                              }
                            }
                            var4_int++;
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (Exception) (Object) decompiledCaughtException;
                  var4.printStackTrace();
                  stackOut_9_0 = "Unable to pack " + param0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
                L5: {
                  if (decompiledRegionSelector0 == 0) {
                    var9.k(-1826190686);
                    var9.b(-var3 + var9.field_h, (byte) 109);
                    var9.field_h = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var4 = null;
                try {
                  L6: {
                    var15 = ssa.a(var9, -26, true);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var5 = (Exception) (Object) decompiledCaughtException;
                  var5.printStackTrace();
                  stackOut_15_0 = "funorb profile threw Exception";
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                }
                var11 = new kh(var15);
                var12 = new esa();
                var7 = -101 % ((-14 - param1) / 49);
                var6 = var11.h(255);
                dga.a(var11, 0);
                var12.a(var11, var6, (byte) 39);
                mq.field_e = var12.a(79);
                f.field_e = var12.b((byte) -78);
                toa.field_j = true;
                stackOut_17_0 = "profile loaded";
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L7: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) (var2);
                stackOut_19_1 = new StringBuilder().append("sra.G(");
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (param0 == null) {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L7;
                } else {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L7;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
            }
            return stackIn_18_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean b(int param0) {
        rg.e(-2339);
        ln.A(67);
        if (!this.field_c) {
          this.c(124);
          return false;
        } else {
          ea.a(-33);
          if (param0 != -4171) {
            return true;
          } else {
            return true;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != -35) {
          field_u = (String[]) null;
          field_u = null;
          field_v = null;
          field_i = null;
          return;
        } else {
          field_u = null;
          field_v = null;
          field_i = null;
          return;
        }
    }

    public final void b(byte param0) {
        bla.a(cq.field_d, (byte) 52);
        hd.a(50, param0 ^ -78);
        wm.field_a = null;
        hb.field_t = (dfa) ((Object) nl.a(0, (byte) 50));
        ima.a(100.0f, uba.field_g[10], param0 ^ 115);
        ad.field_j.c(param0 ^ -49);
        gn.field_C.a(-19216);
        if (param0 == -49) {
          cla.f(0);
          ea.a(param0 + 16);
          if (null == mq.field_e) {
            return;
          } else {
            eda.a(mq.field_e.field_g, true);
            return;
          }
        } else {
          this.c(-107);
          cla.f(0);
          ea.a(param0 + 16);
          if (null == mq.field_e) {
            return;
          } else {
            eda.a(mq.field_e.field_g, true);
            return;
          }
        }
    }

    private final void d(int param0) {
        iu[] array$2 = null;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        iu[][] var7 = null;
        iu[][] var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = new iu[haa.field_C.length][];
        var8 = var7;
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (haa.field_C.length <= var4) {
                break L2;
              } else {
                array$2 = new iu[haa.field_C[var4].length];
                var7[var4] = array$2;
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  var5 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var5 >= haa.field_C[var4].length) {
                          break L5;
                        } else {
                          incrementValue$3 = var3;
                          var3++;
                          var7[var4][var5] = bp.field_m[incrementValue$3];
                          var5++;
                          if (var6 != 0) {
                            break L4;
                          } else {
                            if (var6 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var4++;
                      break L4;
                    }
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = param0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          if (stackIn_11_0 != -10242) {
            L6: {
              this.b((byte) 30);
              if (!dna.field_G) {
                dea.field_c = false;
                op.a(this.field_s, 10, ws.field_o, fr.field_b, oma.field_G, qaa.field_a, 4, var8, true, 2, via.field_c, ota.field_b, jf.field_t, mga.field_f, var8);
                cq.field_d = qw.field_f;
                tda.a(200, (byte) -71);
                fta.field_b = ff.field_p;
                break L6;
              } else {
                break L6;
              }
            }
            return;
          } else {
            L7: {
              if (!dna.field_G) {
                dea.field_c = false;
                op.a(this.field_s, 10, ws.field_o, fr.field_b, oma.field_G, qaa.field_a, 4, var8, true, 2, via.field_c, ota.field_b, jf.field_t, mga.field_f, var8);
                cq.field_d = qw.field_f;
                tda.a(200, (byte) -71);
                fta.field_b = ff.field_p;
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        }
    }

    sra() {
        this.field_c = false;
    }

    static {
        field_v = new String[6];
        field_v[3] = "Key";
        field_v[0] = "Coin";
        field_v[2] = "Idol";
        field_v[4] = "Gun";
        field_v[1] = "Coinbag";
        field_v[5] = "Powerup: Misc";
        field_u = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_i = "Return to game";
    }
}
