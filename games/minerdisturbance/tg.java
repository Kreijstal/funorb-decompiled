/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static int field_f;
    private int field_h;
    private pi field_e;
    private pi field_c;
    static int field_g;
    static int field_i;
    static int field_d;
    private int field_a;
    private pi[] field_b;

    final pi a(int param0) {
        pi discarded$0 = null;
        this.field_h = 0;
        if (param0 != -16545) {
            discarded$0 = this.a(77);
            return this.a(true);
        }
        return this.a(true);
    }

    final pi a(long param0, int param1) {
        pi var4 = null;
        pi var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        var4 = this.field_b[(int)(param0 & (long)(this.field_a - 1))];
        this.field_c = var4.field_f;
        L0: while (true) {
          if (this.field_c == var4) {
            this.field_c = null;
            if (param1 == -27109) {
              return null;
            } else {
              this.field_e = (pi) null;
              return null;
            }
          } else {
            if (this.field_c.field_d != param0) {
              this.field_c = this.field_c.field_f;
              continue L0;
            } else {
              var5 = this.field_c;
              this.field_c = this.field_c.field_f;
              return var5;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 <= -89) {
                break L1;
              } else {
                field_d = -5;
                break L1;
              }
            }
            L2: {
              pe.field_pb = pe.field_pb + 1;
              if ((h.field_b ^ -1) != 0) {
                break L2;
              } else {
                if (vd.field_y == -1) {
                  h.field_b = nk.field_w;
                  vd.field_y = gb.field_e;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (param1 != null) {
                  if (!param1.equals(fa.field_c)) {
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != fa.field_c) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!il.field_n) {
                  if (pe.field_pb >= ch.field_f) {
                    if (od.field_o + ch.field_f > pe.field_pb) {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L5;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_20_0 = stackOut_17_0;
                      break L5;
                    }
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_20_0 = stackOut_15_0;
                    break L5;
                  }
                } else {
                  stackOut_13_0 = 0;
                  stackIn_20_0 = stackOut_13_0;
                  break L5;
                }
              }
              L6: {
                var2_int = stackIn_20_0;
                if (param1 == null) {
                  pe.field_pb = 0;
                  break L6;
                } else {
                  if (il.field_n) {
                    pe.field_pb = ch.field_f;
                    break L6;
                  } else {
                    if (var2_int == 0) {
                      pe.field_pb = 0;
                      break L6;
                    } else {
                      pe.field_pb = ch.field_f;
                      break L6;
                    }
                  }
                }
              }
              lj.field_q = vd.field_y;
              ng.field_l = h.field_b;
              if (param1 != null) {
                il.field_n = false;
                break L3;
              } else {
                if (var2_int == 0) {
                  break L3;
                } else {
                  il.field_n = true;
                  break L3;
                }
              }
            }
            L7: {
              if (il.field_n) {
                break L7;
              } else {
                if (ch.field_f <= pe.field_pb) {
                  break L7;
                } else {
                  if (!k.field_i) {
                    break L7;
                  } else {
                    lj.field_q = vd.field_y;
                    pe.field_pb = 0;
                    ng.field_l = h.field_b;
                    break L7;
                  }
                }
              }
            }
            L8: {
              fa.field_c = param1;
              vd.field_y = -1;
              h.field_b = -1;
              if (!il.field_n) {
                break L8;
              } else {
                if (oh.field_E == pe.field_pb) {
                  il.field_n = false;
                  pe.field_pb = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var2);
            stackOut_41_1 = new StringBuilder().append("tg.G(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        tl.field_m = 0;
        mb.field_c = null;
        if (param1 < -44) {
          em.field_B = null;
          var2 = kb.field_a;
          kb.field_a = sc.field_c;
          sc.field_c = var2;
          if ((param0 ^ -1) == -52) {
            aj.field_c.field_j = 2;
            aj.field_c.field_o = aj.field_c.field_o + 1;
            if (2 > aj.field_c.field_o) {
              if (aj.field_c.field_o < 2) {
                if (-5 < (aj.field_c.field_o ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  if (-5 < (aj.field_c.field_o ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (51 == param0) {
                return 2;
              } else {
                if (aj.field_c.field_o < 2) {
                  if (-5 < (aj.field_c.field_o ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 == param0) {
                    return 5;
                  } else {
                    if (-5 < (aj.field_c.field_o ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          } else {
            if ((param0 ^ -1) == -51) {
              aj.field_c.field_j = 5;
              aj.field_c.field_o = aj.field_c.field_o + 1;
              if (2 > aj.field_c.field_o) {
                if (aj.field_c.field_o < 2) {
                  if (-5 < (aj.field_c.field_o ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 == param0) {
                    return 5;
                  } else {
                    if (-5 < (aj.field_c.field_o ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (51 != param0) {
                  if (aj.field_c.field_o < 2) {
                    if (-5 >= (aj.field_c.field_o ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (50 != param0) {
                      if (-5 >= (aj.field_c.field_o ^ -1)) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              }
            } else {
              aj.field_c.field_j = 1;
              aj.field_c.field_o = aj.field_c.field_o + 1;
              if (2 > aj.field_c.field_o) {
                if (aj.field_c.field_o < 2) {
                  if (-5 >= (aj.field_c.field_o ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param0) {
                    if (-5 >= (aj.field_c.field_o ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                if (51 != param0) {
                  L0: {
                    if (aj.field_c.field_o < 2) {
                      break L0;
                    } else {
                      if (50 == param0) {
                        return 5;
                      } else {
                        break L0;
                      }
                    }
                  }
                  if (-5 >= (aj.field_c.field_o ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            }
          }
        } else {
          L1: {
            field_f = 31;
            em.field_B = null;
            var2 = kb.field_a;
            kb.field_a = sc.field_c;
            sc.field_c = var2;
            if ((param0 ^ -1) == -52) {
              aj.field_c.field_j = 2;
              break L1;
            } else {
              if ((param0 ^ -1) == -51) {
                aj.field_c.field_j = 5;
                break L1;
              } else {
                aj.field_c.field_j = 1;
                break L1;
              }
            }
          }
          aj.field_c.field_o = aj.field_c.field_o + 1;
          if (2 <= aj.field_c.field_o) {
            if (51 == param0) {
              return 2;
            } else {
              if (aj.field_c.field_o >= 2) {
                if (50 == param0) {
                  return 5;
                } else {
                  if (-5 >= (aj.field_c.field_o ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                if (-5 >= (aj.field_c.field_o ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            L2: {
              if (aj.field_c.field_o < 2) {
                break L2;
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  break L2;
                }
              }
            }
            if (-5 >= (aj.field_c.field_o ^ -1)) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    tg(int param0) {
        pi dupTemp$2 = null;
        int var2 = 0;
        pi var3 = null;
        this.field_h = 0;
        this.field_b = new pi[param0];
        this.field_a = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new pi();
            var3 = dupTemp$2;
            this.field_b[var2] = dupTemp$2;
            var3.field_f = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final pi a(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        pi var4 = null;
        pi var5 = null;
        pi var6 = null;
        pi var18 = null;
        pi var19 = null;
        pi var23 = null;
        pi var32 = null;
        var3 = MinerDisturbance.field_ab;
        if (-1 > (this.field_h ^ -1)) {
          if (this.field_b[-1 + this.field_h] == this.field_e) {
            if (!param0) {
              var4 = (pi) null;
              this.a(-99, -121L, (pi) null);
              L0: while (true) {
                if (this.field_a > this.field_h) {
                  fieldTemp$4 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var5 = this.field_b[fieldTemp$4].field_f;
                  var23 = var5;
                  if (var5 == this.field_b[this.field_h - 1]) {
                    continue L0;
                  } else {
                    this.field_e = var23.field_f;
                    return var23;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L1: while (true) {
                if (this.field_a > this.field_h) {
                  fieldTemp$5 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var5 = this.field_b[fieldTemp$5].field_f;
                  var19 = var5;
                  if (var5 == this.field_b[this.field_h - 1]) {
                    continue L1;
                  } else {
                    this.field_e = var19.field_f;
                    return var19;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var32 = this.field_e;
            this.field_e = var32.field_f;
            return var32;
          }
        } else {
          if (param0) {
            L2: while (true) {
              if (this.field_a > this.field_h) {
                fieldTemp$6 = this.field_h;
                this.field_h = this.field_h + 1;
                var5 = this.field_b[fieldTemp$6].field_f;
                var18 = var5;
                if (var5 == this.field_b[this.field_h - 1]) {
                  continue L2;
                } else {
                  this.field_e = var18.field_f;
                  return var18;
                }
              } else {
                return null;
              }
            }
          } else {
            var4 = (pi) null;
            this.a(-99, -121L, (pi) null);
            L3: while (true) {
              if (this.field_a > this.field_h) {
                fieldTemp$7 = this.field_h;
                this.field_h = this.field_h + 1;
                var5 = this.field_b[fieldTemp$7].field_f;
                var6 = var5;
                if (var5 == this.field_b[this.field_h - 1]) {
                  continue L3;
                } else {
                  this.field_e = var6.field_f;
                  return var6;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final void a(int param0, long param1, pi param2) {
        pi var5 = null;
        pi discarded$0 = null;
        try {
            if (!(param2.field_c == null)) {
                param2.b(34);
            }
            var5 = this.field_b[(int)(param1 & (long)(this.field_a - 1))];
            param2.field_c = var5.field_c;
            param2.field_f = var5;
            param2.field_c.field_f = param2;
            if (param0 != 0) {
                discarded$0 = this.a(true);
            }
            param2.field_f.field_c = param2;
            param2.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "tg.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                if (param0 <= -108) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                      param1.getAppletContext().showDocument(nn.a(118, param1, var2), "_top");
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var2_ref.printStackTrace();
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("tg.B(").append(param0).append(',');
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
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    static {
        field_f = 0;
        bc.a(50, -20451);
    }
}
