/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lka extends hf {
    private boolean field_D;
    private int field_I;
    private boolean field_L;
    static String[][] field_E;
    private long field_A;
    private int field_H;
    private int field_J;
    private long field_F;
    static int[] field_G;
    private int field_K;

    private final void h(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var3 = 123 % ((param0 - 55) / 48);
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.i(-12);
              this.a(var2, (byte) -51);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 != ((lka) this).field_H) {
          var2 = -1 + ((lka) this).field_H;
          L0: while (true) {
            if (var2 > 0) {
              if (((lka) this).field_w.charAt(var2 - 1) != 32) {
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
          return ((lka) this).field_H;
        }
    }

    public static void g(byte param0) {
        if (param0 >= -122) {
            field_G = null;
            field_E = null;
            field_G = null;
            return;
        }
        field_E = null;
        field_G = null;
    }

    final void j(byte param0) {
        int var2 = -106 / ((52 - param0) / 41);
        ((lka) this).field_K = 0;
        ((lka) this).field_w = "";
        ((lka) this).field_H = 0;
        ((lka) this).i((byte) -118);
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 == -26) {
          var2 = ((lka) this).field_w.length();
          if (var2 == ((lka) this).field_H) {
            return ((lka) this).field_H;
          } else {
            var3 = 1 + ((lka) this).field_H;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (((lka) this).field_w.charAt(-1 + var3) ^ -1)) {
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
          return 120;
        }
    }

    void i(byte param0) {
        if (param0 < -87) {
          if (((lka) this).field_k instanceof fca) {
            ((fca) (Object) ((lka) this).field_k).a((lka) this, (byte) 63);
            return;
          } else {
            return;
          }
        } else {
          field_G = null;
          if (!(((lka) this).field_k instanceof fca)) {
            return;
          } else {
            ((fca) (Object) ((lka) this).field_k).a((lka) this, (byte) 63);
            return;
          }
        }
    }

    final static kv a(byte param0, kv param1) {
        if (param0 != 54) {
          lka.g((byte) -47);
          param1.g(2);
          param1.f(65793);
          return param1;
        } else {
          param1.g(2);
          param1.f(65793);
          return param1;
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        L0: {
          if (0 == ((lka) this).field_I) {
            break L0;
          } else {
            var3 = ((lka) this).field_I - ((lka) this).field_w.length();
            if (-1 <= var3) {
              return;
            } else {
              param0 = param0.substring(0, var3);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == -51) {
            break L1;
          } else {
            this.i(122);
            break L1;
          }
        }
        if (((lka) this).field_H == ((lka) this).field_w.length()) {
          ((lka) this).field_w = ((lka) this).field_w + param0;
          ((lka) this).field_H = ((lka) this).field_H + param0.length();
          ((lka) this).field_K = ((lka) this).field_H;
          ((lka) this).i((byte) -104);
          return;
        } else {
          ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_H) + param0 + ((lka) this).field_w.substring(((lka) this).field_H, ((lka) this).field_w.length());
          ((lka) this).field_H = ((lka) this).field_H + param0.length();
          ((lka) this).field_K = ((lka) this).field_H;
          ((lka) this).i((byte) -104);
          return;
        }
    }

    private final void g(int param0) {
        if (param0 != 81) {
          field_G = null;
          this.b(false);
          this.i(115);
          return;
        } else {
          this.b(false);
          this.i(115);
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (this.b(param0, param1, param2, param3, param4, param5, param6)) {
          if (((lka) this).field_f instanceof qka) {
            L0: {
              var8_int = ((qka) (Object) ((lka) this).field_f).a((wj) this, gd.field_m, param2, param4, mk.field_p, (byte) -86);
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (-1 != var8_int) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = var8_int;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_7_1 != 0, stackIn_7_2);
              var8 = f.b((byte) 73);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-251L >= (var8 - ((lka) this).field_A ^ -1L)) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((lka) this).field_L = stackIn_10_1 != 0;
            if (((lka) this).field_L) {
              ((lka) this).field_K = this.j(0);
              ((lka) this).field_H = this.e((byte) -26);
              if (((lka) this).field_H > 0) {
                if (((lka) this).field_w.charAt(((lka) this).field_H + -1) != 32) {
                  ((lka) this).field_J = ((lka) this).field_H;
                  ((lka) this).field_A = var8;
                  return true;
                } else {
                  ((lka) this).field_H = ((lka) this).field_H - 1;
                  ((lka) this).field_J = ((lka) this).field_H;
                  ((lka) this).field_A = var8;
                  return true;
                }
              } else {
                ((lka) this).field_J = ((lka) this).field_H;
                ((lka) this).field_A = var8;
                return true;
              }
            } else {
              ((lka) this).field_A = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void a(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        ((lka) this).field_H = param1;
        if (!(wga.field_q[81])) {
            ((lka) this).field_K = ((lka) this).field_H;
        }
    }

    private final void h(byte param0) {
        L0: {
          if (((lka) this).field_k instanceof fca) {
            ((fca) (Object) ((lka) this).field_k).a((lka) this, 0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 18) {
          field_E = null;
          return;
        } else {
          return;
        }
    }

    lka(String param0, pl param1, int param2) {
        super(param0, param1);
        ((lka) this).field_L = false;
        ((lka) this).field_A = 0L;
        ((lka) this).field_J = -1;
        ((lka) this).field_f = fda.field_i.field_s;
        ((lka) this).field_I = param2;
        ((lka) this).a((byte) -26, param0, true);
        ((lka) this).field_D = true;
        ((lka) this).field_F = f.b((byte) 73);
    }

    private final String f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != -53) {
          L0: {
            ((lka) this).field_H = -11;
            if (((lka) this).field_H <= ((lka) this).field_K) {
              stackOut_10_0 = ((lka) this).field_H;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((lka) this).field_K;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (((lka) this).field_H <= ((lka) this).field_K) {
              stackOut_13_0 = ((lka) this).field_K;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = ((lka) this).field_H;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return ((lka) this).field_w.substring(var2, var3);
        } else {
          L2: {
            if (((lka) this).field_H <= ((lka) this).field_K) {
              stackOut_3_0 = ((lka) this).field_H;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = ((lka) this).field_K;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (((lka) this).field_H <= ((lka) this).field_K) {
              stackOut_6_0 = ((lka) this).field_K;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ((lka) this).field_H;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return ((lka) this).field_w.substring(var2, var3);
        }
    }

    private final void d(byte param0) {
        vv var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qka var10 = null;
        vv var11 = null;
        qka var12 = null;
        vv var13 = null;
        var8 = BachelorFridge.field_y;
        if (((lka) this).field_D) {
          if (param0 < -71) {
            if (((lka) this).field_f instanceof qka) {
              var12 = (qka) (Object) ((lka) this).field_f;
              var13 = var12.b((wj) this, false);
              var4 = var13.b((byte) 124);
              var5 = var12.a((wj) this, false);
              var6 = var12.a(-30983) >> -1925269055;
              if (-var6 + var5 <= var4) {
                var7 = ((lka) this).field_m - -var13.a(((lka) this).field_H, (byte) -99);
                if (var7 <= var5 + -var6) {
                  if (var6 <= var7) {
                    if (0 >= ((lka) this).field_m) {
                      if (((lka) this).field_m < -var5 - -var6) {
                        ((lka) this).field_m = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((lka) this).field_m = 0;
                      return;
                    }
                  } else {
                    ((lka) this).field_m = ((lka) this).field_m + (var6 + -var7);
                    if (0 >= ((lka) this).field_m) {
                      if (((lka) this).field_m < -var5 - -var6) {
                        ((lka) this).field_m = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((lka) this).field_m = 0;
                      return;
                    }
                  }
                } else {
                  ((lka) this).field_m = -var7 + (var5 + -var6 + ((lka) this).field_m);
                  if (0 >= ((lka) this).field_m) {
                    if (((lka) this).field_m < -var5 - -var6) {
                      ((lka) this).field_m = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((lka) this).field_m = 0;
                    return;
                  }
                }
              } else {
                ((lka) this).field_o = 0;
                ((lka) this).field_m = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            ((lka) this).field_J = -15;
            if (((lka) this).field_f instanceof qka) {
              var10 = (qka) (Object) ((lka) this).field_f;
              var11 = var10.b((wj) this, false);
              var3 = var11;
              var4 = var11.b((byte) 124);
              var5 = var10.a((wj) this, false);
              var6 = var10.a(-30983) >> -1925269055;
              if (-var6 + var5 <= var4) {
                L0: {
                  var7 = ((lka) this).field_m - -var11.a(((lka) this).field_H, (byte) -99);
                  if (var7 <= var5 + -var6) {
                    if (var6 > var7) {
                      ((lka) this).field_m = ((lka) this).field_m + (var6 + -var7);
                      break L0;
                    } else {
                      L1: {
                        if (0 < ((lka) this).field_m) {
                          ((lka) this).field_m = 0;
                          break L1;
                        } else {
                          if (((lka) this).field_m >= -var5 - -var6) {
                            break L1;
                          } else {
                            ((lka) this).field_m = var6 + -var5;
                            break L1;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    ((lka) this).field_m = -var7 + (var5 + -var6 + ((lka) this).field_m);
                    break L0;
                  }
                }
                if (0 >= ((lka) this).field_m) {
                  if (((lka) this).field_m >= -var5 - -var6) {
                    return;
                  } else {
                    ((lka) this).field_m = var6 + -var5;
                    return;
                  }
                } else {
                  ((lka) this).field_m = 0;
                  return;
                }
              } else {
                ((lka) this).field_o = 0;
                ((lka) this).field_m = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ((lka) this).field_m = 0;
          ((lka) this).field_o = 0;
          return;
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        int var6 = 0;
        qka var7 = null;
        this.a(param0, param1, param2, param3 + 0);
        this.d((byte) -75);
        if (param3 == 20) {
          if (-2 == (((lka) this).field_u ^ -1)) {
            if (!(((lka) this).field_f instanceof qka)) {
              ((lka) this).field_F = f.b((byte) 73);
              return;
            } else {
              L0: {
                var7 = (qka) (Object) ((lka) this).field_f;
                var6 = var7.a((wj) this, gd.field_m, param0, param1, mk.field_p, (byte) -85);
                if (-1 == var6) {
                  break L0;
                } else {
                  L1: {
                    if (!((lka) this).field_L) {
                      break L1;
                    } else {
                      if (((lka) this).field_J <= var6) {
                        break L1;
                      } else {
                        if (((lka) this).field_K >= var6) {
                          break L1;
                        } else {
                          var6 = ((lka) this).field_J;
                          break L1;
                        }
                      }
                    }
                  }
                  ((lka) this).field_H = var6;
                  break L0;
                }
              }
              ((lka) this).field_F = f.b((byte) 73);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, String param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param1 == null) {
            param1 = "";
            break L0;
          } else {
            break L0;
          }
        }
        var4 = -101 / ((param0 - 58) / 54);
        ((lka) this).field_w = param1;
        var5 = param1.length();
        if ((((lka) this).field_I ^ -1) != 0) {
          if (((lka) this).field_I >= var5) {
            L1: {
              ((lka) this).field_K = ((lka) this).field_w.length();
              ((lka) this).field_H = ((lka) this).field_w.length();
              if (!param2) {
                ((lka) this).i((byte) -90);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_I);
              ((lka) this).field_K = ((lka) this).field_w.length();
              ((lka) this).field_H = ((lka) this).field_w.length();
              if (!param2) {
                ((lka) this).i((byte) -90);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          L3: {
            ((lka) this).field_K = ((lka) this).field_w.length();
            ((lka) this).field_H = ((lka) this).field_w.length();
            if (!param2) {
              ((lka) this).i((byte) -90);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    private final void b(boolean param0) {
        try {
            String var2 = null;
            var2 = this.f((byte) -53);
            if (param0) {
              return;
            } else {
              L0: {
                if ((var2.length() ^ -1) < -1) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.f((byte) -53)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        Object var6 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        L0: {
          ((lka) this).field_F = f.b((byte) 73);
          if (param2 == 60) {
            break L0;
          } else {
            if (62 == param2) {
              break L0;
            } else {
              if (32 <= param2) {
                if (param2 <= 126) {
                  if (((lka) this).field_H == ((lka) this).field_K) {
                    if (-1 == ((lka) this).field_I) {
                      if (((lka) this).field_H < ((lka) this).field_w.length()) {
                        ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_H) + param2 + ((lka) this).field_w.substring(((lka) this).field_H, ((lka) this).field_w.length());
                        ((lka) this).field_H = ((lka) this).field_H + 1;
                        ((lka) this).field_K = ((lka) this).field_H;
                        ((lka) this).i((byte) -123);
                        return true;
                      } else {
                        ((lka) this).field_w = ((lka) this).field_w + param2;
                        ((lka) this).field_H = ((lka) this).field_w.length();
                        ((lka) this).field_K = ((lka) this).field_w.length();
                        ((lka) this).i((byte) -123);
                        return true;
                      }
                    } else {
                      if (((lka) this).field_w.length() >= ((lka) this).field_I) {
                        return true;
                      } else {
                        L1: {
                          if (((lka) this).field_H < ((lka) this).field_w.length()) {
                            ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_H) + param2 + ((lka) this).field_w.substring(((lka) this).field_H, ((lka) this).field_w.length());
                            ((lka) this).field_H = ((lka) this).field_H + 1;
                            ((lka) this).field_K = ((lka) this).field_H;
                            break L1;
                          } else {
                            ((lka) this).field_w = ((lka) this).field_w + param2;
                            ((lka) this).field_H = ((lka) this).field_w.length();
                            ((lka) this).field_K = ((lka) this).field_w.length();
                            break L1;
                          }
                        }
                        ((lka) this).i((byte) -123);
                        return true;
                      }
                    }
                  } else {
                    L2: {
                      L3: {
                        this.i(param0 ^ -49);
                        if (-1 == ((lka) this).field_I) {
                          break L3;
                        } else {
                          if (((lka) this).field_w.length() >= ((lka) this).field_I) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (((lka) this).field_H < ((lka) this).field_w.length()) {
                        ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_H) + param2 + ((lka) this).field_w.substring(((lka) this).field_H, ((lka) this).field_w.length());
                        ((lka) this).field_H = ((lka) this).field_H + 1;
                        ((lka) this).field_K = ((lka) this).field_H;
                        ((lka) this).i((byte) -123);
                        break L2;
                      } else {
                        ((lka) this).field_w = ((lka) this).field_w + param2;
                        ((lka) this).field_H = ((lka) this).field_w.length();
                        ((lka) this).field_K = ((lka) this).field_w.length();
                        ((lka) this).i((byte) -123);
                        break L2;
                      }
                    }
                    return true;
                  }
                } else {
                  L4: {
                    if (-86 == param1) {
                      if (((lka) this).field_H == ((lka) this).field_K) {
                        if (-1 > (((lka) this).field_H ^ -1)) {
                          ((lka) this).field_K = ((lka) this).field_H - 1;
                          this.i(111);
                          return true;
                        } else {
                          break L4;
                        }
                      } else {
                        this.i(120);
                        return true;
                      }
                    } else {
                      if (-102 == param1) {
                        if (((lka) this).field_H == ((lka) this).field_K) {
                          if (((lka) this).field_H < ((lka) this).field_w.length()) {
                            ((lka) this).field_K = 1 + ((lka) this).field_H;
                            this.i(106);
                            return true;
                          } else {
                            break L4;
                          }
                        } else {
                          this.i(param0 + 109);
                          return true;
                        }
                      } else {
                        if (-14 != param1) {
                          if (-97 != param1) {
                            if (97 != param1) {
                              if (-103 != (param1 ^ -1)) {
                                if (103 != param1) {
                                  if (84 != param1) {
                                    L5: {
                                      if (!wga.field_q[82]) {
                                        break L5;
                                      } else {
                                        if (-66 != (param1 ^ -1)) {
                                          break L5;
                                        } else {
                                          this.g(81);
                                          return true;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (!wga.field_q[82]) {
                                        break L6;
                                      } else {
                                        if ((param1 ^ -1) != -67) {
                                          break L6;
                                        } else {
                                          this.b(false);
                                          return true;
                                        }
                                      }
                                    }
                                    if (wga.field_q[82]) {
                                      if (param1 == 67) {
                                        this.h(104);
                                        return true;
                                      } else {
                                        break L4;
                                      }
                                    } else {
                                      L7: {
                                        if (param0 == 10) {
                                          break L7;
                                        } else {
                                          var6 = null;
                                          boolean discarded$5 = ((lka) this).b(-24, 51, -40, -52, -18, (wj) null, -94);
                                          break L7;
                                        }
                                      }
                                      return false;
                                    }
                                  } else {
                                    this.h((byte) 52);
                                    return true;
                                  }
                                } else {
                                  this.a(true, ((lka) this).field_w.length());
                                  return true;
                                }
                              } else {
                                this.a(true, 0);
                                return true;
                              }
                            } else {
                              if (((lka) this).field_H < ((lka) this).field_w.length()) {
                                L8: {
                                  stackOut_75_0 = this;
                                  stackOut_75_1 = 1;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (!wga.field_q[82]) {
                                    stackOut_77_0 = this;
                                    stackOut_77_1 = stackIn_77_1;
                                    stackOut_77_2 = 1 + ((lka) this).field_H;
                                    stackIn_78_0 = stackOut_77_0;
                                    stackIn_78_1 = stackOut_77_1;
                                    stackIn_78_2 = stackOut_77_2;
                                    break L8;
                                  } else {
                                    stackOut_76_0 = this;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = this.e((byte) -26);
                                    stackIn_78_0 = stackOut_76_0;
                                    stackIn_78_1 = stackOut_76_1;
                                    stackIn_78_2 = stackOut_76_2;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_78_1 != 0, stackIn_78_2);
                                return true;
                              } else {
                                L9: {
                                  if (param0 == 10) {
                                    break L9;
                                  } else {
                                    var6 = null;
                                    boolean discarded$6 = ((lka) this).b(-24, 51, -40, -52, -18, (wj) null, -94);
                                    break L9;
                                  }
                                }
                                return false;
                              }
                            }
                          } else {
                            if ((((lka) this).field_H ^ -1) < -1) {
                              L10: {
                                stackOut_65_0 = this;
                                stackOut_65_1 = 1;
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_67_1 = stackOut_65_1;
                                stackIn_66_0 = stackOut_65_0;
                                stackIn_66_1 = stackOut_65_1;
                                if (wga.field_q[82]) {
                                  stackOut_67_0 = this;
                                  stackOut_67_1 = stackIn_67_1;
                                  stackOut_67_2 = this.j(0);
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  stackIn_68_2 = stackOut_67_2;
                                  break L10;
                                } else {
                                  stackOut_66_0 = this;
                                  stackOut_66_1 = stackIn_66_1;
                                  stackOut_66_2 = -1 + ((lka) this).field_H;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  stackIn_68_2 = stackOut_66_2;
                                  break L10;
                                }
                              }
                              this.a(stackIn_68_1 != 0, stackIn_68_2);
                              return true;
                            } else {
                              L11: {
                                if (param0 == 10) {
                                  break L11;
                                } else {
                                  var6 = null;
                                  boolean discarded$7 = ((lka) this).b(-24, 51, -40, -52, -18, (wj) null, -94);
                                  break L11;
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          ((lka) this).j((byte) -85);
                          return true;
                        }
                      }
                    }
                  }
                  L12: {
                    if (param0 == 10) {
                      break L12;
                    } else {
                      var6 = null;
                      boolean discarded$8 = ((lka) this).b(-24, 51, -40, -52, -18, (wj) null, -94);
                      break L12;
                    }
                  }
                  return false;
                }
              } else {
                L13: {
                  if (-86 == param1) {
                    if (((lka) this).field_H == ((lka) this).field_K) {
                      if (-1 > (((lka) this).field_H ^ -1)) {
                        ((lka) this).field_K = ((lka) this).field_H - 1;
                        this.i(111);
                        return true;
                      } else {
                        break L13;
                      }
                    } else {
                      this.i(120);
                      return true;
                    }
                  } else {
                    if (-102 == param1) {
                      if (((lka) this).field_H == ((lka) this).field_K) {
                        if (((lka) this).field_H < ((lka) this).field_w.length()) {
                          ((lka) this).field_K = 1 + ((lka) this).field_H;
                          this.i(106);
                          return true;
                        } else {
                          break L13;
                        }
                      } else {
                        this.i(param0 + 109);
                        return true;
                      }
                    } else {
                      if (-14 != param1) {
                        if (-97 != param1) {
                          if (97 != param1) {
                            if (-103 != (param1 ^ -1)) {
                              if (103 != param1) {
                                if (84 != param1) {
                                  L14: {
                                    if (!wga.field_q[82]) {
                                      break L14;
                                    } else {
                                      if (-66 != (param1 ^ -1)) {
                                        break L14;
                                      } else {
                                        this.g(81);
                                        return true;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (!wga.field_q[82]) {
                                      break L15;
                                    } else {
                                      if ((param1 ^ -1) != -67) {
                                        break L15;
                                      } else {
                                        this.b(false);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!wga.field_q[82]) {
                                    break L13;
                                  } else {
                                    if (param1 == 67) {
                                      this.h(104);
                                      return true;
                                    } else {
                                      break L13;
                                    }
                                  }
                                } else {
                                  this.h((byte) 52);
                                  return true;
                                }
                              } else {
                                this.a(true, ((lka) this).field_w.length());
                                return true;
                              }
                            } else {
                              this.a(true, 0);
                              return true;
                            }
                          } else {
                            if (((lka) this).field_H >= ((lka) this).field_w.length()) {
                              break L13;
                            } else {
                              L16: {
                                stackOut_17_0 = this;
                                stackOut_17_1 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if (!wga.field_q[82]) {
                                  stackOut_19_0 = this;
                                  stackOut_19_1 = stackIn_19_1;
                                  stackOut_19_2 = 1 + ((lka) this).field_H;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  stackIn_20_2 = stackOut_19_2;
                                  break L16;
                                } else {
                                  stackOut_18_0 = this;
                                  stackOut_18_1 = stackIn_18_1;
                                  stackOut_18_2 = this.e((byte) -26);
                                  stackIn_20_0 = stackOut_18_0;
                                  stackIn_20_1 = stackOut_18_1;
                                  stackIn_20_2 = stackOut_18_2;
                                  break L16;
                                }
                              }
                              this.a(stackIn_20_1 != 0, stackIn_20_2);
                              return true;
                            }
                          }
                        } else {
                          if ((((lka) this).field_H ^ -1) >= -1) {
                            break L13;
                          } else {
                            L17: {
                              stackOut_11_0 = this;
                              stackOut_11_1 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              if (wga.field_q[82]) {
                                stackOut_13_0 = this;
                                stackOut_13_1 = stackIn_13_1;
                                stackOut_13_2 = this.j(0);
                                stackIn_14_0 = stackOut_13_0;
                                stackIn_14_1 = stackOut_13_1;
                                stackIn_14_2 = stackOut_13_2;
                                break L17;
                              } else {
                                stackOut_12_0 = this;
                                stackOut_12_1 = stackIn_12_1;
                                stackOut_12_2 = -1 + ((lka) this).field_H;
                                stackIn_14_0 = stackOut_12_0;
                                stackIn_14_1 = stackOut_12_1;
                                stackIn_14_2 = stackOut_12_2;
                                break L17;
                              }
                            }
                            this.a(stackIn_14_1 != 0, stackIn_14_2);
                            return true;
                          }
                        }
                      } else {
                        ((lka) this).j((byte) -85);
                        return true;
                      }
                    }
                  }
                }
                if (param0 != 10) {
                  var6 = null;
                  boolean discarded$9 = ((lka) this).b(-24, 51, -40, -52, -18, (wj) null, -94);
                  return false;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    private final void i(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -97 / ((43 - param0) / 38);
        if (!(((lka) this).field_H == ((lka) this).field_K)) {
            var3 = ((lka) this).field_H <= ((lka) this).field_K ? ((lka) this).field_H : ((lka) this).field_K;
            var4 = ((lka) this).field_K < ((lka) this).field_H ? ((lka) this).field_H : ((lka) this).field_K;
            ((lka) this).field_H = var3;
            ((lka) this).field_K = var3;
            ((lka) this).field_w = ((lka) this).field_w.substring(0, var3) + ((lka) this).field_w.substring(var4, ((lka) this).field_w.length());
            ((lka) this).i((byte) -106);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        qka var8 = null;
        if (null != ((lka) this).field_f) {
          if (param2 == 0) {
            ((lka) this).field_f.a(param3, (wj) this, 32679, param1, ((lka) this).field_z);
            if (((lka) this).field_f instanceof qka) {
              var8 = (qka) (Object) ((lka) this).field_f;
              if (((lka) this).field_K == ((lka) this).field_H) {
                var6 = f.b((byte) 73);
                if ((-((lka) this).field_F + var6) % 1000L < 500L) {
                  var8.a((byte) -88, param1, (wj) this, ((lka) this).field_H, param3);
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                } else {
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                }
              } else {
                var8.a(((lka) this).field_K, -17394, param3, ((lka) this).field_H, param1, (wj) this);
                var6 = f.b((byte) 73);
                if ((-((lka) this).field_F + var6) % 1000L < 500L) {
                  var8.a((byte) -88, param1, (wj) this, ((lka) this).field_H, param3);
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                } else {
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                }
              }
            } else {
              var5 = -91 / ((-20 - param0) / 54);
              return;
            }
          } else {
            var5 = -91 / ((-20 - param0) / 54);
            return;
          }
        } else {
          var5 = -91 / ((-20 - param0) / 54);
          return;
        }
    }

    static {
    }
}
