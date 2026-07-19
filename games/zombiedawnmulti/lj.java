/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends br {
    static int field_n;
    private int field_w;
    static String[] field_t;
    static String field_q;
    static String field_m;
    private uj field_g;
    private uj field_i;
    static cj field_v;
    static String field_k;
    private int field_j;
    static String field_p;
    private um[] field_u;
    static String[] field_h;
    private int field_r;
    static String field_f;
    private boolean field_o;
    private int field_l;
    static String field_s;

    final void a(int param0) {
        um[] var2 = null;
        int var3 = 0;
        int var5 = 0;
        um[] var6 = null;
        um var8 = null;
        um var11 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -20587) {
          var6 = this.field_u;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            L1: {
              if (var3 >= var6.length) {
                L2: {
                  if (this.field_i == null) {
                    break L2;
                  } else {
                    if (this.field_i.k()) {
                      this.field_i = null;
                      break L2;
                    } else {
                      this.field_r = this.field_r + 6;
                      if (this.field_j < this.field_r) {
                        if (!this.field_o) {
                          this.a(true);
                          return;
                        } else {
                          fb.field_e.field_u.field_i.a((byte) 127);
                          fb.field_e.field_u.a(48);
                          this.a(true);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                this.field_r = this.field_r + 6;
                break L1;
              } else {
                var11 = var6[var3];
                var11.a(this.field_w, this.field_l, (byte) -125);
                var3++;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    L3: {
                      if (this.field_i == null) {
                        break L3;
                      } else {
                        if (this.field_i.k()) {
                          this.field_i = null;
                          break L3;
                        } else {
                          this.field_r = this.field_r + 6;
                          if (this.field_j < this.field_r) {
                            if (!this.field_o) {
                              this.a(true);
                              return;
                            } else {
                              fb.field_e.field_u.field_i.a((byte) 127);
                              fb.field_e.field_u.a(48);
                              this.a(true);
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    this.field_r = this.field_r + 6;
                    if (this.field_j < this.field_r) {
                      if (!this.field_o) {
                        this.a(true);
                        return;
                      } else {
                        fb.field_e.field_u.field_i.a((byte) 127);
                        fb.field_e.field_u.a(48);
                        this.a(true);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (this.field_j < this.field_r) {
              if (!this.field_o) {
                this.a(true);
                return;
              } else {
                fb.field_e.field_u.field_i.a((byte) 127);
                fb.field_e.field_u.a(48);
                this.a(true);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_p = (String) null;
          var6 = this.field_u;
          var2 = var6;
          var3 = 0;
          L4: while (true) {
            if (var3 < var6.length) {
              L5: {
                var8 = var6[var3];
                var8.a(this.field_w, this.field_l, (byte) -125);
                var3++;
                if (var5 != 0) {
                  break L5;
                } else {
                  if (var5 == 0) {
                    continue L4;
                  } else {
                    if (this.field_i != null) {
                      L6: {
                        if (this.field_i.k()) {
                          this.field_i = null;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_r = this.field_r + 6;
                      break L5;
                    } else {
                      this.field_r = this.field_r + 6;
                      if (this.field_j < this.field_r) {
                        if (!this.field_o) {
                          this.a(true);
                          return;
                        } else {
                          fb.field_e.field_u.field_i.a((byte) 127);
                          fb.field_e.field_u.a(48);
                          this.a(true);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (this.field_j < this.field_r) {
                if (!this.field_o) {
                  this.a(true);
                  return;
                } else {
                  fb.field_e.field_u.field_i.a((byte) 127);
                  fb.field_e.field_u.a(48);
                  this.a(true);
                  return;
                }
              } else {
                return;
              }
            } else {
              L7: {
                if (this.field_i == null) {
                  break L7;
                } else {
                  if (this.field_i.k()) {
                    this.field_i = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_r = this.field_r + 6;
              if (this.field_j < this.field_r) {
                if (!this.field_o) {
                  this.a(true);
                  return;
                } else {
                  fb.field_e.field_u.field_i.a((byte) 127);
                  fb.field_e.field_u.a(48);
                  this.a(true);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, nm param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = param1.c(this.field_l, -20126);
                var4 = param1.d(this.field_w, 122);
                if (this.field_g != null) {
                  break L2;
                } else {
                  if (this.field_i != null) {
                    break L2;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = sd.b(126, var4, var3_int);
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var5 = stackIn_5_0;
              if (this.field_g != null) {
                if (this.field_g.k()) {
                  this.field_g = null;
                  break L3;
                } else {
                  this.field_g.h(var5);
                  if (var12 == 0) {
                    break L3;
                  } else {
                    this.field_g = null;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_i == null) {
                break L4;
              } else {
                if (this.field_i.k()) {
                  this.field_i = null;
                  break L4;
                } else {
                  this.field_i.h(var5);
                  if (var12 == 0) {
                    break L4;
                  } else {
                    this.field_i = null;
                    break L4;
                  }
                }
              }
            }
            L5: {
              var6 = (int)(15.0f * (float)this.field_r / (float)this.field_j);
              var7 = (int)((float)this.field_r * 128.0f / (float)this.field_j);
              var9 = 18 / ((-61 - param0) / 36);
              if (-97 > (var7 ^ -1)) {
                stackOut_20_0 = 288 + (-(3 * var7) + 96);
                stackIn_21_0 = stackOut_20_0;
                break L5;
              } else {
                stackOut_19_0 = var7;
                stackIn_21_0 = stackOut_19_0;
                break L5;
              }
            }
            L6: {
              var8 = stackIn_21_0;
              var10 = 128 + -var7 >> -91337791;
              if (-33 > (var10 ^ -1)) {
                var10 = 32;
                break L6;
              } else {
                break L6;
              }
            }
            var11 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (this.field_u.length / 2 <= var11) {
                    break L9;
                  } else {
                    this.field_u[var11].a(var4, (byte) 33, td.field_c[var6], var10 / 2, var8 / 2, var3_int);
                    var11++;
                    if (var12 != 0) {
                      break L8;
                    } else {
                      if (var12 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                var11 = this.field_u.length / 2;
                break L8;
              }
              L10: while (true) {
                if (this.field_u.length <= var11) {
                  break L0;
                } else {
                  this.field_u[var11].a(var4, (byte) 33, td.field_c[var6], var10, var8, var3_int);
                  var11++;
                  if (var12 == 0) {
                    continue L10;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("lj.D(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_m = null;
        int var1 = -50 / ((-24 - param0) / 43);
        field_p = null;
        field_h = null;
        field_f = null;
        field_q = null;
        field_t = null;
        field_s = null;
        field_v = null;
    }

    final static void a(fm param0, int param1, fm param2, int param3) {
        try {
            m.field_C = param0;
            int var4_int = 43 / ((12 - param3) / 47);
            ib.field_b = param1;
            uq.field_f = param2;
            uo.a(oo.field_l / 2, oo.field_b / 2, 1633);
            ek.a(param0.field_J, param2.field_r + param2.field_J, 1829947600, param2.field_J, param0.field_r + param0.field_J);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "lj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    lj(int param0, int param1, boolean param2) {
        th discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_g = null;
          this.field_o = false;
          this.field_i = null;
          if (fb.field_e.field_u.a(-113, param1, param0)) {
            break L0;
          } else {
            param1 = param1 - (param1 % 24 - 4);
            break L0;
          }
        }
        this.field_w = param1;
        this.field_u = new um[150];
        this.field_r = 0;
        this.field_l = param0;
        var4 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (this.field_u.length / 2 <= var4) {
                break L3;
              } else {
                this.field_u[var4] = new um(jm.field_n[var4] * 6.0f, jm.field_k[var4] * 6.0f);
                var4++;
                if (var5 != 0) {
                  break L2;
                } else {
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var4 = this.field_u.length / 2;
            break L2;
          }
          L4: while (true) {
            L5: {
              L6: {
                if (this.field_u.length <= var4) {
                  break L6;
                } else {
                  this.field_u[var4] = new um(jm.field_n[var4 % jm.field_n.length] * 6.0f / 2.0f, jm.field_k[var4 % jm.field_k.length] * 6.0f / 2.0f);
                  var4++;
                  if (var5 != 0) {
                    break L5;
                  } else {
                    if (var5 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              discarded$1 = new th();
              break L5;
            }
            L7: {
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (!param2) {
                stackOut_13_0 = this;
                stackOut_13_1 = 180;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L7;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = 90;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L7;
              }
            }
            ((lj) (this)).field_j = stackIn_14_1;
            this.field_g = nm.b(-127, 0);
            return;
          }
        }
    }

    static {
        field_p = "Breaking real-world laws";
        field_q = "Make your zombies hunger for human flesh. They will lunge faster and from further away.";
        field_h = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_t = new String[16];
        field_m = "Tutorial";
        field_f = "Username: ";
        field_k = "Invite more players, or alternatively try changing the following settings:  ";
        field_s = "You must be a member to play with the current options.";
    }
}
