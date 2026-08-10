/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_i;
    static int field_d;
    private int[] field_c;
    tl field_a;
    char[] field_h;
    tl field_g;
    tl field_b;
    private boolean field_f;
    private fc field_e;

    final static void a(String param0, String param1, int param2) {
        if (param2 >= -58) {
            return;
        }
        try {
            uf.a(param0, -108, param1, false);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ha.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean b(int param0) {
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = 1;
        var3 = qc.field_b[this.field_i][this.field_b.field_a];
        var4 = 0;
        if (param0 == -11498) {
          L0: while (true) {
            if (var4 >= 4) {
              return var2 != 0;
            } else {
              var5 = this.field_a.field_a + var3[var4 * 2];
              var6 = this.field_g.field_a - -var3[var4 * 2 + 1];
              if (18 <= var6) {
                var2 = 0;
                var4++;
                continue L0;
              } else {
                this.field_e.field_w[var6][var5] = this.field_h[var4];
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final void a(boolean param0, int param1) {
        int[] var3;
        int var3_int;
        int var4;
        int var5;
        int[] var5_ref_int__;
        int var6;
        db var6_ref_db;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int var15;
        L0: {
          var13 = Lexicominos.field_L ? 1 : 0;
          if (!param0) {
            var14 = qc.field_b[this.field_i][this.field_b.field_a];
            var3 = var14;
            var15 = 0;
            var4 = var15;
            L1: while (true) {
              if (var15 >= 4) {
                break L0;
              } else {
                var5 = this.field_c[this.field_i] + var14[1 + 2 * var15];
                var6 = var14[2 * var15];
                var7 = this.field_a.a((byte) -123) + (149 + 24 * var6);
                var8 = -this.field_g.a((byte) -123) + 78 - 24 * var5;
                eb.a(param1 + -13543, this.field_e.field_m, 0, ia.field_H, this.field_h[var15], var8, var7);
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              lf.g(0, 8, 311, 450);
              var3_int = this.field_b.field_a * this.field_b.field_b + this.field_b.a((byte) -123);
              if (-1 < (var3_int ^ -1)) {
                var3_int += 128;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var4 = this.field_b.a((byte) -123);
              if (var4 >= 0) {
                break L3;
              } else {
                var4 += 32;
                break L3;
              }
            }
            var5_ref_int__ = qc.field_f[this.field_i][var3_int];
            var6_ref_db = qc.field_d[var4];
            var7 = (-var6_ref_db.field_p + ia.field_H.field_p) / 2;
            var8 = 0;
            L4: while (true) {
              if ((var8 ^ -1) <= -5) {
                lf.b();
                break L0;
              } else {
                var9 = this.field_a.field_a * 24 - -var5_ref_int__[var8 * 2];
                var10 = this.field_g.field_a * 24 + var5_ref_int__[1 + 2 * var8];
                var11 = this.field_a.a((byte) -123) + (var9 + 10 + var7);
                var12 = var7 + -this.field_g.a((byte) -123) + 416 + -var10;
                eb.a(param1 ^ 13560, this.field_e.field_m, 0, var6_ref_db, this.field_h[var8], var12, var11);
                var8++;
                continue L4;
              }
            }
          }
        }
        L5: {
          if (param1 == 13551) {
            break L5;
          } else {
            this.field_g = (tl) null;
            break L5;
          }
        }
    }

    final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, byte param5) {
        tl stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        tl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_13_0 = 0;
        tl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        tl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_55_0 = 0;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_72_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        L0: {
          var17 = Lexicominos.field_L ? 1 : 0;
          var7 = 0;
          if (param0 ^ param4) {
            L1: {
              stackIn_4_0 = this.field_b;

              stackIn_4_1 = 121;

              if (param0) {
                stackIn_5_0 = (tl) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = this.field_e.field_d;
                break L1;
              } else {
                stackIn_5_0 = (tl) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = -this.field_e.field_d;
                break L1;
              }
            }
            var7 = ((tl) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_5_2);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (var7 != 0) {
            break L2;
          } else {
            if (this.field_b.field_c != 0) {
              var8 = rf.a(this.field_b.field_c, 47);
              var7 = Math.min(var8 * this.field_b.field_c, this.field_e.field_d) * -var8;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (this.field_e.field_d > Math.abs(this.field_a.field_c)) {
            stackIn_13_0 = -this.field_a.field_c;
            break L3;
          } else {
            stackIn_13_0 = -this.field_e.field_d * rf.a(this.field_a.field_c, 47);
            break L3;
          }
        }
        var8 = stackIn_13_0;
        var9 = 0;
        if (param5 == -93) {
          L4: {
            if (param1 ^ param2) {
              L5: {
                stackIn_19_0 = this.field_a;

                stackIn_19_1 = 115;

                if (param2) {
                  stackIn_20_0 = (tl) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = -1;
                  break L5;
                } else {
                  stackIn_20_0 = (tl) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = 1;
                  break L5;
                }
              }
              var9 = ((tl) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_20_2 * this.field_e.field_d);
              break L4;
            } else {
              break L4;
            }
          }
          L6: {
            if (!param3) {
              stackIn_24_0 = -this.field_e.field_d;
              break L6;
            } else {
              stackIn_24_0 = -32;
              break L6;
            }
          }
          L7: {
            var10 = stackIn_24_0;
            var11 = var7;
            var12 = var8;
            var13 = var9;
            var14 = var10;
            if (rf.a(var12, 47) != rf.a(var13, 47)) {
              break L7;
            } else {
              var12 = 0;
              var8 = 0;
              break L7;
            }
          }
          L8: while (true) {
            L9: {
              L10: {
                if (-1 != (var11 ^ -1)) {
                  break L10;
                } else {
                  if (0 != var12) {
                    break L10;
                  } else {
                    if (-1 != (var13 ^ -1)) {
                      break L10;
                    } else {
                      if (0 == var14) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (var11 == 0) {
                  break L11;
                } else {
                  var15 = rf.a(var11, 47);
                  if (-1 < (var15 * this.field_b.field_c ^ -1)) {
                    var16 = Math.min(Math.abs(var11), Math.abs(this.field_b.field_c)) * var15;
                    var11 = var11 - var16;
                    this.field_b.field_c = this.field_b.field_c + var16;
                    continue L8;
                  } else {
                    var16 = (4 + var15 + this.field_b.field_a) % 4;
                    if (!this.field_f) {
                      break L11;
                    } else {
                      if (!this.a(this.field_g.field_a, this.field_a.field_a, (byte) -15, var16)) {
                        break L11;
                      } else {
                        this.field_b.field_c = this.field_b.field_c + var15 * (1 + -this.field_b.field_f);
                        this.field_b.field_a = var16;
                        var11 = var11 - var15;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L12: {
                if (var13 != 0) {
                  var15 = rf.a(var13, 47);
                  if (this.field_a.field_c * var15 >= 0) {
                    if (!this.a(this.field_g.field_a, var15 + this.field_a.field_a, (byte) -15, this.field_b.field_a)) {
                      break L12;
                    } else {
                      L13: {
                        if (0 == this.field_g.field_c) {
                          break L13;
                        } else {
                          if (this.a(this.field_g.field_a - -1, var15 + this.field_a.field_a, (byte) -15, this.field_b.field_a)) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var13 = var13 - var15;
                      var12 = 0;
                      this.field_a.field_c = this.field_a.field_c + (1 + -this.field_a.field_f) * var15;
                      this.field_a.field_a = this.field_a.field_a + var15;
                      continue L8;
                    }
                  } else {
                    var16 = Math.min(Math.abs(var13), Math.abs(this.field_a.field_c)) * var15;
                    var13 = var13 - var16;
                    var12 = 0;
                    this.field_a.field_c = this.field_a.field_c + var16;
                    continue L8;
                  }
                } else {
                  break L12;
                }
              }
              if (0 != var12) {
                this.field_a.field_c = this.field_a.field_c + var12;
                var12 = 0;
                continue L8;
              } else {
                if (var14 == 0) {
                  break L9;
                } else {
                  if (-1 <= (this.field_g.field_c ^ -1)) {
                    if (!this.a(this.field_g.field_a + -1, this.field_a.field_a, (byte) -15, this.field_b.field_a)) {
                      break L9;
                    } else {
                      L14: {
                        if (this.field_a.field_c == 0) {
                          break L14;
                        } else {
                          if (this.a(this.field_g.field_a + -1, this.field_a.field_a - -rf.a(this.field_a.field_c, 47), (byte) -15, this.field_b.field_a)) {
                            break L14;
                          } else {
                            break L9;
                          }
                        }
                      }
                      this.field_g.field_a = this.field_g.field_a - 1;
                      this.field_g.field_c = this.field_g.field_f + -1;
                      var14++;
                      continue L8;
                    }
                  } else {
                    L15: {
                      if (this.field_g.field_c < -var14) {
                        stackIn_55_0 = this.field_g.field_c;
                        break L15;
                      } else {
                        stackIn_55_0 = -var14;
                        break L15;
                      }
                    }
                    var15 = stackIn_55_0;
                    this.field_g.field_c = this.field_g.field_c - var15;
                    var14 = var14 + var15;
                    continue L8;
                  }
                }
              }
            }
            L16: {
              L17: {
                stackIn_65_0 = this;

                if (var8 != var12) {
                  break L17;
                } else {
                  stackIn_65_0 = this;

                  if (var9 != var13) {
                    break L17;
                  } else {
                    stackIn_66_0 = this;

                    if (var10 == var14) {
                      stackIn_67_0 = this;
                      stackIn_67_1 = 0;
                      break L16;
                    } else {
                      stackIn_65_0 = this;
                      break L17;
                    }
                  }
                }
              }
              stackIn_67_0 = this;
              stackIn_67_1 = 1;
              break L16;
            }
            L18: {
              L19: {
                ((ha) (this)).field_f = stackIn_67_1 != 0;
                if (var7 != var11) {
                  break L19;
                } else {
                  if (!this.field_f) {
                    stackIn_72_0 = 0;
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              stackIn_72_0 = 1;
              break L18;
            }
            return stackIn_72_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0) {
        java.awt.Canvas var2;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 43) {
            break L0;
          } else {
            var2 = (java.awt.Canvas) null;
            ha.a((java.awt.Canvas) null, (byte) 124);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (ta.field_g ^ -1)) {
              break L2;
            } else {
              if ((wf.field_i ^ -1) > -14) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        if (param1 <= 41) {
            return;
        }
        try {
            sg.a((java.awt.Component) ((Object) param0), 2);
            bi.a((byte) 104, (java.awt.Component) ((Object) param0));
            if (null != rk.field_c) {
                rk.field_c.a(true, (java.awt.Component) ((Object) param0));
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1, byte param2, int param3) {
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param2 == -15) {
          var10 = qc.field_b[this.field_i][param3 % 4];
          var5 = var10;
          var6 = 0;
          L0: while (true) {
            if ((var6 ^ -1) <= -5) {
              return true;
            } else {
              L1: {
                var7 = param1 - -var10[var6 * 2];
                var8 = param0 + var10[1 + var6 * 2];
                if ((var7 ^ -1) > -1) {
                  break L1;
                } else {
                  if ((var7 ^ -1) <= -13) {
                    break L1;
                  } else {
                    if ((var8 ^ -1) > -1) {
                      break L1;
                    } else {
                      if ((var8 ^ -1) > -19) {
                        if (this.field_e.field_w[var8][var7] != 0) {
                          break L1;
                        } else {
                          var6++;
                          continue L0;
                        }
                      } else {
                        var6++;
                        continue L0;
                      }
                    }
                  }
                }
              }
              return false;
            }
          }
        } else {
          return false;
        }
    }

    ha(fc param0) {
        int var2_int = 0;
        int var3 = 0;
        this.field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
        this.field_a = new tl(16, 24);
        this.field_g = new tl(128, 24);
        this.field_b = new tl(32, 32);
        this.field_f = true;
        try {
            this.field_e = param0;
            this.field_h = new char[4];
            param0.field_m.a(param0, 0, this.field_h);
            this.field_i = param0.a(-2, 7);
            this.field_b.field_a = 0;
            this.field_a.field_a = 5;
            var2_int = 0;
            for (var3 = 0; var3 < qc.field_b[this.field_i][this.field_b.field_a].length; var3 += 2) {
                var2_int = Math.min(var2_int, qc.field_b[this.field_i][this.field_b.field_a][var3]);
            }
            this.field_g.field_a = -var2_int + 18;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ha(fc param0, int param1, char[] param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        this.field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
        this.field_a = new tl(16, 24);
        this.field_g = new tl(128, 24);
        this.field_b = new tl(32, 32);
        this.field_f = true;
        try {
          L0: {
            this.field_e = param0;
            this.field_h = param2;
            this.field_i = param1;
            if (param2.length == 4) {
              this.field_b.field_a = 0;
              this.field_a.field_a = 5;
              var4_int = 0;
              var5 = 0;
              L1: while (true) {
                if (var5 >= qc.field_b[param1][this.field_b.field_a].length) {
                  this.field_g.field_a = -var4_int + 18;
                  break L0;
                } else {
                  var4_int = Math.min(var4_int, qc.field_b[param1][this.field_b.field_a][var5]);
                  var5 += 2;
                  continue L1;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ha.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    static {
    }
}
