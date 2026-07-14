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
        int discarded$4 = nk.a((byte) -126);
        if (param0) {
            vi.a(false, -63);
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 != (((vi) this).field_N ^ -1)) {
          var2 = ((vi) this).field_N - 1;
          L0: while (true) {
            if ((var2 ^ -1) < -1) {
              if (32 != ((vi) this).field_l.charAt(var2 - 1)) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((vi) this).field_N;
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int var4 = 0;
        L0: {
          if (param2 != null) {
            break L0;
          } else {
            param2 = "";
            break L0;
          }
        }
        ((vi) this).field_l = param2;
        var4 = param2.length();
        if (param0 != (((vi) this).field_P ^ -1)) {
          if (((vi) this).field_P >= var4) {
            L1: {
              ((vi) this).field_L = ((vi) this).field_l.length();
              ((vi) this).field_N = ((vi) this).field_l.length();
              if (!param1) {
                ((vi) this).c((byte) -128);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_P);
              ((vi) this).field_L = ((vi) this).field_l.length();
              ((vi) this).field_N = ((vi) this).field_l.length();
              if (!param1) {
                ((vi) this).c((byte) -128);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          L3: {
            ((vi) this).field_L = ((vi) this).field_l.length();
            ((vi) this).field_N = ((vi) this).field_l.length();
            if (!param1) {
              ((vi) this).c((byte) -128);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        ui var15 = null;
        StringWriter var16 = null;
        PrintWriter var21 = null;
        String var22 = null;
        BufferedReader var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        PrintWriter var30 = null;
        String var31 = null;
        BufferedReader var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var45 = null;
        L0: {
          var13 = OrbDefence.field_D ? 1 : 0;
          if (param1 instanceof ui) {
            var15 = (ui) (Object) param1;
            var2 = var15.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param1 = var15.field_c;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var16 = new StringWriter();
        if (param0 == 41) {
          var21 = new PrintWriter((Writer) (Object) var16);
          param1.printStackTrace(var21);
          var21.close();
          var22 = var16.toString();
          var11 = var22;
          var2 = var11;
          var11 = var22;
          var23 = new BufferedReader((Reader) (Object) new StringReader(var22));
          var29 = var23.readLine();
          var11 = var29;
          var2 = var11;
          var11 = var29;
          L1: while (true) {
            var24 = var23.readLine();
            var11 = var24;
            var2 = var11;
            var11 = var24;
            if (var24 == null) {
              var2 = var2 + "| " + var29;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L2: {
                var9 = var24.indexOf('(');
                var10 = var24.indexOf(')', 1 + var9);
                if ((var9 ^ -1) == 0) {
                  var11 = var24;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var24.substring(0, var9);
                  break L2;
                }
              }
              L3: {
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
                if (var9 == -1) {
                  break L3;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L3;
                  } else {
                    var12 = var24.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
                      var2 = var28 + var24.substring(5 + var12, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            }
          }
        } else {
          var14 = null;
          String discarded$1 = vi.a((CharSequence[]) null, -61, -90, 112);
          var30 = new PrintWriter((Writer) (Object) var16);
          param1.printStackTrace(var30);
          var30.close();
          var31 = var16.toString();
          var11 = var31;
          var2 = var11;
          var11 = var31;
          var32 = new BufferedReader((Reader) (Object) new StringReader(var31));
          var6 = var32;
          var38 = var32.readLine();
          var11 = var38;
          var2 = var11;
          var11 = var38;
          var7 = var38;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L4: while (true) {
            var33 = var32.readLine();
            var11 = var33;
            var2 = var11;
            var11 = var33;
            if (var33 == null) {
              var2 = var2 + "| " + var38;
              var11 = var2;
              var45 = var11;
              var11 = var2;
              return var2;
            } else {
              L5: {
                var9 = var33.indexOf('(');
                var10 = var33.indexOf(')', 1 + var9);
                if ((var9 ^ -1) == 0) {
                  var11 = var33;
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var33.substring(0, var9);
                  break L5;
                }
              }
              L6: {
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
                if (var9 == -1) {
                  break L6;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L6;
                  } else {
                    var12 = var33.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
                      var2 = var37 + var33.substring(5 + var12, var10);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L4;
            }
          }
        }
    }

    final static sc a(int param0, ki param1, ki param2, int param3, int param4) {
        if (pk.a(113, param4, param2, param3)) {
          if (param0 != -13449) {
            return null;
          } else {
            return fc.a(param1.b(param4, false, param3), -62);
          }
        } else {
          return null;
        }
    }

    final void e(byte param0) {
        ((vi) this).field_N = 0;
        ((vi) this).field_L = 0;
        ((vi) this).field_l = "";
        ((vi) this).c((byte) -125);
        if (param0 >= -119) {
            field_O = null;
        }
    }

    private final String d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != -114) {
          return null;
        } else {
          L0: {
            if (((vi) this).field_N <= ((vi) this).field_L) {
              stackOut_3_0 = ((vi) this).field_N;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((vi) this).field_L;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (((vi) this).field_N > ((vi) this).field_L) {
              stackOut_6_0 = ((vi) this).field_N;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((vi) this).field_L;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((vi) this).field_l.substring(var2, var3);
        }
    }

    private final void p(int param0) {
        dm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rj var9 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (((vi) this).field_G) {
          if (((vi) this).field_j instanceof rj) {
            var9 = (rj) (Object) ((vi) this).field_j;
            var3 = var9.a((pj) this, true);
            if (param0 == 1970553377) {
              var4 = var3.a(false);
              var5 = var9.a((pj) this, param0 + -1970553495);
              var6 = var9.a((byte) 94) >> 1970553377;
              if (-var6 + var5 > var4) {
                ((vi) this).field_f = 0;
                ((vi) this).field_q = 0;
                return;
              } else {
                var7 = ((vi) this).field_f - -var3.a(param0 + -1970553503, ((vi) this).field_N);
                if (var7 <= -var6 + var5) {
                  if (var7 < var6) {
                    ((vi) this).field_f = ((vi) this).field_f + -var7 + var6;
                    if (0 >= ((vi) this).field_f) {
                      if (((vi) this).field_f < -var5 - -var6) {
                        ((vi) this).field_f = -var5 - -var6;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((vi) this).field_f = 0;
                      return;
                    }
                  } else {
                    if (0 >= ((vi) this).field_f) {
                      if (((vi) this).field_f < -var5 - -var6) {
                        ((vi) this).field_f = -var5 - -var6;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((vi) this).field_f = 0;
                      return;
                    }
                  }
                } else {
                  ((vi) this).field_f = -var7 - var6 - -var5 + ((vi) this).field_f;
                  if (0 >= ((vi) this).field_f) {
                    if (((vi) this).field_f >= -var5 - -var6) {
                      return;
                    } else {
                      ((vi) this).field_f = -var5 - -var6;
                      return;
                    }
                  } else {
                    ((vi) this).field_f = 0;
                    return;
                  }
                }
              }
            } else {
              ((vi) this).field_L = -101;
              var4 = var3.a(false);
              var5 = var9.a((pj) this, param0 + -1970553495);
              var6 = var9.a((byte) 94) >> 1970553377;
              if (-var6 + var5 > var4) {
                ((vi) this).field_f = 0;
                ((vi) this).field_q = 0;
                return;
              } else {
                L0: {
                  var7 = ((vi) this).field_f - -var3.a(param0 + -1970553503, ((vi) this).field_N);
                  if (var7 <= -var6 + var5) {
                    if (var7 < var6) {
                      ((vi) this).field_f = ((vi) this).field_f + -var7 + var6;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((vi) this).field_f = -var7 - var6 - -var5 + ((vi) this).field_f;
                    break L0;
                  }
                }
                if (0 >= ((vi) this).field_f) {
                  if (((vi) this).field_f >= -var5 - -var6) {
                    return;
                  } else {
                    ((vi) this).field_f = -var5 - -var6;
                    return;
                  }
                } else {
                  ((vi) this).field_f = 0;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          ((vi) this).field_f = 0;
          ((vi) this).field_q = 0;
          return;
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((vi) this).field_L == ((vi) this).field_N) {
            break L0;
          } else {
            L1: {
              if (((vi) this).field_L >= ((vi) this).field_N) {
                stackOut_3_0 = ((vi) this).field_N;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((vi) this).field_L;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (((vi) this).field_N <= ((vi) this).field_L) {
                stackOut_6_0 = ((vi) this).field_L;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((vi) this).field_N;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            ((vi) this).field_N = var2;
            ((vi) this).field_L = var2;
            ((vi) this).field_l = ((vi) this).field_l.substring(0, var2) + ((vi) this).field_l.substring(var3, ((vi) this).field_l.length());
            ((vi) this).c((byte) -128);
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -47) {
          var2 = ((vi) this).field_l.length();
          if (var2 == ((vi) this).field_N) {
            return ((vi) this).field_N;
          } else {
            var3 = 1 + ((vi) this).field_N;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (((vi) this).field_l.charAt(-1 + var3) ^ -1)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          var5 = null;
          boolean discarded$5 = ((vi) this).a('i', 85, (pj) null, 10);
          var2 = ((vi) this).field_l.length();
          if (var2 == ((vi) this).field_N) {
            return ((vi) this).field_N;
          } else {
            var3 = 1 + ((vi) this).field_N;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != ((vi) this).field_l.charAt(-1 + var3)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
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
            String var2 = null;
            Object var3 = null;
            L0: {
              var2 = this.d((byte) -114);
              if ((var2.length() ^ -1) < -1) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.d((byte) -114)), (java.awt.datatransfer.ClipboardOwner) null);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 < 5) {
              var3 = null;
              boolean discarded$2 = ((vi) this).a('ﾦ', 54, (pj) null, -16);
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
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        Object stackIn_132_0 = null;
        Object stackIn_133_0 = null;
        Object stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        Object stackOut_131_0 = null;
        Object stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        Object stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        Object stackOut_88_0 = null;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        ((vi) this).field_Q = ji.b(109);
        if (60 != param0) {
          if (param0 != 62) {
            if (param0 >= 32) {
              if (param0 <= 126) {
                L0: {
                  if (((vi) this).field_N != ((vi) this).field_L) {
                    this.m(25177);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (0 == (((vi) this).field_P ^ -1)) {
                    break L1;
                  } else {
                    if (((vi) this).field_l.length() < ((vi) this).field_P) {
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
                if (((vi) this).field_N >= ((vi) this).field_l.length()) {
                  ((vi) this).field_l = ((vi) this).field_l + param0;
                  ((vi) this).field_N = ((vi) this).field_l.length();
                  ((vi) this).field_L = ((vi) this).field_l.length();
                  ((vi) this).c((byte) -122);
                  return true;
                } else {
                  ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_N) + param0 + ((vi) this).field_l.substring(((vi) this).field_N, ((vi) this).field_l.length());
                  ((vi) this).field_N = ((vi) this).field_N + 1;
                  ((vi) this).field_L = ((vi) this).field_N;
                  ((vi) this).c((byte) -122);
                  return true;
                }
              } else {
                L2: {
                  if (param1 != 85) {
                    if (param1 == 101) {
                      if (((vi) this).field_N != ((vi) this).field_L) {
                        this.m(25177);
                        return true;
                      } else {
                        if (((vi) this).field_N < ((vi) this).field_l.length()) {
                          ((vi) this).field_L = ((vi) this).field_N + 1;
                          this.m(25177);
                          return true;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      if (13 != param1) {
                        if (-97 != (param1 ^ -1)) {
                          if (-98 == (param1 ^ -1)) {
                            if (((vi) this).field_N < ((vi) this).field_l.length()) {
                              L3: {
                                stackOut_131_0 = this;
                                stackIn_133_0 = stackOut_131_0;
                                stackIn_132_0 = stackOut_131_0;
                                if (!ek.field_a[82]) {
                                  stackOut_133_0 = this;
                                  stackOut_133_1 = ((vi) this).field_N + 1;
                                  stackIn_134_0 = stackOut_133_0;
                                  stackIn_134_1 = stackOut_133_1;
                                  break L3;
                                } else {
                                  stackOut_132_0 = this;
                                  stackOut_132_1 = this.b((byte) -123);
                                  stackIn_134_0 = stackOut_132_0;
                                  stackIn_134_1 = stackOut_132_1;
                                  break L3;
                                }
                              }
                              this.b(stackIn_134_1, 1242);
                              return true;
                            } else {
                              L4: {
                                if (param3 == 0) {
                                  break L4;
                                } else {
                                  vi.a(true, 15);
                                  break L4;
                                }
                              }
                              return false;
                            }
                          } else {
                            if (param1 != -103) {
                              if (103 != param1) {
                                if (-85 != param1) {
                                  L5: {
                                    if (!ek.field_a[82]) {
                                      break L5;
                                    } else {
                                      if (param1 != -66) {
                                        break L5;
                                      } else {
                                        this.k(param3 + -89);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!ek.field_a[82]) {
                                    if (ek.field_a[82]) {
                                      if ((param1 ^ -1) == -68) {
                                        this.o(0);
                                        return true;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      L6: {
                                        if (param3 == 0) {
                                          break L6;
                                        } else {
                                          vi.a(true, 15);
                                          break L6;
                                        }
                                      }
                                      return false;
                                    }
                                  } else {
                                    if (-67 != param1) {
                                      if (ek.field_a[82]) {
                                        if ((param1 ^ -1) == -68) {
                                          this.o(0);
                                          return true;
                                        } else {
                                          L7: {
                                            if (param3 == 0) {
                                              break L7;
                                            } else {
                                              vi.a(true, 15);
                                              break L7;
                                            }
                                          }
                                          return false;
                                        }
                                      } else {
                                        L8: {
                                          if (param3 == 0) {
                                            break L8;
                                          } else {
                                            vi.a(true, 15);
                                            break L8;
                                          }
                                        }
                                        return false;
                                      }
                                    } else {
                                      this.f((byte) 64);
                                      return true;
                                    }
                                  }
                                } else {
                                  this.j(param3 + -8108);
                                  return true;
                                }
                              } else {
                                this.b(((vi) this).field_l.length(), 1242);
                                return true;
                              }
                            } else {
                              this.b(0, 1242);
                              return true;
                            }
                          }
                        } else {
                          if (((vi) this).field_N <= 0) {
                            L9: {
                              if (param3 == 0) {
                                break L9;
                              } else {
                                vi.a(true, 15);
                                break L9;
                              }
                            }
                            return false;
                          } else {
                            L10: {
                              stackOut_88_0 = this;
                              stackIn_90_0 = stackOut_88_0;
                              stackIn_89_0 = stackOut_88_0;
                              if (ek.field_a[82]) {
                                stackOut_90_0 = this;
                                stackOut_90_1 = this.l(-1);
                                stackIn_91_0 = stackOut_90_0;
                                stackIn_91_1 = stackOut_90_1;
                                break L10;
                              } else {
                                stackOut_89_0 = this;
                                stackOut_89_1 = -1 + ((vi) this).field_N;
                                stackIn_91_0 = stackOut_89_0;
                                stackIn_91_1 = stackOut_89_1;
                                break L10;
                              }
                            }
                            this.b(stackIn_91_1, 1242);
                            return true;
                          }
                        }
                      } else {
                        ((vi) this).e((byte) -126);
                        return true;
                      }
                    }
                  } else {
                    if (((vi) this).field_N == ((vi) this).field_L) {
                      if (((vi) this).field_N > 0) {
                        ((vi) this).field_L = -1 + ((vi) this).field_N;
                        this.m(25177);
                        return true;
                      } else {
                        break L2;
                      }
                    } else {
                      this.m(25177);
                      return true;
                    }
                  }
                }
                L11: {
                  if (param3 == 0) {
                    break L11;
                  } else {
                    vi.a(true, 15);
                    break L11;
                  }
                }
                return false;
              }
            } else {
              L12: {
                if (param1 != 85) {
                  if (param1 == 101) {
                    if (((vi) this).field_N == ((vi) this).field_L) {
                      if (((vi) this).field_N < ((vi) this).field_l.length()) {
                        ((vi) this).field_L = ((vi) this).field_N + 1;
                        this.m(25177);
                        return true;
                      } else {
                        break L12;
                      }
                    } else {
                      this.m(25177);
                      return true;
                    }
                  } else {
                    if (13 != param1) {
                      if (-97 != (param1 ^ -1)) {
                        if (-98 == (param1 ^ -1)) {
                          if (((vi) this).field_N >= ((vi) this).field_l.length()) {
                            L13: {
                              if (param3 == 0) {
                                break L13;
                              } else {
                                vi.a(true, 15);
                                break L13;
                              }
                            }
                            return false;
                          } else {
                            L14: {
                              stackOut_58_0 = this;
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_59_0 = stackOut_58_0;
                              if (!ek.field_a[82]) {
                                stackOut_60_0 = this;
                                stackOut_60_1 = ((vi) this).field_N + 1;
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                break L14;
                              } else {
                                stackOut_59_0 = this;
                                stackOut_59_1 = this.b((byte) -123);
                                stackIn_61_0 = stackOut_59_0;
                                stackIn_61_1 = stackOut_59_1;
                                break L14;
                              }
                            }
                            this.b(stackIn_61_1, 1242);
                            return true;
                          }
                        } else {
                          if (param1 != -103) {
                            if (103 != param1) {
                              if (-85 != param1) {
                                L15: {
                                  if (!ek.field_a[82]) {
                                    break L15;
                                  } else {
                                    if (param1 != -66) {
                                      break L15;
                                    } else {
                                      this.k(param3 + -89);
                                      return true;
                                    }
                                  }
                                }
                                if (!ek.field_a[82]) {
                                  if (ek.field_a[82]) {
                                    if ((param1 ^ -1) == -68) {
                                      this.o(0);
                                      return true;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    L16: {
                                      if (param3 == 0) {
                                        break L16;
                                      } else {
                                        vi.a(true, 15);
                                        break L16;
                                      }
                                    }
                                    return false;
                                  }
                                } else {
                                  if (-67 != param1) {
                                    if (ek.field_a[82]) {
                                      if ((param1 ^ -1) == -68) {
                                        this.o(0);
                                        return true;
                                      } else {
                                        L17: {
                                          if (param3 == 0) {
                                            break L17;
                                          } else {
                                            vi.a(true, 15);
                                            break L17;
                                          }
                                        }
                                        return false;
                                      }
                                    } else {
                                      L18: {
                                        if (param3 == 0) {
                                          break L18;
                                        } else {
                                          vi.a(true, 15);
                                          break L18;
                                        }
                                      }
                                      return false;
                                    }
                                  } else {
                                    this.f((byte) 64);
                                    return true;
                                  }
                                }
                              } else {
                                this.j(param3 + -8108);
                                return true;
                              }
                            } else {
                              this.b(((vi) this).field_l.length(), 1242);
                              return true;
                            }
                          } else {
                            this.b(0, 1242);
                            return true;
                          }
                        }
                      } else {
                        if (((vi) this).field_N > 0) {
                          L19: {
                            stackOut_21_0 = this;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_22_0 = stackOut_21_0;
                            if (ek.field_a[82]) {
                              stackOut_23_0 = this;
                              stackOut_23_1 = this.l(-1);
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              break L19;
                            } else {
                              stackOut_22_0 = this;
                              stackOut_22_1 = -1 + ((vi) this).field_N;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              break L19;
                            }
                          }
                          this.b(stackIn_24_1, 1242);
                          return true;
                        } else {
                          L20: {
                            if (param3 == 0) {
                              break L20;
                            } else {
                              vi.a(true, 15);
                              break L20;
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      ((vi) this).e((byte) -126);
                      return true;
                    }
                  }
                } else {
                  if (((vi) this).field_N == ((vi) this).field_L) {
                    if (((vi) this).field_N > 0) {
                      ((vi) this).field_L = -1 + ((vi) this).field_N;
                      this.m(25177);
                      return true;
                    } else {
                      break L12;
                    }
                  } else {
                    this.m(25177);
                    return true;
                  }
                }
              }
              L21: {
                if (param3 == 0) {
                  break L21;
                } else {
                  vi.a(true, 15);
                  break L21;
                }
              }
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        rj var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.p(1970553377);
        if (-2 == (((vi) this).field_v ^ -1)) {
            if (((vi) this).field_j instanceof rj) {
                var5 = (rj) (Object) ((vi) this).field_j;
                var6 = var5.a(vl.field_d, param3, 2147483647, ua.field_a, (pj) this, param2);
                if ((var6 ^ -1) != 0) {
                    if (((vi) this).field_J) {
                        if (((vi) this).field_K > var6) {
                            if (var6 > ((vi) this).field_L) {
                                var6 = ((vi) this).field_K;
                            }
                        }
                    }
                    ((vi) this).field_N = var6;
                }
            }
            ((vi) this).field_Q = ji.b(-98);
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (!super.a((byte) -116, param1, param2, param3, param4, param5, param6)) {
          if (param0 > -115) {
            ((vi) this).field_Q = 71L;
            return false;
          } else {
            return false;
          }
        } else {
          if (((vi) this).field_j instanceof rj) {
            L0: {
              var8_int = ((rj) (Object) ((vi) this).field_j).a(vl.field_d, param6, 2147483647, ua.field_a, (pj) this, param3);
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var8_int != -1) {
                stackOut_8_0 = this;
                stackOut_8_1 = var8_int;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L0;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L0;
              }
            }
            L1: {
              this.b(stackIn_9_1, 1242);
              var8 = ji.b(119);
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (-((vi) this).field_R + var8 >= 250L) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L1;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L1;
              }
            }
            ((vi) this).field_J = stackIn_12_1 != 0;
            if (((vi) this).field_J) {
              ((vi) this).field_L = this.l(-1);
              ((vi) this).field_N = this.b((byte) -115);
              if ((((vi) this).field_N ^ -1) < -1) {
                if (((vi) this).field_l.charAt(-1 + ((vi) this).field_N) == 32) {
                  ((vi) this).field_N = ((vi) this).field_N - 1;
                  ((vi) this).field_K = ((vi) this).field_N;
                  ((vi) this).field_R = var8;
                  return true;
                } else {
                  ((vi) this).field_K = ((vi) this).field_N;
                  ((vi) this).field_R = var8;
                  return true;
                }
              } else {
                ((vi) this).field_K = ((vi) this).field_N;
                ((vi) this).field_R = var8;
                return true;
              }
            } else {
              ((vi) this).field_R = var8;
              return true;
            }
          } else {
            if (param0 <= -115) {
              return false;
            } else {
              ((vi) this).field_Q = 71L;
              return false;
            }
          }
        }
    }

    vi(String param0, ag param1, int param2) {
        super(param0, param1);
        ((vi) this).field_J = false;
        ((vi) this).field_R = 0L;
        ((vi) this).field_K = -1;
        ((vi) this).field_P = param2;
        ((vi) this).field_j = mb.field_a.field_q;
        ((vi) this).a(0, true, param0);
        ((vi) this).field_G = true;
        ((vi) this).field_Q = ji.b(-53);
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
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            if (param0 == 0) {
              try {
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.m(25177);
                this.a(var2_ref, true);
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              var2 = (Exception) (Object) decompiledCaughtException;
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
        CharSequence var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        if (param2 != 0) {
          if (1 == param2) {
            var10 = param0[param3];
            var4 = var10;
            if (var4 == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4_int = param2 - -param3;
            var5 = param1;
            var6_int = param3;
            L0: while (true) {
              if (var4_int <= var6_int) {
                L1: {
                  var6 = new StringBuilder(var5);
                  var7 = param3;
                  if (var4_int <= var7) {
                    break L1;
                  } else {
                    L2: {
                      var8 = param0[var7];
                      if (var8 != null) {
                        StringBuilder discarded$2 = var6.append(var8);
                        break L2;
                      } else {
                        StringBuilder discarded$3 = var6.append("null");
                        var7++;
                        break L2;
                      }
                    }
                    var7++;
                    var7++;
                    break L1;
                  }
                }
                return var6.toString();
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        if (!(((vi) this).field_P == 0)) {
            var3 = ((vi) this).field_P - ((vi) this).field_l.length();
            if (-1 <= var3) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((vi) this).field_N != ((vi) this).field_l.length()) {
            ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_N) + param0 + ((vi) this).field_l.substring(((vi) this).field_N, ((vi) this).field_l.length());
            ((vi) this).field_N = ((vi) this).field_N + param0.length();
            ((vi) this).field_L = ((vi) this).field_N;
            if (!param1) {
                ((vi) this).field_G = false;
            } else {
                ((vi) this).c((byte) -127);
                return;
            }
            ((vi) this).c((byte) -127);
            return;
        }
        ((vi) this).field_l = ((vi) this).field_l + param0;
        ((vi) this).field_N = ((vi) this).field_N + param0.length();
        ((vi) this).field_L = ((vi) this).field_N;
        if (!param1) {
            ((vi) this).field_G = false;
        } else {
            ((vi) this).c((byte) -127);
            return;
        }
        ((vi) this).c((byte) -127);
    }

    void c(byte param0) {
        L0: {
          if (((vi) this).field_h instanceof jb) {
            ((jb) (Object) ((vi) this).field_h).a((vi) this, 66);
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
        Object var3 = null;
        if (param0 == -8108) {
          if (((vi) this).field_h instanceof jb) {
            ((jb) (Object) ((vi) this).field_h).a((vi) this, false);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          ((vi) this).a((byte) -122, (pj) null, -81, 77);
          if (!(((vi) this).field_h instanceof jb)) {
            return;
          } else {
            ((jb) (Object) ((vi) this).field_h).a((vi) this, false);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        rj var8 = null;
        if (((vi) this).field_j != null) {
          if (-1 == (param1 ^ -1)) {
            ((vi) this).field_j.a(param0, param3, (pj) this, -4394, ((vi) this).field_F);
            if (((vi) this).field_j instanceof rj) {
              L0: {
                var8 = (rj) (Object) ((vi) this).field_j;
                if (((vi) this).field_N != ((vi) this).field_L) {
                  var8.a(((vi) this).field_L, ((vi) this).field_N, (pj) this, param3, param2 ^ -1048511, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              var6 = ji.b(126);
              if (((-((vi) this).field_Q + var6) % 1000L ^ -1L) > -501L) {
                var8.a(param0, (pj) this, param3, (byte) 94, ((vi) this).field_N);
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
        Object var2 = null;
        field_O = null;
        if (param0 != 1) {
          var2 = null;
          String discarded$2 = vi.a((CharSequence[]) null, 10, 59, 11);
          field_H = null;
          return;
        } else {
          field_H = null;
          return;
        }
    }

    private final void b(int param0, int param1) {
        ((vi) this).field_N = param0;
        if (param1 != 1242) {
            return;
        }
        if (!(ek.field_a[81])) {
            ((vi) this).field_L = ((vi) this).field_N;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_H = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_O = new int[256];
        var1 = 0;
        L0: while (true) {
          if (-257 >= var1) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (-9 <= var2) {
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
