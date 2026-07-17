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
            throw ld.a((Throwable) (Object) runtimeException, "ha.F(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = 1;
        var3 = qc.field_b[((ha) this).field_i][((ha) this).field_b.field_a];
        var4 = 0;
        if (param0 == -11498) {
          L0: while (true) {
            if (var4 >= 4) {
              return var2 != 0;
            } else {
              var5 = ((ha) this).field_a.field_a + var3[var4 * 2];
              var6 = ((ha) this).field_g.field_a - -var3[var4 * 2 + 1];
              if (18 <= var6) {
                var2 = 0;
                var4++;
                continue L0;
              } else {
                ((ha) this).field_e.field_w[var6][var5] = ((ha) this).field_h[var4];
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
        int[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        db var6_ref_db = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var15 = 0;
        L0: {
          var13 = Lexicominos.field_L ? 1 : 0;
          if (!param0) {
            var14 = qc.field_b[((ha) this).field_i][((ha) this).field_b.field_a];
            var3 = var14;
            var15 = 0;
            var4 = var15;
            L1: while (true) {
              if (var15 >= 4) {
                break L0;
              } else {
                var5 = ((ha) this).field_c[((ha) this).field_i] + var14[1 + 2 * var15];
                var6 = var14[2 * var15];
                var7 = ((ha) this).field_a.a((byte) -123) + (149 + 24 * var6);
                var8 = -((ha) this).field_g.a((byte) -123) + 78 - 24 * var5;
                eb.a(param1 + -13543, ((ha) this).field_e.field_m, 0, ia.field_H, ((ha) this).field_h[var15], var8, var7);
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              lf.g(0, 8, 311, 450);
              var3_int = ((ha) this).field_b.field_a * ((ha) this).field_b.field_b + ((ha) this).field_b.a((byte) -123);
              if (var3_int < 0) {
                var3_int += 128;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var4 = ((ha) this).field_b.a((byte) -123);
              if (var4 >= 0) {
                break L3;
              } else {
                var4 += 32;
                break L3;
              }
            }
            var5_ref_int__ = qc.field_f[((ha) this).field_i][var3_int];
            var6_ref_db = qc.field_d[var4];
            var7 = (-var6_ref_db.field_p + ia.field_H.field_p) / 2;
            var8 = 0;
            L4: while (true) {
              if (var8 >= 4) {
                lf.b();
                break L0;
              } else {
                var9 = ((ha) this).field_a.field_a * 24 - -var5_ref_int__[var8 * 2];
                var10 = ((ha) this).field_g.field_a * 24 + var5_ref_int__[1 + 2 * var8];
                var11 = ((ha) this).field_a.a((byte) -123) + (var9 + 10 + var7);
                var12 = var7 + -((ha) this).field_g.a((byte) -123) + 416 + -var10;
                eb.a(param1 ^ 13560, ((ha) this).field_e.field_m, 0, var6_ref_db, ((ha) this).field_h[var8], var12, var11);
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
            ((ha) this).field_g = null;
            break L5;
          }
        }
    }

    final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        tl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        tl stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        tl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_13_0 = 0;
        tl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        tl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        tl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_73_0 = 0;
        tl stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        tl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        tl stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        tl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        tl stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        tl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_63_0 = null;
        Object stackOut_64_0 = null;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_65_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        L0: {
          var17 = Lexicominos.field_L ? 1 : 0;
          var7 = 0;
          if (param0 ^ param4) {
            L1: {
              stackOut_2_0 = ((ha) this).field_b;
              stackOut_2_1 = 121;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (param0) {
                stackOut_4_0 = (tl) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = ((ha) this).field_e.field_d;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L1;
              } else {
                stackOut_3_0 = (tl) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = -((ha) this).field_e.field_d;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
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
            if (((ha) this).field_b.field_c != 0) {
              var8 = rf.a(((ha) this).field_b.field_c, 47);
              var7 = Math.min(var8 * ((ha) this).field_b.field_c, ((ha) this).field_e.field_d) * -var8;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (((ha) this).field_e.field_d > Math.abs(((ha) this).field_a.field_c)) {
            stackOut_12_0 = -((ha) this).field_a.field_c;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = -((ha) this).field_e.field_d * rf.a(((ha) this).field_a.field_c, 47);
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        var8 = stackIn_13_0;
        var9 = 0;
        if (param5 == -93) {
          L4: {
            if (param1 ^ param2) {
              L5: {
                stackOut_17_0 = ((ha) this).field_a;
                stackOut_17_1 = 115;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param2) {
                  stackOut_19_0 = (tl) (Object) stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = -1;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L5;
                } else {
                  stackOut_18_0 = (tl) (Object) stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L5;
                }
              }
              var9 = ((tl) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_20_2 * ((ha) this).field_e.field_d);
              break L4;
            } else {
              break L4;
            }
          }
          L6: {
            if (!param3) {
              stackOut_23_0 = -((ha) this).field_e.field_d;
              stackIn_24_0 = stackOut_23_0;
              break L6;
            } else {
              stackOut_22_0 = -32;
              stackIn_24_0 = stackOut_22_0;
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
                if (var11 != 0) {
                  break L10;
                } else {
                  if (0 != var12) {
                    break L10;
                  } else {
                    if (var13 != 0) {
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
                  if (var15 * ((ha) this).field_b.field_c < 0) {
                    var16 = Math.min(Math.abs(var11), Math.abs(((ha) this).field_b.field_c)) * var15;
                    var11 = var11 - var16;
                    ((ha) this).field_b.field_c = ((ha) this).field_b.field_c + var16;
                    continue L8;
                  } else {
                    var16 = (4 + var15 + ((ha) this).field_b.field_a) % 4;
                    if (!((ha) this).field_f) {
                      break L11;
                    } else {
                      if (!this.a(((ha) this).field_g.field_a, ((ha) this).field_a.field_a, (byte) -15, var16)) {
                        break L11;
                      } else {
                        ((ha) this).field_b.field_c = ((ha) this).field_b.field_c + var15 * (1 + -((ha) this).field_b.field_f);
                        ((ha) this).field_b.field_a = var16;
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
                  if (((ha) this).field_a.field_c * var15 >= 0) {
                    if (!this.a(((ha) this).field_g.field_a, var15 + ((ha) this).field_a.field_a, (byte) -15, ((ha) this).field_b.field_a)) {
                      break L12;
                    } else {
                      L13: {
                        if (0 == ((ha) this).field_g.field_c) {
                          break L13;
                        } else {
                          if (this.a(((ha) this).field_g.field_a - -1, var15 + ((ha) this).field_a.field_a, (byte) -15, ((ha) this).field_b.field_a)) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var13 = var13 - var15;
                      var12 = 0;
                      ((ha) this).field_a.field_c = ((ha) this).field_a.field_c + (1 + -((ha) this).field_a.field_f) * var15;
                      ((ha) this).field_a.field_a = ((ha) this).field_a.field_a + var15;
                      continue L8;
                    }
                  } else {
                    var16 = Math.min(Math.abs(var13), Math.abs(((ha) this).field_a.field_c)) * var15;
                    var13 = var13 - var16;
                    var12 = 0;
                    ((ha) this).field_a.field_c = ((ha) this).field_a.field_c + var16;
                    continue L8;
                  }
                } else {
                  break L12;
                }
              }
              if (0 != var12) {
                ((ha) this).field_a.field_c = ((ha) this).field_a.field_c + var12;
                var12 = 0;
                continue L8;
              } else {
                if (var14 == 0) {
                  break L9;
                } else {
                  if (((ha) this).field_g.field_c <= 0) {
                    if (!this.a(((ha) this).field_g.field_a + -1, ((ha) this).field_a.field_a, (byte) -15, ((ha) this).field_b.field_a)) {
                      break L9;
                    } else {
                      L14: {
                        if (((ha) this).field_a.field_c == 0) {
                          break L14;
                        } else {
                          if (this.a(((ha) this).field_g.field_a + -1, ((ha) this).field_a.field_a - -rf.a(((ha) this).field_a.field_c, 47), (byte) -15, ((ha) this).field_b.field_a)) {
                            break L14;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((ha) this).field_g.field_a = ((ha) this).field_g.field_a - 1;
                      ((ha) this).field_g.field_c = ((ha) this).field_g.field_f + -1;
                      var14++;
                      continue L8;
                    }
                  } else {
                    L15: {
                      if (~((ha) this).field_g.field_c > ~-var14) {
                        stackOut_55_0 = ((ha) this).field_g.field_c;
                        stackIn_56_0 = stackOut_55_0;
                        break L15;
                      } else {
                        stackOut_54_0 = -var14;
                        stackIn_56_0 = stackOut_54_0;
                        break L15;
                      }
                    }
                    var15 = stackIn_56_0;
                    ((ha) this).field_g.field_c = ((ha) this).field_g.field_c - var15;
                    var14 = var14 + var15;
                    continue L8;
                  }
                }
              }
            }
            L16: {
              L17: {
                stackOut_62_0 = this;
                stackIn_66_0 = stackOut_62_0;
                stackIn_63_0 = stackOut_62_0;
                if (var8 != var12) {
                  break L17;
                } else {
                  stackOut_63_0 = this;
                  stackIn_66_0 = stackOut_63_0;
                  stackIn_64_0 = stackOut_63_0;
                  if (var9 != var13) {
                    break L17;
                  } else {
                    stackOut_64_0 = this;
                    stackIn_67_0 = stackOut_64_0;
                    stackIn_65_0 = stackOut_64_0;
                    if (var10 == var14) {
                      stackOut_67_0 = this;
                      stackOut_67_1 = 0;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      break L16;
                    } else {
                      stackOut_65_0 = this;
                      stackIn_66_0 = stackOut_65_0;
                      break L17;
                    }
                  }
                }
              }
              stackOut_66_0 = this;
              stackOut_66_1 = 1;
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              break L16;
            }
            L18: {
              L19: {
                ((ha) this).field_f = stackIn_68_1 != 0;
                if (var7 != var11) {
                  break L19;
                } else {
                  if (!((ha) this).field_f) {
                    stackOut_72_0 = 0;
                    stackIn_73_0 = stackOut_72_0;
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              stackOut_71_0 = 1;
              stackIn_73_0 = stackOut_71_0;
              break L18;
            }
            return stackIn_73_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 43) {
            break L0;
          } else {
            var2 = null;
            ha.a((java.awt.Canvas) null, (byte) 124);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ta.field_g < 10) {
              break L2;
            } else {
              if (wf.field_i < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 > 41) {
              L1: {
                sg.a((java.awt.Component) (Object) param0, 2);
                bi.a((byte) 104, (java.awt.Component) (Object) param0);
                if (null == rk.field_c) {
                  break L1;
                } else {
                  rk.field_c.a(true, (java.awt.Component) (Object) param0);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ha.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    private final boolean a(int param0, int param1, byte param2, int param3) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param2 == -15) {
          var10 = qc.field_b[((ha) this).field_i][param3 % 4];
          var5 = var10;
          var6 = 0;
          L0: while (true) {
            if (var6 >= 4) {
              return true;
            } else {
              L1: {
                var7 = param1 - -var10[var6 * 2];
                var8 = param0 + var10[1 + var6 * 2];
                if (var7 < 0) {
                  break L1;
                } else {
                  if (var7 >= 12) {
                    break L1;
                  } else {
                    if (var8 < 0) {
                      break L1;
                    } else {
                      if (var8 < 18) {
                        if (((ha) this).field_e.field_w[var8][var7] != 0) {
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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((ha) this).field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
        ((ha) this).field_a = new tl(16, 24);
        ((ha) this).field_g = new tl(128, 24);
        ((ha) this).field_b = new tl(32, 32);
        ((ha) this).field_f = true;
        try {
          L0: {
            ((ha) this).field_e = param0;
            ((ha) this).field_h = new char[4];
            param0.field_m.a(param0, 0, ((ha) this).field_h);
            ((ha) this).field_i = param0.a(-2, 7);
            ((ha) this).field_b.field_a = 0;
            ((ha) this).field_a.field_a = 5;
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= qc.field_b[((ha) this).field_i][((ha) this).field_b.field_a].length) {
                ((ha) this).field_g.field_a = -var2_int + 18;
                break L0;
              } else {
                var2_int = Math.min(var2_int, qc.field_b[((ha) this).field_i][((ha) this).field_b.field_a][var3]);
                var3 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ha.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    ha(fc param0, int param1, char[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((ha) this).field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
        ((ha) this).field_a = new tl(16, 24);
        ((ha) this).field_g = new tl(128, 24);
        ((ha) this).field_b = new tl(32, 32);
        ((ha) this).field_f = true;
        try {
          L0: {
            ((ha) this).field_e = param0;
            ((ha) this).field_h = param2;
            ((ha) this).field_i = param1;
            if (param2.length == 4) {
              ((ha) this).field_b.field_a = 0;
              ((ha) this).field_a.field_a = 5;
              var4_int = 0;
              var5 = 0;
              L1: while (true) {
                if (var5 >= qc.field_b[param1][((ha) this).field_b.field_a].length) {
                  ((ha) this).field_g.field_a = -var4_int + 18;
                  break L0;
                } else {
                  var4_int = Math.min(var4_int, qc.field_b[param1][((ha) this).field_b.field_a][var5]);
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
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ha.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    static {
    }
}
