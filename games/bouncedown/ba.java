/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ba extends wd {
    private boolean field_H;
    static tj field_E;
    private boolean field_C;
    private long field_L;
    private int field_F;
    private int field_D;
    static boolean field_B;
    private int field_K;
    private long field_J;
    static boolean field_I;
    private int field_G;

    private final void b(int param0, int param1) {
        ((ba) this).field_G = param0;
        if (!ng.field_a[81]) {
            ((ba) this).field_K = ((ba) this).field_G;
        }
        if (param1 != 102) {
            ((ba) this).field_C = true;
        }
    }

    private final void i(int param0) {
        if (param0 != 30483) {
            ((ba) this).h(-108);
        }
        if (((ba) this).field_n instanceof gl) {
            ((gl) (Object) ((ba) this).field_n).a((byte) -51, (ba) this);
        }
    }

    private final String j(int param0) {
        int var2 = ((ba) this).field_G > ((ba) this).field_K ? ((ba) this).field_K : ((ba) this).field_G;
        int var4 = -121 % ((param0 - -61) / 36);
        int var3 = ((ba) this).field_K >= ((ba) this).field_G ? ((ba) this).field_K : ((ba) this).field_G;
        return ((ba) this).field_h.substring(var2, var3);
    }

    private final void f(byte param0) {
        int var2 = -116 % ((param0 - -25) / 63);
        this.i((byte) 84);
        this.b(true);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
            return;
        }
        if (!(((ba) this).field_K == ((ba) this).field_G)) {
            var2 = ((ba) this).field_G > ((ba) this).field_K ? ((ba) this).field_K : ((ba) this).field_G;
            var3 = ((ba) this).field_G > ((ba) this).field_K ? ((ba) this).field_G : ((ba) this).field_K;
            ((ba) this).field_K = var2;
            ((ba) this).field_G = var2;
            ((ba) this).field_h = ((ba) this).field_h.substring(0, var2) + ((ba) this).field_h.substring(var3, ((ba) this).field_h.length());
            ((ba) this).h((byte) 88);
        }
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        if (!(((ba) this).field_D == -1)) {
            var3 = ((ba) this).field_D + -((ba) this).field_h.length();
            if (-1 >= (var3 ^ -1)) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (((ba) this).field_G == ((ba) this).field_h.length()) {
            ((ba) this).field_h = ((ba) this).field_h + param1;
        } else {
            ((ba) this).field_h = ((ba) this).field_h.substring(0, ((ba) this).field_G) + param1 + ((ba) this).field_h.substring(((ba) this).field_G, ((ba) this).field_h.length());
        }
        ((ba) this).field_G = ((ba) this).field_G + param1.length();
        ((ba) this).field_K = ((ba) this).field_G;
        if (param0 != 28383) {
            return;
        }
        ((ba) this).h((byte) 88);
    }

    final void a(boolean param0, String param1, boolean param2) {
        if (!(param1 != null)) {
            param1 = "";
        }
        if (!param2) {
            Object var5 = null;
            ((ba) this).a(32, -52, -24, (lk) null);
        }
        ((ba) this).field_h = param1;
        int var4 = param1.length();
        if (((ba) this).field_D != -1) {
            if (!(var4 <= ((ba) this).field_D)) {
                ((ba) this).field_h = ((ba) this).field_h.substring(0, ((ba) this).field_D);
            }
        }
        int dupTemp$0 = ((ba) this).field_h.length();
        ((ba) this).field_K = dupTemp$0;
        ((ba) this).field_G = dupTemp$0;
        if (!(param0)) {
            ((ba) this).h((byte) 88);
        }
    }

    private final void g(byte param0) {
        try {
            int var2_int = 0;
            Exception var2 = null;
            String var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_int = 12 % ((param0 - 66) / 57);
                var3 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.b(true);
                this.a(28383, var3);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void h(byte param0) {
        if (((ba) this).field_n instanceof gl) {
            ((gl) (Object) ((ba) this).field_n).a((ba) this, (byte) 98);
        }
        if (param0 != 88) {
            ba.a((byte) -91, 122L);
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        sf var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.e((byte) 126);
        if (!(1 != ((ba) this).field_u)) {
            if (((ba) this).field_j instanceof sf) {
                var5 = (sf) (Object) ((ba) this).field_j;
                var6 = var5.a((lk) this, param2, ll.field_y, param1, param0 + -57, uc.field_C);
                if (-1 != var6) {
                    if (((ba) this).field_C) {
                        if (((ba) this).field_F > var6) {
                            if (var6 > ((ba) this).field_K) {
                                var6 = ((ba) this).field_F;
                            }
                        }
                    }
                    ((ba) this).field_G = var6;
                }
            }
            ((ba) this).field_L = fa.a(-55);
        }
    }

    ba(String param0, sk param1, int param2) {
        super(param0, param1);
        ((ba) this).field_J = 0L;
        ((ba) this).field_F = -1;
        ((ba) this).field_C = false;
        ((ba) this).field_D = param2;
        ((ba) this).field_j = ma.field_m.field_e;
        ((ba) this).a(true, param0, true);
        ((ba) this).field_H = true;
        ((ba) this).field_L = fa.a(-96);
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (param0 >= 44) {
          var2 = ((ba) this).field_h.length();
          if (var2 != ((ba) this).field_G) {
            var3 = 1 + ((ba) this).field_G;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (32 == ((ba) this).field_h.charAt(var3 + -1)) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return ((ba) this).field_G;
          }
        } else {
          return -111;
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        L0: {
          ((ba) this).field_L = fa.a(param3 + 14452);
          if (param1 == 60) {
            break L0;
          } else {
            if (62 == param1) {
              break L0;
            } else {
              L1: {
                if (param3 == -14565) {
                  break L1;
                } else {
                  ((ba) this).h((byte) -70);
                  break L1;
                }
              }
              L2: {
                if (param1 < 32) {
                  break L2;
                } else {
                  if (param1 > 126) {
                    break L2;
                  } else {
                    L3: {
                      if ((((ba) this).field_G ^ -1) == (((ba) this).field_K ^ -1)) {
                        break L3;
                      } else {
                        this.b(true);
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        if (0 == (((ba) this).field_D ^ -1)) {
                          break L5;
                        } else {
                          if (((ba) this).field_h.length() >= ((ba) this).field_D) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((ba) this).field_G < ((ba) this).field_h.length()) {
                          ((ba) this).field_h = ((ba) this).field_h.substring(0, ((ba) this).field_G) + param1 + ((ba) this).field_h.substring(((ba) this).field_G, ((ba) this).field_h.length());
                          ((ba) this).field_G = ((ba) this).field_G + 1;
                          ((ba) this).field_K = ((ba) this).field_G;
                          break L6;
                        } else {
                          ((ba) this).field_h = ((ba) this).field_h + param1;
                          int dupTemp$1 = ((ba) this).field_h.length();
                          ((ba) this).field_G = dupTemp$1;
                          ((ba) this).field_K = dupTemp$1;
                          break L6;
                        }
                      }
                      ((ba) this).h((byte) 88);
                      break L4;
                    }
                    return true;
                  }
                }
              }
              if (-86 != (param2 ^ -1)) {
                L7: {
                  if (param2 != 101) {
                    if (13 != param2) {
                      if (-97 != (param2 ^ -1)) {
                        if (param2 != 97) {
                          if (102 == param2) {
                            this.b(0, 102);
                            return true;
                          } else {
                            if (103 != param2) {
                              if (param2 == 84) {
                                this.i(30483);
                                return true;
                              } else {
                                L8: {
                                  if (!ng.field_a[82]) {
                                    break L8;
                                  } else {
                                    if ((param2 ^ -1) == -66) {
                                      this.f((byte) 107);
                                      return true;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if (!ng.field_a[82]) {
                                    break L9;
                                  } else {
                                    if ((param2 ^ -1) != -67) {
                                      break L9;
                                    } else {
                                      this.i((byte) 103);
                                      return true;
                                    }
                                  }
                                }
                                if (!ng.field_a[82]) {
                                  break L7;
                                } else {
                                  if (param2 != 67) {
                                    break L7;
                                  } else {
                                    this.g((byte) -11);
                                    return true;
                                  }
                                }
                              }
                            } else {
                              this.b(((ba) this).field_h.length(), 102);
                              return true;
                            }
                          }
                        } else {
                          if ((((ba) this).field_G ^ -1) <= (((ba) this).field_h.length() ^ -1)) {
                            break L7;
                          } else {
                            L10: {
                              stackOut_40_0 = this;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_41_0 = stackOut_40_0;
                              if (ng.field_a[82]) {
                                stackOut_42_0 = this;
                                stackOut_42_1 = this.a(param3 + 14657);
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                break L10;
                              } else {
                                stackOut_41_0 = this;
                                stackOut_41_1 = ((ba) this).field_G - -1;
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_43_1 = stackOut_41_1;
                                break L10;
                              }
                            }
                            this.b(stackIn_43_1, param3 + 14667);
                            return true;
                          }
                        }
                      } else {
                        if (-1 <= (((ba) this).field_G ^ -1)) {
                          break L7;
                        } else {
                          L11: {
                            stackOut_34_0 = this;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (!ng.field_a[82]) {
                              stackOut_36_0 = this;
                              stackOut_36_1 = -1 + ((ba) this).field_G;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              break L11;
                            } else {
                              stackOut_35_0 = this;
                              stackOut_35_1 = this.k(param3 ^ -14565);
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              break L11;
                            }
                          }
                          this.b(stackIn_37_1, param3 ^ -14467);
                          return true;
                        }
                      }
                    } else {
                      ((ba) this).h(123);
                      return true;
                    }
                  } else {
                    if ((((ba) this).field_K ^ -1) != (((ba) this).field_G ^ -1)) {
                      this.b(true);
                      return true;
                    } else {
                      if (((ba) this).field_G < ((ba) this).field_h.length()) {
                        ((ba) this).field_K = ((ba) this).field_G + 1;
                        this.b(true);
                        return true;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                return false;
              } else {
                if (((ba) this).field_K != ((ba) this).field_G) {
                  this.b(true);
                  return true;
                } else {
                  if (0 < ((ba) this).field_G) {
                    ((ba) this).field_K = -1 + ((ba) this).field_G;
                    this.b(true);
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final void h(int param0) {
        ((ba) this).field_G = 0;
        ((ba) this).field_h = "";
        ((ba) this).field_K = 0;
        ((ba) this).h((byte) 88);
        if (param0 <= 107) {
            Object var3 = null;
            ((ba) this).a(120, -64, -29, (lk) null);
        }
    }

    private final void e(byte param0) {
        ed var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sf var9 = null;
        var8 = Bounce.field_N;
        if (!((ba) this).field_H) {
          ((ba) this).field_v = 0;
          ((ba) this).field_o = 0;
          return;
        } else {
          if (((ba) this).field_j instanceof sf) {
            L0: {
              var9 = (sf) (Object) ((ba) this).field_j;
              if (param0 > 102) {
                break L0;
              } else {
                ((ba) this).field_D = -65;
                break L0;
              }
            }
            var3 = var9.b((lk) this, 0);
            var4 = var3.b(106);
            var5 = var9.a((lk) this, (byte) -55);
            var6 = var9.a(68) >> 1651627489;
            if (-var6 + var5 > var4) {
              ((ba) this).field_o = 0;
              ((ba) this).field_v = 0;
              return;
            } else {
              L1: {
                var7 = ((ba) this).field_v - -var3.a(((ba) this).field_G, 81);
                if (-var6 + var5 >= var7) {
                  if (var6 > var7) {
                    ((ba) this).field_v = ((ba) this).field_v - (var7 + -var6);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((ba) this).field_v = ((ba) this).field_v + (-var7 + (var5 + -var6));
                  break L1;
                }
              }
              L2: {
                if (0 >= ((ba) this).field_v) {
                  if (-var5 + var6 <= ((ba) this).field_v) {
                    break L2;
                  } else {
                    ((ba) this).field_v = var6 + -var5;
                    break L2;
                  }
                } else {
                  ((ba) this).field_v = 0;
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        if (param0 == ((ba) this).field_G) {
          return ((ba) this).field_G;
        } else {
          var2 = -1 + ((ba) this).field_G;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (((ba) this).field_h.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    final static void a(byte param0, long param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              Thread.sleep(param1);
              if (param0 <= -29) {
                break L1;
              } else {
                ba.a((byte) 115, 7L);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (((ba) this).field_j instanceof sf) {
            var8_int = ((sf) (Object) ((ba) this).field_j).a((lk) this, param6, ll.field_y, param2, -66, uc.field_C);
            this.b(-1 != var8_int ? var8_int : 0, param4 ^ 28481);
            var8 = fa.a(-99);
            ((ba) this).field_C = var8 + -((ba) this).field_J < 250L ? true : false;
            if (!(!((ba) this).field_C)) {
                ((ba) this).field_K = this.k(param4 + -28455);
                ((ba) this).field_G = this.a(116);
                if ((((ba) this).field_G ^ -1) < -1) {
                    if (!(((ba) this).field_h.charAt(-1 + ((ba) this).field_G) != 32)) {
                        ((ba) this).field_G = ((ba) this).field_G - 1;
                    }
                }
                ((ba) this).field_F = ((ba) this).field_G;
            }
            ((ba) this).field_J = var8;
            return true;
        }
        return false;
    }

    public static void d(byte param0) {
        if (param0 <= 69) {
            return;
        }
        field_E = null;
    }

    private final void i(byte param0) {
        int var2 = 89 % ((-11 - param0) / 49);
        String var3 = this.j(65);
        if (!((var3.length() ^ -1) >= -1)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j(-116)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        sf var8 = null;
        long var6 = 0L;
        if (null != ((ba) this).field_j) {
            if (!(param0 != 0)) {
                ((ba) this).field_j.a(param1, (lk) this, (byte) 91, ((ba) this).field_y, param3);
                if (!(!(((ba) this).field_j instanceof sf))) {
                    var8 = (sf) (Object) ((ba) this).field_j;
                    if (((ba) this).field_G != ((ba) this).field_K) {
                        var8.a(param3, (lk) this, param1, ((ba) this).field_G, ((ba) this).field_K, (byte) 87);
                    }
                    var6 = fa.a(-84);
                    if (!(((-((ba) this).field_L + var6) % 1000L ^ -1L) <= -501L)) {
                        var8.a((lk) this, ((ba) this).field_G, (byte) 65, param1, param3);
                    }
                }
            }
        }
        if (param2 <= 33) {
            ((ba) this).field_H = true;
        }
    }

    static {
    }
}
