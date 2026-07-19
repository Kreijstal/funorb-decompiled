/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qv implements pa {
    private int[] field_h;
    private int field_p;
    private int field_f;
    private int[] field_k;
    private int field_u;
    private int[] field_m;
    private int field_a;
    private int[] field_g;
    private int[] field_c;
    private int[] field_b;
    private int[] field_n;
    private ha field_o;
    private int field_w;
    private int[] field_e;
    private int[] field_d;
    private v field_v;
    private vb field_q;
    static char[] field_i;
    private int field_t;
    static h field_l;
    private int field_s;
    static int[] field_j;
    static String field_r;

    public final boolean b(byte param0) {
        if (param0 >= -25) {
            return true;
        }
        return false;
    }

    private final void h(int param0) {
        if (-8 == (this.field_q.field_r.field_m ^ -1)) {
          this.field_f = 50;
          if (param0 != -7432) {
            return;
          } else {
            this.field_s = this.field_p * this.field_f;
            return;
          }
        } else {
          this.field_f = nu.field_z[ek.field_d];
          if (!ArmiesOfGielinor.field_M) {
            if (param0 != -7432) {
              return;
            } else {
              this.field_s = this.field_p * this.field_f;
              return;
            }
          } else {
            this.field_f = 50;
            if (param0 != -7432) {
              return;
            } else {
              this.field_s = this.field_p * this.field_f;
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte[] param4, int param5) {
        bv var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var6 = vl.field_n;
            var6.h(32161, param0);
            var6.field_q = var6.field_q + 1;
            if (param5 != 5623) {
                field_i = (char[]) null;
            }
            var7 = var6.field_q;
            var6.b(1, 4);
            var6.b(1, param1);
            var8 = param2;
            if (param3) {
                var8 += 128;
            }
            var6.b(1, var8);
            var6.a(param4, 0, param4.length, 102);
            var6.e(var6.field_q + -var7, 5930);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qv.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public final boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        kr var8 = null;
        String var9 = null;
        md var10 = null;
        String var11 = null;
        int[] var13 = null;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 57) {
                break L1;
              } else {
                this.field_u = 46;
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_u = 0;
                if (-1 != (param0.field_m ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    var8 = (kr) ((Object) param0);
                    var4 = this.field_t * var8.field_I + var8.field_H;
                    this.a(var8.field_B, true, var4);
                    if (null == var8.field_w) {
                      var8.field_w = this.field_o.c(var8.field_I, true, var8.field_H);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var8.field_w == null) {
                    var9 = ha.field_q + ": Can see start";
                    this.field_o.a(0, var9, param0);
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L5: {
                      if (var8.field_w.field_bb) {
                        var8.field_w = var8.field_w.b(false);
                        hs.b(-90, 29);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var8.field_w.field_z = 1;
                    var8.a(var8.field_w, 12);
                    this.b(var8, (byte) 58);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (7 != param0.field_m) {
                break L2;
              } else {
                var10 = (md) ((Object) param0);
                var4 = var10.field_D + var10.field_B * this.field_t;
                var10.field_w = this.field_o.c(var10.field_B, true, var10.field_D);
                if (null == var10.field_w) {
                  var11 = ha.field_q + ": Can see parasite";
                  this.field_o.a(0, var11, param0);
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L6: {
                    L7: {
                      var13 = new int[1];
                      if (var10.field_E - var10.field_D == 0) {
                        break L7;
                      } else {
                        L8: {
                          if ((-var10.field_D + var10.field_E ^ -1) < -1) {
                            break L8;
                          } else {
                            var13[0] = 3;
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var13[0] = 0;
                        if (var6 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (0 < var10.field_z + -var10.field_B) {
                        break L9;
                      } else {
                        var13[0] = 1;
                        if (var6 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var13[0] = 2;
                    break L6;
                  }
                  var10.a(var10.field_w, param1 + -45);
                  this.a(var13, true, var4);
                  this.b(var10, (byte) -94);
                  break L2;
                }
              }
            }
            stackOut_31_0 = 1;
            stackIn_32_0 = stackOut_31_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("qv.E(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            return stackIn_32_0 != 0;
          }
        }
    }

    final static void c(int param0) {
        String[][][] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        String[][][] var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = wh.a(117);
              var1 = var8;
              var2 = var8.length;
              if (sf.field_P.length >= var2) {
                break L1;
              } else {
                var2 = sf.field_P.length;
                break L1;
              }
            }
            var3 = fd.field_n[0].length;
            aw.field_j = new int[var2][var3][];
            if (param0 == -11757) {
              var4 = 0;
              L2: while (true) {
                L3: {
                  if (var4 >= var2) {
                    break L3;
                  } else {
                    var5 = sf.field_P[var4];
                    var6 = jq.field_I[var5];
                    bd.a(var8[var4], var6, var4, 2378077);
                    var4++;
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
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
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "qv.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        this.field_e[0] = this.field_d[0];
        this.field_e[1] = this.field_d[1];
        if (0 < this.field_p) {
          var2 = this.field_h[0];
          this.field_k[1] = 0;
          this.field_k[0] = 0;
          this.a(var2, 96);
          if (param0 <= 24) {
            return;
          } else {
            this.field_n[1] = this.field_e[1] - -this.field_k[1];
            this.field_n[0] = this.field_k[0] + this.field_e[0];
            return;
          }
        } else {
          return;
        }
    }

    public final void a(byte param0) {
        if (param0 != -52) {
            qv.c(101);
        }
    }

    private final boolean a(boolean param0) {
        int var2 = 0;
        if (!param0) {
          var2 = this.field_u / this.field_f;
          this.field_a = (-(this.field_f * this.field_w) + this.field_u << -409834360) / this.field_f;
          if (var2 == this.field_w) {
            return false;
          } else {
            if (this.field_w + 1 == var2) {
              this.field_w = var2;
              this.field_e[1] = this.field_n[1];
              this.field_e[0] = this.field_n[0];
              this.field_k[1] = 0;
              this.field_k[0] = 0;
              this.field_a = (-(this.field_f * this.field_w) + this.field_u << -1630569304) / this.field_f;
              this.a(this.field_h[this.field_w], 126);
              this.field_n[0] = this.field_e[0] + this.field_k[0];
              this.field_n[1] = this.field_k[1] + this.field_e[1];
              if (ArmiesOfGielinor.field_M) {
                this.i(-14628);
                this.field_w = var2;
                this.field_a = (-(this.field_f * this.field_w) + this.field_u << 117933000) / this.field_f;
                return true;
              } else {
                return true;
              }
            } else {
              this.i(-14628);
              this.field_w = var2;
              this.field_a = (-(this.field_f * this.field_w) + this.field_u << 117933000) / this.field_f;
              return true;
            }
          }
        } else {
          this.field_b = (int[]) null;
          var2 = this.field_u / this.field_f;
          this.field_a = (-(this.field_f * this.field_w) + this.field_u << -409834360) / this.field_f;
          if (var2 == this.field_w) {
            return false;
          } else {
            if (this.field_w + 1 == var2) {
              this.field_w = var2;
              this.field_e[1] = this.field_n[1];
              this.field_e[0] = this.field_n[0];
              this.field_k[1] = 0;
              this.field_k[0] = 0;
              this.field_a = (-(this.field_f * this.field_w) + this.field_u << -1630569304) / this.field_f;
              this.a(this.field_h[this.field_w], 126);
              this.field_n[0] = this.field_e[0] + this.field_k[0];
              this.field_n[1] = this.field_k[1] + this.field_e[1];
              if (!ArmiesOfGielinor.field_M) {
                return true;
              } else {
                this.i(-14628);
                this.field_w = var2;
                this.field_a = (-(this.field_f * this.field_w) + this.field_u << 117933000) / this.field_f;
                return true;
              }
            } else {
              this.i(-14628);
              this.field_w = var2;
              this.field_a = (-(this.field_f * this.field_w) + this.field_u << 117933000) / this.field_f;
              return true;
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (-2 == (param0 ^ -1)) {
            this.field_k[1] = -1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 == param0) {
            this.field_k[0] = 1;
            break L1;
          } else {
            break L1;
          }
        }
        var3 = 86 / ((28 - param1) / 55);
        if (param0 == 2) {
          L2: {
            this.field_k[1] = 1;
            if (-4 == (param0 ^ -1)) {
              this.field_k[0] = -1;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (-4 == (param0 ^ -1)) {
              this.field_k[0] = -1;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public final void c(byte param0) {
        if (param0 >= -119) {
            this.a((byte) 114);
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        g var14 = null;
        StringWriter var15 = null;
        String var20 = null;
        BufferedReader var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        BufferedReader var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        L0: {
          L1: {
            var13 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!(param1 instanceof g)) {
              break L1;
            } else {
              var14 = (g) ((Object) param1);
              param1 = var14.field_b;
              var2 = var14.field_g + " | ";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          break L0;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        if (param0 == 0) {
          param1.printStackTrace(var4);
          var4.close();
          var20 = var15.toString();
          var11 = var20;
          var2 = var11;
          var11 = var20;
          var21 = new BufferedReader((Reader) ((Object) new StringReader(var20)));
          var27 = var21.readLine();
          var11 = var27;
          var2 = var11;
          var11 = var27;
          L2: while (true) {
            L3: {
              var22 = var21.readLine();
              var11 = var22;
              var2 = var11;
              var11 = var22;
              if (var22 == null) {
                var2 = var2 + "| " + var27;
                var11 = var2;
                var2 = var11;
                var11 = var2;
                break L3;
              } else {
                var9 = var22.indexOf('(');
                var10 = var22.indexOf(')', var9 - -1);
                if (var13 != 0) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (var9 != -1) {
                        break L5;
                      } else {
                        var11 = var22;
                        if (var13 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = var22.substring(0, var9);
                    var2 = var11;
                    var2 = var11;
                    break L4;
                  }
                  L6: {
                    var23 = var11.trim();
                    var2 = var23;
                    var2 = var23;
                    var24 = var23.substring(var23.lastIndexOf(' ') - -1);
                    var2 = var24;
                    var2 = var24;
                    var25 = var24.substring(1 + var24.lastIndexOf('\t'));
                    var2 = var25;
                    var2 = var25;
                    var26 = var2 + var25;
                    var2 = var26;
                    var2 = var26;
                    var2 = var26;
                    if (-1 == var9) {
                      break L6;
                    } else {
                      if (0 == (var10 ^ -1)) {
                        break L6;
                      } else {
                        var12 = var22.indexOf(".java:", var9);
                        if (0 > var12) {
                          break L6;
                        } else {
                          var2 = var26 + var22.substring(var12 - -5, var10);
                          break L6;
                        }
                      }
                    }
                  }
                  var2 = var2 + ' ';
                  continue L2;
                }
              }
            }
            return var2;
          }
        } else {
          field_i = (char[]) null;
          param1.printStackTrace(var4);
          var4.close();
          var28 = var15.toString();
          var11 = var28;
          var2 = var11;
          var11 = var28;
          var29 = new BufferedReader((Reader) ((Object) new StringReader(var28)));
          var6 = var29;
          var35 = var29.readLine();
          var11 = var35;
          var2 = var11;
          var11 = var35;
          var7 = var35;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L7: while (true) {
            L8: {
              var30 = var29.readLine();
              var11 = var30;
              var2 = var11;
              var11 = var30;
              if (var30 == null) {
                var2 = var2 + "| " + var35;
                var11 = var2;
                var2 = var11;
                var11 = var2;
                break L8;
              } else {
                var9 = var30.indexOf('(');
                var10 = var30.indexOf(')', var9 - -1);
                if (var13 != 0) {
                  break L8;
                } else {
                  L9: {
                    L10: {
                      if (var9 != -1) {
                        break L10;
                      } else {
                        var11 = var30;
                        if (var13 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var11 = var30.substring(0, var9);
                    var2 = var11;
                    var2 = var11;
                    break L9;
                  }
                  L11: {
                    var31 = var11.trim();
                    var2 = var31;
                    var2 = var31;
                    var32 = var31.substring(var31.lastIndexOf(' ') - -1);
                    var2 = var32;
                    var2 = var32;
                    var33 = var32.substring(1 + var32.lastIndexOf('\t'));
                    var2 = var33;
                    var2 = var33;
                    var34 = var2 + var33;
                    var2 = var34;
                    var2 = var34;
                    var2 = var34;
                    if (-1 == var9) {
                      break L11;
                    } else {
                      if (0 == (var10 ^ -1)) {
                        break L11;
                      } else {
                        var12 = var30.indexOf(".java:", var9);
                        if (0 > var12) {
                          break L11;
                        } else {
                          var2 = var34 + var30.substring(var12 - -5, var10);
                          break L11;
                        }
                      }
                    }
                  }
                  var2 = var2 + ' ';
                  continue L7;
                }
              }
            }
            return var2;
          }
        }
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (this.field_h == null) {
            break L0;
          } else {
            if ((this.field_h.length ^ -1) <= -2) {
              L1: {
                var2 = this.field_h[this.field_w];
                var3 = 1792;
                if (1 == var2) {
                  var3 -= 1024;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == -69) {
                  break L2;
                } else {
                  this.field_d = (int[]) null;
                  break L2;
                }
              }
              L3: {
                if (var2 != 0) {
                  break L3;
                } else {
                  var3 -= 512;
                  break L3;
                }
              }
              L4: {
                if ((var2 ^ -1) != -3) {
                  break L4;
                } else {
                  var3 += 0;
                  break L4;
                }
              }
              if (-4 == (var2 ^ -1)) {
                var3 -= 1536;
                return var3;
              } else {
                return var3;
              }
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    private final void e(int param0) {
        int var2 = this.field_m[0] - this.field_c[0];
        var2 = this.field_a * var2 >> 2001831496;
        int var3 = this.field_m[1] - this.field_c[param0];
        this.field_b[0] = var2 + this.field_c[0];
        var3 = this.field_a * var3 >> -1772175000;
        this.field_b[1] = var3 + this.field_c[1];
    }

    public final void a(int param0) {
        if (param0 < 94) {
            this.field_g = (int[]) null;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_n[0] = this.field_d[0];
          this.field_n[1] = this.field_d[1];
          this.field_k[0] = 0;
          this.field_k[1] = 0;
          if (param0 == -14628) {
            break L0;
          } else {
            this.e(87);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 <= this.field_w) {
            this.a(this.field_h[this.field_w], 104);
            this.field_n[0] = this.field_n[0] + this.field_k[0];
            this.field_n[1] = this.field_n[1] + this.field_k[1];
            var2++;
            if (var3 == 0) {
              continue L1;
            } else {
              return;
            }
          } else {
            this.field_e[0] = this.field_n[0] - this.field_k[0];
            this.field_e[1] = -this.field_k[1] + this.field_n[1];
            return;
          }
        }
    }

    private final void f(byte param0) {
        this.field_w = this.field_p - 1;
        this.i(-14628);
        if (param0 > -79) {
          this.field_k = (int[]) null;
          this.field_g[0] = this.field_n[0];
          this.field_g[1] = this.field_n[1];
          return;
        } else {
          this.field_g[0] = this.field_n[0];
          this.field_g[1] = this.field_n[1];
          return;
        }
    }

    public static void g(int param0) {
        field_r = null;
        if (param0 <= 3) {
            return;
        }
        field_l = null;
        field_j = null;
        field_i = null;
    }

    public final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 8865) {
          L0: {
            this.field_d = (int[]) null;
            if (this.field_s > this.field_u) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_s > this.field_u) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private final void a(boolean param0, oj param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              this.field_q.field_x = this.f(-4923);
              if (param0) {
                break L1;
              } else {
                discarded$2 = qv.j(101);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = 0;
                var4 = 0;
                if (0 != (this.field_q.field_x ^ -1)) {
                  break L3;
                } else {
                  var3_int = this.field_e[0];
                  var4 = this.field_e[1];
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (1 != (this.field_q.field_x ^ -1)) {
                break L2;
              } else {
                var3_int = this.field_n[0];
                var4 = this.field_n[1];
                break L2;
              }
            }
            this.field_q.field_x = var4 * this.field_t + var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("qv.M(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static boolean j(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -11) {
          if (-11 >= (p.field_b ^ -1)) {
            if (bl.field_b) {
              return false;
            } else {
              L0: {
                if (go.a(-103)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    qv(ha param0, v param1, vb param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            this.field_n = new int[2];
            this.field_c = new int[2];
            this.field_o = param0;
            this.field_m = new int[2];
            this.field_v = param1;
            this.field_t = param0.field_v;
            this.field_q = param2;
            this.field_b = new int[2];
            this.field_g = new int[2];
            this.field_e = new int[2];
            this.field_d = new int[2];
            this.field_k = new int[2];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4);
            stackOut_3_1 = new StringBuilder().append("qv.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void a(int[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
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
            this.field_h = param0;
            this.field_p = this.field_h.length;
            this.field_d[1] = param2 / this.field_t;
            this.field_d[0] = -(this.field_d[1] * this.field_t) + param2;
            this.f((byte) -116);
            this.h(-7432);
            this.field_w = 0;
            if (param1) {
              this.d((byte) 56);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("qv.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(oj param0, byte param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        jd var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
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
              if (!this.a(false)) {
                break L1;
              } else {
                dh.a(param0.field_w.field_N, 0, 32);
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                this.a(true, param0);
                this.d(22);
                this.e(1);
                this.field_q.field_m = this.field_b[0];
                this.field_q.field_v = this.field_b[1];
                var3_int = this.e((byte) -69);
                var4 = param0.field_w;
                if (param0.field_m != 7) {
                  var4.field_z = 1;
                  break L2;
                } else {
                  var4.field_z = 5;
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    var4.field_z = 1;
                    break L2;
                  }
                }
              }
              discarded$1 = this.field_q.field_u.a(1 + this.field_q.field_m, -35, this.field_q.field_v - 6, var3_int, var4);
              var5 = 115 / ((param1 - -26) / 48);
              this.field_u = this.field_u + 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("qv.Q(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != this.field_h) {
          if (1 <= this.field_h.length) {
            var2 = this.field_h[this.field_w];
            if (param0 != -4923) {
              return -113;
            } else {
              L0: {
                var3 = -1;
                if ((var2 ^ -1) == -2) {
                  var3 = -1;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (var2 != 0) {
                  break L1;
                } else {
                  var3 = -1;
                  break L1;
                }
              }
              L2: {
                if (2 == var2) {
                  var3 = -2;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 != var2) {
                  break L3;
                } else {
                  var3 = -2;
                  break L3;
                }
              }
              return var3;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private final void d(int param0) {
        if (param0 <= 12) {
          this.field_q = (vb) null;
          this.field_v.field_c[1] = this.field_e[1];
          this.field_v.field_c[0] = this.field_e[0];
          this.field_v.f(-88);
          this.field_v.i(0);
          this.field_c[1] = this.field_v.field_e[1];
          this.field_c[0] = this.field_v.field_e[0];
          this.field_v.field_c[1] = this.field_n[1];
          this.field_v.field_c[0] = this.field_n[0];
          this.field_v.f(-54);
          this.field_v.i(0);
          this.field_m[0] = this.field_v.field_e[0];
          this.field_m[1] = this.field_v.field_e[1];
          return;
        } else {
          this.field_v.field_c[1] = this.field_e[1];
          this.field_v.field_c[0] = this.field_e[0];
          this.field_v.f(-88);
          this.field_v.i(0);
          this.field_c[1] = this.field_v.field_e[1];
          this.field_c[0] = this.field_v.field_e[0];
          this.field_v.field_c[1] = this.field_n[1];
          this.field_v.field_c[0] = this.field_n[0];
          this.field_v.f(-54);
          this.field_v.i(0);
          this.field_m[0] = this.field_v.field_e[0];
          this.field_m[1] = this.field_v.field_e[1];
          return;
        }
    }

    static {
        field_i = new char[]{(char)91, (char)93, (char)35};
        field_l = new h(0);
        field_r = "This item can only be used on enemy units.";
    }
}
