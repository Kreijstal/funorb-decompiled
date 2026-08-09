/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tjb extends llb {
    private int field_Jb;
    static String field_Cb;
    static int field_wb;
    private int field_zb;
    private int field_Ib;
    private int field_Hb;
    private int field_Eb;
    private int field_Gb;
    private int field_vb;
    private char[] field_yb;
    private tjb[] field_Db;
    private int field_Fb;
    private tjb field_xb;
    private cna[] field_Bb;
    private int[] field_Ab;

    final boolean a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_5_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 <= -60) {
            break L0;
          } else {
            this.field_Eb = 67;
            break L0;
          }
        }
        L1: {
          if (pma.field_o != 85) {
            stackIn_5_0 = 0;
            break L1;
          } else {
            stackIn_5_0 = 1;
            break L1;
          }
        }
        var4 = stackIn_5_0;
        if (this.field_xb != null) {
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              if (this.field_xb.field_vb != -1) {
                break L2;
              } else {
                this.j(16384);
                this.a((byte) 112, 0);
                return true;
              }
            }
          }
          return this.field_xb.a(param0, -126, param2);
        } else {
          L3: {
            if (null != this.field_xb) {
              break L3;
            } else {
              if (this != fkb.field_m) {
                break L3;
              } else {
                if (var4 == 0) {
                  break L3;
                } else {
                  fea.a(-1);
                  return true;
                }
              }
            }
          }
          L4: {
            var5 = jl.field_r;
            if (var5 <= 0) {
              break L4;
            } else {
              L5: {
                if (ttb.field_B == var5) {
                  var5 = 63;
                  break L5;
                } else {
                  break L5;
                }
              }
              var6 = 0;
              L6: while (true) {
                if (var6 >= this.field_yb.length) {
                  break L4;
                } else {
                  if (var5 == this.field_yb[var6]) {
                    this.a(var6, true, param0, param2);
                    return true;
                  } else {
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        long stackIn_15_2 = 0L;
        int stackIn_16_0;
        int stackIn_16_1;
        long stackIn_16_2;
        int stackIn_16_3;
        var7 = VoidHunters.field_G;
        if (param1) {
          L0: {
            if (this.field_vb != param0) {
              if (this.field_Db[param0] != null) {
                this.j(16384);
                this.a((byte) 116, 0);
                this.field_vb = param0;
                this.field_xb = this.field_Db[this.field_vb];
                wkb.a(this.field_xb, 6);
                this.field_xb.a((byte) 121, 12);
                break L0;
              } else {
                if (0 != (this.field_Ab[param0] ^ -1)) {
                  L1: {
                    var5 = 32768 | this.field_Ab[param0];
                    var6 = ow.field_b;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      if (null == lqa.field_o) {
                        break L1;
                      } else {
                        var6 = 1;
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (jia.a(var6, (byte) 19) == 2) {
                      mea.a(1, (byte) -119, param2, var6);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var8 = (String) null;
                    va.a((String) null, -25719, var5, param3, ow.field_b, waa.field_x);
                    stackIn_15_0 = ow.field_b;

                    stackIn_15_1 = var5;

                    stackIn_15_2 = lsa.field_f;

                    if (param1) {
                      stackIn_16_0 = stackIn_15_0;
                      stackIn_16_1 = stackIn_15_1;
                      stackIn_16_2 = stackIn_15_2;
                      stackIn_16_3 = 0;
                      break L3;
                    } else {
                      stackIn_16_0 = stackIn_15_0;
                      stackIn_16_1 = stackIn_15_1;
                      stackIn_16_2 = stackIn_15_2;
                      stackIn_16_3 = 1;
                      break L3;
                    }
                  }
                  jtb.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0, waa.field_x);
                  fea.a(-1);
                  fd.a(4907);
                  break L0;
                } else {
                  wha.a(29012);
                  fea.a(-1);
                  break L0;
                }
              }
            } else {
              this.j(16384);
              this.a((byte) 121, 0);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    tjb(long param0, llb param1, llb param2, llb param3, tjb[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        no var17 = null;
        no var18 = null;
        this.field_vb = -1;
        try {
          L0: {
            this.field_yb = param7;
            this.field_Ab = param5;
            this.field_Db = param4;
            this.field_Gb = this.field_Ab.length;
            var17 = param3.field_eb;
            var18 = var17;
            this.field_Ib = var18.field_A + (var18.field_k + 2);
            this.field_Jb = 0;
            this.field_Bb = new cna[this.field_Gb];
            this.field_zb = this.field_Ib * this.field_Gb;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (this.field_Gb <= var13) {
                this.field_Jb = this.field_Jb + (10 + ie.field_o.field_m);
                this.a((byte) 120, 12);
                break L0;
              } else {
                L2: {
                  if (this.field_yb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + av.a(this.field_yb[var13], 6).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (this.field_Db[var13] != null) {
                      break L4;
                    } else {
                      if (0 != (this.field_Ab[var13] ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = ie.field_o;
                  break L3;
                }
                L5: {
                  this.field_Bb[var13] = new cna(0L, param2, (llb) null, param3, (phb) (var14), param6[var13]);
                  this.b(-561, this.field_Bb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (this.field_Jb >= var15) {
                    break L5;
                  } else {
                    this.field_Jb = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("tjb.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param7 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_34_2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = VoidHunters.field_G;
        this.field_Fb = param1;
        if (param0 < 109) {
            this.field_Eb = -122;
        }
        for (var5 = 0; var5 < this.field_Gb; var5++) {
            var4 = this.field_Fb * this.field_Fb;
            var3 = var5 * this.field_Ib;
            this.field_Bb[var5].field_K = ((this.field_Hb + -this.field_u) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    final int k(int param0) {
        if (param0 != -4109) {
            this.a(-122, 20, 102);
        }
        return this.field_Eb - -(null != this.field_xb ? this.field_xb.k(-4109) : 0);
    }

    public static void i(int param0) {
        if (param0 != 85) {
            return;
        }
        field_Cb = null;
    }

    final void j(int param0) {
        int var3 = 0;
        cna var4 = null;
        int var5 = VoidHunters.field_G;
        cna[] var6 = this.field_Bb;
        cna[] var2 = var6;
        if (param0 != 16384) {
            this.field_zb = -32;
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_o = 0;
            var4.field_J = false;
        }
        if (!(this.field_xb == null)) {
            this.field_xb.j(16384);
            this.field_xb.b(param0 + -20230);
        }
        this.field_xb = null;
        this.field_vb = -1;
        this.a((byte) 113, 12);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
            return false;
        }
        tsb.field_q = true;
        ska.field_p = wt.a(false) + 15000L;
        return qmb.field_q == 11 ? true : false;
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int;
        int var5;
        cna var6;
        int var7;
        cna stackIn_7_0 = null;
        cna stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        tjb var4;
        tjb var8;
        var7 = VoidHunters.field_G;
        var4_int = -84 / ((-12 - param2) / 44);
        var5 = 0;
        L0: while (true) {
          if (this.field_Bb.length <= var5) {
            L1: {
              if (this.field_vb == -1) {
                break L1;
              } else {
                var8 = this.field_Db[this.field_vb];
                var4 = var8;
                if (var4 == null) {
                  break L1;
                } else {
                  var8.a(param0, param1, (byte) 78);
                  break L1;
                }
              }
            }
            L2: {
              if (0 < this.field_Fb) {
                this.a((byte) 123, this.field_Fb + -1);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var6 = this.field_Bb[var5];
            if (-2 == (var6.field_o ^ -1)) {
              L3: {
                this.a(var5, true, param0, param1);
                stackIn_7_0 = (cna) (var6);

                if (var5 != this.field_vb) {
                  stackIn_8_0 = (cna) ((Object) stackIn_7_0);
                  stackIn_8_1 = 0;
                  break L3;
                } else {
                  stackIn_8_0 = (cna) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
                  break L3;
                }
              }
              stackIn_8_0.field_J = stackIn_8_1 != 0;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final boolean h(int param0) {
        int var2;
        cna[] var3;
        int var4;
        cna var5;
        int var6;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_1 = 0;
        int stackIn_18_0 = 0;
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = this.field_Bb;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 >= var3.length) {
                if (param0 == -25675) {
                  break L1;
                } else {
                  break L2;
                }
              } else {
                var5 = var3[var4];
                stackIn_5_0 = var2;

                stackIn_5_1 = var5.field_o;

                L3: {


                  if (stackIn_5_1 == 0) {

                    stackIn_8_1 = 0;
                    break L3;
                  } else {

                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                var2 = stackIn_5_0 | stackIn_8_1;
                var4++;
                continue L0;
              }
            }
            tjb.l(52);
            break L1;
          }
          L4: {
            if (var2 != 0) {
              break L4;
            } else {
              if (-1 == this.field_vb) {
                break L4;
              } else {
                if (this.field_Db[this.field_vb] != null) {
                  L5: {
                    if (!this.field_Db[this.field_vb].h(-25675)) {
                      stackIn_18_0 = 0;
                      break L5;
                    } else {
                      stackIn_18_0 = 1;
                      break L5;
                    }
                  }
                  var2 = stackIn_18_0;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
          return var2 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        var9 = VoidHunters.field_G;
        this.field_Eb = this.field_Jb - -(2 * param3);
        if (param0 == 12) {
          L0: {
            this.a(param2, param0 + -41, this.field_Eb, param1 + -this.field_zb, this.field_zb);
            if (param4 != this.field_Hb) {
              this.field_Hb = param4;
              this.a((byte) 116, this.field_Fb);
              break L0;
            } else {
              break L0;
            }
          }
          var7 = 0;
          L1: while (true) {
            if (var7 >= this.field_Gb) {
              L2: {
                if ((this.field_vb ^ -1) == 0) {
                  break L2;
                } else {
                  if (this.field_Db[this.field_vb] == null) {
                    break L2;
                  } else {
                    var7 = this.field_Db[this.field_vb].field_Gb;
                    var8 = this.field_K + (this.field_vb + var7) * this.field_Ib;
                    L3: while (true) {
                      if (param1 >= var8) {
                        this.field_Db[this.field_vb].a(12, var8, this.field_Eb + param2, param3, this.field_Bb[this.field_vb].field_u, param5);
                        break L2;
                      } else {
                        var8 = var8 - this.field_Ib;
                        continue L3;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              this.field_Bb[var7].a(this.field_Bb[var7].field_K, 0, -127, param3, param5, this.field_Eb, this.field_Ib);
              var7++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final static Object a(Object[] param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (ls.field_q) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  ((byte[]) (param0[2]))[0] = ((byte[]) (param0[12]))[2];
                  break L1;
                }
              }
              if (param0 != null) {
                if (-1 > (param0.length ^ -1)) {
                  var2_int = 0;
                  L2: while (true) {
                    if (var2_int < param0.length) {
                      if (VoidHunters.a(true, param0[var2_int])) {
                        stackIn_16_0 = param0[var2_int];
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var2_int++;
                        continue L2;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackIn_19_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("tjb.K(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    static {
        field_Cb = "Invalid name";
        field_wb = 2;
    }
}
