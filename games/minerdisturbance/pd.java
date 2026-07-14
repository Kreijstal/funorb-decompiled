/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    static ea field_a;
    private java.util.zip.Inflater field_c;
    static MinerDisturbance field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        if ((mn.field_x ^ -1) <= -1) {
          L0: {
            var3 = param1 - 135;
            var4 = -35 + param2;
            var5 = 256;
            if (75 <= mn.field_x) {
              break L0;
            } else {
              var5 = (mn.field_x << -732783256) / 75;
              break L0;
            }
          }
          L1: {
            if (-201 > (mn.field_x ^ -1)) {
              var5 = (-mn.field_x + 250 << -540592664) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            vb.a(nn.field_c, 127);
            dj.a();
            eh.d();
            oj.o(-1236579128);
            if (var5 > -257) {
              eh.b(0, 0, eh.field_g, eh.field_c, 0, 256 + -var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            tk.b(true);
            if (-151 <= mn.field_x) {
              bl.field_x.f(15 + var3, 10 + var4, var5);
              break L3;
            } else {
              nn.field_c.d(var3, var4);
              break L3;
            }
          }
          L4: {
            var6 = mn.field_x + -125;
            if (var6 >= -1) {
              break L4;
            } else {
              if (-51 <= var6) {
                break L4;
              } else {
                if (var6 >= 20) {
                  if (-31 < (var6 ^ -1)) {
                    lc.field_u.g(var3, var4, 256);
                    break L4;
                  } else {
                    var7 = (50 - var6) * 256 / 20;
                    lc.field_u.g(var3, var4, var7);
                    break L4;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  lc.field_u.g(var3, var4, var7);
                  break L4;
                }
              }
            }
          }
          L5: {
            if (param0 == 10853) {
              break L5;
            } else {
              pd.a(89, 110, 71, 81, 114, -10, -60, 118, 22, (byte) -120, -27, 90, 69, -93, 21, -7);
              break L5;
            }
          }
          L6: {
            var6 = -140 + mn.field_x;
            if ((var6 ^ -1) < -1) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              eg.field_b.f(var3 - -15, var4 - -10, var7 * var5 >> -1441514616);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(sb param0, boolean param1, byte[] param2) {
        try {
            if (param0.field_u[param0.field_o] == 31) {
                // if_icmpne L45
            } else {
                throw new RuntimeException("");
            }
            if (null == ((pd) this).field_c) {
                ((pd) this).field_c = new java.util.zip.Inflater(true);
            }
            try {
                ((pd) this).field_c.setInput(param0.field_u, param0.field_o + 10, param0.field_u.length + (-18 + -param0.field_o));
                int discarded$0 = ((pd) this).field_c.inflate(param2);
            } catch (Exception exception) {
                ((pd) this).field_c.reset();
                throw new RuntimeException("");
            }
            if (!param1) {
                Object var5 = null;
                boolean discarded$1 = pd.a((CharSequence) null, -19, false, (byte) -63);
            }
            ((pd) this).field_c.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != 117) {
            pd.a(34, -67, -113, -64, 55, -59, 121, -65, 67, (byte) -89, -110, -95, 58, 93, -30, -64);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = MinerDisturbance.field_ab;
          if (2 > param1) {
            break L0;
          } else {
            if (param1 > 36) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                if (param3 >= 48) {
                  break L1;
                } else {
                  var12 = null;
                  boolean discarded$1 = pd.a((CharSequence) null, -116, true, (byte) 7);
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param0.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param0.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (97 > var9) {
                      return false;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (param1 <= var9) {
                    return false;
                  } else {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var6 * param1 - -var9;
                    if (var6 == var10 / param1) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = MinerDisturbance.field_ab;
          if (param8 >= param13) {
            if (param8 >= param1) {
              if (param13 >= param1) {
                of.a(param5, -5190, param0, param6, param7, param3, param1, param8, param13, param11, param10, eh.field_f, param4, param12, param14, param15, param2);
                break L0;
              } else {
                of.a(param5, -5190, param14, param12, param7, param3, param13, param8, param1, param11, param2, eh.field_f, param15, param6, param0, param4, param10);
                break L0;
              }
            } else {
              of.a(param14, -5190, param5, param7, param12, param4, param13, param1, param8, param10, param2, eh.field_f, param15, param6, param0, param3, param11);
              break L0;
            }
          } else {
            if (param1 <= param13) {
              if (param1 <= param8) {
                of.a(param0, param9 + -5130, param5, param7, param6, param15, param1, param13, param8, param2, param10, eh.field_f, param4, param12, param14, param3, param11);
                break L0;
              } else {
                of.a(param0, param9 + -5130, param14, param12, param6, param15, param8, param13, param1, param2, param11, eh.field_f, param3, param7, param5, param4, param10);
                break L0;
              }
            } else {
              of.a(param14, param9 ^ 5246, param0, param6, param12, param4, param8, param1, param13, param10, param11, eh.field_f, param3, param7, param5, param15, param2);
              break L0;
            }
          }
        }
        L1: {
          if (param9 == -60) {
            break L1;
          } else {
            pd.a(-121, 90, -65, -124, -127, -119, 17, 110, 25, (byte) 107, -103, 4, 28, 90, 43, -66);
            break L1;
          }
        }
    }

    private pd(int param0, int param1, int param2) {
    }

    public pd() {
        this(-1, 1000000, 1000000);
    }

    final static int a(CharSequence param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = MinerDisturbance.field_ab;
          if (param3 < 2) {
            break L0;
          } else {
            if (36 < param3) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                if (param2) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param0.length();
              var8 = 0;
              L2: while (true) {
                if (var7 <= var8) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L3: {
                    var9 = param0.charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 >= var9) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param3 > var9) {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var6 * param3 - -var9;
                    if (var6 != var10 / param3) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    static {
    }
}
