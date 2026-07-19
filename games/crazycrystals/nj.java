/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static ko field_c;
    String field_b;
    String[] field_o;
    int field_f;
    static int field_k;
    f field_a;
    private int field_d;
    nj field_n;
    dl field_l;
    boolean field_i;
    private int field_j;
    int field_g;
    static int field_e;
    private int field_h;
    private int field_m;

    final void b(int param0) {
        this.a(-25, 158);
        if (param0 > -33) {
            this.field_m = -49;
        }
    }

    public static void a(int param0) {
        if (param0 != 12) {
            return;
        }
        field_c = null;
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7_ref_String = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wm var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        var11 = CrazyCrystals.field_B;
        var13 = jf.a(72 + (param1 - -4), 486, 0, 534, param1 + 4);
        var4 = -126 % ((71 - param0) / 38);
        if (var13 == null) {
          return;
        } else {
          L0: {
            if (this.field_a != null) {
              this.field_a.a(24, 35, 24, false, 24 + (param1 - -4), 486);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.field_l != null) {
              param1 -= 2;
              this.field_l.a(486, 12 + (param1 - -4));
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var13.a((byte) -85);
            if (this.field_i) {
              L3: {
                L4: {
                  var5 = go.field_l.a(this.field_b);
                  var6 = this.field_b.lastIndexOf(' ');
                  if (0 > var6) {
                    break L4;
                  } else {
                    if (96 >= var5) {
                      break L4;
                    } else {
                      var21 = this.field_b.substring(0, var6);
                      var22 = this.field_b.substring(var6 - -1);
                      var9 = go.field_l.a(var21);
                      var10 = go.field_l.a(var22);
                      ih.a((byte) -20, var9, var21, param1 - -4 - -31);
                      ih.a((byte) -20, var10, var22, 36 + param1 - -4 + 15);
                      break L3;
                    }
                  }
                }
                ih.a((byte) -20, var5, this.field_b, 36 + (param1 - -4 + 5));
                break L3;
              }
              L5: {
                if (null != this.field_l) {
                  param1 -= 12;
                  break L5;
                } else {
                  break L5;
                }
              }
              var12 = 0;
              var7 = var12;
              L6: while (true) {
                if (this.field_o.length <= var12) {
                  break L2;
                } else {
                  an.field_q.a(this.field_o[var12], 486, 4 + (4 + param1 + 72) + (12 - -(var12 * 12)), 8438015, -1);
                  var12++;
                  continue L6;
                }
              }
            } else {
              L7: {
                L8: {
                  var5 = go.field_l.a(this.field_b);
                  var6 = this.field_b.lastIndexOf(' ');
                  if (var6 < 0) {
                    break L8;
                  } else {
                    if ((go.field_l.a(this.field_b) ^ -1) < -97) {
                      var16 = this.field_b.substring(0, var6);
                      var8 = var16;
                      var7_ref_String = var8;
                      var8 = var16;
                      var17 = this.field_b.substring(1 + var6);
                      var8 = var17;
                      var7_ref_String = var8;
                      var8 = var17;
                      var9 = go.field_l.a(var16);
                      if (var6 >= this.field_h) {
                        L9: {
                          var19 = var16.substring(0, this.field_h);
                          var7_ref_String = var19;
                          var7_ref_String = var19;
                          var7_ref_String = var19;
                          if ((this.field_d | this.field_j) != 0) {
                            break L9;
                          } else {
                            if ((8 & this.field_m) == 0) {
                              var7_ref_String = var19 + '_';
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ih.a((byte) -20, var9, var7_ref_String, -1 + (param1 + 36));
                        break L7;
                      } else {
                        L10: {
                          var10 = go.field_l.a(var17);
                          var18 = var17.substring(0, -var6 + (this.field_h - 1));
                          var8 = var18;
                          var7_ref_String = var8;
                          var8 = var18;
                          var8 = var18;
                          if ((this.field_j | this.field_d) != 0) {
                            break L10;
                          } else {
                            if ((this.field_m & 8) != 0) {
                              break L10;
                            } else {
                              var8 = var18 + '_';
                              var7_ref_String = var8;
                              var7_ref_String = var8;
                              break L10;
                            }
                          }
                        }
                        ih.a((byte) -20, var9, var16, -1 + (param1 - -36));
                        ih.a((byte) -20, var10, var8, 15 + (param1 + 4 - -36));
                        break L7;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L11: {
                  var14 = this.field_b;
                  var7_ref_String = var14;
                  var8 = var7_ref_String;
                  var7_ref_String = var14;
                  var15 = var14.substring(0, this.field_h);
                  var7_ref_String = var15;
                  var8 = var7_ref_String;
                  var7_ref_String = var15;
                  var7_ref_String = var15;
                  if ((this.field_d | this.field_j) != 0) {
                    break L11;
                  } else {
                    if (-1 == (8 & this.field_m ^ -1)) {
                      var7_ref_String = var15 + '_';
                      var8 = var7_ref_String;
                      var7_ref_String = var8;
                      var8 = var7_ref_String;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                ih.a((byte) -20, var5, var7_ref_String, 41 + (param1 - -4));
                break L7;
              }
              L12: {
                if (this.field_l == null) {
                  break L12;
                } else {
                  param1 -= 12;
                  break L12;
                }
              }
              var7 = 0;
              L13: while (true) {
                if (var7 >= this.field_d) {
                  L14: {
                    var20 = this.field_o[this.field_d].substring(0, this.field_j);
                    var7_ref_String = var20;
                    if (0 == (this.field_d | this.field_j)) {
                      break L14;
                    } else {
                      if (0 == this.field_g) {
                        break L14;
                      } else {
                        if ((8 & this.field_m) != 0) {
                          break L14;
                        } else {
                          var7_ref_String = var20 + '_';
                          break L14;
                        }
                      }
                    }
                  }
                  an.field_q.a(var7_ref_String, 486, 12 * this.field_d + (param1 + 92), 8438015, -1);
                  break L2;
                } else {
                  an.field_q.a(this.field_o[var7], 486, var7 * 12 + (72 + param1 + 4) - -4 + 12, 8438015, -1);
                  var7++;
                  continue L13;
                }
              }
            }
          }
          L15: {
            if (this.field_n == null) {
              break L15;
            } else {
              L16: {
                if (this.field_i) {
                  break L16;
                } else {
                  if (0 == this.field_g) {
                    break L16;
                  } else {
                    break L15;
                  }
                }
              }
              this.field_n.a(121, this.field_o.length * 12 + 12 + (4 + param1) + 58);
              break L15;
            }
          }
          return;
        }
    }

    final static double[] a(int param0, int param1, int param2) {
        if (param0 < 39) {
            field_e = -61;
        }
        int var3 = (tm.field_d[0].length - 2 * param2) * 48;
        int var4 = 48 * (tm.field_d.length + -(2 * param1));
        int var5 = var3 >= var4 ? var3 : var4;
        double var6 = (double)(param2 * 48) + (double)var3 * 0.5;
        double var8 = (double)(48 * param1) + (double)var4 * 0.5;
        double var10 = 24.0;
        if (!((var5 ^ -1) >= -481)) {
            var10 = 480.0 * var10 / (double)var5;
            var6 = var10 * var6 / 24.0;
            var8 = var8 * var10 / 24.0;
        }
        return new double[]{var6, var8, var10};
    }

    private final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var3 = CrazyCrystals.field_B;
          this.field_m = 1 + this.field_m & 15;
          if (param0 == 71) {
            break L0;
          } else {
            this.field_a = (f) null;
            break L0;
          }
        }
        if ((this.field_g ^ -1) >= -1) {
          if (this.field_n == null) {
            return false;
          } else {
            this.field_f = this.field_f - this.field_n.field_f;
            var2 = this.field_n.a((byte) 71) ? 1 : 0;
            this.field_f = this.field_f + this.field_n.field_f;
            return var2 != 0;
          }
        } else {
          L1: {
            this.field_g = this.field_g - 1;
            if (-1 != (this.field_g ^ -1)) {
              break L1;
            } else {
              if (this.field_h < this.field_b.length()) {
                L2: {
                  this.field_h = this.field_h + 1;
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (this.field_h != this.field_b.length()) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 4;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L2;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 30;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L2;
                  }
                }
                ((nj) (this)).field_g = stackIn_17_1;
                break L1;
              } else {
                if (this.field_o.length <= this.field_d) {
                  break L1;
                } else {
                  if (this.field_j >= this.field_o[this.field_d].length()) {
                    if (this.field_o.length + -1 > this.field_d) {
                      this.field_j = 0;
                      this.field_d = this.field_d + 1;
                      this.field_g = 2;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L3: {
                      if (this.field_o[this.field_d].charAt(this.field_j) != 60) {
                        this.field_j = this.field_j + 1;
                        break L3;
                      } else {
                        this.field_j = this.field_o[this.field_d].indexOf('>', this.field_j + 1) + 1;
                        break L3;
                      }
                    }
                    this.field_g = 2;
                    this.field_f = this.field_f + 1;
                    return true;
                  }
                }
              }
            }
          }
          return true;
        }
    }

    final nj b(byte param0) {
        nj discarded$0 = null;
        if (0 < this.field_g) {
            if (!this.field_i) {
                this.field_i = true;
                if (null != this.field_n) {
                    discarded$0 = this.field_n.b((byte) -112);
                }
                return (nj) (this);
            }
        }
        if (param0 > -91) {
            this.field_i = true;
        }
        if (null == this.field_n) {
            return null;
        }
        this.field_n = this.field_n.b((byte) -105);
        if (null == this.field_n) {
            return null;
        }
        return (nj) (this);
    }

    final nj c(int param0) {
        if (!(null == this.field_a)) {
            f[][] var3 = (f[][]) null;
            this.field_a.b(57, 0, (f[][]) null, 0);
        }
        if (param0 != -28530) {
            return (nj) null;
        }
        if (this.a((byte) 71)) {
            return (nj) (this);
        }
        this.field_f = this.field_f - 1;
        if (this.field_f == 0) {
            return null;
        }
        return (nj) (this);
    }

    nj(f param0, String param1, String[] param2) {
        this.field_f = 300;
        this.field_d = 0;
        this.field_j = 0;
        this.field_g = 30;
        this.field_h = 0;
        this.field_m = 0;
        try {
            this.field_b = param1;
            this.field_a = param0;
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "nj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    nj(dl param0, String param1, String param2) {
        this.field_f = 300;
        this.field_d = 0;
        this.field_j = 0;
        this.field_g = 30;
        this.field_h = 0;
        this.field_m = 0;
        try {
            this.field_l = param0;
            this.field_b = param1;
            this.field_o = rn.a(param2, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "nj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
