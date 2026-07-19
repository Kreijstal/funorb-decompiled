/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_e;
    static boolean field_c;
    java.awt.Frame field_b;
    static dd field_a;
    static int field_d;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(sj param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              og.a(this.field_b, param0, 24442);
              if (param1 == -1) {
                break L1;
              } else {
                field_a = (dd) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("od.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "od.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(int param0) {
        if (param0 != 255) {
            return;
        }
        field_a = null;
    }

    od() {
    }

    final static long a(long param0, long param1, boolean param2) {
        long var5 = 0L;
        L0: {
          var5 = param1 * param0;
          if ((255L & var5 >> -2007386769 ^ -1L) == -1L) {
            var5 = var5 >> 16;
            break L0;
          } else {
            if (255L != (var5 >> -920856721 & 255L)) {
              var5 = (param0 >> 1303925256) * (param1 >> 195064840);
              break L0;
            } else {
              L1: {
                var5 = var5 >> 16;
                if (0L <= param0) {
                  break L1;
                } else {
                  if (param1 >= 0L) {
                    break L1;
                  } else {
                    if (var5 < 0L) {
                      throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                L3: {
                  L4: {
                    if (-1L <= (param0 ^ -1L)) {
                      break L4;
                    } else {
                      if ((param1 ^ -1L) > -1L) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (0L <= param0) {
                    break L2;
                  } else {
                    if (0L >= param1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-1L <= (var5 ^ -1L)) {
                  break L2;
                } else {
                  throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                }
              }
              if (!param2) {
                if (-1L > (param0 ^ -1L)) {
                  if (-1L > (param1 ^ -1L)) {
                    if (var5 < 0L) {
                      throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                    } else {
                      return var5;
                    }
                  } else {
                    return var5;
                  }
                } else {
                  return var5;
                }
              } else {
                return 61L;
              }
            }
          }
        }
        if (0L > param0) {
          if (param1 < 0L) {
            if (var5 >= 0L) {
              L5: {
                L6: {
                  L7: {
                    if (-1L <= (param0 ^ -1L)) {
                      break L7;
                    } else {
                      if ((param1 ^ -1L) > -1L) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (0L <= param0) {
                    break L5;
                  } else {
                    if (0L >= param1) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (-1L <= (var5 ^ -1L)) {
                  break L5;
                } else {
                  throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                }
              }
              if (!param2) {
                if (-1L > (param0 ^ -1L)) {
                  if (-1L > (param1 ^ -1L)) {
                    if (var5 >= 0L) {
                      return var5;
                    } else {
                      throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                    }
                  } else {
                    return var5;
                  }
                } else {
                  return var5;
                }
              } else {
                return 61L;
              }
            } else {
              throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
            }
          } else {
            L8: {
              if (-1L <= (param0 ^ -1L)) {
                if (0L <= param0) {
                  break L8;
                } else {
                  if (0L >= param1) {
                    break L8;
                  } else {
                    if (-1L <= (var5 ^ -1L)) {
                      if (!param2) {
                        if (-1L > (param0 ^ -1L)) {
                          if (-1L > (param1 ^ -1L)) {
                            if (var5 < 0L) {
                              throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                            } else {
                              return var5;
                            }
                          } else {
                            return var5;
                          }
                        } else {
                          return var5;
                        }
                      } else {
                        return 61L;
                      }
                    } else {
                      throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                    }
                  }
                }
              } else {
                if ((param1 ^ -1L) > -1L) {
                  if (-1L <= (var5 ^ -1L)) {
                    break L8;
                  } else {
                    throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                  }
                } else {
                  L9: {
                    if (0L <= param0) {
                      break L9;
                    } else {
                      if (0L >= param1) {
                        break L9;
                      } else {
                        if (-1L <= (var5 ^ -1L)) {
                          break L9;
                        } else {
                          throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                        }
                      }
                    }
                  }
                  if (!param2) {
                    if (-1L > (param0 ^ -1L)) {
                      if (-1L > (param1 ^ -1L)) {
                        if (var5 < 0L) {
                          throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                        } else {
                          return var5;
                        }
                      } else {
                        return var5;
                      }
                    } else {
                      return var5;
                    }
                  } else {
                    return 61L;
                  }
                }
              }
            }
            if (!param2) {
              if (-1L > (param0 ^ -1L)) {
                if (-1L > (param1 ^ -1L)) {
                  if (var5 < 0L) {
                    throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                  } else {
                    return var5;
                  }
                } else {
                  return var5;
                }
              } else {
                return var5;
              }
            } else {
              return 61L;
            }
          }
        } else {
          L10: {
            if (-1L <= (param0 ^ -1L)) {
              if (0L <= param0) {
                break L10;
              } else {
                if (0L >= param1) {
                  break L10;
                } else {
                  if (-1L <= (var5 ^ -1L)) {
                    if (!param2) {
                      if (-1L > (param0 ^ -1L)) {
                        if (-1L > (param1 ^ -1L)) {
                          if (var5 < 0L) {
                            throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                          } else {
                            return var5;
                          }
                        } else {
                          return var5;
                        }
                      } else {
                        return var5;
                      }
                    } else {
                      return 61L;
                    }
                  } else {
                    throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                  }
                }
              }
            } else {
              if ((param1 ^ -1L) > -1L) {
                if (-1L <= (var5 ^ -1L)) {
                  break L10;
                } else {
                  throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                }
              } else {
                L11: {
                  if (0L <= param0) {
                    break L11;
                  } else {
                    if (0L >= param1) {
                      break L11;
                    } else {
                      if (-1L <= (var5 ^ -1L)) {
                        break L11;
                      } else {
                        throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                      }
                    }
                  }
                }
                if (!param2) {
                  if (-1L > (param0 ^ -1L)) {
                    if (-1L > (param1 ^ -1L)) {
                      if (var5 < 0L) {
                        throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                      } else {
                        return var5;
                      }
                    } else {
                      return var5;
                    }
                  } else {
                    return var5;
                  }
                } else {
                  return 61L;
                }
              }
            }
          }
          if (!param2) {
            if (-1L > (param0 ^ -1L)) {
              if (-1L > (param1 ^ -1L)) {
                if (var5 < 0L) {
                  throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param1 + "[" + cr.a((byte) 89, param1) + ", " + Long.toString(param1, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
                } else {
                  return var5;
                }
              } else {
                return var5;
              }
            } else {
              return var5;
            }
          } else {
            return 61L;
          }
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          field_c = true;
          tn.field_n.d(new nr(), 30);
          return;
        } else {
          tn.field_n.d(new nr(), 30);
          return;
        }
    }

    static {
        field_d = -1;
    }
}
