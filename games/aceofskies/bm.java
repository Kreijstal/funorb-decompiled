/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bm extends mi {
    static Object field_C;
    private int field_H;
    private int field_A;
    private long field_E;
    private boolean field_G;
    static ia field_x;
    private int field_B;
    private boolean field_y;
    private int field_D;
    private long field_F;
    static rk field_I;
    static int field_z;
    static int[] field_w;

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        Object stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        Object stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        Object stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        Object stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        Object stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        Object stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        Object stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        L0: {
          var5 = 127 / ((param0 - -53) / 33);
          ((bm) this).field_F = kh.a(-97);
          if (60 == param2) {
            break L0;
          } else {
            if (param2 == 62) {
              break L0;
            } else {
              if (param2 < 32) {
                if (param1 != 85) {
                  L1: {
                    if ((param1 ^ -1) != -102) {
                      if (-14 != param1) {
                        if (-97 == param1) {
                          if (-1 <= (((bm) this).field_B ^ -1)) {
                            break L1;
                          } else {
                            L2: {
                              stackOut_117_0 = this;
                              stackOut_117_1 = 120;
                              stackIn_119_0 = stackOut_117_0;
                              stackIn_119_1 = stackOut_117_1;
                              stackIn_118_0 = stackOut_117_0;
                              stackIn_118_1 = stackOut_117_1;
                              if (lp.field_a[82]) {
                                stackOut_119_0 = this;
                                stackOut_119_1 = stackIn_119_1;
                                stackOut_119_2 = this.e((byte) 76);
                                stackIn_120_0 = stackOut_119_0;
                                stackIn_120_1 = stackOut_119_1;
                                stackIn_120_2 = stackOut_119_2;
                                break L2;
                              } else {
                                stackOut_118_0 = this;
                                stackOut_118_1 = stackIn_118_1;
                                stackOut_118_2 = -1 + ((bm) this).field_B;
                                stackIn_120_0 = stackOut_118_0;
                                stackIn_120_1 = stackOut_118_1;
                                stackIn_120_2 = stackOut_118_2;
                                break L2;
                              }
                            }
                            this.a((byte) stackIn_120_1, stackIn_120_2);
                            return true;
                          }
                        } else {
                          if (-98 == param1) {
                            if (((bm) this).field_B < ((bm) this).field_f.length()) {
                              L3: {
                                stackOut_112_0 = this;
                                stackOut_112_1 = 53;
                                stackIn_114_0 = stackOut_112_0;
                                stackIn_114_1 = stackOut_112_1;
                                stackIn_113_0 = stackOut_112_0;
                                stackIn_113_1 = stackOut_112_1;
                                if (!lp.field_a[82]) {
                                  stackOut_114_0 = this;
                                  stackOut_114_1 = stackIn_114_1;
                                  stackOut_114_2 = 1 + ((bm) this).field_B;
                                  stackIn_115_0 = stackOut_114_0;
                                  stackIn_115_1 = stackOut_114_1;
                                  stackIn_115_2 = stackOut_114_2;
                                  break L3;
                                } else {
                                  stackOut_113_0 = this;
                                  stackOut_113_1 = stackIn_113_1;
                                  stackOut_113_2 = this.k(0);
                                  stackIn_115_0 = stackOut_113_0;
                                  stackIn_115_1 = stackOut_113_1;
                                  stackIn_115_2 = stackOut_113_2;
                                  break L3;
                                }
                              }
                              this.a((byte) stackIn_115_1, stackIn_115_2);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            if (102 != param1) {
                              if (-104 != param1) {
                                if (-85 != (param1 ^ -1)) {
                                  if (!lp.field_a[82]) {
                                    if (lp.field_a[82]) {
                                      if (param1 == 66) {
                                        this.i(-116);
                                        return true;
                                      } else {
                                        if (lp.field_a[82]) {
                                          if (67 != param1) {
                                            return false;
                                          } else {
                                            this.l(-1);
                                            return true;
                                          }
                                        } else {
                                          return false;
                                        }
                                      }
                                    } else {
                                      L4: {
                                        if (!lp.field_a[82]) {
                                          break L4;
                                        } else {
                                          if (67 != param1) {
                                            break L4;
                                          } else {
                                            this.l(-1);
                                            return true;
                                          }
                                        }
                                      }
                                      return false;
                                    }
                                  } else {
                                    if ((param1 ^ -1) != -66) {
                                      if (lp.field_a[82]) {
                                        if (param1 == 66) {
                                          this.i(-116);
                                          return true;
                                        } else {
                                          L5: {
                                            if (!lp.field_a[82]) {
                                              break L5;
                                            } else {
                                              if (67 != param1) {
                                                break L5;
                                              } else {
                                                this.l(-1);
                                                return true;
                                              }
                                            }
                                          }
                                          return false;
                                        }
                                      } else {
                                        if (lp.field_a[82]) {
                                          if (67 == param1) {
                                            this.l(-1);
                                            return true;
                                          } else {
                                            return false;
                                          }
                                        } else {
                                          return false;
                                        }
                                      }
                                    } else {
                                      this.b(true);
                                      return true;
                                    }
                                  }
                                } else {
                                  this.j(-1);
                                  return true;
                                }
                              } else {
                                this.a((byte) 59, ((bm) this).field_f.length());
                                return true;
                              }
                            } else {
                              this.a((byte) 69, 0);
                              return true;
                            }
                          }
                        }
                      } else {
                        ((bm) this).f((byte) -2);
                        return true;
                      }
                    } else {
                      if (((bm) this).field_D == ((bm) this).field_B) {
                        if (((bm) this).field_B < ((bm) this).field_f.length()) {
                          ((bm) this).field_D = 1 + ((bm) this).field_B;
                          this.a((byte) 43);
                          return true;
                        } else {
                          break L1;
                        }
                      } else {
                        this.a((byte) -87);
                        return true;
                      }
                    }
                  }
                  return false;
                } else {
                  if (((bm) this).field_D == ((bm) this).field_B) {
                    if ((((bm) this).field_B ^ -1) < -1) {
                      ((bm) this).field_D = ((bm) this).field_B - 1;
                      this.a((byte) 14);
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    this.a((byte) -118);
                    return true;
                  }
                }
              } else {
                if (param2 <= 126) {
                  L6: {
                    if (((bm) this).field_B == ((bm) this).field_D) {
                      break L6;
                    } else {
                      this.a((byte) -127);
                      break L6;
                    }
                  }
                  if ((((bm) this).field_H ^ -1) == 0) {
                    if (((bm) this).field_B >= ((bm) this).field_f.length()) {
                      ((bm) this).field_f = ((bm) this).field_f + param2;
                      ((bm) this).field_B = ((bm) this).field_f.length();
                      ((bm) this).field_D = ((bm) this).field_f.length();
                      ((bm) this).g((byte) -75);
                      return true;
                    } else {
                      ((bm) this).field_f = ((bm) this).field_f.substring(0, ((bm) this).field_B) + param2 + ((bm) this).field_f.substring(((bm) this).field_B, ((bm) this).field_f.length());
                      ((bm) this).field_B = ((bm) this).field_B + 1;
                      ((bm) this).field_D = ((bm) this).field_B;
                      ((bm) this).g((byte) -75);
                      return true;
                    }
                  } else {
                    if (((bm) this).field_f.length() >= ((bm) this).field_H) {
                      return true;
                    } else {
                      L7: {
                        if (((bm) this).field_B >= ((bm) this).field_f.length()) {
                          ((bm) this).field_f = ((bm) this).field_f + param2;
                          ((bm) this).field_B = ((bm) this).field_f.length();
                          ((bm) this).field_D = ((bm) this).field_f.length();
                          break L7;
                        } else {
                          ((bm) this).field_f = ((bm) this).field_f.substring(0, ((bm) this).field_B) + param2 + ((bm) this).field_f.substring(((bm) this).field_B, ((bm) this).field_f.length());
                          ((bm) this).field_B = ((bm) this).field_B + 1;
                          ((bm) this).field_D = ((bm) this).field_B;
                          break L7;
                        }
                      }
                      ((bm) this).g((byte) -75);
                      return true;
                    }
                  }
                } else {
                  if (param1 != 85) {
                    if ((param1 ^ -1) != -102) {
                      if (-14 != param1) {
                        if (-97 == param1) {
                          if (-1 <= (((bm) this).field_B ^ -1)) {
                            return false;
                          } else {
                            L8: {
                              stackOut_50_0 = this;
                              stackOut_50_1 = 120;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_52_1 = stackOut_50_1;
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              if (lp.field_a[82]) {
                                stackOut_52_0 = this;
                                stackOut_52_1 = stackIn_52_1;
                                stackOut_52_2 = this.e((byte) 76);
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                stackIn_53_2 = stackOut_52_2;
                                break L8;
                              } else {
                                stackOut_51_0 = this;
                                stackOut_51_1 = stackIn_51_1;
                                stackOut_51_2 = -1 + ((bm) this).field_B;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                stackIn_53_2 = stackOut_51_2;
                                break L8;
                              }
                            }
                            this.a((byte) stackIn_53_1, stackIn_53_2);
                            return true;
                          }
                        } else {
                          if (-98 == param1) {
                            if (((bm) this).field_B < ((bm) this).field_f.length()) {
                              L9: {
                                stackOut_45_0 = this;
                                stackOut_45_1 = 53;
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                stackIn_46_0 = stackOut_45_0;
                                stackIn_46_1 = stackOut_45_1;
                                if (!lp.field_a[82]) {
                                  stackOut_47_0 = this;
                                  stackOut_47_1 = stackIn_47_1;
                                  stackOut_47_2 = 1 + ((bm) this).field_B;
                                  stackIn_48_0 = stackOut_47_0;
                                  stackIn_48_1 = stackOut_47_1;
                                  stackIn_48_2 = stackOut_47_2;
                                  break L9;
                                } else {
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = stackIn_46_1;
                                  stackOut_46_2 = this.k(0);
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_48_1 = stackOut_46_1;
                                  stackIn_48_2 = stackOut_46_2;
                                  break L9;
                                }
                              }
                              this.a((byte) stackIn_48_1, stackIn_48_2);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            if (102 != param1) {
                              if (-104 != param1) {
                                if (-85 != (param1 ^ -1)) {
                                  L10: {
                                    if (!lp.field_a[82]) {
                                      break L10;
                                    } else {
                                      if ((param1 ^ -1) != -66) {
                                        break L10;
                                      } else {
                                        this.b(true);
                                        return true;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (!lp.field_a[82]) {
                                      break L11;
                                    } else {
                                      if (param1 != 66) {
                                        break L11;
                                      } else {
                                        this.i(-116);
                                        return true;
                                      }
                                    }
                                  }
                                  if (lp.field_a[82]) {
                                    if (67 == param1) {
                                      this.l(-1);
                                      return true;
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  this.j(-1);
                                  return true;
                                }
                              } else {
                                this.a((byte) 59, ((bm) this).field_f.length());
                                return true;
                              }
                            } else {
                              this.a((byte) 69, 0);
                              return true;
                            }
                          }
                        }
                      } else {
                        ((bm) this).f((byte) -2);
                        return true;
                      }
                    } else {
                      if (((bm) this).field_D == ((bm) this).field_B) {
                        if (((bm) this).field_B >= ((bm) this).field_f.length()) {
                          return false;
                        } else {
                          ((bm) this).field_D = 1 + ((bm) this).field_B;
                          this.a((byte) 43);
                          return true;
                        }
                      } else {
                        this.a((byte) -87);
                        return true;
                      }
                    }
                  } else {
                    if (((bm) this).field_D == ((bm) this).field_B) {
                      if ((((bm) this).field_B ^ -1) < -1) {
                        ((bm) this).field_D = ((bm) this).field_B - 1;
                        this.a((byte) 14);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.a((byte) -118);
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final void l(int param0) {
        try {
            Exception exception = null;
            String var2 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                            this.a((byte) -81);
                            this.a(var2, (byte) 126);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param0 != -1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        field_I = (rk) null;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet m(int param0) {
        if (param0 < 106) {
            al var2 = (al) null;
            rh discarded$4 = bm.a((byte) -67, (al) null);
            if (!(hu.field_a == null)) {
                return hu.field_a;
            }
            return (java.applet.Applet) (Object) gh.field_f;
        }
        if (!(hu.field_a == null)) {
            return hu.field_a;
        }
        return (java.applet.Applet) (Object) gh.field_f;
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (((bm) this).field_B != 0) {
          var3 = 85 % ((param0 - 13) / 39);
          var2 = -1 + ((bm) this).field_B;
          L0: while (true) {
            if (var2 > 0) {
              if (-33 != (((bm) this).field_f.charAt(-1 + var2) ^ -1)) {
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
          return ((bm) this).field_B;
        }
    }

    final void a(int param0, String param1, boolean param2) {
        int var4 = 0;
        L0: {
          if (param1 == null) {
            param1 = "";
            break L0;
          } else {
            break L0;
          }
        }
        ((bm) this).field_f = param1;
        if (param0 == -20975) {
          L1: {
            var4 = param1.length();
            if (((bm) this).field_H == -1) {
              break L1;
            } else {
              if (((bm) this).field_H < var4) {
                ((bm) this).field_f = ((bm) this).field_f.substring(0, ((bm) this).field_H);
                break L1;
              } else {
                ((bm) this).field_D = ((bm) this).field_f.length();
                ((bm) this).field_B = ((bm) this).field_f.length();
                if (param2) {
                  return;
                } else {
                  ((bm) this).g((byte) -75);
                  return;
                }
              }
            }
          }
          ((bm) this).field_D = ((bm) this).field_f.length();
          ((bm) this).field_B = ((bm) this).field_f.length();
          if (!param2) {
            ((bm) this).g((byte) -75);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static rh a(byte param0, al param1) {
        if (param0 != -70) {
            return (rh) null;
        }
        return am.a(param1, false);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        long var6 = 0L;
        et var8 = null;
        if (null != ((bm) this).field_e) {
          if (param1 == 0) {
            L0: {
              ((bm) this).field_e.a(((bm) this).field_u, -7592, param3, (ea) this, param2);
              if (!(((bm) this).field_e instanceof et)) {
                break L0;
              } else {
                var8 = (et) ((bm) this).field_e;
                if (((bm) this).field_D == ((bm) this).field_B) {
                  var6 = kh.a(-62);
                  if ((-((bm) this).field_F + var6) % 1000L >= 500L) {
                    break L0;
                  } else {
                    ((et) var8).a((byte) 71, param3, param2, ((bm) this).field_B, (ea) this);
                    if (param0 <= 64) {
                      int discarded$6 = this.k(125);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  ((et) var8).a(((bm) this).field_D, ((bm) this).field_B, param2, param3, (ea) this, (byte) -123);
                  var6 = kh.a(-62);
                  if ((-((bm) this).field_F + var6) % 1000L >= 500L) {
                    if (param0 <= 64) {
                      int discarded$7 = this.k(125);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((et) var8).a((byte) 71, param3, param2, ((bm) this).field_B, (ea) this);
                    if (param0 <= 64) {
                      int discarded$8 = this.k(125);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (param0 <= 64) {
              int discarded$9 = this.k(125);
              return;
            } else {
              return;
            }
          } else {
            if (param0 > 64) {
              return;
            } else {
              int discarded$10 = this.k(125);
              return;
            }
          }
        } else {
          if (param0 <= 64) {
            int discarded$11 = this.k(125);
            return;
          } else {
            return;
          }
        }
    }

    void g(byte param0) {
        L0: {
          if (((bm) this).field_o instanceof dr) {
            ((dr) ((bm) this).field_o).a((bm) this, -6525);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -75) {
          field_I = (rk) null;
          return;
        } else {
          return;
        }
    }

    bm(String param0, no param1, int param2) {
        super(param0, param1);
        ((bm) this).field_E = 0L;
        ((bm) this).field_A = -1;
        ((bm) this).field_G = false;
        ((bm) this).field_H = param2;
        ((bm) this).field_e = ag.field_n.field_n;
        ((bm) this).a(-20975, param0, true);
        ((bm) this).field_y = true;
        ((bm) this).field_F = kh.a(-88);
    }

    private final void b(boolean param0) {
        ea var3 = null;
        this.i(-120);
        if (!param0) {
          var3 = (ea) null;
          boolean discarded$2 = ((bm) this).a(9, 25, 35, 10, 41, (ea) null, -23);
          this.a((byte) -85);
          return;
        } else {
          this.a((byte) -85);
          return;
        }
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -51 / ((-40 - param0) / 32);
        if (((bm) this).field_B != ((bm) this).field_D) {
            var3 = ((bm) this).field_B <= ((bm) this).field_D ? ((bm) this).field_B : ((bm) this).field_D;
            var4 = ((bm) this).field_B > ((bm) this).field_D ? ((bm) this).field_B : ((bm) this).field_D;
            ((bm) this).field_D = var3;
            ((bm) this).field_B = var3;
            ((bm) this).field_f = ((bm) this).field_f.substring(0, var3) + ((bm) this).field_f.substring(var4, ((bm) this).field_f.length());
            ((bm) this).g((byte) -75);
        }
    }

    private final void h(int param0) {
        pp var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        et var9 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (!((bm) this).field_y) {
          ((bm) this).field_j = 0;
          ((bm) this).field_l = 0;
          return;
        } else {
          if (!(((bm) this).field_e instanceof et)) {
            return;
          } else {
            var9 = (et) ((bm) this).field_e;
            var3 = ((et) var9).a((byte) 96, (ea) this);
            var4 = var3.a((byte) 24);
            var5 = ((et) var9).b((ea) this, -64);
            var6 = ((et) var9).a(-4) >> -1911304799;
            if (var4 < -var6 + var5) {
              ((bm) this).field_l = 0;
              ((bm) this).field_j = 0;
              return;
            } else {
              var7 = ((bm) this).field_j + var3.b(((bm) this).field_B, -127);
              if (var5 - var6 < var7) {
                ((bm) this).field_j = -var7 + -var6 + (var5 + ((bm) this).field_j);
                if (param0 >= ((bm) this).field_j) {
                  if (-var5 - -var6 <= ((bm) this).field_j) {
                    return;
                  } else {
                    ((bm) this).field_j = -var5 + var6;
                    return;
                  }
                } else {
                  ((bm) this).field_j = 0;
                  return;
                }
              } else {
                if (var6 <= var7) {
                  if (param0 >= ((bm) this).field_j) {
                    if (-var5 - -var6 <= ((bm) this).field_j) {
                      return;
                    } else {
                      ((bm) this).field_j = -var5 + var6;
                      return;
                    }
                  } else {
                    ((bm) this).field_j = 0;
                    return;
                  }
                } else {
                  ((bm) this).field_j = ((bm) this).field_j - -var6 - var7;
                  if (param0 >= ((bm) this).field_j) {
                    if (-var5 - -var6 <= ((bm) this).field_j) {
                      return;
                    } else {
                      ((bm) this).field_j = -var5 + var6;
                      return;
                    }
                  } else {
                    ((bm) this).field_j = 0;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        ((bm) this).field_B = param1;
        if (param0 <= 30) {
          L0: {
            ((bm) this).field_F = 35L;
            if (!lp.field_a[81]) {
              ((bm) this).field_D = ((bm) this).field_B;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!lp.field_a[81]) {
              ((bm) this).field_D = ((bm) this).field_B;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        int var6 = 0;
        et var8 = null;
        et var9 = null;
        this.a((byte) 126, param1, param2, param3);
        if (param0 > 13) {
          this.h(0);
          if (((bm) this).field_i == 1) {
            if (((bm) this).field_e instanceof et) {
              var9 = (et) ((bm) this).field_e;
              var6 = ((et) var9).a((ea) this, param3, param2, cf.field_g, 3, ic.field_b);
              if (-1 != var6) {
                if (((bm) this).field_G) {
                  if (var6 < ((bm) this).field_A) {
                    if (var6 <= ((bm) this).field_D) {
                      ((bm) this).field_B = var6;
                      ((bm) this).field_F = kh.a(-60);
                      return;
                    } else {
                      var6 = ((bm) this).field_A;
                      ((bm) this).field_B = var6;
                      ((bm) this).field_F = kh.a(-60);
                      return;
                    }
                  } else {
                    ((bm) this).field_B = var6;
                    ((bm) this).field_F = kh.a(-60);
                    return;
                  }
                } else {
                  ((bm) this).field_B = var6;
                  ((bm) this).field_F = kh.a(-60);
                  return;
                }
              } else {
                ((bm) this).field_F = kh.a(-60);
                return;
              }
            } else {
              ((bm) this).field_F = kh.a(-60);
              return;
            }
          } else {
            return;
          }
        } else {
          ((bm) this).field_B = -1;
          this.h(0);
          if (((bm) this).field_i == 1) {
            if (((bm) this).field_e instanceof et) {
              var8 = (et) ((bm) this).field_e;
              var6 = ((et) var8).a((ea) this, param3, param2, cf.field_g, 3, ic.field_b);
              if (-1 != var6) {
                if (((bm) this).field_G) {
                  if (var6 >= ((bm) this).field_A) {
                    ((bm) this).field_B = var6;
                    ((bm) this).field_F = kh.a(-60);
                    return;
                  } else {
                    L0: {
                      if (var6 > ((bm) this).field_D) {
                        var6 = ((bm) this).field_A;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    ((bm) this).field_B = var6;
                    ((bm) this).field_F = kh.a(-60);
                    return;
                  }
                } else {
                  ((bm) this).field_B = var6;
                  ((bm) this).field_F = kh.a(-60);
                  return;
                }
              } else {
                ((bm) this).field_F = kh.a(-60);
                return;
              }
            } else {
              ((bm) this).field_F = kh.a(-60);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void d(byte param0) {
        al var2 = null;
        if (param0 >= -33) {
          var2 = (al) null;
          rh discarded$2 = bm.a((byte) -72, (al) null);
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        } else {
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        }
    }

    private final void j(int param0) {
        if (param0 != -1) {
          L0: {
            ((bm) this).field_A = 14;
            if (((bm) this).field_o instanceof dr) {
              ((dr) ((bm) this).field_o).b((bm) this, -40);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((bm) this).field_o instanceof dr) {
              ((dr) ((bm) this).field_o).b((bm) this, -40);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var2 = ((bm) this).field_f.length();
        if (param0 == 0) {
          if (var2 != ((bm) this).field_B) {
            var3 = 1 + ((bm) this).field_B;
            L0: while (true) {
              if (var2 > var3) {
                if (((bm) this).field_f.charAt(-1 + var3) != 32) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return ((bm) this).field_B;
          }
        } else {
          return -109;
        }
    }

    final void f(byte param0) {
        ((bm) this).field_f = "";
        ((bm) this).field_B = 0;
        ((bm) this).field_D = 0;
        ((bm) this).g((byte) -75);
        if (param0 != -2) {
            ((bm) this).field_y = false;
        }
    }

    private final void i(int param0) {
        try {
            String var2 = null;
            if (param0 <= -98) {
              var2 = this.h((byte) 97);
              if (-1 > (var2.length() ^ -1)) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              ((bm) this).field_D = -50;
              var2 = this.h((byte) 97);
              if (-1 <= (var2.length() ^ -1)) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        L0: {
          if (((bm) this).field_H == 0) {
            break L0;
          } else {
            var3 = ((bm) this).field_H + -((bm) this).field_f.length();
            if (-1 <= var3) {
              return;
            } else {
              param0 = param0.substring(0, var3);
              break L0;
            }
          }
        }
        if (((bm) this).field_B != ((bm) this).field_f.length()) {
          ((bm) this).field_f = ((bm) this).field_f.substring(0, ((bm) this).field_B) + param0 + ((bm) this).field_f.substring(((bm) this).field_B, ((bm) this).field_f.length());
          if (param1 <= 120) {
            return;
          } else {
            ((bm) this).field_B = ((bm) this).field_B + param0.length();
            ((bm) this).field_D = ((bm) this).field_B;
            ((bm) this).g((byte) -75);
            return;
          }
        } else {
          ((bm) this).field_f = ((bm) this).field_f + param0;
          if (param1 <= 120) {
            return;
          } else {
            ((bm) this).field_B = ((bm) this).field_B + param0.length();
            ((bm) this).field_D = ((bm) this).field_B;
            ((bm) this).g((byte) -75);
            return;
          }
        }
    }

    private final String h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((bm) this).field_D >= ((bm) this).field_B) {
            stackOut_2_0 = ((bm) this).field_B;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((bm) this).field_D;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 <= 80) {
          L1: {
            ((bm) this).a((byte) 107, -41, -122, -11);
            if (((bm) this).field_D >= ((bm) this).field_B) {
              stackOut_10_0 = ((bm) this).field_D;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = ((bm) this).field_B;
              stackIn_11_0 = stackOut_9_0;
              break L1;
            }
          }
          var3 = stackIn_11_0;
          return ((bm) this).field_f.substring(var2, var3);
        } else {
          L2: {
            if (((bm) this).field_D >= ((bm) this).field_B) {
              stackOut_6_0 = ((bm) this).field_D;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = ((bm) this).field_B;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
          }
          var3 = stackIn_7_0;
          return ((bm) this).field_f.substring(var2, var3);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
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
        if (this.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
          if (((bm) this).field_e instanceof et) {
            L0: {
              var8_int = ((et) ((bm) this).field_e).a((ea) this, param1, param4, cf.field_g, param0 + -31, ic.field_b);
              stackOut_4_0 = this;
              stackOut_4_1 = 82;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (var8_int == -1) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = var8_int;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L0;
              }
            }
            L1: {
              this.a((byte) stackIn_7_1, stackIn_7_2);
              var8 = kh.a(param0 + -125);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if ((var8 + -((bm) this).field_E ^ -1L) <= -251L) {
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
            ((bm) this).field_G = stackIn_10_1 != 0;
            if (((bm) this).field_G) {
              ((bm) this).field_D = this.e((byte) 97);
              ((bm) this).field_B = this.k(0);
              if ((((bm) this).field_B ^ -1) < -1) {
                if (((bm) this).field_f.charAt(((bm) this).field_B + -1) == 32) {
                  ((bm) this).field_B = ((bm) this).field_B - 1;
                  ((bm) this).field_A = ((bm) this).field_B;
                  ((bm) this).field_E = var8;
                  return true;
                } else {
                  ((bm) this).field_A = ((bm) this).field_B;
                  ((bm) this).field_E = var8;
                  return true;
                }
              } else {
                ((bm) this).field_A = ((bm) this).field_B;
                ((bm) this).field_E = var8;
                return true;
              }
            } else {
              ((bm) this).field_E = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new ia();
        field_w = new int[4];
    }
}
