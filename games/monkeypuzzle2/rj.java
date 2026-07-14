/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rj extends t {
    private int field_E;
    private int field_J;
    private long field_K;
    private int field_D;
    static String field_B;
    static le field_H;
    private boolean field_G;
    private int field_I;
    private long field_F;
    private boolean field_C;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0) {
          return;
        } else {
          L0: {
            if (((rj) this).field_E != ((rj) this).field_D) {
              L1: {
                if (((rj) this).field_E > ((rj) this).field_D) {
                  stackOut_5_0 = ((rj) this).field_D;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((rj) this).field_E;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_6_0;
                if (((rj) this).field_E > ((rj) this).field_D) {
                  stackOut_8_0 = ((rj) this).field_E;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ((rj) this).field_D;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var3 = stackIn_9_0;
              ((rj) this).field_E = var2;
              ((rj) this).field_D = var2;
              ((rj) this).field_s = ((rj) this).field_s.substring(0, var2) + ((rj) this).field_s.substring(var3, ((rj) this).field_s.length());
              ((rj) this).m(0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        Object stackIn_114_0 = null;
        Object stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        Object stackOut_113_0 = null;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        Object stackOut_85_0 = null;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_59_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        L0: {
          ((rj) this).field_K = pf.a(0);
          var5 = 84 / ((param3 - 37) / 50);
          if (param1 == 60) {
            break L0;
          } else {
            if (param1 == 62) {
              break L0;
            } else {
              if (param1 >= 32) {
                if (param1 <= 126) {
                  if (((rj) this).field_D == ((rj) this).field_E) {
                    L1: {
                      if ((((rj) this).field_I ^ -1) == 0) {
                        break L1;
                      } else {
                        if (((rj) this).field_s.length() < ((rj) this).field_I) {
                          break L1;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (((rj) this).field_E >= ((rj) this).field_s.length()) {
                      ((rj) this).field_s = ((rj) this).field_s + param1;
                      ((rj) this).field_E = ((rj) this).field_s.length();
                      ((rj) this).field_D = ((rj) this).field_s.length();
                      ((rj) this).m(0);
                      return true;
                    } else {
                      ((rj) this).field_s = ((rj) this).field_s.substring(0, ((rj) this).field_E) + param1 + ((rj) this).field_s.substring(((rj) this).field_E, ((rj) this).field_s.length());
                      ((rj) this).field_E = ((rj) this).field_E + 1;
                      ((rj) this).field_D = ((rj) this).field_E;
                      ((rj) this).m(0);
                      return true;
                    }
                  } else {
                    L2: {
                      L3: {
                        this.a(false);
                        if ((((rj) this).field_I ^ -1) == 0) {
                          break L3;
                        } else {
                          if (((rj) this).field_s.length() < ((rj) this).field_I) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (((rj) this).field_E >= ((rj) this).field_s.length()) {
                        ((rj) this).field_s = ((rj) this).field_s + param1;
                        ((rj) this).field_E = ((rj) this).field_s.length();
                        ((rj) this).field_D = ((rj) this).field_s.length();
                        ((rj) this).m(0);
                        break L2;
                      } else {
                        ((rj) this).field_s = ((rj) this).field_s.substring(0, ((rj) this).field_E) + param1 + ((rj) this).field_s.substring(((rj) this).field_E, ((rj) this).field_s.length());
                        ((rj) this).field_E = ((rj) this).field_E + 1;
                        ((rj) this).field_D = ((rj) this).field_E;
                        ((rj) this).m(0);
                        break L2;
                      }
                    }
                    return true;
                  }
                } else {
                  if (param2 != -86) {
                    L4: {
                      if (param2 != 101) {
                        if (-14 != (param2 ^ -1)) {
                          if (param2 == 96) {
                            if (-1 > (((rj) this).field_E ^ -1)) {
                              L5: {
                                stackOut_113_0 = this;
                                stackIn_115_0 = stackOut_113_0;
                                stackIn_114_0 = stackOut_113_0;
                                if (!dl.field_c[82]) {
                                  stackOut_115_0 = this;
                                  stackOut_115_1 = -1 + ((rj) this).field_E;
                                  stackIn_116_0 = stackOut_115_0;
                                  stackIn_116_1 = stackOut_115_1;
                                  break L5;
                                } else {
                                  stackOut_114_0 = this;
                                  stackOut_114_1 = this.l(-1);
                                  stackIn_116_0 = stackOut_114_0;
                                  stackIn_116_1 = stackOut_114_1;
                                  break L5;
                                }
                              }
                              this.a(stackIn_116_1, -102);
                              return true;
                            } else {
                              break L4;
                            }
                          } else {
                            if (param2 != 97) {
                              if (param2 == 102) {
                                this.a(0, -126);
                                return true;
                              } else {
                                if (103 != param2) {
                                  if (84 != param2) {
                                    if (!dl.field_c[82]) {
                                      L6: {
                                        if (!dl.field_c[82]) {
                                          break L6;
                                        } else {
                                          if (-67 != (param2 ^ -1)) {
                                            break L6;
                                          } else {
                                            this.b(true);
                                            return true;
                                          }
                                        }
                                      }
                                      if (!dl.field_c[82]) {
                                        break L4;
                                      } else {
                                        if (param2 != 67) {
                                          break L4;
                                        } else {
                                          this.e((byte) 63);
                                          return true;
                                        }
                                      }
                                    } else {
                                      if (param2 == -66) {
                                        this.c((byte) -121);
                                        return true;
                                      } else {
                                        L7: {
                                          if (!dl.field_c[82]) {
                                            break L7;
                                          } else {
                                            if (-67 != param2) {
                                              break L7;
                                            } else {
                                              this.b(true);
                                              return true;
                                            }
                                          }
                                        }
                                        L8: {
                                          if (!dl.field_c[82]) {
                                            break L8;
                                          } else {
                                            if (param2 != 67) {
                                              break L8;
                                            } else {
                                              this.e((byte) 63);
                                              return true;
                                            }
                                          }
                                        }
                                        return false;
                                      }
                                    }
                                  } else {
                                    this.d((byte) -118);
                                    return true;
                                  }
                                } else {
                                  this.a(((rj) this).field_s.length(), -105);
                                  return true;
                                }
                              }
                            } else {
                              if (((rj) this).field_E >= ((rj) this).field_s.length()) {
                                break L4;
                              } else {
                                L9: {
                                  stackOut_85_0 = this;
                                  stackIn_87_0 = stackOut_85_0;
                                  stackIn_86_0 = stackOut_85_0;
                                  if (dl.field_c[82]) {
                                    stackOut_87_0 = this;
                                    stackOut_87_1 = this.n(-1033);
                                    stackIn_88_0 = stackOut_87_0;
                                    stackIn_88_1 = stackOut_87_1;
                                    break L9;
                                  } else {
                                    stackOut_86_0 = this;
                                    stackOut_86_1 = 1 + ((rj) this).field_E;
                                    stackIn_88_0 = stackOut_86_0;
                                    stackIn_88_1 = stackOut_86_1;
                                    break L9;
                                  }
                                }
                                this.a(stackIn_88_1, -109);
                                return true;
                              }
                            }
                          }
                        } else {
                          ((rj) this).f((byte) -108);
                          return true;
                        }
                      } else {
                        if (((rj) this).field_D == ((rj) this).field_E) {
                          if (((rj) this).field_E < ((rj) this).field_s.length()) {
                            ((rj) this).field_D = 1 + ((rj) this).field_E;
                            this.a(false);
                            return true;
                          } else {
                            break L4;
                          }
                        } else {
                          this.a(false);
                          return true;
                        }
                      }
                    }
                    return false;
                  } else {
                    if (((rj) this).field_D == ((rj) this).field_E) {
                      if (-1 < ((rj) this).field_E) {
                        ((rj) this).field_D = ((rj) this).field_E - 1;
                        this.a(false);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.a(false);
                      return true;
                    }
                  }
                }
              } else {
                if (param2 != -86) {
                  if (param2 != 101) {
                    if (-14 != (param2 ^ -1)) {
                      if (param2 == 96) {
                        if (-1 > (((rj) this).field_E ^ -1)) {
                          L10: {
                            stackOut_59_0 = this;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_60_0 = stackOut_59_0;
                            if (!dl.field_c[82]) {
                              stackOut_61_0 = this;
                              stackOut_61_1 = -1 + ((rj) this).field_E;
                              stackIn_62_0 = stackOut_61_0;
                              stackIn_62_1 = stackOut_61_1;
                              break L10;
                            } else {
                              stackOut_60_0 = this;
                              stackOut_60_1 = this.l(-1);
                              stackIn_62_0 = stackOut_60_0;
                              stackIn_62_1 = stackOut_60_1;
                              break L10;
                            }
                          }
                          this.a(stackIn_62_1, -102);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        if (param2 != 97) {
                          if (param2 != 102) {
                            if (103 != param2) {
                              if (84 != param2) {
                                if (!dl.field_c[82]) {
                                  L11: {
                                    if (!dl.field_c[82]) {
                                      break L11;
                                    } else {
                                      if (-67 != (param2 ^ -1)) {
                                        break L11;
                                      } else {
                                        this.b(true);
                                        return true;
                                      }
                                    }
                                  }
                                  if (dl.field_c[82]) {
                                    if (param2 != 67) {
                                      return false;
                                    } else {
                                      this.e((byte) 63);
                                      return true;
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  if (param2 != -66) {
                                    L12: {
                                      if (!dl.field_c[82]) {
                                        break L12;
                                      } else {
                                        if (-67 != param2) {
                                          break L12;
                                        } else {
                                          this.b(true);
                                          return true;
                                        }
                                      }
                                    }
                                    if (dl.field_c[82]) {
                                      if (param2 != 67) {
                                        return false;
                                      } else {
                                        this.e((byte) 63);
                                        return true;
                                      }
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    this.c((byte) -121);
                                    return true;
                                  }
                                }
                              } else {
                                this.d((byte) -118);
                                return true;
                              }
                            } else {
                              this.a(((rj) this).field_s.length(), -105);
                              return true;
                            }
                          } else {
                            this.a(0, -126);
                            return true;
                          }
                        } else {
                          if (((rj) this).field_E < ((rj) this).field_s.length()) {
                            L13: {
                              stackOut_25_0 = this;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (dl.field_c[82]) {
                                stackOut_27_0 = this;
                                stackOut_27_1 = this.n(-1033);
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                break L13;
                              } else {
                                stackOut_26_0 = this;
                                stackOut_26_1 = 1 + ((rj) this).field_E;
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_28_1 = stackOut_26_1;
                                break L13;
                              }
                            }
                            this.a(stackIn_28_1, -109);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      ((rj) this).f((byte) -108);
                      return true;
                    }
                  } else {
                    if (((rj) this).field_D == ((rj) this).field_E) {
                      if (((rj) this).field_E >= ((rj) this).field_s.length()) {
                        return false;
                      } else {
                        ((rj) this).field_D = 1 + ((rj) this).field_E;
                        this.a(false);
                        return true;
                      }
                    } else {
                      this.a(false);
                      return true;
                    }
                  }
                } else {
                  if (((rj) this).field_D == ((rj) this).field_E) {
                    if (-1 < ((rj) this).field_E) {
                      ((rj) this).field_D = ((rj) this).field_E - 1;
                      this.a(false);
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    this.a(false);
                    return true;
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final void a(int param0, int param1) {
        L0: {
          ((rj) this).field_E = param0;
          if (!dl.field_c[81]) {
            ((rj) this).field_D = ((rj) this).field_E;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -89) {
          this.e((byte) 122);
          return;
        } else {
          return;
        }
    }

    rj(String param0, of param1, int param2) {
        super(param0, param1);
        ((rj) this).field_J = -1;
        ((rj) this).field_C = false;
        ((rj) this).field_F = 0L;
        ((rj) this).field_I = param2;
        ((rj) this).field_h = hi.field_b.field_o;
        ((rj) this).a(true, -5905, param0);
        ((rj) this).field_G = true;
        ((rj) this).field_K = pf.a(0);
    }

    private final void b(boolean param0) {
        try {
            String var2 = null;
            var2 = this.p(18587);
            if (!param0) {
              return;
            } else {
              L0: {
                if (0 >= var2.length()) {
                  break L0;
                } else {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(18587)), (java.awt.datatransfer.ClipboardOwner) null);
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

    public static void o(int param0) {
        field_B = null;
        if (param0 != 0) {
            field_B = null;
            field_H = null;
            return;
        }
        field_H = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        Object var8 = null;
        ui var9 = null;
        if (null != ((rj) this).field_h) {
          if (0 == param1) {
            ((rj) this).field_h.a(((rj) this).field_w, (we) this, param2, param3, 110);
            if (((rj) this).field_h instanceof ui) {
              var9 = (ui) (Object) ((rj) this).field_h;
              if (((rj) this).field_D == ((rj) this).field_E) {
                var6 = pf.a(param0 + -30);
                if (-501L >= ((-((rj) this).field_K + var6) % 1000L ^ -1L)) {
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a((we) this, param3, param2, ((rj) this).field_E, 0);
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var9.a(119, (we) this, ((rj) this).field_D, param3, ((rj) this).field_E, param2);
                var6 = pf.a(param0 + -30);
                if (-501L >= ((-((rj) this).field_K + var6) % 1000L ^ -1L)) {
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a((we) this, param3, param2, ((rj) this).field_E, 0);
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 != 30) {
                var8 = null;
                ((rj) this).a(false, 120, (String) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 == 30) {
              return;
            } else {
              var8 = null;
              ((rj) this).a(false, 120, (String) null);
              return;
            }
          }
        } else {
          if (param0 != 30) {
            var8 = null;
            ((rj) this).a(false, 120, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        int var6 = 0;
        ui var8 = null;
        ui var9 = null;
        if (param3 < -13) {
          super.a(param0, param1, param2, (byte) -98);
          this.k(95);
          if (-2 == (((rj) this).field_t ^ -1)) {
            if (((rj) this).field_h instanceof ui) {
              var9 = (ui) (Object) ((rj) this).field_h;
              var6 = var9.a(param2, p.field_a, (we) this, ei.field_a, true, param1);
              if (-1 == var6) {
                ((rj) this).field_K = pf.a(0);
                return;
              } else {
                L0: {
                  if (!((rj) this).field_C) {
                    break L0;
                  } else {
                    if (var6 >= ((rj) this).field_J) {
                      break L0;
                    } else {
                      if (var6 <= ((rj) this).field_D) {
                        break L0;
                      } else {
                        var6 = ((rj) this).field_J;
                        break L0;
                      }
                    }
                  }
                }
                ((rj) this).field_E = var6;
                ((rj) this).field_K = pf.a(0);
                return;
              }
            } else {
              ((rj) this).field_K = pf.a(0);
              return;
            }
          } else {
            return;
          }
        } else {
          rj.o(59);
          super.a(param0, param1, param2, (byte) -98);
          this.k(95);
          if (-2 == (((rj) this).field_t ^ -1)) {
            if (((rj) this).field_h instanceof ui) {
              var8 = (ui) (Object) ((rj) this).field_h;
              var6 = var8.a(param2, p.field_a, (we) this, ei.field_a, true, param1);
              if (-1 == var6) {
                ((rj) this).field_K = pf.a(0);
                return;
              } else {
                L1: {
                  if (!((rj) this).field_C) {
                    break L1;
                  } else {
                    if (var6 >= ((rj) this).field_J) {
                      break L1;
                    } else {
                      if (var6 <= ((rj) this).field_D) {
                        break L1;
                      } else {
                        var6 = ((rj) this).field_J;
                        break L1;
                      }
                    }
                  }
                }
                ((rj) this).field_E = var6;
                ((rj) this).field_K = pf.a(0);
                return;
              }
            } else {
              ((rj) this).field_K = pf.a(0);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (bi.a(param1, 20558, param0)) {
          var3 = 0;
          L0: while (true) {
            if (param1.length() <= var3) {
              if (param2 != 20) {
                rj.o(-49);
                return true;
              } else {
                return true;
              }
            } else {
              if (!vb.a((byte) 115, param1.charAt(var3))) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1033) {
          var2 = ((rj) this).field_s.length();
          if (var2 == ((rj) this).field_E) {
            return ((rj) this).field_E;
          } else {
            var3 = ((rj) this).field_E + 1;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (((rj) this).field_s.charAt(var3 + -1) ^ -1)) {
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
          field_B = null;
          var2 = ((rj) this).field_s.length();
          if (var2 == ((rj) this).field_E) {
            return ((rj) this).field_E;
          } else {
            var3 = ((rj) this).field_E + 1;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != ((rj) this).field_s.charAt(var3 + -1)) {
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

    private final String p(int param0) {
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
        if (param0 != 18587) {
          L0: {
            ((rj) this).field_F = -108L;
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_10_0 = ((rj) this).field_D;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((rj) this).field_E;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_13_0 = ((rj) this).field_E;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = ((rj) this).field_D;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return ((rj) this).field_s.substring(var2, var3);
        } else {
          L2: {
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_3_0 = ((rj) this).field_D;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = ((rj) this).field_E;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_6_0 = ((rj) this).field_E;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ((rj) this).field_D;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return ((rj) this).field_s.substring(var2, var3);
        }
    }

    final void f(byte param0) {
        ((rj) this).field_s = "";
        ((rj) this).field_E = 0;
        ((rj) this).field_D = 0;
        ((rj) this).m(0);
        if (param0 >= -3) {
            ((rj) this).field_F = 110L;
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int var4 = 0;
        L0: {
          if (param2 == null) {
            param2 = "";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == -5905) {
            break L1;
          } else {
            String discarded$1 = this.p(100);
            break L1;
          }
        }
        ((rj) this).field_s = param2;
        var4 = param2.length();
        if (0 == (((rj) this).field_I ^ -1)) {
          L2: {
            ((rj) this).field_D = ((rj) this).field_s.length();
            ((rj) this).field_E = ((rj) this).field_s.length();
            if (!param0) {
              ((rj) this).m(param1 ^ -5905);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (var4 > ((rj) this).field_I) {
              ((rj) this).field_s = ((rj) this).field_s.substring(0, ((rj) this).field_I);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            ((rj) this).field_D = ((rj) this).field_s.length();
            ((rj) this).field_E = ((rj) this).field_s.length();
            if (!param0) {
              ((rj) this).m(param1 ^ -5905);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    private final void e(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 63) {
                break L0;
              } else {
                this.a(true);
                break L0;
              }
            }
            try {
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.a(false);
              this.a(false, var2_ref);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, String param1) {
        int var3 = 0;
        L0: {
          if (0 != ((rj) this).field_I) {
            var3 = ((rj) this).field_I + -((rj) this).field_s.length();
            if (-1 <= var3) {
              return;
            } else {
              param1 = param1.substring(0, var3);
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (((rj) this).field_E != ((rj) this).field_s.length()) {
          ((rj) this).field_s = ((rj) this).field_s.substring(0, ((rj) this).field_E) + param1 + ((rj) this).field_s.substring(((rj) this).field_E, ((rj) this).field_s.length());
          ((rj) this).field_E = ((rj) this).field_E + param1.length();
          ((rj) this).field_D = ((rj) this).field_E;
          ((rj) this).m(0);
          if (!param0) {
            return;
          } else {
            ((rj) this).f((byte) -115);
            return;
          }
        } else {
          ((rj) this).field_s = ((rj) this).field_s + param1;
          ((rj) this).field_E = ((rj) this).field_E + param1.length();
          ((rj) this).field_D = ((rj) this).field_E;
          ((rj) this).m(0);
          if (!param0) {
            return;
          } else {
            ((rj) this).f((byte) -115);
            return;
          }
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((rj) this).field_E != 0) {
          var2 = param0 + ((rj) this).field_E;
          L0: while (true) {
            if (-1 > (var2 ^ -1)) {
              if (((rj) this).field_s.charAt(-1 + var2) != 32) {
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
          return ((rj) this).field_E;
        }
    }

    private final void c(byte param0) {
        this.b(true);
        int var2 = -6 % ((param0 - -65) / 35);
        this.a(false);
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        if (super.a(param0, param1, param2, param3 ^ 0, param4, param5, param6)) {
          if (((rj) this).field_h instanceof ui) {
            L0: {
              var8_int = ((ui) (Object) ((rj) this).field_h).a(param6, p.field_a, (we) this, ei.field_a, true, param0);
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (0 == (var8_int ^ -1)) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L0;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = var8_int;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_13_1, -120);
              var8 = pf.a(0);
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (250L <= var8 - ((rj) this).field_F) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L1;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L1;
              }
            }
            ((rj) this).field_C = stackIn_16_1 != 0;
            if (((rj) this).field_C) {
              ((rj) this).field_D = this.l(-1);
              ((rj) this).field_E = this.n(param3 ^ 592);
              if (((rj) this).field_E > 0) {
                if (((rj) this).field_s.charAt(((rj) this).field_E - 1) != 32) {
                  ((rj) this).field_J = ((rj) this).field_E;
                  ((rj) this).field_F = var8;
                  return true;
                } else {
                  ((rj) this).field_E = ((rj) this).field_E - 1;
                  ((rj) this).field_J = ((rj) this).field_E;
                  ((rj) this).field_F = var8;
                  return true;
                }
              } else {
                ((rj) this).field_J = ((rj) this).field_E;
                ((rj) this).field_F = var8;
                return true;
              }
            } else {
              ((rj) this).field_F = var8;
              return true;
            }
          } else {
            if (param3 == -1625) {
              return false;
            } else {
              ((rj) this).field_D = 46;
              return false;
            }
          }
        } else {
          if (param3 == -1625) {
            return false;
          } else {
            ((rj) this).field_D = 46;
            return false;
          }
        }
    }

    private final void d(byte param0) {
        if (!(((rj) this).field_o instanceof vc)) {
          if (param0 > -94) {
            ((rj) this).field_J = -3;
            return;
          } else {
            return;
          }
        } else {
          ((vc) (Object) ((rj) this).field_o).a(-88, (rj) this);
          if (param0 <= -94) {
            return;
          } else {
            ((rj) this).field_J = -3;
            return;
          }
        }
    }

    private final void k(int param0) {
        aa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ui var10 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((rj) this).field_G) {
          if (((rj) this).field_h instanceof ui) {
            var10 = (ui) (Object) ((rj) this).field_h;
            var3 = var10.a(-1, (we) this);
            var4 = var3.a(true);
            var5 = var10.b((we) this, true);
            var7 = -85 / ((27 - param0) / 63);
            var6 = var10.a(2) >> -793386367;
            if (-var6 + var5 > var4) {
              ((rj) this).field_k = 0;
              ((rj) this).field_i = 0;
              return;
            } else {
              var8 = ((rj) this).field_k - -var3.a(115, ((rj) this).field_E);
              if (var5 - var6 < var8) {
                ((rj) this).field_k = ((rj) this).field_k - (-var5 + (var6 + var8));
                if (0 >= ((rj) this).field_k) {
                  if (-var5 - -var6 > ((rj) this).field_k) {
                    ((rj) this).field_k = var6 + -var5;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((rj) this).field_k = 0;
                  return;
                }
              } else {
                if (var6 > var8) {
                  ((rj) this).field_k = ((rj) this).field_k + -var8 + var6;
                  if (0 >= ((rj) this).field_k) {
                    if (-var5 - -var6 <= ((rj) this).field_k) {
                      return;
                    } else {
                      ((rj) this).field_k = var6 + -var5;
                      return;
                    }
                  } else {
                    ((rj) this).field_k = 0;
                    return;
                  }
                } else {
                  if (0 >= ((rj) this).field_k) {
                    if (-var5 - -var6 <= ((rj) this).field_k) {
                      return;
                    } else {
                      ((rj) this).field_k = var6 + -var5;
                      return;
                    }
                  } else {
                    ((rj) this).field_k = 0;
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          ((rj) this).field_i = 0;
          ((rj) this).field_k = 0;
          return;
        }
    }

    void m(int param0) {
        Object var3 = null;
        if (!(((rj) this).field_o instanceof vc)) {
          if (param0 != 0) {
            var3 = null;
            ((rj) this).a(false, -10, (String) null);
            return;
          } else {
            return;
          }
        } else {
          ((vc) (Object) ((rj) this).field_o).b(16926, (rj) this);
          if (param0 == 0) {
            return;
          } else {
            var3 = null;
            ((rj) this).a(false, -10, (String) null);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = null;
        field_H = new le(540, 140);
    }
}
