/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class vi extends s {
    private int field_P;
    private int field_N;
    private boolean field_G;
    private long field_R;
    private long field_Q;
    static int[] field_O;
    static String field_H;
    private boolean field_J;
    private int field_K;
    static int field_I;
    private int field_L;

    final static void a(boolean param0, int param1) {
        nk.a((byte) -126);
        if (param0) {
            vi.a(false, -63);
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        int stackIn_7_0 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 != (this.field_N ^ -1)) {
          var2 = this.field_N - 1;
          L0: while (true) {
            if ((var2 ^ -1) < -1) {
              stackIn_7_0 = 32;

              if (var3 == 0) {
                if (stackIn_7_0 != this.field_l.charAt(var2 - 1)) {
                  var2--;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_N;
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              this.field_l = param2;
              var4_int = param2.length();
              if (param0 == (this.field_P ^ -1)) {
                break L2;
              } else {
                if (this.field_P < var4_int) {
                  this.field_l = this.field_l.substring(0, this.field_P);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_l.length();
              this.field_L = dupTemp$2;
              this.field_N = dupTemp$2;
              if (!param1) {
                this.c((byte) -128);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("vi.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        BufferedReader var6;
        String var7;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        CharSequence[] var14;
        ui var15;
        StringWriter var16;
        PrintWriter var21;
        String var22;
        BufferedReader var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        String var29;
        PrintWriter var30;
        String var31;
        BufferedReader var32;
        String var33;
        String var34;
        String var35;
        String var36;
        String var37;
        String var38;
        L0: {
          L1: {
            var13 = OrbDefence.field_D ? 1 : 0;
            if (param1 instanceof ui) {
              break L1;
            } else {
              var2 = "";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var15 = (ui) ((Object) param1);
          var2 = var15.field_d + " | ";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          param1 = var15.field_c;
          break L0;
        }
        var16 = new StringWriter();
        if (param0 == 41) {
          var21 = new PrintWriter((Writer) ((Object) var16));
          param1.printStackTrace(var21);
          var21.close();
          var22 = var16.toString();
          var11 = var22;
          var2 = var11;
          var11 = var22;
          var23 = new BufferedReader((Reader) ((Object) new StringReader(var22)));
          var29 = var23.readLine();
          var11 = var29;
          var2 = var11;
          var11 = var29;
          L2: while (true) {
            L3: {
              L4: {
                var24 = var23.readLine();
                var11 = var24;
                var2 = var11;
                var11 = var24;
                if (var24 == null) {
                  break L4;
                } else {
                  var9 = var24.indexOf('(');
                  var10 = var24.indexOf(')', 1 + var9);
                  if (var13 != 0) {
                    break L3;
                  } else {
                    L5: {
                      L6: {
                        if ((var9 ^ -1) == 0) {
                          break L6;
                        } else {
                          var11 = var24.substring(0, var9);
                          if (var13 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var11 = var24;
                      var2 = var11;
                      var2 = var11;
                      break L5;
                    }
                    L7: {
                      var25 = var11.trim();
                      var2 = var25;
                      var2 = var25;
                      var26 = var25.substring(1 + var25.lastIndexOf(' '));
                      var2 = var26;
                      var2 = var26;
                      var27 = var26.substring(1 + var26.lastIndexOf('\t'));
                      var2 = var27;
                      var2 = var27;
                      var28 = var2 + var27;
                      var2 = var28;
                      var2 = var28;
                      var2 = var28;
                      if (var9 == -1) {
                        break L7;
                      } else {
                        if ((var10 ^ -1) == 0) {
                          break L7;
                        } else {
                          var12 = var24.indexOf(".java:", var9);
                          if ((var12 ^ -1) <= -1) {
                            var2 = var28 + var24.substring(5 + var12, var10);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var2 = var2 + ' ';
                    if (var13 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var2 = var2 + "| " + var29;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              break L3;
            }
            return var2;
          }
        } else {
          var14 = (CharSequence[]) null;
          vi.a((CharSequence[]) null, -61, -90, 112);
          var30 = new PrintWriter((Writer) ((Object) var16));
          param1.printStackTrace(var30);
          var30.close();
          var31 = var16.toString();
          var11 = var31;
          var2 = var11;
          var11 = var31;
          var32 = new BufferedReader((Reader) ((Object) new StringReader(var31)));
          var6 = var32;
          var38 = var32.readLine();
          var11 = var38;
          var2 = var11;
          var11 = var38;
          var7 = var38;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L8: while (true) {
            L9: {
              L10: {
                var33 = var32.readLine();
                var11 = var33;
                var2 = var11;
                var11 = var33;
                if (var33 == null) {
                  break L10;
                } else {
                  var9 = var33.indexOf('(');
                  var10 = var33.indexOf(')', 1 + var9);
                  if (var13 != 0) {
                    break L9;
                  } else {
                    L11: {
                      L12: {
                        if ((var9 ^ -1) == 0) {
                          break L12;
                        } else {
                          var11 = var33.substring(0, var9);
                          if (var13 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var11 = var33;
                      var2 = var11;
                      var2 = var11;
                      break L11;
                    }
                    L13: {
                      var34 = var11.trim();
                      var2 = var34;
                      var2 = var34;
                      var35 = var34.substring(1 + var34.lastIndexOf(' '));
                      var2 = var35;
                      var2 = var35;
                      var36 = var35.substring(1 + var35.lastIndexOf('\t'));
                      var2 = var36;
                      var2 = var36;
                      var37 = var2 + var36;
                      var2 = var37;
                      var2 = var37;
                      var2 = var37;
                      if (var9 == -1) {
                        break L13;
                      } else {
                        if ((var10 ^ -1) == 0) {
                          break L13;
                        } else {
                          var12 = var33.indexOf(".java:", var9);
                          if ((var12 ^ -1) <= -1) {
                            var2 = var37 + var33.substring(5 + var12, var10);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    var2 = var2 + ' ';
                    if (var13 == 0) {
                      continue L8;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              var2 = var2 + "| " + var38;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              break L9;
            }
            return var2;
          }
        }
    }

    final static sc a(int param0, ki param1, ki param2, int param3, int param4) {
        RuntimeException var5 = null;
        sc stackIn_5_0 = null;
        sc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (pk.a(113, param4, param2, param3)) {
              if (param0 == -13449) {
                stackIn_7_0 = fc.a(param1.b(param4, false, param3), -62);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (sc) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("vi.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void e(byte param0) {
        this.field_N = 0;
        this.field_L = 0;
        this.field_l = "";
        this.c((byte) -125);
        if (param0 >= -119) {
            field_O = (int[]) null;
        }
    }

    private final String d(byte param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        if (param0 != -114) {
          return (String) null;
        } else {
          L0: {
            if (this.field_N <= this.field_L) {
              stackIn_4_0 = this.field_N;
              break L0;
            } else {
              stackIn_4_0 = this.field_L;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_N > this.field_L) {
              stackIn_7_0 = this.field_N;
              break L1;
            } else {
              stackIn_7_0 = this.field_L;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_l.substring(var2, var3);
        }
    }

    private final void p(int param0) {
        dm var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rj var9;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (this.field_G) {
          if (this.field_j instanceof rj) {
            var9 = (rj) ((Object) this.field_j);
            var3 = var9.a((pj) (this), true);
            if (param0 == 1970553377) {
              var4 = var3.a(false);
              var5 = var9.a((pj) (this), param0 + -1970553495);
              var6 = var9.a((byte) 94) >> 1970553377;
              if (-var6 + var5 > var4) {
                this.field_f = 0;
                this.field_q = 0;
                return;
              } else {
                L0: {
                  var7 = this.field_f - -var3.a(param0 + -1970553503, this.field_N);
                  if (var7 <= -var6 + var5) {
                    if (var7 < var6) {
                      this.field_f = this.field_f + -var7 + var6;
                      break L0;
                    } else {
                      if (0 >= this.field_f) {
                        if (this.field_f < -var5 - -var6) {
                          this.field_f = -var5 - -var6;
                          if (var8 != 0) {
                            this.field_f = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_f = 0;
                        return;
                      }
                    }
                  } else {
                    this.field_f = -var7 - var6 - -var5 + this.field_f;
                    if (var8 == 0) {
                      break L0;
                    } else {
                      L1: {
                        if (var7 < var6) {
                          this.field_f = this.field_f + -var7 + var6;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      if (0 >= this.field_f) {
                        if (this.field_f < -var5 - -var6) {
                          this.field_f = -var5 - -var6;
                          if (var8 != 0) {
                            this.field_f = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_f = 0;
                        return;
                      }
                    }
                  }
                }
                if (0 >= this.field_f) {
                  if (this.field_f < -var5 - -var6) {
                    this.field_f = -var5 - -var6;
                    if (var8 != 0) {
                      this.field_f = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  this.field_f = 0;
                  return;
                }
              }
            } else {
              this.field_L = -101;
              var4 = var3.a(false);
              var5 = var9.a((pj) (this), param0 + -1970553495);
              var6 = var9.a((byte) 94) >> 1970553377;
              if (-var6 + var5 > var4) {
                this.field_f = 0;
                this.field_q = 0;
                return;
              } else {
                var7 = this.field_f - -var3.a(param0 + -1970553503, this.field_N);
                if (var7 > -var6 + var5) {
                  this.field_f = -var7 - var6 - -var5 + this.field_f;
                  if (var8 != 0) {
                    L2: {
                      if (var7 < var6) {
                        this.field_f = this.field_f + -var7 + var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (0 >= this.field_f) {
                      if (this.field_f < -var5 - -var6) {
                        this.field_f = -var5 - -var6;
                        if (var8 == 0) {
                          return;
                        } else {
                          this.field_f = 0;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      this.field_f = 0;
                      return;
                    }
                  } else {
                    L3: {
                      if (0 < this.field_f) {
                        this.field_f = 0;
                        break L3;
                      } else {
                        if (this.field_f >= -var5 - -var6) {
                          break L3;
                        } else {
                          this.field_f = -var5 - -var6;
                          if (var8 == 0) {
                            break L3;
                          } else {
                            this.field_f = 0;
                            break L3;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L4: {
                    if (var7 < var6) {
                      this.field_f = this.field_f + -var7 + var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (0 < this.field_f) {
                      this.field_f = 0;
                      break L5;
                    } else {
                      if (this.field_f >= -var5 - -var6) {
                        break L5;
                      } else {
                        this.field_f = -var5 - -var6;
                        if (var8 == 0) {
                          break L5;
                        } else {
                          this.field_f = 0;
                          break L5;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          this.field_f = 0;
          this.field_q = 0;
          return;
        }
    }

    private final void m(int param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          if (this.field_L == this.field_N) {
            break L0;
          } else {
            L1: {
              if (this.field_L >= this.field_N) {
                stackIn_4_0 = this.field_N;
                break L1;
              } else {
                stackIn_4_0 = this.field_L;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_N <= this.field_L) {
                stackIn_7_0 = this.field_L;
                break L2;
              } else {
                stackIn_7_0 = this.field_N;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            this.field_N = var2;
            this.field_L = var2;
            this.field_l = this.field_l.substring(0, var2) + this.field_l.substring(var3, this.field_l.length());
            this.c((byte) -128);
            break L0;
          }
        }
        if (param0 != 25177) {
          this.m(68);
          return;
        } else {
          return;
        }
    }

    private final int b(byte param0) {
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int var2;
        int var3;
        int var4;
        pj var5;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -47) {
          var2 = this.field_l.length();
          if (var2 == this.field_N) {
            return this.field_N;
          } else {
            var3 = 1 + this.field_N;
            L0: while (true) {
              if (var2 > var3) {
                stackIn_23_0 = -33;

                if (var4 == 0) {
                  if (stackIn_23_0 != (this.field_l.charAt(-1 + var3) ^ -1)) {
                    var3++;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_23_0;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          var5 = (pj) null;
          this.a('i', 85, (pj) null, 10);
          var2 = this.field_l.length();
          if (var2 == this.field_N) {
            return this.field_N;
          } else {
            var3 = 1 + this.field_N;
            L1: while (true) {
              if (var2 > var3) {
                stackIn_10_0 = -33;

                if (var4 == 0) {
                  if (stackIn_10_0 != (this.field_l.charAt(-1 + var3) ^ -1)) {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_10_0;
                }
              } else {
                return var3;
              }
            }
          }
        }
    }

    private final void f(byte param0) {
        try {
            String var2;
            pj var3;
            L0: {
              var2 = this.d((byte) -114);
              if ((var2.length() ^ -1) < -1) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.d((byte) -114))), (java.awt.datatransfer.ClipboardOwner) null);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 < 5) {
              var3 = (pj) null;
              this.a('ﾦ', 54, (pj) null, -16);
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

    final boolean a(char param0, int param1, pj param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            this.field_Q = ji.b(109);
            if (60 == param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 > 126) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_N != this.field_L) {
                          this.m(25177);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (0 == (this.field_P ^ -1)) {
                            break L4;
                          } else {
                            if (this.field_l.length() < this.field_P) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (this.field_N >= this.field_l.length()) {
                              break L6;
                            } else {
                              this.field_l = this.field_l.substring(0, this.field_N) + param0 + this.field_l.substring(this.field_N, this.field_l.length());
                              this.field_N = this.field_N + 1;
                              this.field_L = this.field_N;
                              if (!OrbDefence.field_D) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.field_l = this.field_l + param0;
                          dupTemp$0 = this.field_l.length();
                          this.field_N = dupTemp$0;
                          this.field_L = dupTemp$0;
                          break L5;
                        }
                        this.c((byte) -122);
                        break L3;
                      }
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                L7: {
                  if (param1 != 85) {
                    if (param1 == 101) {
                      if (this.field_N != this.field_L) {
                        this.m(25177);
                        stackIn_75_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        if (this.field_N < this.field_l.length()) {
                          this.field_L = this.field_N + 1;
                          this.m(25177);
                          stackIn_73_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          break L7;
                        }
                      }
                    } else {
                      if (13 != param1) {
                        if (-97 != (param1 ^ -1)) {
                          if (-98 == (param1 ^ -1)) {
                            if (this.field_N >= this.field_l.length()) {
                              break L7;
                            } else {
                              L8: {
                                stackIn_66_0 = this;

                                if (!ek.field_a[82]) {
                                  stackIn_67_0 = this;
                                  stackIn_67_1 = this.field_N + 1;
                                  break L8;
                                } else {
                                  stackIn_67_0 = this;
                                  stackIn_67_1 = this.b((byte) -123);
                                  break L8;
                                }
                              }
                              this.b(stackIn_67_1, 1242);
                              stackIn_68_0 = 1;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            }
                          } else {
                            if ((param1 ^ -1) == -103) {
                              this.b(0, 1242);
                              stackIn_62_0 = 1;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            } else {
                              if (103 == param1) {
                                this.b(this.field_l.length(), 1242);
                                stackIn_60_0 = 1;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                if (-85 == (param1 ^ -1)) {
                                  this.j(param3 + -8108);
                                  stackIn_58_0 = 1;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  L9: {
                                    if (!ek.field_a[82]) {
                                      break L9;
                                    } else {
                                      if ((param1 ^ -1) != -66) {
                                        break L9;
                                      } else {
                                        this.k(param3 + -89);
                                        stackIn_46_0 = 1;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!ek.field_a[82]) {
                                      break L10;
                                    } else {
                                      if (-67 == (param1 ^ -1)) {
                                        this.f((byte) 64);
                                        stackIn_56_0 = 1;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  if (!ek.field_a[82]) {
                                    break L7;
                                  } else {
                                    if ((param1 ^ -1) == -68) {
                                      this.o(0);
                                      stackIn_54_0 = 1;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_N <= 0) {
                            break L7;
                          } else {
                            L11: {
                              stackIn_36_0 = this;

                              if (ek.field_a[82]) {
                                stackIn_37_0 = this;
                                stackIn_37_1 = this.l(-1);
                                break L11;
                              } else {
                                stackIn_37_0 = this;
                                stackIn_37_1 = -1 + this.field_N;
                                break L11;
                              }
                            }
                            this.b(stackIn_37_1, 1242);
                            stackIn_38_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        this.e((byte) -126);
                        stackIn_31_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  } else {
                    if (this.field_N != this.field_L) {
                      this.m(25177);
                      stackIn_27_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (this.field_N > 0) {
                        this.field_L = -1 + this.field_N;
                        this.m(25177);
                        stackIn_25_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L12: {
                  if (param3 == 0) {
                    break L12;
                  } else {
                    vi.a(true, 15);
                    break L12;
                  }
                }
                stackIn_79_0 = 0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var5);

            stackIn_82_1 = new StringBuilder().append("vi.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L13;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L13;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_38_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_46_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_54_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_56_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_58_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_60_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_62_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_68_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_73_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_75_0 != 0;
                                    } else {
                                      return stackIn_79_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        rj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.p(1970553377);
              if (-2 != (this.field_v ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (!(this.field_j instanceof rj)) {
                    break L2;
                  } else {
                    var5 = (rj) ((Object) this.field_j);
                    var6 = var5.a(vl.field_d, param3, 2147483647, ua.field_a, (pj) (this), param2);
                    if ((var6 ^ -1) == 0) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_J) {
                          break L3;
                        } else {
                          if (this.field_K <= var6) {
                            break L3;
                          } else {
                            if (var6 <= this.field_L) {
                              break L3;
                            } else {
                              var6 = this.field_K;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_N = var6;
                      break L2;
                    }
                  }
                }
                this.field_Q = ji.b(-98);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("vi.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (!super.a((byte) -116, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (this.field_j instanceof rj) {
                  L2: {
                    var8_int = ((rj) ((Object) this.field_j)).a(vl.field_d, param6, 2147483647, ua.field_a, (pj) (this), param3);
                    stackIn_5_0 = this;

                    if (var8_int != -1) {
                      stackIn_6_0 = this;
                      stackIn_6_1 = var8_int;
                      break L2;
                    } else {
                      stackIn_6_0 = this;
                      stackIn_6_1 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    this.b(stackIn_6_1, 1242);
                    var8_long = ji.b(119);
                    stackIn_8_0 = this;

                    if (-this.field_R + var8_long >= 250L) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L3;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((vi) (this)).field_J = stackIn_9_1 != 0;
                    if (!this.field_J) {
                      break L4;
                    } else {
                      L5: {
                        this.field_L = this.l(-1);
                        this.field_N = this.b((byte) -115);
                        if ((this.field_N ^ -1) >= -1) {
                          break L5;
                        } else {
                          if (this.field_l.charAt(-1 + this.field_N) != 32) {
                            break L5;
                          } else {
                            this.field_N = this.field_N - 1;
                            break L5;
                          }
                        }
                      }
                      this.field_K = this.field_N;
                      break L4;
                    }
                  }
                  this.field_R = var8_long;
                  stackIn_15_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 <= -115) {
              stackIn_19_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_Q = 71L;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("vi.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    vi(String param0, ag param1, int param2) {
        super(param0, param1);
        this.field_J = false;
        this.field_R = 0L;
        this.field_K = -1;
        try {
            this.field_P = param2;
            this.field_j = mb.field_a.field_q;
            this.a(0, true, param0);
            this.field_G = true;
            this.field_Q = ji.b(-53);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        if (param0 >= -33) {
            return;
        }
        this.f((byte) 91);
        this.m(25177);
    }

    private final void o(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            if (param0 == 0) {
              try {
                L0: {
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  this.m(25177);
                  this.a(var2, true);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  break L1;
                }
              }
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

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$45 = null;
        StringBuilder discarded$46 = null;
        StringBuilder discarded$47 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = "";
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (1 != param2) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10 = param0[param3];
                        var4 = var10;
                        if (var4 != null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = "null";
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        stackIn_9_0 = var10.toString();
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        var4_int = param2 - -param3;
                        var5 = param1;
                        var6_int = param3;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_int <= var6_int) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7_ref_CharSequence = param0[var6_int];
                        if (var7_ref_CharSequence != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 += 4;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var5 + var7_ref_CharSequence.length();
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 += 4;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6 = new StringBuilder(var5);
                        var7 = param3;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = param0[var7];
                        if (var8 != null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        discarded$45 = var6.append("null");
                        if (var9 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        discarded$46 = var6.append(var8);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        discarded$47 = var6.append(var8);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = var6.toString();
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var4_ref);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("vi.S(");
                    stackIn_28_1 = stackIn_29_1;
                    if (param0 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((this.field_P ^ -1) != 0) {
                var3_int = this.field_P - this.field_l.length();
                if (-1 < (var3_int ^ -1)) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_N == this.field_l.length()) {
                  break L3;
                } else {
                  this.field_l = this.field_l.substring(0, this.field_N) + param0 + this.field_l.substring(this.field_N, this.field_l.length());
                  if (!OrbDefence.field_D) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_l = this.field_l + param0;
              break L2;
            }
            L4: {
              this.field_N = this.field_N + param0.length();
              this.field_L = this.field_N;
              if (!param1) {
                this.field_G = false;
                this.c((byte) -127);
                break L4;
              } else {
                this.c((byte) -127);
                break L4;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("vi.CA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void c(byte param0) {
        L0: {
          if (this.field_h instanceof jb) {
            ((jb) ((Object) this.field_h)).a((vi) (this), 66);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -120) {
          this.p(89);
          return;
        } else {
          return;
        }
    }

    private final void j(int param0) {
        pj var3;
        if (param0 == -8108) {
          if (this.field_h instanceof jb) {
            ((jb) ((Object) this.field_h)).a((vi) (this), false);
            return;
          } else {
            return;
          }
        } else {
          var3 = (pj) null;
          this.a((byte) -122, (pj) null, -81, 77);
          if (!(this.field_h instanceof jb)) {
            return;
          } else {
            ((jb) ((Object) this.field_h)).a((vi) (this), false);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6;
        rj var8;
        if (this.field_j != null) {
          if (-1 == (param1 ^ -1)) {
            this.field_j.a(param0, param3, (pj) (this), -4394, this.field_F);
            if (this.field_j instanceof rj) {
              L0: {
                var8 = (rj) ((Object) this.field_j);
                if (this.field_N != this.field_L) {
                  var8.a(this.field_L, this.field_N, (pj) (this), param3, param2 ^ -1048511, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              var6 = ji.b(126);
              if (((-this.field_Q + var6) % 1000L ^ -1L) > -501L) {
                var8.a(param0, (pj) (this), param3, (byte) 94, this.field_N);
                if (param2 != 1048575) {
                  this.b(-122, -76);
                  return;
                } else {
                  return;
                }
              } else {
                if (param2 != 1048575) {
                  this.b(-122, -76);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param2 != 1048575) {
                this.b(-122, -76);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param2 != 1048575) {
              this.b(-122, -76);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != 1048575) {
            this.b(-122, -76);
            return;
          } else {
            return;
          }
        }
    }

    public static void n(int param0) {
        CharSequence[] var2;
        field_O = null;
        if (param0 != 1) {
          var2 = (CharSequence[]) null;
          vi.a((CharSequence[]) null, 10, 59, 11);
          field_H = null;
          return;
        } else {
          field_H = null;
          return;
        }
    }

    private final void b(int param0, int param1) {
        this.field_N = param0;
        if (param1 != 1242) {
            return;
        }
        if (!(ek.field_a[81])) {
            this.field_L = this.field_N;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_H = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            field_O = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (-9 >= (var2 ^ -1)) {
                    field_O[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((1 & var0) != 1) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> 1204531841;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
