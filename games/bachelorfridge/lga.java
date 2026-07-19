/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lga {
    private boolean[][] field_p;
    private int field_h;
    private int field_j;
    private jfa field_o;
    private wda[][] field_f;
    private int field_c;
    static String[] field_n;
    private mka[][] field_m;
    private int field_q;
    private int field_b;
    static int field_r;
    static kv field_k;
    static String field_i;
    eaa field_e;
    private int field_a;
    private int[][] field_d;
    private int field_l;
    private int field_g;

    final static String a(boolean param0, String[] param1, String param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = param2.length();
              if (param0) {
                break L1;
              } else {
                field_n = (String[]) null;
                break L1;
              }
            }
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param2.indexOf("<%", var5);
              if (0 <= var6_int) {
                var5 = 2 + var6_int;
                L3: while (true) {
                  L4: {
                    if (var3_int <= var5) {
                      break L4;
                    } else {
                      if (!ula.a(param2.charAt(var5), 48)) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var7_ref_String = param2.substring(2 + var6_int, var5);
                  if (!vn.a((byte) 107, (CharSequence) ((Object) var7_ref_String))) {
                    continue L2;
                  } else {
                    if (var3_int <= var5) {
                      continue L2;
                    } else {
                      if (62 != param2.charAt(var5)) {
                        continue L2;
                      } else {
                        var5++;
                        var8 = pd.a((byte) 47, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (param1[var8].length() + var6_int + -var5);
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L5: while (true) {
                  var8 = param2.indexOf("<%", var5);
                  if ((var8 ^ -1) > -1) {
                    discarded$3 = var6.append(param2.substring(var7));
                    stackOut_25_0 = var6.toString();
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    var5 = var8 - -2;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!ula.a(param2.charAt(var5), 48)) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param2.substring(2 + var8, var5);
                      if (vn.a((byte) 113, (CharSequence) ((Object) var9))) {
                        if (var3_int <= var5) {
                          continue L5;
                        } else {
                          if (param2.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = pd.a((byte) 47, (CharSequence) ((Object) var9));
                            discarded$4 = var6.append(param2.substring(var7, var8));
                            discarded$5 = var6.append(param1[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
                      } else {
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("lga.F(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        return stackIn_26_0;
    }

    public static void b(int param0) {
        String discarded$2 = null;
        String var2 = null;
        if (param0 != -4) {
          var2 = (String) null;
          discarded$2 = lga.a(true, (String[]) null, (String) null);
          field_i = null;
          field_n = null;
          field_k = null;
          return;
        } else {
          field_i = null;
          field_n = null;
          field_k = null;
          return;
        }
    }

    final static void a(nv param0, boolean param1) {
        if (!(param0 != null)) {
            return;
        }
        try {
            da.field_d = param0;
            fo.field_a.field_z.d(82);
            fo.field_a.a(-1, da.field_d);
            gm.field_k = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lga.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(mka param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        mka var5_ref = null;
        mka var6 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param3 < (param1 ^ -1)) {
                break L1;
              } else {
                if (-1 < (param2 ^ -1)) {
                  break L1;
                } else {
                  if (param1 > this.field_l - 1) {
                    break L1;
                  } else {
                    if (param2 > -1 + this.field_b) {
                      break L1;
                    } else {
                      if (!this.field_p[param1][param2]) {
                        L2: {
                          if (0 != this.field_f[param1][param2].field_e) {
                            break L2;
                          } else {
                            if (-1 + this.field_b <= param2) {
                              break L2;
                            } else {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                        L3: {
                          if (-4 != (this.field_f[param0.field_k][param0.field_g].field_e ^ -1)) {
                            break L3;
                          } else {
                            if (-1 != (this.field_f[param1][param2].field_e ^ -1)) {
                              break L3;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                        L4: {
                          if (param0.field_g != param2) {
                            break L4;
                          } else {
                            if (0 != this.field_f[param1][param2].field_e) {
                              break L4;
                            } else {
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        this.field_p[param1][param2] = true;
                        this.field_d[param1][param2] = param0.field_l - -1;
                        var6 = new mka(param0, param1, param2, this.field_d[param1][param2]);
                        var5_ref = var6;
                        this.field_m[param1][param2] = var6;
                        this.field_e.a(-16, var5_ref);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("lga.A(");
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
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        mc var4 = null;
        var3 = BachelorFridge.field_y;
        var4 = (mc) ((Object) this.field_e.b((byte) 90));
        var4.a(false);
        if (var4.field_f != 8) {
          if (1 == var4.field_f) {
            this.field_o.field_i.a(new qd(this.field_o, -39 * var4.field_j), true);
            if (param0 == 82) {
              return;
            } else {
              field_k = (kv) null;
              return;
            }
          } else {
            if (var4.field_f == 4) {
              if (-4 != (this.field_o.field_m[this.field_o.field_u][this.field_o.field_l].field_e ^ -1)) {
                this.field_o.field_i.a(new qd(this.field_o, var4.field_j * 39), true);
                if (param0 == 82) {
                  return;
                } else {
                  field_k = (kv) null;
                  return;
                }
              } else {
                this.field_o.field_i.a(new qd(this.field_o, var4.field_j * 39), true);
                if (param0 == 82) {
                  return;
                } else {
                  field_k = (kv) null;
                  return;
                }
              }
            } else {
              if ((var4.field_f ^ -1) != -3) {
                if (param0 == 82) {
                  return;
                } else {
                  field_k = (kv) null;
                  return;
                }
              } else {
                this.field_o.field_i.a(new ug(this.field_o, var4.field_j * 56), true);
                if (param0 == 82) {
                  return;
                } else {
                  field_k = (kv) null;
                  return;
                }
              }
            }
          }
        } else {
          this.field_o.field_i.a(new ug(this.field_o, var4.field_j * -56), true);
          if (param0 == 82) {
            return;
          } else {
            field_k = (kv) null;
            return;
          }
        }
    }

    final void a(int param0) {
        mka var2 = null;
        int var3 = 0;
        int var4 = 0;
        mc var5 = null;
        int var6 = 0;
        mka var8 = null;
        mka var9 = null;
        mka var12 = null;
        var6 = BachelorFridge.field_y;
        if (param0 == 8) {
          var8 = this.field_m[this.field_h][this.field_c];
          var2 = var8;
          this.field_e = new eaa();
          var3 = this.field_h;
          var4 = this.field_c;
          var5 = new mc(-1, 0);
          L0: while (true) {
            if (var2 == null) {
              if (var5 == null) {
                return;
              } else {
                this.field_e.a(-57, var5);
                return;
              }
            } else {
              var4 = var8.field_g;
              var3 = var8.field_k;
              var9 = var8.field_h;
              if (var9 != null) {
                L1: {
                  if (var9.field_k <= var3) {
                    break L1;
                  } else {
                    if (var5.field_f == 8) {
                      break L1;
                    } else {
                      this.field_e.a(-21, var5);
                      var5 = new mc(8, 1);
                      continue L0;
                    }
                  }
                }
                L2: {
                  if (var9.field_k >= var3) {
                    break L2;
                  } else {
                    if (2 == var5.field_f) {
                      break L2;
                    } else {
                      this.field_e.a(-116, var5);
                      var5 = new mc(2, 1);
                      continue L0;
                    }
                  }
                }
                if (var9.field_g > var4) {
                  this.field_e.a(-57, var5);
                  var5 = new mc(1, 2);
                  continue L0;
                } else {
                  if (var9.field_g >= var4) {
                    L3: {
                      var5.field_j = var5.field_j + 1;
                      if ((var5.field_f ^ -1) == -2) {
                        break L3;
                      } else {
                        if (var5.field_f != 4) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5.field_j = var5.field_j + 1;
                    continue L0;
                  } else {
                    this.field_e.a(param0 + -41, var5);
                    var5 = new mc(4, 2);
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        } else {
          this.a(-28);
          var8 = this.field_m[this.field_h][this.field_c];
          var2 = var8;
          this.field_e = new eaa();
          var3 = this.field_h;
          var4 = this.field_c;
          var5 = new mc(-1, 0);
          L4: while (true) {
            if (var2 == null) {
              if (var5 == null) {
                return;
              } else {
                this.field_e.a(-57, var5);
                return;
              }
            } else {
              var4 = var8.field_g;
              var3 = var8.field_k;
              var12 = var8.field_h;
              if (var12 != null) {
                L5: {
                  if (var12.field_k <= var3) {
                    break L5;
                  } else {
                    if (var5.field_f == 8) {
                      break L5;
                    } else {
                      this.field_e.a(-21, var5);
                      var5 = new mc(8, 1);
                      continue L4;
                    }
                  }
                }
                L6: {
                  if (var12.field_k >= var3) {
                    break L6;
                  } else {
                    if (2 == var5.field_f) {
                      break L6;
                    } else {
                      this.field_e.a(-116, var5);
                      var5 = new mc(2, 1);
                      continue L4;
                    }
                  }
                }
                if (var12.field_g > var4) {
                  this.field_e.a(-57, var5);
                  var5 = new mc(1, 2);
                  continue L4;
                } else {
                  if (var12.field_g >= var4) {
                    L7: {
                      var5.field_j = var5.field_j + 1;
                      if ((var5.field_f ^ -1) == -2) {
                        break L7;
                      } else {
                        if (var5.field_f != 4) {
                          continue L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var5.field_j = var5.field_j + 1;
                    continue L4;
                  } else {
                    this.field_e.a(param0 + -41, var5);
                    var5 = new mc(4, 2);
                    continue L4;
                  }
                }
              } else {
                continue L4;
              }
            }
          }
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        mka var4 = null;
        mka var5 = null;
        var3 = BachelorFridge.field_y;
        this.field_q = this.field_g;
        this.field_a = this.field_j;
        if (param0 > 48) {
          this.field_e.a(-79, new mka((mka) null, this.field_a, this.field_q, 0));
          L0: while (true) {
            if (!this.field_e.e(12917)) {
              L1: {
                var4 = (mka) ((Object) this.field_e.a(false));
                var5 = var4;
                if ((this.field_f[var4.field_k][var4.field_g].field_d & 2 ^ -1) != -3) {
                  break L1;
                } else {
                  this.a(var5, 1 + var5.field_k, var5.field_g, -1);
                  break L1;
                }
              }
              L2: {
                if ((this.field_f[var4.field_k][var4.field_g].field_d & 8 ^ -1) != -9) {
                  break L2;
                } else {
                  this.a(var5, var5.field_k - 1, var5.field_g, -1);
                  break L2;
                }
              }
              L3: {
                if (-5 != (4 & this.field_f[var4.field_k][var4.field_g].field_d ^ -1)) {
                  break L3;
                } else {
                  this.a(var5, var5.field_k, 2 + var5.field_g, -1);
                  break L3;
                }
              }
              if ((this.field_f[var4.field_k][var4.field_g].field_d & 1) == 1) {
                this.a(var5, var5.field_k, -2 + var5.field_g, -1);
                continue L0;
              } else {
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void c(byte param0) {
        if (null != kga.field_c) {
          L0: {
            wd.a((byte) 70, kga.field_c);
            kga.field_c.a(-6, ju.field_r);
            kga.field_c = null;
            if (null != qt.field_l) {
              qt.field_l.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 <= 107) {
            field_i = (String) null;
            dca.field_y.requestFocus();
            return;
          } else {
            dca.field_y.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    lga(jfa param0) {
        try {
            this.field_o = param0;
            this.field_f = this.field_o.field_m;
            this.field_l = this.field_f.length;
            this.field_b = this.field_f[0].length;
            this.field_h = this.field_o.field_x;
            this.field_d = new int[this.field_l][this.field_b];
            this.field_j = this.field_o.field_u;
            this.field_c = this.field_o.field_z;
            this.field_p = new boolean[this.field_l][this.field_b];
            this.field_m = new mka[this.field_l][this.field_b];
            this.field_g = this.field_o.field_l;
            this.field_e = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new String[]{"Grosser, with more added slime...", "... more creatures to choose from ...", "... more vomit, more poo and more mayhem!"};
        field_i = "Send private Quick Chat to <%0>";
        field_r = 3;
    }
}
