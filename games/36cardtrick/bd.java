/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends g implements qh {
    static kc field_H;
    private hl[] field_G;
    private wi field_D;
    private String[] field_E;
    static int field_F;

    final static void d(byte param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == e.field_e) {
                break L0;
              } else {
                try {
                  L1: {
                    e.field_e.a(0L, 10);
                    e.field_e.a(rd.field_j.field_g, rd.field_j.field_i, 24, -1);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  L3: {
                    if (param0 <= -59) {
                      break L3;
                    } else {
                      field_F = -108;
                      break L3;
                    }
                  }
                  rd.field_j.field_i = rd.field_j.field_i + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            if (param0 > -59) {
              field_F = -108;
              rd.field_j.field_i = rd.field_j.field_i + 24;
              return;
            } else {
              rd.field_j.field_i = rd.field_j.field_i + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        var6 = -59 % ((param1 - -62) / 32);
        var7 = 0;
        L0: while (true) {
          if (((bd) this).field_E.length <= var7) {
            L1: {
              if (((bd) this).field_G[((bd) this).field_E.length] == param3) {
                ((bd) this).field_D.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            if (((bd) this).field_G[var7] != param3) {
              var7++;
              var7++;
              continue L0;
            } else {
              ((bd) this).field_D.a(((bd) this).field_E[var7], true);
              var7++;
              continue L0;
            }
          }
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        var9 = Main.field_T;
        var14 = new char[param3];
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var4 = var10;
        var5 = 0;
        if (param0 != 255) {
          L0: {
            field_H = null;
            var6 = 0;
            if (param3 <= var6) {
              break L0;
            } else {
              L1: {
                var7 = 255 & param2[var6 + param1];
                if (var7 == 0) {
                  var6++;
                  break L1;
                } else {
                  L2: {
                    if (var7 < 128) {
                      break L2;
                    } else {
                      if (var7 < 160) {
                        L3: {
                          var8 = se.field_K[var7 + -128];
                          if (0 == var8) {
                            var8 = 63;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var7 = var8;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  int incrementValue$2 = var5;
                  var5++;
                  var10[incrementValue$2] = (char)var7;
                  break L1;
                }
              }
              var6++;
              var6++;
              var6++;
              break L0;
            }
          }
          return new String(var14, 0, var5);
        } else {
          var6 = 0;
          L4: while (true) {
            if (param3 <= var6) {
              return new String(var14, 0, var5);
            } else {
              var7 = 255 & param2[var6 + param1];
              if (var7 != 0) {
                L5: {
                  if (var7 < 128) {
                    break L5;
                  } else {
                    if (var7 < 160) {
                      L6: {
                        var8 = se.field_K[var7 + -128];
                        if (0 == var8) {
                          var8 = 63;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7 = var8;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                int incrementValue$3 = var5;
                var5++;
                var10[incrementValue$3] = (char)var7;
                var6++;
                continue L4;
              } else {
                var6++;
                continue L4;
              }
            }
          }
        }
    }

    public static void l(int param0) {
        if (param0 != -10790) {
            field_F = -70;
            field_H = null;
            return;
        }
        field_H = null;
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        Object var6 = null;
        if (!super.a(param0, (byte) -116, param2, param3)) {
          if ((param2 ^ -1) != -99) {
            if (param1 < -99) {
              if (-100 == param2) {
                return ((bd) this).a(param3, (byte) -28);
              } else {
                return false;
              }
            } else {
              var6 = null;
              String discarded$5 = bd.a(101, 70, (byte[]) null, 118);
              if (-100 == param2) {
                return ((bd) this).a(param3, (byte) -28);
              } else {
                return false;
              }
            }
          } else {
            return ((bd) this).b(121, param3);
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ee var5 = null;
        Object var6 = null;
        super.a(param0, param1, param2 ^ 0, param3);
        if (param3 == 0) {
          var5 = j.field_C;
          if (((bd) this).field_E == null) {
            if (param2 != -1) {
              var6 = null;
              boolean discarded$34 = ((bd) this).a('', (byte) 54, 78, (lk) null);
              return;
            } else {
              return;
            }
          } else {
            int discarded$35 = var5.a(cb.field_h, param0 + ((bd) this).field_o, param1 + ((bd) this).field_i, ((bd) this).field_h, 20, 16777215, -1, 0, 0, var5.field_s - -var5.field_x);
            if (param2 == -1) {
              return;
            } else {
              var6 = null;
              boolean discarded$36 = ((bd) this).a('', (byte) 54, 78, (lk) null);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static int a(boolean param0, CharSequence param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        if (-3 >= (param3 ^ -1)) {
          if (-37 <= (param3 ^ -1)) {
            var4 = 0;
            if (param2 == 122) {
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L0: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L1: {
                    var9 = param1.charAt(var8);
                    if (0 == var8) {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param0) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (var9 < 48) {
                        break L3;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (65 > var9) {
                        break L4;
                      } else {
                        if (var9 > 90) {
                          break L4;
                        } else {
                          var9 -= 55;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (97 > var9) {
                        break L5;
                      } else {
                        if (122 >= var9) {
                          var9 -= 87;
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 < param3) {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var9 = -var9;
                        break L6;
                      }
                    }
                    var10 = param3 * var6 - -var9;
                    if (var6 != var10 / param3) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            } else {
              bd.d((byte) -54);
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L7: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L8: {
                    var9 = param1.charAt(var8);
                    if (0 == var8) {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param0) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L7;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      if (var9 < 48) {
                        break L10;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (65 > var9) {
                        break L11;
                      } else {
                        if (var9 > 90) {
                          break L11;
                        } else {
                          var9 -= 55;
                          break L9;
                        }
                      }
                    }
                    L12: {
                      if (97 > var9) {
                        break L12;
                      } else {
                        if (122 >= var9) {
                          var9 -= 87;
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 < param3) {
                    L13: {
                      if (var4 == 0) {
                        break L13;
                      } else {
                        var9 = -var9;
                        break L13;
                      }
                    }
                    var10 = param3 * var6 - -var9;
                    if (var6 != var10 / param3) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param3);
          }
        } else {
          throw new IllegalArgumentException("" + param3);
        }
    }

    bd(wi param0) {
        super(0, 0, 0, 0, (ci) null);
        ((bd) this).field_D = param0;
    }

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        nb var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        ((bd) this).field_z.c(29026);
        if (param0 < -101) {
          if (param1 != null) {
            if (0 == param1.length) {
              ((bd) this).field_E = null;
              return;
            } else {
              var3 = param1.length;
              ((bd) this).field_E = new String[var3];
              var4_int = 0;
              L0: while (true) {
                if (var3 <= var4_int) {
                  var4 = new nb(j.field_C, 0, 1);
                  ((bd) this).field_G = new hl[1 + var3];
                  var5 = 0;
                  L1: while (true) {
                    if (var3 <= var5) {
                      ((bd) this).field_G[var3] = new hl(sh.field_f, (pl) this);
                      ((bd) this).field_G[var3].field_v = (ci) (Object) var4;
                      ((bd) this).field_G[var3].a(15, 36 - -(var3 * 16), 100, 0, true);
                      ((bd) this).b((lk) (Object) ((bd) this).field_G[var3], (byte) 118);
                      return;
                    } else {
                      ((bd) this).field_G[var5] = new hl(((bd) this).field_E[var5], (pl) this);
                      ((bd) this).field_G[var5].field_v = (ci) (Object) var4;
                      ((bd) this).field_G[var5].field_n = lb.field_e;
                      ((bd) this).field_G[var5].a(15, var5 * 16 + 20, 80, 0, true);
                      ((bd) this).b((lk) (Object) ((bd) this).field_G[var5], (byte) 118);
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  ((bd) this).field_E[var4_int] = hg.a((CharSequence) (Object) param1[var4_int], (byte) 115).replace(' ', ' ');
                  var4_int++;
                  continue L0;
                }
              }
            }
          } else {
            ((bd) this).field_E = null;
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
