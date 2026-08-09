/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ug {
    int field_e;
    static String field_j;
    static int field_f;
    static int field_i;
    byte[] field_g;
    static int field_h;

    final static void f(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var1;
        int var2;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (mb.field_e.a((byte) -117) != null) {
          var1 = qc.field_N;
          if (var1 == 0) {
            em.field_B = em.field_B - 1;
            if (-ii.field_B + -10 + 480 >= em.field_B) {
              qc.field_N = 1;
              s.field_O = 0;
              if (var2 != 0) {
                fieldTemp$0 = s.field_O;
                s.field_O = s.field_O + 1;
                if (fieldTemp$0 > 150) {
                  L0: {
                    qc.field_N = 2;
                    if (var2 == 0) {
                      break L0;
                    } else {
                      fieldTemp$1 = em.field_B;
                      em.field_B = em.field_B + 1;
                      if (480 >= fieldTemp$1) {
                        break L0;
                      } else {
                        mb.field_e.d(4011);
                        ke.b(8192);
                        if (param0 > 125) {
                          return;
                        } else {
                          mk.a(99);
                          return;
                        }
                      }
                    }
                  }
                  if (param0 > 125) {
                    return;
                  } else {
                    mk.a(99);
                    return;
                  }
                } else {
                  if (param0 > 125) {
                    return;
                  } else {
                    mk.a(99);
                    return;
                  }
                }
              } else {
                if (param0 > 125) {
                  return;
                } else {
                  mk.a(99);
                  return;
                }
              }
            } else {
              if (param0 <= 125) {
                mk.a(99);
                return;
              } else {
                return;
              }
            }
          } else {
            L1: {
              L2: {
                if (-2 == (var1 ^ -1)) {
                  fieldTemp$2 = s.field_O;
                  s.field_O = s.field_O + 1;
                  if (fieldTemp$2 > 150) {
                    qc.field_N = 2;
                    if (var2 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    if (param0 > 125) {
                      return;
                    } else {
                      mk.a(99);
                      return;
                    }
                  }
                } else {
                  if (-3 == (var1 ^ -1)) {
                    if (var2 == 0) {
                      break L2;
                    } else {
                      em.field_B = em.field_B - 1;
                      if (-ii.field_B + -10 + 480 >= em.field_B) {
                        qc.field_N = 1;
                        s.field_O = 0;
                        if (var2 != 0) {
                          fieldTemp$3 = s.field_O;
                          s.field_O = s.field_O + 1;
                          if (fieldTemp$3 > 150) {
                            L3: {
                              qc.field_N = 2;
                              if (var2 == 0) {
                                break L3;
                              } else {
                                fieldTemp$4 = em.field_B;
                                em.field_B = em.field_B + 1;
                                if (480 >= fieldTemp$4) {
                                  break L3;
                                } else {
                                  mb.field_e.d(4011);
                                  ke.b(8192);
                                  if (param0 <= 125) {
                                    mk.a(99);
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                            if (param0 <= 125) {
                              mk.a(99);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param0 <= 125) {
                              mk.a(99);
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          if (param0 <= 125) {
                            mk.a(99);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (param0 <= 125) {
                          mk.a(99);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (param0 <= 125) {
                      mk.a(99);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              fieldTemp$5 = em.field_B;
              em.field_B = em.field_B + 1;
              if (480 >= fieldTemp$5) {
                break L1;
              } else {
                mb.field_e.d(4011);
                ke.b(8192);
                if (param0 > 125) {
                  return;
                } else {
                  mk.a(99);
                  return;
                }
              }
            }
            if (param0 > 125) {
              return;
            } else {
              mk.a(99);
              return;
            }
          }
        } else {
          if (param0 <= 125) {
            mk.a(99);
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 8134) {
            return;
        }
        field_j = null;
    }

    final static String e(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        if (!(cf.field_b != ch.field_d)) {
            return ac.field_c;
        }
        return wk.field_d;
    }

    private mk() throws Throwable {
        throw new Error();
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3;
        long var4;
        long var7;
        int var9;
        int var10;
        int var11;
        StringBuilder var12;
        StringBuilder var13;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if ((param0 ^ -1L) < -1L) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if (0L != param0 % 37L) {
              if (param1 != 480) {
                mk.e(-14);
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  L1: {
                    if (0L == var4) {
                      break L1;
                    } else {
                      var3++;
                      var4 = var4 / 37L;
                      if (var11 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var12 = new StringBuilder(var3);
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (param0 == 0L) {
                          break L4;
                        } else {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = sc.field_a[(int)(-(param0 * 37L) + var7)];
                          if (var11 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (var9 == 95) {
                                var10 = -1 + var12.length();
                                var9 = 160;
                                var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            discarded$2 = var12.append((char) var9);
                            if (var11 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var12.reverse();
                      var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                      break L3;
                    }
                    return var12.toString();
                  }
                }
              } else {
                var3 = 0;
                var4 = param0;
                L6: while (true) {
                  L7: {
                    if (0L == var4) {
                      break L7;
                    } else {
                      var3++;
                      var4 = var4 / 37L;
                      if (var11 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var13 = new StringBuilder(var3);
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (param0 == 0L) {
                          break L10;
                        } else {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = sc.field_a[(int)(-(param0 * 37L) + var7)];
                          if (var11 != 0) {
                            break L9;
                          } else {
                            L11: {
                              if (var9 == 95) {
                                var10 = -1 + var13.length();
                                var9 = 160;
                                var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            discarded$3 = var13.append((char) var9);
                            if (var11 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      var13.reverse();
                      var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                      break L9;
                    }
                    return var13.toString();
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            kd.field_e = param0;
            try {
                var3 = param2.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (0 == param0.length()) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                mf.a(true, param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            if (param1 != -5) {
                return;
            }
            try {
                tf.a((byte) -85, param2);
            } catch (RuntimeException runtimeException) {
                throw la.a((Throwable) ((Object) runtimeException), "mk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_j = "Welcome to Monkey Puzzle 2. To read these instructions in-game, press <img=4> and select 'Instructions' from the pause menu.<br><br><shad=6767667>Story<br></shad>Deep in the jungle, the great explorer, Farnsworth, is up some creek without a paddle. The waters are rising and the locals will only throw him a line if he gets rid of the monkeys from the branches above. Fortunately, he has a catapult, lots of nuts and a good eye for monkey-hide.<br><br><shad=6767667>Controls<br></shad>Use the <img=0> and <img=1> keys to aim. Press the <img=3> bar or <img=5> to fire coconuts.";
    }
}
