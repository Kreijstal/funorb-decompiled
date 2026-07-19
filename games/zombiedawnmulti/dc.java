/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends cj {
    static long[] field_Ib;
    static int field_Hb;
    int field_Kb;
    private cj field_Mb;
    private cj[] field_Nb;
    private cj[] field_Jb;
    static int field_Fb;
    static th field_Gb;
    static fm field_Lb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_x = param1;
        if (param0 != 9736) {
          return;
        } else {
          this.field_z = param5;
          this.field_Q = param6;
          this.field_zb = param2;
          this.a(param3, param4, (byte) 119);
          return;
        }
    }

    public static void c(byte param0) {
        field_Lb = null;
        int var1 = -12 / ((8 - param0) / 54);
        field_Ib = null;
        field_Gb = null;
    }

    dc(long param0, cj param1, String[] param2, cj param3, cj[] param4, int param5) {
        super(param0, (cj) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        cj var9 = null;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_Nb = new cj[param2.length];
            this.field_Mb = new cj(0L, param3);
            this.field_Jb = param4;
            var8_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8_int >= param2.length) {
                    break L3;
                  } else {
                    var9 = new cj(0L, param1);
                    var9.field_wb = param2[var8_int];
                    this.field_Nb[var8_int] = var9;
                    this.a((byte) 50, var9);
                    var8_int++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a((byte) 50, this.field_Mb);
                break L2;
              }
              var8_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var8_int >= param4.length) {
                      break L6;
                    } else {
                      this.field_Mb.a((byte) 50, param4[var8_int]);
                      var8_int++;
                      if (var10 != 0) {
                        break L5;
                      } else {
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  this.field_Kb = param5;
                  this.field_Nb[param5].field_Ab = true;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8);
            stackOut_12_1 = new StringBuilder().append("dc.<init>(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L7;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L7;
            }
          }
          L8: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          L10: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (this.field_Nb.length <= var4) {
            if (param2 >= 72) {
              this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
              var4 = 0;
              L1: while (true) {
                if (this.field_Jb.length > var4) {
                  this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                  if (var7 == 0) {
                    L2: {
                      if (this.field_Kb == var4) {
                        break L2;
                      } else {
                        this.field_Jb[var4].field_x = this.field_Jb[var4].field_x + 10000;
                        break L2;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              this.a(-74, 39, -109, 35, 100, -8, 71);
              this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
              var4 = 0;
              L3: while (true) {
                if (this.field_Jb.length > var4) {
                  this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                  if (var7 == 0) {
                    L4: {
                      if (this.field_Kb == var4) {
                        break L4;
                      } else {
                        this.field_Jb[var4].field_x = this.field_Jb[var4].field_x + 10000;
                        break L4;
                      }
                    }
                    var4++;
                    continue L3;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            var5 = var4 * this.field_zb / this.field_Nb.length;
            var6 = (var4 - -1) * this.field_zb / this.field_Nb.length;
            this.field_Nb[var4].field_x = var5;
            this.field_Nb[var4].field_Q = 0;
            this.field_Nb[var4].field_zb = -var5 + var6;
            this.field_Nb[var4].field_z = param1;
            var4++;
            if (var7 != 0) {
              var4 = 0;
              L5: while (true) {
                if (this.field_Jb.length > var4) {
                  this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                  if (var7 == 0) {
                    L6: {
                      if (this.field_Kb == var4) {
                        break L6;
                      } else {
                        this.field_Jb[var4].field_x = this.field_Jb[var4].field_x + 10000;
                        break L6;
                      }
                    }
                    var4++;
                    continue L5;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (var7 == 0) {
                continue L0;
              } else {
                if (param2 >= 72) {
                  this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
                  var4 = 0;
                  L7: while (true) {
                    if (this.field_Jb.length > var4) {
                      this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                      if (var7 == 0) {
                        L8: {
                          if (this.field_Kb == var4) {
                            break L8;
                          } else {
                            this.field_Jb[var4].field_x = this.field_Jb[var4].field_x + 10000;
                            break L8;
                          }
                        }
                        var4++;
                        continue L7;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  this.a(-74, 39, -109, 35, 100, -8, 71);
                  this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
                  var4 = 0;
                  L9: while (true) {
                    if (this.field_Jb.length > var4) {
                      this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                      if (var7 == 0) {
                        L10: {
                          if (this.field_Kb == var4) {
                            break L10;
                          } else {
                            this.field_Jb[var4].field_x = this.field_Jb[var4].field_x + 10000;
                            break L10;
                          }
                        }
                        var4++;
                        continue L9;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(long param0, java.applet.Applet param1, String param2, int param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        var8 = param1.getParameter("cookiehost");
                        var7 = var8;
                        var7 = var8;
                        var9 = param2 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                        var7 = var9;
                        var7 = var9;
                        var7 = var9;
                        if (0L > param0) {
                          break L3;
                        } else {
                          var7 = var9 + "; Expires=" + ke.a(-29971, bl.a((byte) 101) + 1000L * param0) + "; Max-Age=" + param0;
                          if (!ZombieDawnMulti.field_E) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var7 = var7 + "; Discard;";
                      break L2;
                    }
                    if (param3 < -91) {
                      fo.a(param1, 14575, "document.cookie=\"" + var7 + "\"");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var6_ref);
                stackOut_9_1 = new StringBuilder().append("dc.EA(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L6;
                }
              }
              L7: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param4 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < -26) {
          var2 = 0;
          L0: while (true) {
            if (this.field_Nb.length > var2) {
              if (var3 == 0) {
                L1: {
                  if (var2 == this.field_Kb) {
                    break L1;
                  } else {
                    if (0 != this.field_Nb[var2].field_T) {
                      this.field_Nb[this.field_Kb].field_Ab = false;
                      this.field_Jb[this.field_Kb].field_x = this.field_Jb[this.field_Kb].field_x + 10000;
                      this.field_Kb = var2;
                      this.field_Nb[var2].field_Ab = true;
                      this.field_Jb[var2].field_x = this.field_Jb[var2].field_x - 10000;
                      break L1;
                    } else {
                      var2++;
                      continue L0;
                    }
                  }
                }
                var2++;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_Ib = new long[32];
        field_Gb = new th();
    }
}
