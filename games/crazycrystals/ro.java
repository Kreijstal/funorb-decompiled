/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends pn implements Cloneable {
    static dl[] field_u;
    gh field_o;
    gh field_p;
    static String[] field_r;
    static int field_n;
    static String field_t;
    int field_m;
    static String field_s;
    static dl field_q;

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        dl var5 = null;
        RuntimeException var5_ref = null;
        ma stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -74) {
            ro.g(-49);
          }
          var5 = param0.a(13214, this.field_m);
          stackIn_3_0 = new ma(var5, (f) (this), param0);
          return (f) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("ro.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
        wm var10 = jf.a(kh.field_j, param2, 0, param0 * 2 + param2, kh.field_b);
        if (var10 == null) {
          return;
        }
        int var8 = 2 * (param0 * this.field_o.field_m) / this.field_o.field_p;
        int var9 = 2 * this.field_o.field_m * param5 / this.field_o.field_p;
        if (param1 < -38) {
          this.field_o.a(param4, this.field_o.field_o * var8 + param2, param0, param5, param3 + this.field_o.field_s * var9, 4261);
          var10.a((byte) -84);
          return;
        }
        this.field_o = (gh) null;
        this.field_o.a(param4, this.field_o.field_o * var8 + param2, param0, param5, param3 + this.field_o.field_s * var9, 4261);
        var10.a((byte) -84);
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ro.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void g(int param0) {
        int var1 = -38 % ((18 - param0) / 61);
        wk.a(dg.field_a, true, fh.field_i, false);
        ud.field_U = true;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        dl stackIn_22_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        dl stackIn_44_0 = null;
        dl stackIn_48_0 = null;
        dl stackIn_70_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_87_0 = 0;
        dl stackIn_92_0 = null;
        dl stackIn_96_0 = null;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_134_0 = 0;
        dl stackIn_139_0 = null;
        dl stackIn_143_0 = null;
        dl stackIn_169_0 = null;
        int stackIn_172_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_186_0 = 0;
        dl stackIn_191_0 = null;
        dl stackIn_195_0 = null;
        dl stackIn_217_0 = null;
        int stackIn_220_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_234_0 = 0;
        dl stackIn_239_0 = null;
        dl stackIn_243_0 = null;
        int stackIn_293_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_301_0 = 0;
        dl stackIn_306_0 = null;
        dl stackIn_339_0 = null;
        int var7;
        int var8;
        int var9;
        int var10;
        dl var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var7Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = CrazyCrystals.field_B;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_m != 1) {
          var11 = ig.field_q;
        } else {
          var11 = nf.field_g;
        }
        if (this.field_p == null) {
          if (null == this.field_o) {
            if (var7 != 0) {
              this.a(param3, param1, 2, param5, param2, param4);
            }
            if (var8 != 0) {
              this.a(param1, (byte) -64, param4, param5, param3, param2);
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 != 24) {
              var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
            } else {
              if (param2 == 24) {
                var11.a(param4, -param2 + param5);
              } else {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
              }
            }
          } else {
            var12 = this.field_o.field_G;
            var13 = this.field_o.field_x;
            if (this.field_m == 1) {
              stackIn_297_0 = (-var12 + var13 >= 0) ? 0 : 1;
              var8 = stackIn_297_0;
            } else {
              stackIn_293_0 = (var13 + var12 >= 0) ? 0 : 1;
              var8 = stackIn_293_0;
            }
            stackIn_301_0 = (var8 != 0) ? 0 : 1;
            var10 = stackIn_301_0;
            if (this.field_o.field_m < 6) {
              var14 = this.field_o.field_m;
              if (1 == this.field_m) {
                if (0 <= var12 - var13) {
                  stackIn_306_0 = ja.field_h[var14];
                } else {
                  stackIn_306_0 = tk.field_h[var14];
                }
                var11 = stackIn_306_0;
              } else {
                if (var13 + var12 >= 0) {
                  stackIn_339_0 = en.field_K[var14];
                } else {
                  stackIn_339_0 = db.field_j[var14];
                }
                var11 = stackIn_339_0;
              }
            }
            if (var7 != 0) {
              this.a(param3, param1, 2, param5, param2, param4);
            }
            if (var8 != 0) {
              this.a(param1, (byte) -64, param4, param5, param3, param2);
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 != 24) {
              var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
            } else {
              if (param2 != 24) {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
              } else {
                var11.a(param4, -param2 + param5);
              }
            }
          }
          if (var9 != 0) {
            this.a(param3, param1, 2, param5, param2, param4);
          }
          if (var10 != 0) {
            this.a(param1, (byte) -125, param4, param5, param3, param2);
          }
          return;
        }
        var12Lifetime1 = this.field_p.field_G;
        var13Lifetime1 = this.field_p.field_x;
        if (1 == this.field_m) {
          stackIn_13_0 = (0 >= var13Lifetime1 - var12Lifetime1) ? 0 : 1;
          var7Lifetime1 = stackIn_13_0;
        } else {
          stackIn_9_0 = (var13Lifetime1 + var12Lifetime1 <= 0) ? 0 : 1;
          var7Lifetime1 = stackIn_9_0;
        }
        if (0 == this.field_p.field_m) {
          if (this.field_p.field_m == 0) {
            var14Lifetime1 = 0;
          } else {
            var14Lifetime1 = -this.field_p.field_m + 12;
          }
          if (this.field_m == 1) {
            if (-var13Lifetime1 + var12Lifetime1 <= 0) {
              stackIn_70_0 = ja.field_h[var14Lifetime1];
            } else {
              stackIn_70_0 = tk.field_h[var14Lifetime1];
            }
            var11 = stackIn_70_0;
            stackIn_73_0 = (var7Lifetime1 != 0) ? 0 : 1;
            var9Lifetime1 = stackIn_73_0;
            if (null != this.field_o) {
              var12Lifetime1 = this.field_o.field_G;
              var13Lifetime1 = this.field_o.field_x;
              if (this.field_m == 1) {
                stackIn_83_0 = (-var12Lifetime1 + var13Lifetime1 >= 0) ? 0 : 1;
                var8 = stackIn_83_0;
              } else {
                stackIn_79_0 = (var13Lifetime1 + var12Lifetime1 >= 0) ? 0 : 1;
                var8 = stackIn_79_0;
              }
              stackIn_87_0 = (var8 != 0) ? 0 : 1;
              var10 = stackIn_87_0;
              if (this.field_o.field_m < 6) {
                var14Lifetime1 = this.field_o.field_m;
                if (1 != this.field_m) {
                  if (var13Lifetime1 + var12Lifetime1 >= 0) {
                    stackIn_96_0 = en.field_K[var14Lifetime1];
                  } else {
                    stackIn_96_0 = db.field_j[var14Lifetime1];
                  }
                  var11 = stackIn_96_0;
                } else {
                  if (0 <= var12Lifetime1 - var13Lifetime1) {
                    stackIn_92_0 = ja.field_h[var14Lifetime1];
                  } else {
                    stackIn_92_0 = tk.field_h[var14Lifetime1];
                  }
                  var11 = stackIn_92_0;
                }
              }
            }
            if (var7Lifetime1 != 0) {
              this.a(param3, param1, 2, param5, param2, param4);
            }
            if (var8 != 0) {
              this.a(param1, (byte) -64, param4, param5, param3, param2);
            }
            var12Lifetime1 = -84 % ((param0 - 74) / 41);
            if (param1 == 24 &&
              param2 == 24) {
              var11.a(param4, -param2 + param5);
            } else {
              var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
            }
          } else {
            if (var12Lifetime1 + var13Lifetime1 > 0) {
              stackIn_22_0 = db.field_j[var14Lifetime1];
            } else {
              stackIn_22_0 = en.field_K[var14Lifetime1];
            }
            var11 = stackIn_22_0;
            stackIn_25_0 = (var7Lifetime1 != 0) ? 0 : 1;
            var9Lifetime1 = stackIn_25_0;
            if (null != this.field_o) {
              var12Lifetime1 = this.field_o.field_G;
              var13Lifetime1 = this.field_o.field_x;
              if (this.field_m == 1) {
                stackIn_35_0 = (-var12Lifetime1 + var13Lifetime1 >= 0) ? 0 : 1;
                var8 = stackIn_35_0;
              } else {
                stackIn_31_0 = (var13Lifetime1 + var12Lifetime1 >= 0) ? 0 : 1;
                var8 = stackIn_31_0;
              }
              stackIn_39_0 = (var8 != 0) ? 0 : 1;
              var10 = stackIn_39_0;
              if (this.field_o.field_m < 6) {
                var14Lifetime1 = this.field_o.field_m;
                if (1 != this.field_m) {
                  if (var13Lifetime1 + var12Lifetime1 >= 0) {
                    stackIn_48_0 = en.field_K[var14Lifetime1];
                  } else {
                    stackIn_48_0 = db.field_j[var14Lifetime1];
                  }
                  var11 = stackIn_48_0;
                } else {
                  if (0 <= var12Lifetime1 - var13Lifetime1) {
                    stackIn_44_0 = ja.field_h[var14Lifetime1];
                  } else {
                    stackIn_44_0 = tk.field_h[var14Lifetime1];
                  }
                  var11 = stackIn_44_0;
                }
              }
            }
            if (var7Lifetime1 != 0) {
              this.a(param3, param1, 2, param5, param2, param4);
            }
            if (var8 != 0) {
              this.a(param1, (byte) -64, param4, param5, param3, param2);
            }
            var12Lifetime1 = -84 % ((param0 - 74) / 41);
            if (param1 == 24 &&
              param2 == 24) {
              var11.a(param4, -param2 + param5);
            } else {
              var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
            }
          }
        } else {
          if (this.field_p.field_m <= 6) {
            stackIn_120_0 = (var7Lifetime1 != 0) ? 0 : 1;
            var9Lifetime1 = stackIn_120_0;
            if (null != this.field_o) {
              var12Lifetime1 = this.field_o.field_G;
              var13Lifetime1 = this.field_o.field_x;
              if (this.field_m == 1) {
                stackIn_130_0 = (-var12Lifetime1 + var13Lifetime1 >= 0) ? 0 : 1;
                var8 = stackIn_130_0;
              } else {
                stackIn_126_0 = (var13Lifetime1 + var12Lifetime1 >= 0) ? 0 : 1;
                var8 = stackIn_126_0;
              }
              stackIn_134_0 = (var8 != 0) ? 0 : 1;
              var10 = stackIn_134_0;
              if (this.field_o.field_m < 6) {
                var14Lifetime1 = this.field_o.field_m;
                if (1 != this.field_m) {
                  if (var13Lifetime1 + var12Lifetime1 >= 0) {
                    stackIn_143_0 = en.field_K[var14Lifetime1];
                  } else {
                    stackIn_143_0 = db.field_j[var14Lifetime1];
                  }
                  var11 = stackIn_143_0;
                } else {
                  if (0 <= var12Lifetime1 - var13Lifetime1) {
                    stackIn_139_0 = ja.field_h[var14Lifetime1];
                  } else {
                    stackIn_139_0 = tk.field_h[var14Lifetime1];
                  }
                  var11 = stackIn_139_0;
                }
              }
            }
            if (var7Lifetime1 != 0) {
              this.a(param3, param1, 2, param5, param2, param4);
            }
            if (var8 != 0) {
              this.a(param1, (byte) -64, param4, param5, param3, param2);
            }
            var12Lifetime1 = -84 % ((param0 - 74) / 41);
            if (param1 == 24 &&
              param2 == 24) {
              var11.a(param4, -param2 + param5);
            } else {
              var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
            }
          } else {
            if (this.field_p.field_m == 0) {
              var14Lifetime1 = 0;
            } else {
              var14Lifetime1 = -this.field_p.field_m + 12;
            }
            if (this.field_m == 1) {
              if (-var13Lifetime1 + var12Lifetime1 <= 0) {
                stackIn_217_0 = ja.field_h[var14Lifetime1];
              } else {
                stackIn_217_0 = tk.field_h[var14Lifetime1];
              }
              var11 = stackIn_217_0;
              stackIn_220_0 = (var7Lifetime1 != 0) ? 0 : 1;
              var9Lifetime1 = stackIn_220_0;
              if (null != this.field_o) {
                var12Lifetime1 = this.field_o.field_G;
                var13Lifetime1 = this.field_o.field_x;
                if (this.field_m == 1) {
                  stackIn_230_0 = (-var12Lifetime1 + var13Lifetime1 >= 0) ? 0 : 1;
                  var8 = stackIn_230_0;
                } else {
                  stackIn_226_0 = (var13Lifetime1 + var12Lifetime1 >= 0) ? 0 : 1;
                  var8 = stackIn_226_0;
                }
                stackIn_234_0 = (var8 != 0) ? 0 : 1;
                var10 = stackIn_234_0;
                if (this.field_o.field_m < 6) {
                  var14Lifetime1 = this.field_o.field_m;
                  if (1 != this.field_m) {
                    if (var13Lifetime1 + var12Lifetime1 >= 0) {
                      stackIn_243_0 = en.field_K[var14Lifetime1];
                    } else {
                      stackIn_243_0 = db.field_j[var14Lifetime1];
                    }
                    var11 = stackIn_243_0;
                  } else {
                    if (0 <= var12Lifetime1 - var13Lifetime1) {
                      stackIn_239_0 = ja.field_h[var14Lifetime1];
                    } else {
                      stackIn_239_0 = tk.field_h[var14Lifetime1];
                    }
                    var11 = stackIn_239_0;
                  }
                }
              }
              if (var7Lifetime1 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
              }
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
              }
              var12Lifetime1 = -84 % ((param0 - 74) / 41);
              if (param1 == 24 &&
                param2 == 24) {
                var11.a(param4, -param2 + param5);
              } else {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
              }
            } else {
              if (var12Lifetime1 + var13Lifetime1 > 0) {
                stackIn_169_0 = db.field_j[var14Lifetime1];
              } else {
                stackIn_169_0 = en.field_K[var14Lifetime1];
              }
              var11 = stackIn_169_0;
              stackIn_172_0 = (var7Lifetime1 != 0) ? 0 : 1;
              var9Lifetime1 = stackIn_172_0;
              if (null != this.field_o) {
                var12Lifetime1 = this.field_o.field_G;
                var13Lifetime1 = this.field_o.field_x;
                if (this.field_m == 1) {
                  stackIn_182_0 = (-var12Lifetime1 + var13Lifetime1 >= 0) ? 0 : 1;
                  var8 = stackIn_182_0;
                } else {
                  stackIn_178_0 = (var13Lifetime1 + var12Lifetime1 >= 0) ? 0 : 1;
                  var8 = stackIn_178_0;
                }
                stackIn_186_0 = (var8 != 0) ? 0 : 1;
                var10 = stackIn_186_0;
                if (this.field_o.field_m < 6) {
                  var14Lifetime1 = this.field_o.field_m;
                  if (1 != this.field_m) {
                    if (var13Lifetime1 + var12Lifetime1 >= 0) {
                      stackIn_195_0 = en.field_K[var14Lifetime1];
                    } else {
                      stackIn_195_0 = db.field_j[var14Lifetime1];
                    }
                    var11 = stackIn_195_0;
                  } else {
                    if (0 <= var12Lifetime1 - var13Lifetime1) {
                      stackIn_191_0 = ja.field_h[var14Lifetime1];
                    } else {
                      stackIn_191_0 = tk.field_h[var14Lifetime1];
                    }
                    var11 = stackIn_191_0;
                  }
                }
              }
              if (var7Lifetime1 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
              }
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
              }
              var12Lifetime1 = -84 % ((param0 - 74) / 41);
              if (param1 == 24 &&
                param2 == 24) {
                var11.a(param4, -param2 + param5);
              } else {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
              }
            }
          }
        }
        if (var9Lifetime1 != 0) {
          this.a(param3, param1, 2, param5, param2, param4);
        }
        if (var10 != 0) {
          this.a(param1, (byte) -125, param4, param5, param3, param2);
        }
        return;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            this.a(-44, -106, 68, (f[][]) null, 106, 20, 110, -87);
          }
          stackIn_3_0 = ng.a(sn.field_b, param1, new ro(this.field_m, new kp(-1)), (byte) -83, qk.field_z);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ro.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          field_u = (dl[]) null;
          return (f) (this);
        }
        return (f) (this);
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
          if (param0 <= 92) {
            this.a(-61, (byte) -122, 116);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ro.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final int a(boolean param0, boolean param1) {
        if (param0) {
          return this.field_m != 1 ? 4 : 8;
        }
        field_u = (dl[]) null;
        return this.field_m != 1 ? 4 : 8;
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        wm var10 = jf.a(kh.field_j, param5, param2 - 2, param5 + param1 * 2, kh.field_b);
        if (var10 != null) {
          var8 = param2 * ((-this.field_p.field_p + this.field_p.field_m) * param1) / this.field_p.field_p;
          var9 = param4 * ((-this.field_p.field_p + this.field_p.field_m) * 2) / this.field_p.field_p;
          this.field_p.a(param0, this.field_p.field_o * var8 + param5, param1, param4, param3 + var9 * this.field_p.field_s, param2 + 4259);
          var10.a((byte) -16);
          return;
        }
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_r = null;
        if (param0 != 4) {
          return;
        }
        field_s = null;
        field_u = null;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 16736352) {
            stackIn_4_0 = param2;
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_7_0 = var9;
          stackIn_7_1 = new StringBuilder().append("ro.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(')').toString());
        }
    }

    ro(int param0, f param1) {
        super(param1);
        this.field_p = null;
        this.field_o = null;
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ro.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(db param0, db param1, boolean param2, db param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return false;
          }
          if (!param0.a((byte) 102)) {
            return false;
          }
          if (!param0.a(-20402, "commonui")) {
            return false;
          }
          if (param1.a((byte) 102) &&
            param1.a(-20402, "commonui")) {
            if (param3.a((byte) 102) &&
              param3.a(-20402, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ro.P(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_t = "These are members-only levels.";
        field_r = new String[]{"Easy", "Peasy", "Three Rooms", "An Electric Ball", "Get the Key", "Spider Box", "Bounce Around", "Bomb in the Hole", "Push the Rock", "Hammerhead", "Fiddle Dig", "Mining Disturbance", "Shuffle to Defuse", "Hole Hider", "Variety", "Boom Averted", "A Bit Handy", "Double Shuffles", "Bottom-Heavy", "Critical Mass", "Beyond the Bomb", "Precision", "Bottomless", "Air Raid Bunker", "Twang", "Mirror Fiddle", "Lurid", "Where is the Key?", "Ooh Look, Leaves", "Low Exit", "Star Feet", "Support! Timing!", "Rock Block", "Don't Rush", "Box Box Box", "One-Way", "Smoothly Does It", "Pink Suits You Sir!", "Piercing", "Elimination", "Mystifying", "Crossroads", "Falling Sky", "Balancing Act", "Demolition", "Laser Maze", "Controller", "Safe Madness", "Puzzle Rooms", "Ball Race", "Drop Nothing", "Psychedelic", "Funnel", "Cascade", "Rook", "Bomb Block Rock", "Magic Pervades", "Quick, Kill Them!", "Where to?", "Hot Feet", "Rather Hard", "Turbo Controller", "Funner Funnel", "Unexplainable", "Juggle Maze", "Fearsome", "Filter Effect", "It's a Goblin!", "It's Hostile!", "Grand Finale"};
        field_s = "achievements to collect";
    }
}
