/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gq extends uta {
    private ela[] field_v;
    static ica field_w;
    static dn field_u;

    final void e(int param0) {
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        int var3 = 0;
        mi[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ela var12_ref_ela = null;
        int var12 = 0;
        ela var13 = null;
        int var14 = 0;
        String var15 = null;
        mi var16 = null;
        vj var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          var15 = this.field_o.e((byte) -114);
          var6 = var15;
          var6 = var15;
          var3 = this.field_o.j(-1320);
          var4 = ih.a((byte) 126, var15);
          var5 = qa.a(true, var4, var3);
          var6 = "";
          if ((var5 ^ -1) > -1) {
            break L0;
          } else {
            var16 = var4[var5];
            var8_int = var3 - var16.field_h;
            if (tr.field_f != var16.field_p) {
              break L0;
            } else {
              if (0 >= var8_int) {
                break L0;
              } else {
                if (var16.field_m.length() >= var8_int) {
                  var6 = var16.field_m.substring(0, var8_int);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var17 = this.b(false, var6);
        if (var17.a((byte) -48) != 0) {
          var8 = new StringBuilder();
          var9 = var6.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_ela = (ela) ((Object) var17.b((byte) 38));
          L1: while (true) {
            L2: {
              if (var12_ref_ela == null) {
                break L2;
              } else {
                var21 = var12_ref_ela.field_l.length();
                var20 = var11;
                if (var14 != 0) {
                  if (var20 != var21) {
                    field_w = (ica) null;
                    var12 = var3 - -var8.length();
                    if (var6.length() - -var8.length() == var11) {
                      discarded$20 = var8.append("()");
                      var12++;
                      if (1 == var17.a((byte) -34)) {
                        if (((ela) ((Object) var17.b((byte) 38))).field_n.length != 0) {
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        } else {
                          var12++;
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        }
                      } else {
                        this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                        this.field_o.c(var12, 1);
                        return;
                      }
                    } else {
                      this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                      this.field_o.c(var12, 1);
                      return;
                    }
                  } else {
                    var12 = var3 - -var8.length();
                    if (var6.length() - -var8.length() == var11) {
                      discarded$21 = var8.append("()");
                      var12++;
                      if (1 == var17.a((byte) -34)) {
                        if (((ela) ((Object) var17.b((byte) 38))).field_n.length != 0) {
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        } else {
                          var12++;
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        }
                      } else {
                        this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                        this.field_o.c(var12, 1);
                        return;
                      }
                    } else {
                      this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                      this.field_o.c(var12, 1);
                      return;
                    }
                  }
                } else {
                  L3: {
                    if (var20 <= var21) {
                      break L3;
                    } else {
                      var11 = var12_ref_ela.field_l.length();
                      break L3;
                    }
                  }
                  var12_ref_ela = (ela) ((Object) var17.c(param0 + -21275));
                  if (var14 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: while (true) {
              if (var10 != 0) {
                var19 = var11 ^ -1;
                var18 = var9 ^ -1;
                if (var14 != 0) {
                  if (var18 != var19) {
                    field_w = (ica) null;
                    var12 = var3 - -var8.length();
                    if (var6.length() - -var8.length() == var11) {
                      discarded$22 = var8.append("()");
                      var12++;
                      if (1 == var17.a((byte) -34)) {
                        if (((ela) ((Object) var17.b((byte) 38))).field_n.length != 0) {
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        } else {
                          var12++;
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        }
                      } else {
                        this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                        this.field_o.c(var12, 1);
                        return;
                      }
                    } else {
                      this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                      this.field_o.c(var12, 1);
                      return;
                    }
                  } else {
                    var12 = var3 - -var8.length();
                    if (var6.length() - -var8.length() == var11) {
                      discarded$23 = var8.append("()");
                      var12++;
                      if (1 == var17.a((byte) -34)) {
                        if (((ela) ((Object) var17.b((byte) 38))).field_n.length == 0) {
                          var12++;
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        } else {
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        }
                      } else {
                        this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                        this.field_o.c(var12, 1);
                        return;
                      }
                    } else {
                      this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                      this.field_o.c(var12, 1);
                      return;
                    }
                  }
                } else {
                  L5: {
                    if (var18 <= var19) {
                      break L5;
                    } else {
                      var12 = ((ela) ((Object) var17.b((byte) 38))).field_l.charAt(var9);
                      var13 = (ela) ((Object) var17.c(param0 ^ 21291));
                      L6: while (true) {
                        L7: {
                          if (var13 == null) {
                            break L7;
                          } else {
                            stackOut_55_0 = var10;
                            stackOut_55_1 = var12 ^ -1;
                            stackOut_55_2 = var13.field_l.charAt(var9) ^ -1;
                            stackIn_95_0 = stackOut_55_0;
                            stackIn_95_1 = stackOut_55_1;
                            stackIn_95_2 = stackOut_55_2;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            stackIn_56_2 = stackOut_55_2;
                            if (var14 != 0) {
                              if (stackIn_95_0 == (stackIn_95_1 ^ stackIn_95_2)) {
                                discarded$24 = var8.append("()");
                                var12++;
                                if (1 == var17.a((byte) -34)) {
                                  if (((ela) ((Object) var17.b((byte) 38))).field_n.length == 0) {
                                    var12++;
                                    this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                                    this.field_o.c(var12, 1);
                                    return;
                                  } else {
                                    this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                                    this.field_o.c(var12, 1);
                                    return;
                                  }
                                } else {
                                  this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                                  this.field_o.c(var12, 1);
                                  return;
                                }
                              } else {
                                this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                                this.field_o.c(var12, 1);
                                return;
                              }
                            } else {
                              L8: {
                                stackOut_56_0 = stackIn_56_0;
                                stackIn_58_0 = stackOut_56_0;
                                stackIn_57_0 = stackOut_56_0;
                                if (stackIn_56_1 != stackIn_56_2) {
                                  stackOut_58_0 = stackIn_58_0;
                                  stackOut_58_1 = 0;
                                  stackIn_59_0 = stackOut_58_0;
                                  stackIn_59_1 = stackOut_58_1;
                                  break L8;
                                } else {
                                  stackOut_57_0 = stackIn_57_0;
                                  stackOut_57_1 = 1;
                                  stackIn_59_0 = stackOut_57_0;
                                  stackIn_59_1 = stackOut_57_1;
                                  break L8;
                                }
                              }
                              var10 = stackIn_59_0 & stackIn_59_1;
                              var13 = (ela) ((Object) var17.c(28));
                              if (var14 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        L9: {
                          if (var10 != 0) {
                            discarded$25 = var8.append((char) var12);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var9++;
                        if (var14 == 0) {
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param0 != 21303) {
                    L10: {
                      field_w = (ica) null;
                      var12 = var3 - -var8.length();
                      if (var6.length() - -var8.length() != var11) {
                        break L10;
                      } else {
                        discarded$26 = var8.append("()");
                        var12++;
                        if (1 != var17.a((byte) -34)) {
                          break L10;
                        } else {
                          if (((ela) ((Object) var17.b((byte) 38))).field_n.length == 0) {
                            var12++;
                            break L10;
                          } else {
                            this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                            this.field_o.c(var12, 1);
                            return;
                          }
                        }
                      }
                    }
                    this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                    this.field_o.c(var12, 1);
                    return;
                  } else {
                    var12 = var3 - -var8.length();
                    if (var6.length() - -var8.length() == var11) {
                      discarded$27 = var8.append("()");
                      var12++;
                      if (1 == var17.a((byte) -34)) {
                        if (((ela) ((Object) var17.b((byte) 38))).field_n.length == 0) {
                          var12++;
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        } else {
                          this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                          this.field_o.c(var12, 1);
                          return;
                        }
                      } else {
                        this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                        this.field_o.c(var12, 1);
                        return;
                      }
                    } else {
                      this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                      this.field_o.c(var12, 1);
                      return;
                    }
                  }
                }
              } else {
                if (param0 == 21303) {
                  var12 = var3 - -var8.length();
                  if (var6.length() - -var8.length() == var11) {
                    discarded$28 = var8.append("()");
                    var12++;
                    if (1 == var17.a((byte) -34)) {
                      if (((ela) ((Object) var17.b((byte) 38))).field_n.length != 0) {
                        this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                        this.field_o.c(var12, 1);
                        return;
                      } else {
                        var12++;
                        this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                        this.field_o.c(var12, 1);
                        return;
                      }
                    } else {
                      this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                      this.field_o.c(var12, 1);
                      return;
                    }
                  } else {
                    this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                    this.field_o.c(var12, 1);
                    return;
                  }
                } else {
                  L11: {
                    field_w = (ica) null;
                    var12 = var3 - -var8.length();
                    if (var6.length() - -var8.length() != var11) {
                      break L11;
                    } else {
                      discarded$29 = var8.append("()");
                      var12++;
                      if (1 != var17.a((byte) -34)) {
                        break L11;
                      } else {
                        if (((ela) ((Object) var17.b((byte) 38))).field_n.length == 0) {
                          var12++;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                  this.field_o.c(var12, 1);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final vj b(boolean param0, String param1) {
        vj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vj stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        vj stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new vj();
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                field_u = (dn) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var4 >= this.field_v.length) {
                  break L3;
                } else {
                  L4: {
                    if (!this.field_v[var4].field_l.startsWith(param1)) {
                      break L4;
                    } else {
                      this.field_v[var4].c(-7975);
                      var3.a(this.field_v[var4], (byte) -78);
                      break L4;
                    }
                  }
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = (vj) (var3);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("gq.H(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final boolean a(String param0, byte param1) {
        try {
            jj var3 = null;
            rv var3_ref = null;
            RuntimeException var3_ref2 = null;
            jea var4 = null;
            int var5 = 0;
            mi var6 = null;
            vna var7 = null;
            cr var8 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_5_0 = 0;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var7 = lp.a((byte) 48, param0);
                    var5 = 80 / ((-44 - param1) / 36);
                    var8 = new cr(var7);
                    var6 = ed.a(var8, -31733);
                    if (var8.a((byte) 85)) {
                      this.a((byte) -80, var6.a(-1, this.field_v));
                      stackOut_2_0 = 1;
                      stackIn_3_0 = stackOut_2_0;
                      break L1;
                    } else {
                      throw new jj(var8.c((byte) -127).field_h);
                    }
                  }
                } catch (jj decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (jj) (Object) decompiledCaughtException;
                  param0 = "<col=55ff55>" + param0.substring(0, var3.field_a) + "</col>" + param0.substring(var3.field_a);
                  var4 = (jea) ((Object) this.field_a.field_tb.field_J.b(3));
                  var4.field_r = this.field_t + param0;
                  return false;
                } catch (rv decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3_ref = (rv) (Object) decompiledCaughtException;
                  this.a(123, var3_ref.field_b);
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var3_ref2);
                stackOut_7_1 = new StringBuilder().append("gq.G(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
            }
            return stackIn_3_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 != 39) {
            gq.f(51);
            field_w = null;
            return;
        }
        field_w = null;
    }

    gq(vna param0, il param1, fia param2) {
        super(param1, param2);
        int incrementValue$2 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        ela var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_v = new ela[param0.a((byte) -16)];
            var4_int = 0;
            var5 = (ela) ((Object) param0.f(-80));
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    incrementValue$2 = var4_int;
                    var4_int++;
                    this.field_v[incrementValue$2] = var5;
                    var5 = (ela) ((Object) param0.e(125));
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(-124, "# <col=ffaaff>FunOrbConsole (loaded " + this.field_v.length + " methods at " + new Date() + ")</col>");
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("gq.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final String[] a(boolean param0) {
        boolean discarded$2 = false;
        int incrementValue$3 = 0;
        int var3 = 0;
        mi[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ela var10 = null;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        mi var15 = null;
        vj var16 = null;
        int var17 = 0;
        int var18 = 0;
        String[] stackIn_31_0 = null;
        String[] stackIn_32_0 = null;
        String[] stackOut_30_0 = null;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var13 = this.field_o.e((byte) -115);
          var6 = var13;
          var6 = var13;
          var14 = var13;
          var6 = var14;
          var6 = var14;
          var3 = this.field_o.j(-1320);
          var4 = ih.a((byte) 126, var14);
          var5 = qa.a(true, var4, var3);
          if (!param0) {
            break L0;
          } else {
            var12 = (String) null;
            discarded$2 = this.a((String) null, (byte) -83);
            break L0;
          }
        }
        L1: {
          this.field_p.field_qb = 0;
          var6 = "";
          if ((var5 ^ -1) <= -1) {
            L2: {
              var15 = var4[var5];
              var8_int = -var15.field_h + var3;
              if (var15.field_p != tr.field_f) {
                break L2;
              } else {
                if ((var8_int ^ -1) >= -1) {
                  break L2;
                } else {
                  var6 = var15.field_m.substring(0, Math.min(var15.field_m.length(), var8_int));
                  this.field_p.field_qb = this.field_m.b(var14.substring(0, var15.field_h));
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var9 = var5;
            var10_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var9 < 0) {
                    break L5;
                  } else {
                    var18 = rs.field_a;
                    var17 = var4[var9].field_p;
                    if (var11 != 0) {
                      if (var17 >= var18) {
                        break L1;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        if (var17 != var18) {
                          break L6;
                        } else {
                          var10_int++;
                          break L6;
                        }
                      }
                      L7: {
                        if (var4[var9].field_p == lna.field_a) {
                          var10_int--;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (-1 >= (var10_int ^ -1)) {
                          break L8;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var9--;
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (0 >= var9) {
                  break L1;
                } else {
                  break L4;
                }
              }
              if (tr.field_f == var4[var9 + -1].field_p) {
                var6 = var4[var9 - 1].field_m;
                this.field_p.field_qb = this.field_m.b(var13.substring(0, var4[var9 + -1].field_h));
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        var16 = this.b(param0, var6);
        var8 = new String[var16.a((byte) -99)];
        var9 = 0;
        var10 = (ela) ((Object) var16.b((byte) 38));
        L9: while (true) {
          if (var10 != null) {
            stackOut_30_0 = (String[]) (var8);
            stackIn_32_0 = stackOut_30_0;
            stackIn_31_0 = stackOut_30_0;
            if (var11 == 0) {
              incrementValue$3 = var9;
              var9++;
              stackIn_32_0[incrementValue$3] = var10.field_k;
              var10 = (ela) ((Object) var16.c(28));
              continue L9;
            } else {
              return stackIn_31_0;
            }
          } else {
            return var8;
          }
        }
    }

    public final boolean a(byte param0, char param1, int param2) {
        boolean discarded$60 = false;
        boolean discarded$61 = false;
        boolean discarded$62 = false;
        boolean discarded$63 = false;
        boolean discarded$64 = false;
        boolean discarded$65 = false;
        boolean discarded$66 = false;
        boolean discarded$67 = false;
        boolean discarded$68 = false;
        boolean discarded$69 = false;
        boolean discarded$70 = false;
        boolean discarded$71 = false;
        boolean discarded$72 = false;
        boolean discarded$73 = false;
        boolean discarded$74 = false;
        boolean discarded$75 = false;
        boolean discarded$76 = false;
        boolean discarded$77 = false;
        boolean discarded$78 = false;
        boolean discarded$79 = false;
        boolean discarded$80 = false;
        boolean discarded$81 = false;
        boolean discarded$82 = false;
        boolean discarded$83 = false;
        boolean discarded$84 = false;
        boolean discarded$85 = false;
        boolean discarded$86 = false;
        boolean discarded$87 = false;
        boolean discarded$88 = false;
        boolean discarded$89 = false;
        boolean discarded$90 = false;
        boolean discarded$91 = false;
        boolean discarded$92 = false;
        boolean discarded$93 = false;
        boolean discarded$94 = false;
        boolean discarded$95 = false;
        boolean discarded$96 = false;
        boolean discarded$97 = false;
        boolean discarded$98 = false;
        boolean discarded$99 = false;
        boolean discarded$100 = false;
        boolean discarded$101 = false;
        boolean discarded$102 = false;
        boolean discarded$103 = false;
        boolean discarded$104 = false;
        boolean discarded$105 = false;
        boolean discarded$106 = false;
        boolean discarded$107 = false;
        boolean discarded$108 = false;
        boolean discarded$109 = false;
        boolean discarded$110 = false;
        boolean discarded$111 = false;
        boolean discarded$112 = false;
        boolean discarded$113 = false;
        boolean discarded$114 = false;
        boolean discarded$115 = false;
        boolean discarded$116 = false;
        boolean discarded$117 = false;
        boolean discarded$118 = false;
        boolean discarded$119 = false;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        char stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        char stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (!this.a(-2)) {
          return super.a((byte) -72, param1, param2);
        } else {
          var12 = this.field_o.e((byte) -106);
          var5 = this.field_o.j(-1320);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          L0: while (true) {
            L1: {
              if (var5 <= var9) {
                stackOut_26_0 = -1;
                stackIn_27_0 = stackOut_26_0;
                break L1;
              } else {
                stackOut_5_0 = var8;
                stackIn_27_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var11 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (stackIn_6_0 == 0) {
                        break L3;
                      } else {
                        var8 = 0;
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      L5: {
                        var10 = var12.charAt(var9);
                        if (var6 != 0) {
                          break L5;
                        } else {
                          if (var7 != 0) {
                            break L5;
                          } else {
                            stackOut_10_0 = 0;
                            stackIn_16_0 = stackOut_10_0;
                            break L4;
                          }
                        }
                      }
                      if (var10 == 92) {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_16_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L6: {
                      L7: {
                        var8 = stackIn_16_0;
                        stackOut_16_0 = var6;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var7 != 0) {
                          break L7;
                        } else {
                          stackOut_17_0 = stackIn_17_0;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var10 != 34) {
                            break L7;
                          } else {
                            stackOut_18_0 = stackIn_18_0;
                            stackOut_18_1 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L6;
                          }
                        }
                      }
                      stackOut_19_0 = stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L6;
                    }
                    L8: {
                      L9: {
                        var6 = stackIn_20_0 ^ stackIn_20_1;
                        stackOut_20_0 = var7;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var6 != 0) {
                          break L9;
                        } else {
                          stackOut_21_0 = stackIn_21_0;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var10 != 39) {
                            break L9;
                          } else {
                            stackOut_22_0 = stackIn_22_0;
                            stackOut_22_1 = 1;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_24_1 = stackOut_22_1;
                            break L8;
                          }
                        }
                      }
                      stackOut_23_0 = stackIn_23_0;
                      stackOut_23_1 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L8;
                    }
                    var7 = stackIn_24_0 ^ stackIn_24_1;
                    break L2;
                  }
                  var9++;
                  continue L0;
                }
              }
            }
            L10: {
              if (stackIn_27_0 > (var5 ^ -1)) {
                stackOut_29_0 = var12.charAt(-1 + var5);
                stackIn_30_0 = stackOut_29_0;
                break L10;
              } else {
                stackOut_28_0 = 65535;
                stackIn_30_0 = stackOut_28_0;
                break L10;
              }
            }
            L11: {
              var9 = stackIn_30_0;
              if (var12.length() > var5) {
                stackOut_32_0 = var12.charAt(var5);
                stackIn_33_0 = stackOut_32_0;
                break L11;
              } else {
                stackOut_31_0 = 65535;
                stackIn_33_0 = stackOut_31_0;
                break L11;
              }
            }
            var10 = stackIn_33_0;
            if (var6 != 0) {
              if (var8 == 0) {
                L12: {
                  L13: {
                    L14: {
                      if (34 != param1) {
                        break L14;
                      } else {
                        if (var10 == 34) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (var7 == 0) {
                        break L15;
                      } else {
                        if (var8 != 0) {
                          break L15;
                        } else {
                          if (39 != param1) {
                            break L15;
                          } else {
                            if (var10 == 39) {
                              break L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    if (var6 != 0) {
                      break L12;
                    } else {
                      if (var7 != 0) {
                        break L12;
                      } else {
                        if (param1 != 41) {
                          break L12;
                        } else {
                          if (var10 != 41) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  this.field_o.c(1 + var5, 1);
                  if (var11 != 0) {
                    break L12;
                  } else {
                    gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                    if (param0 != -72) {
                      this.field_v = (ela[]) null;
                      return true;
                    } else {
                      return true;
                    }
                  }
                }
                L16: {
                  if (85 != param2) {
                    break L16;
                  } else {
                    L17: {
                      if (40 != var9) {
                        break L17;
                      } else {
                        if (var10 == 41) {
                          discarded$60 = this.field_o.a(101, -19696, '￿');
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (var6 == 0) {
                        break L18;
                      } else {
                        if (34 != var9) {
                          break L18;
                        } else {
                          if (34 != var10) {
                            break L18;
                          } else {
                            L19: {
                              discarded$61 = this.field_o.a(101, -19696, '￿');
                              discarded$62 = super.a((byte) -72, param1, param2);
                              var4 = this.field_o.e((byte) -124);
                              var5 = this.field_o.j(-1320);
                              if (var6 != 0) {
                                break L19;
                              } else {
                                if (var7 != 0) {
                                  break L19;
                                } else {
                                  if (param1 == 40) {
                                    discarded$63 = this.field_o.a(-1, -19696, ')');
                                    this.field_o.a(var5, (byte) 84, var5);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            L20: {
                              if (var6 != 0) {
                                break L20;
                              } else {
                                if (var7 != 0) {
                                  break L20;
                                } else {
                                  if (param1 != 34) {
                                    break L20;
                                  } else {
                                    discarded$64 = this.field_o.a(-1, -19696, '"');
                                    this.field_o.a(var5, (byte) 95, var5);
                                    break L20;
                                  }
                                }
                              }
                            }
                            L21: {
                              if (var6 != 0) {
                                break L21;
                              } else {
                                if (var7 != 0) {
                                  break L21;
                                } else {
                                  if (param1 != 39) {
                                    break L21;
                                  } else {
                                    discarded$65 = this.field_o.a(-1, -19696, '\'');
                                    this.field_o.a(var5, (byte) 72, var5);
                                    break L21;
                                  }
                                }
                              }
                            }
                            L22: {
                              gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                              if (param0 == -72) {
                                break L22;
                              } else {
                                this.field_v = (ela[]) null;
                                break L22;
                              }
                            }
                            return true;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L16;
                    } else {
                      if (var9 != 39) {
                        break L16;
                      } else {
                        if (39 != var10) {
                          break L16;
                        } else {
                          L23: {
                            discarded$66 = this.field_o.a(101, -19696, '￿');
                            discarded$67 = super.a((byte) -72, param1, param2);
                            var4 = this.field_o.e((byte) -124);
                            var5 = this.field_o.j(-1320);
                            if (var6 != 0) {
                              break L23;
                            } else {
                              if (var7 != 0) {
                                break L23;
                              } else {
                                if (param1 == 40) {
                                  discarded$68 = this.field_o.a(-1, -19696, ')');
                                  this.field_o.a(var5, (byte) 84, var5);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          L24: {
                            if (var6 != 0) {
                              break L24;
                            } else {
                              if (var7 != 0) {
                                break L24;
                              } else {
                                if (param1 != 34) {
                                  break L24;
                                } else {
                                  discarded$69 = this.field_o.a(-1, -19696, '"');
                                  this.field_o.a(var5, (byte) 95, var5);
                                  break L24;
                                }
                              }
                            }
                          }
                          L25: {
                            if (var6 != 0) {
                              break L25;
                            } else {
                              if (var7 != 0) {
                                break L25;
                              } else {
                                if (param1 != 39) {
                                  break L25;
                                } else {
                                  discarded$70 = this.field_o.a(-1, -19696, '\'');
                                  this.field_o.a(var5, (byte) 72, var5);
                                  break L25;
                                }
                              }
                            }
                          }
                          L26: {
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 == -72) {
                              break L26;
                            } else {
                              this.field_v = (ela[]) null;
                              break L26;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                }
                discarded$71 = super.a((byte) -72, param1, param2);
                var4 = this.field_o.e((byte) -124);
                var5 = this.field_o.j(-1320);
                if (var6 == 0) {
                  L27: {
                    if (var7 != 0) {
                      break L27;
                    } else {
                      if (param1 == 40) {
                        discarded$72 = this.field_o.a(-1, -19696, ')');
                        this.field_o.a(var5, (byte) 84, var5);
                        break L27;
                      } else {
                        L28: {
                          if (var6 != 0) {
                            break L28;
                          } else {
                            if (param1 != 34) {
                              break L28;
                            } else {
                              L29: {
                                discarded$73 = this.field_o.a(-1, -19696, '"');
                                this.field_o.a(var5, (byte) 95, var5);
                                if (param1 != 39) {
                                  break L29;
                                } else {
                                  discarded$74 = this.field_o.a(-1, -19696, '\'');
                                  this.field_o.a(var5, (byte) 72, var5);
                                  break L29;
                                }
                              }
                              L30: {
                                gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                                if (param0 == -72) {
                                  break L30;
                                } else {
                                  this.field_v = (ela[]) null;
                                  break L30;
                                }
                              }
                              return true;
                            }
                          }
                        }
                        L31: {
                          if (var6 != 0) {
                            break L31;
                          } else {
                            if (var7 != 0) {
                              break L31;
                            } else {
                              if (param1 != 39) {
                                break L31;
                              } else {
                                discarded$75 = this.field_o.a(-1, -19696, '\'');
                                this.field_o.a(var5, (byte) 72, var5);
                                gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                                if (param0 != -72) {
                                  this.field_v = (ela[]) null;
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                        if (param0 == -72) {
                          return true;
                        } else {
                          this.field_v = (ela[]) null;
                          return true;
                        }
                      }
                    }
                  }
                  L32: {
                    if (var6 != 0) {
                      break L32;
                    } else {
                      if (var7 != 0) {
                        break L32;
                      } else {
                        if (param1 != 34) {
                          break L32;
                        } else {
                          discarded$76 = this.field_o.a(-1, -19696, '"');
                          this.field_o.a(var5, (byte) 95, var5);
                          if (param1 != 39) {
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 == -72) {
                              return true;
                            } else {
                              this.field_v = (ela[]) null;
                              return true;
                            }
                          } else {
                            discarded$77 = this.field_o.a(-1, -19696, '\'');
                            this.field_o.a(var5, (byte) 72, var5);
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 == -72) {
                              return true;
                            } else {
                              this.field_v = (ela[]) null;
                              return true;
                            }
                          }
                        }
                      }
                    }
                  }
                  L33: {
                    if (var6 != 0) {
                      break L33;
                    } else {
                      if (var7 != 0) {
                        break L33;
                      } else {
                        if (param1 != 39) {
                          break L33;
                        } else {
                          discarded$78 = this.field_o.a(-1, -19696, '\'');
                          this.field_o.a(var5, (byte) 72, var5);
                          gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                          if (param0 == -72) {
                            return true;
                          } else {
                            this.field_v = (ela[]) null;
                            return true;
                          }
                        }
                      }
                    }
                  }
                  gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                  if (param0 == -72) {
                    return true;
                  } else {
                    this.field_v = (ela[]) null;
                    return true;
                  }
                } else {
                  L34: {
                    if (var6 != 0) {
                      break L34;
                    } else {
                      if (var7 != 0) {
                        break L34;
                      } else {
                        if (param1 != 34) {
                          break L34;
                        } else {
                          discarded$79 = this.field_o.a(-1, -19696, '"');
                          this.field_o.a(var5, (byte) 95, var5);
                          if (param1 != 39) {
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 != -72) {
                              this.field_v = (ela[]) null;
                              return true;
                            } else {
                              return true;
                            }
                          } else {
                            L35: {
                              discarded$80 = this.field_o.a(-1, -19696, '\'');
                              this.field_o.a(var5, (byte) 72, var5);
                              gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                              if (param0 == -72) {
                                break L35;
                              } else {
                                this.field_v = (ela[]) null;
                                break L35;
                              }
                            }
                            return true;
                          }
                        }
                      }
                    }
                  }
                  L36: {
                    if (var6 != 0) {
                      break L36;
                    } else {
                      if (var7 != 0) {
                        break L36;
                      } else {
                        if (param1 != 39) {
                          break L36;
                        } else {
                          discarded$81 = this.field_o.a(-1, -19696, '\'');
                          this.field_o.a(var5, (byte) 72, var5);
                          gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                          if (param0 == -72) {
                            return true;
                          } else {
                            this.field_v = (ela[]) null;
                            return true;
                          }
                        }
                      }
                    }
                  }
                  gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                  if (param0 != -72) {
                    this.field_v = (ela[]) null;
                    return true;
                  } else {
                    return true;
                  }
                }
              } else {
                L37: {
                  L38: {
                    L39: {
                      L40: {
                        if (var7 == 0) {
                          break L40;
                        } else {
                          if (var8 != 0) {
                            break L40;
                          } else {
                            if (39 != param1) {
                              break L40;
                            } else {
                              if (var10 == 39) {
                                break L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                        }
                      }
                      if (var6 != 0) {
                        break L38;
                      } else {
                        if (var7 != 0) {
                          break L38;
                        } else {
                          if (param1 != 41) {
                            break L38;
                          } else {
                            if (var10 != 41) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                      }
                    }
                    this.field_o.c(1 + var5, 1);
                    if (var11 == 0) {
                      break L37;
                    } else {
                      break L38;
                    }
                  }
                  L41: {
                    if (85 != param2) {
                      break L41;
                    } else {
                      L42: {
                        if (40 != var9) {
                          break L42;
                        } else {
                          if (var10 == 41) {
                            discarded$82 = this.field_o.a(101, -19696, '￿');
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      L43: {
                        if (var6 == 0) {
                          break L43;
                        } else {
                          if (34 != var9) {
                            break L43;
                          } else {
                            if (34 != var10) {
                              break L43;
                            } else {
                              L44: {
                                discarded$83 = this.field_o.a(101, -19696, '￿');
                                discarded$84 = super.a((byte) -72, param1, param2);
                                var4 = this.field_o.e((byte) -124);
                                var5 = this.field_o.j(-1320);
                                if (var6 != 0) {
                                  break L44;
                                } else {
                                  if (var7 != 0) {
                                    break L44;
                                  } else {
                                    if (param1 == 40) {
                                      discarded$85 = this.field_o.a(-1, -19696, ')');
                                      this.field_o.a(var5, (byte) 84, var5);
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                              L45: {
                                if (var6 != 0) {
                                  break L45;
                                } else {
                                  if (var7 != 0) {
                                    break L45;
                                  } else {
                                    if (param1 != 34) {
                                      break L45;
                                    } else {
                                      discarded$86 = this.field_o.a(-1, -19696, '"');
                                      this.field_o.a(var5, (byte) 95, var5);
                                      break L45;
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (var6 != 0) {
                                  break L46;
                                } else {
                                  if (var7 != 0) {
                                    break L46;
                                  } else {
                                    if (param1 != 39) {
                                      break L46;
                                    } else {
                                      discarded$87 = this.field_o.a(-1, -19696, '\'');
                                      this.field_o.a(var5, (byte) 72, var5);
                                      break L46;
                                    }
                                  }
                                }
                              }
                              L47: {
                                gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                                if (param0 == -72) {
                                  break L47;
                                } else {
                                  this.field_v = (ela[]) null;
                                  break L47;
                                }
                              }
                              return true;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L41;
                      } else {
                        if (var9 != 39) {
                          break L41;
                        } else {
                          if (39 != var10) {
                            break L41;
                          } else {
                            L48: {
                              discarded$88 = this.field_o.a(101, -19696, '￿');
                              discarded$89 = super.a((byte) -72, param1, param2);
                              var4 = this.field_o.e((byte) -124);
                              var5 = this.field_o.j(-1320);
                              if (var6 != 0) {
                                break L48;
                              } else {
                                if (var7 != 0) {
                                  break L48;
                                } else {
                                  if (param1 == 40) {
                                    discarded$90 = this.field_o.a(-1, -19696, ')');
                                    this.field_o.a(var5, (byte) 84, var5);
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            L49: {
                              if (var6 != 0) {
                                break L49;
                              } else {
                                if (var7 != 0) {
                                  break L49;
                                } else {
                                  if (param1 != 34) {
                                    break L49;
                                  } else {
                                    discarded$91 = this.field_o.a(-1, -19696, '"');
                                    this.field_o.a(var5, (byte) 95, var5);
                                    break L49;
                                  }
                                }
                              }
                            }
                            L50: {
                              if (var6 != 0) {
                                break L50;
                              } else {
                                if (var7 != 0) {
                                  break L50;
                                } else {
                                  if (param1 != 39) {
                                    break L50;
                                  } else {
                                    discarded$92 = this.field_o.a(-1, -19696, '\'');
                                    this.field_o.a(var5, (byte) 72, var5);
                                    break L50;
                                  }
                                }
                              }
                            }
                            L51: {
                              gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                              if (param0 == -72) {
                                break L51;
                              } else {
                                this.field_v = (ela[]) null;
                                break L51;
                              }
                            }
                            return true;
                          }
                        }
                      }
                    }
                  }
                  L52: {
                    discarded$93 = super.a((byte) -72, param1, param2);
                    var4 = this.field_o.e((byte) -124);
                    var5 = this.field_o.j(-1320);
                    if (var6 != 0) {
                      break L52;
                    } else {
                      if (var7 != 0) {
                        break L52;
                      } else {
                        if (param1 == 40) {
                          discarded$94 = this.field_o.a(-1, -19696, ')');
                          this.field_o.a(var5, (byte) 84, var5);
                          break L52;
                        } else {
                          L53: {
                            if (param1 != 34) {
                              break L53;
                            } else {
                              discarded$95 = this.field_o.a(-1, -19696, '"');
                              this.field_o.a(var5, (byte) 95, var5);
                              break L53;
                            }
                          }
                          L54: {
                            if (var6 != 0) {
                              break L54;
                            } else {
                              if (var7 != 0) {
                                break L54;
                              } else {
                                if (param1 != 39) {
                                  break L54;
                                } else {
                                  discarded$96 = this.field_o.a(-1, -19696, '\'');
                                  this.field_o.a(var5, (byte) 72, var5);
                                  break L54;
                                }
                              }
                            }
                          }
                          L55: {
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 == -72) {
                              break L55;
                            } else {
                              this.field_v = (ela[]) null;
                              break L55;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                  L56: {
                    if (var6 != 0) {
                      break L56;
                    } else {
                      if (var7 != 0) {
                        break L56;
                      } else {
                        if (param1 != 34) {
                          break L56;
                        } else {
                          L57: {
                            discarded$97 = this.field_o.a(-1, -19696, '"');
                            this.field_o.a(var5, (byte) 95, var5);
                            if (param1 != 39) {
                              break L57;
                            } else {
                              discarded$98 = this.field_o.a(-1, -19696, '\'');
                              this.field_o.a(var5, (byte) 72, var5);
                              break L57;
                            }
                          }
                          L58: {
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 == -72) {
                              break L58;
                            } else {
                              this.field_v = (ela[]) null;
                              break L58;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                  if (var6 != 0) {
                    break L37;
                  } else {
                    if (var7 != 0) {
                      break L37;
                    } else {
                      if (param1 != 39) {
                        break L37;
                      } else {
                        L59: {
                          discarded$99 = this.field_o.a(-1, -19696, '\'');
                          this.field_o.a(var5, (byte) 72, var5);
                          gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                          if (param0 == -72) {
                            break L59;
                          } else {
                            this.field_v = (ela[]) null;
                            break L59;
                          }
                        }
                        return true;
                      }
                    }
                  }
                }
                gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                if (param0 != -72) {
                  this.field_v = (ela[]) null;
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              L60: {
                L61: {
                  L62: {
                    L63: {
                      if (var7 == 0) {
                        break L63;
                      } else {
                        if (var8 != 0) {
                          break L63;
                        } else {
                          if (39 != param1) {
                            break L63;
                          } else {
                            if (var10 == 39) {
                              break L62;
                            } else {
                              break L63;
                            }
                          }
                        }
                      }
                    }
                    if (var6 != 0) {
                      break L61;
                    } else {
                      if (var7 != 0) {
                        break L61;
                      } else {
                        if (param1 != 41) {
                          break L61;
                        } else {
                          if (var10 != 41) {
                            break L61;
                          } else {
                            break L62;
                          }
                        }
                      }
                    }
                  }
                  this.field_o.c(1 + var5, 1);
                  if (var11 == 0) {
                    break L60;
                  } else {
                    break L61;
                  }
                }
                L64: {
                  if (85 != param2) {
                    break L64;
                  } else {
                    L65: {
                      if (40 != var9) {
                        break L65;
                      } else {
                        if (var10 == 41) {
                          discarded$100 = this.field_o.a(101, -19696, '￿');
                          break L64;
                        } else {
                          break L65;
                        }
                      }
                    }
                    L66: {
                      if (var6 == 0) {
                        break L66;
                      } else {
                        if (34 != var9) {
                          break L66;
                        } else {
                          if (34 == var10) {
                            L67: {
                              discarded$101 = this.field_o.a(101, -19696, '￿');
                              discarded$102 = super.a((byte) -72, param1, param2);
                              var4 = this.field_o.e((byte) -124);
                              var5 = this.field_o.j(-1320);
                              if (var6 != 0) {
                                if (var6 == 0) {
                                  if (var7 != 0) {
                                    break L67;
                                  } else {
                                    if (param1 != 34) {
                                      break L67;
                                    } else {
                                      discarded$103 = this.field_o.a(-1, -19696, '"');
                                      this.field_o.a(var5, (byte) 95, var5);
                                      break L67;
                                    }
                                  }
                                } else {
                                  if (var6 != 0) {
                                    break L67;
                                  } else {
                                    if (var7 != 0) {
                                      break L67;
                                    } else {
                                      if (param1 != 34) {
                                        break L67;
                                      } else {
                                        discarded$104 = this.field_o.a(-1, -19696, '"');
                                        this.field_o.a(var5, (byte) 95, var5);
                                        break L67;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (var7 != 0) {
                                  break L67;
                                } else {
                                  if (param1 != 34) {
                                    break L67;
                                  } else {
                                    discarded$105 = this.field_o.a(-1, -19696, '"');
                                    this.field_o.a(var5, (byte) 95, var5);
                                    break L67;
                                  }
                                }
                              }
                            }
                            L68: {
                              if (var6 != 0) {
                                break L68;
                              } else {
                                if (var7 != 0) {
                                  break L68;
                                } else {
                                  if (param1 != 39) {
                                    break L68;
                                  } else {
                                    discarded$106 = this.field_o.a(-1, -19696, '\'');
                                    this.field_o.a(var5, (byte) 72, var5);
                                    break L68;
                                  }
                                }
                              }
                            }
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 != -72) {
                              this.field_v = (ela[]) null;
                              return true;
                            } else {
                              return true;
                            }
                          } else {
                            break L66;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L64;
                    } else {
                      if (var9 != 39) {
                        break L64;
                      } else {
                        if (39 != var10) {
                          break L64;
                        } else {
                          L69: {
                            discarded$107 = this.field_o.a(101, -19696, '￿');
                            discarded$108 = super.a((byte) -72, param1, param2);
                            var4 = this.field_o.e((byte) -124);
                            var5 = this.field_o.j(-1320);
                            if (var6 != 0) {
                              if (var6 == 0) {
                                if (var7 != 0) {
                                  break L69;
                                } else {
                                  if (param1 != 34) {
                                    break L69;
                                  } else {
                                    discarded$109 = this.field_o.a(-1, -19696, '"');
                                    this.field_o.a(var5, (byte) 95, var5);
                                    break L69;
                                  }
                                }
                              } else {
                                if (var6 != 0) {
                                  break L69;
                                } else {
                                  if (var7 != 0) {
                                    break L69;
                                  } else {
                                    if (param1 != 34) {
                                      break L69;
                                    } else {
                                      discarded$110 = this.field_o.a(-1, -19696, '"');
                                      this.field_o.a(var5, (byte) 95, var5);
                                      break L69;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var7 != 0) {
                                break L69;
                              } else {
                                if (param1 != 34) {
                                  break L69;
                                } else {
                                  discarded$111 = this.field_o.a(-1, -19696, '"');
                                  this.field_o.a(var5, (byte) 95, var5);
                                  break L69;
                                }
                              }
                            }
                          }
                          L70: {
                            if (var6 != 0) {
                              break L70;
                            } else {
                              if (var7 != 0) {
                                break L70;
                              } else {
                                if (param1 != 39) {
                                  break L70;
                                } else {
                                  discarded$112 = this.field_o.a(-1, -19696, '\'');
                                  this.field_o.a(var5, (byte) 72, var5);
                                  break L70;
                                }
                              }
                            }
                          }
                          L71: {
                            gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                            if (param0 == -72) {
                              break L71;
                            } else {
                              this.field_v = (ela[]) null;
                              break L71;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                }
                L72: {
                  discarded$113 = super.a((byte) -72, param1, param2);
                  var4 = this.field_o.e((byte) -124);
                  var5 = this.field_o.j(-1320);
                  if (var6 != 0) {
                    break L72;
                  } else {
                    if (var7 != 0) {
                      break L72;
                    } else {
                      if (param1 == 40) {
                        discarded$114 = this.field_o.a(-1, -19696, ')');
                        this.field_o.a(var5, (byte) 84, var5);
                        break L72;
                      } else {
                        L73: {
                          if (param1 != 34) {
                            break L73;
                          } else {
                            discarded$115 = this.field_o.a(-1, -19696, '"');
                            this.field_o.a(var5, (byte) 95, var5);
                            break L73;
                          }
                        }
                        L74: {
                          if (var6 != 0) {
                            break L74;
                          } else {
                            if (var7 != 0) {
                              break L74;
                            } else {
                              if (param1 != 39) {
                                break L74;
                              } else {
                                discarded$116 = this.field_o.a(-1, -19696, '\'');
                                this.field_o.a(var5, (byte) 72, var5);
                                break L74;
                              }
                            }
                          }
                        }
                        L75: {
                          gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                          if (param0 == -72) {
                            break L75;
                          } else {
                            this.field_v = (ela[]) null;
                            break L75;
                          }
                        }
                        return true;
                      }
                    }
                  }
                }
                L76: {
                  if (var6 != 0) {
                    break L76;
                  } else {
                    if (var7 != 0) {
                      break L76;
                    } else {
                      if (param1 != 34) {
                        break L76;
                      } else {
                        L77: {
                          discarded$117 = this.field_o.a(-1, -19696, '"');
                          this.field_o.a(var5, (byte) 95, var5);
                          if (param1 != 39) {
                            break L77;
                          } else {
                            discarded$118 = this.field_o.a(-1, -19696, '\'');
                            this.field_o.a(var5, (byte) 72, var5);
                            break L77;
                          }
                        }
                        L78: {
                          gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                          if (param0 == -72) {
                            break L78;
                          } else {
                            this.field_v = (ela[]) null;
                            break L78;
                          }
                        }
                        return true;
                      }
                    }
                  }
                }
                if (var6 != 0) {
                  break L60;
                } else {
                  if (var7 != 0) {
                    break L60;
                  } else {
                    if (param1 != 39) {
                      break L60;
                    } else {
                      L79: {
                        discarded$119 = this.field_o.a(-1, -19696, '\'');
                        this.field_o.a(var5, (byte) 72, var5);
                        gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                        if (param0 == -72) {
                          break L79;
                        } else {
                          this.field_v = (ela[]) null;
                          break L79;
                        }
                      }
                      return true;
                    }
                  }
                }
              }
              gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
              if (param0 != -72) {
                this.field_v = (ela[]) null;
                return true;
              } else {
                return true;
              }
            }
          }
        }
    }

    public final void b(int param0) {
        String var3 = this.field_o.field_Cb.field_r;
        String var2 = var3;
        this.field_o.field_Cb.field_r = gsa.field_w;
        super.b(param0);
        this.field_o.field_Cb.field_r = var3;
    }

    static {
        field_w = new ica();
        field_u = new dn();
    }
}
