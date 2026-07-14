/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tl implements Runnable {
    private java.net.URL field_h;
    private int field_a;
    static nh field_k;
    private pn field_g;
    static cn field_i;
    static String[] field_e;
    static String field_c;
    private DataInputStream field_o;
    private ec field_j;
    private pn field_b;
    static String[] field_m;
    private qg field_f;
    private pn field_n;
    static boolean field_l;
    static boolean field_d;

    final static char a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 != -69) {
          field_c = null;
          var2 = param1;
          if (-33 != var2) {
            L0: {
              if (-161 == var2) {
                break L0;
              } else {
                if (95 == var2) {
                  break L0;
                } else {
                  if (var2 != 45) {
                    L1: {
                      if (var2 != -92) {
                        if (93 == var2) {
                          break L1;
                        } else {
                          if (-36 != var2) {
                            L2: {
                              if (var2 != 224) {
                                if (-226 != var2) {
                                  if (-227 != var2) {
                                    if (var2 != -229) {
                                      if (-228 == var2) {
                                        break L2;
                                      } else {
                                        if (192 != var2) {
                                          if (193 != var2) {
                                            if ((var2 ^ -1) == -195) {
                                              break L2;
                                            } else {
                                              if (196 != var2) {
                                                if (195 == var2) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (var2 != 232) {
                                                      if ((var2 ^ -1) != -234) {
                                                        if ((var2 ^ -1) != -235) {
                                                          if (var2 == -236) {
                                                            break L3;
                                                          } else {
                                                            if (-201 != var2) {
                                                              if (201 == var2) {
                                                                break L3;
                                                              } else {
                                                                if (202 != var2) {
                                                                  if (var2 != 203) {
                                                                    L4: {
                                                                      if (-238 != (var2 ^ -1)) {
                                                                        if ((var2 ^ -1) != -239) {
                                                                          if (var2 != 239) {
                                                                            if (var2 != -206) {
                                                                              if (-207 != var2) {
                                                                                if (207 == var2) {
                                                                                  break L4;
                                                                                } else {
                                                                                  if (var2 != 242) {
                                                                                    if ((var2 ^ -1) != -244) {
                                                                                      L5: {
                                                                                        if (var2 == -245) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (246 != var2) {
                                                                                            if (-246 != var2) {
                                                                                              if (210 == var2) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if ((var2 ^ -1) == -212) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (212 == var2) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 != -215) {
                                                                                                      if (var2 != 213) {
                                                                                                        if (-250 != var2) {
                                                                                                          if (250 != var2) {
                                                                                                            if (-252 != (var2 ^ -1)) {
                                                                                                              if (252 != var2) {
                                                                                                                if (var2 != -218) {
                                                                                                                  L6: {
                                                                                                                    if (-219 == var2) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (219 != var2) {
                                                                                                                        if (var2 == 220) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          if (-232 != var2) {
                                                                                                                            if (-200 == var2) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (-256 != var2) {
                                                                                                                                if (-377 != var2) {
                                                                                                                                  if (241 != var2) {
                                                                                                                                    if ((var2 ^ -1) == -210) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (223 != var2) {
                                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  return 'u';
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'o';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'o';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              return 'o';
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      return 'o';
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                return 'i';
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          } else {
                                                                            break L4;
                                                                          }
                                                                        } else {
                                                                          break L4;
                                                                        }
                                                                      } else {
                                                                        break L4;
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          break L3;
                                                        }
                                                      } else {
                                                        break L3;
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            if (-161 != (var2 ^ -1)) {
              if (95 != var2) {
                if (var2 != 45) {
                  L7: {
                    if ((var2 ^ -1) != -92) {
                      if (93 != var2) {
                        if (-36 != var2) {
                          L8: {
                            if (var2 != 224) {
                              if (-226 != var2) {
                                if (-227 != (var2 ^ -1)) {
                                  if (var2 != -229) {
                                    if (-228 == var2) {
                                      break L8;
                                    } else {
                                      if (192 != var2) {
                                        if (193 != var2) {
                                          if ((var2 ^ -1) == -195) {
                                            break L8;
                                          } else {
                                            if (196 != var2) {
                                              if (195 == var2) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (var2 != 232) {
                                                    if ((var2 ^ -1) != -234) {
                                                      if ((var2 ^ -1) != -235) {
                                                        if (var2 == -236) {
                                                          break L9;
                                                        } else {
                                                          if (-201 != var2) {
                                                            if (201 == var2) {
                                                              break L9;
                                                            } else {
                                                              if (202 != var2) {
                                                                if (var2 != 203) {
                                                                  L10: {
                                                                    if (-238 != (var2 ^ -1)) {
                                                                      if ((var2 ^ -1) != -239) {
                                                                        if (var2 != 239) {
                                                                          if (var2 != -206) {
                                                                            if (-207 != var2) {
                                                                              if (207 == var2) {
                                                                                break L10;
                                                                              } else {
                                                                                L11: {
                                                                                  if (var2 != 242) {
                                                                                    if ((var2 ^ -1) != -244) {
                                                                                      if (var2 == -245) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if (246 != var2) {
                                                                                          if (-246 != var2) {
                                                                                            if (210 == var2) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if ((var2 ^ -1) == -212) {
                                                                                                break L11;
                                                                                              } else {
                                                                                                if (212 == var2) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if (var2 != -215) {
                                                                                                    if (var2 != 213) {
                                                                                                      L12: {
                                                                                                        if (-250 != var2) {
                                                                                                          if (250 != var2) {
                                                                                                            if (-252 != (var2 ^ -1)) {
                                                                                                              if (252 != var2) {
                                                                                                                if (var2 != -218) {
                                                                                                                  if (-219 == var2) {
                                                                                                                    break L12;
                                                                                                                  } else {
                                                                                                                    if (219 != var2) {
                                                                                                                      if (var2 == 220) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (-232 != var2) {
                                                                                                                          if (-200 == var2) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (-256 != var2) {
                                                                                                                              if (-377 != var2) {
                                                                                                                                if (241 != var2) {
                                                                                                                                  if ((var2 ^ -1) == -210) {
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    if (223 != var2) {
                                                                                                                                      return Character.toLowerCase(param1);
                                                                                                                                    } else {
                                                                                                                                      return 'b';
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L12;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L12;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L12;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L12;
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      break L11;
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L11;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L11;
                                                                                          }
                                                                                        } else {
                                                                                          break L11;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  } else {
                                                                                    break L11;
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              break L10;
                                                                            }
                                                                          } else {
                                                                            break L10;
                                                                          }
                                                                        } else {
                                                                          break L10;
                                                                        }
                                                                      } else {
                                                                        break L10;
                                                                      }
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L9;
                                                                }
                                                              } else {
                                                                break L9;
                                                              }
                                                            }
                                                          } else {
                                                            break L9;
                                                          }
                                                        }
                                                      } else {
                                                        break L9;
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                                return 'e';
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          return 'a';
                        } else {
                          break L7;
                        }
                      } else {
                        return param1;
                      }
                    } else {
                      break L7;
                    }
                  }
                  return param1;
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    final ec c(int param0) {
        if (((tl) this).field_a != param0) {
            return null;
        }
        return ((tl) this).field_j;
    }

    public static void a(byte param0) {
        field_k = null;
        field_c = null;
        field_e = null;
        field_i = null;
        field_m = null;
        if (param0 != 50) {
            field_i = null;
        }
    }

    protected final void finalize() {
        if (!(null == ((tl) this).field_g)) {
            if (((tl) this).field_g.field_f != null) {
                try {
                    ((DataInputStream) ((tl) this).field_g.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((tl) this).field_g = null;
        }
        if (!(null == ((tl) this).field_n)) {
            if (null != ((tl) this).field_n.field_f) {
                try {
                    ((java.net.Socket) ((tl) this).field_n.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((tl) this).field_n = null;
        }
        if (null != ((tl) this).field_o) {
            try {
                ((tl) this).field_o.close();
            } catch (Exception exception) {
            }
            ((tl) this).field_o = null;
        }
        ((tl) this).field_b = null;
    }

    final static void a(int param0) {
        if (!(sp.field_c == null)) {
            sp.field_c.c(-6624);
            sp.field_c = null;
        }
        int var1 = 17 / ((param0 - 42) / 58);
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = DungeonAssault.field_K;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((tl) this).field_j.field_m.length <= ((tl) this).field_j.field_o) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((tl) this).field_o.read(((tl) this).field_j.field_m, ((tl) this).field_j.field_o, -((tl) this).field_j.field_o + ((tl) this).field_j.field_m.length);
                            if (-1 < (var1_int ^ -1)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((tl) this).field_j.field_o = ((tl) this).field_j.field_o + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((tl) this).field_j.field_m.length == ((tl) this).field_j.field_o) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((tl) this).field_j.field_m.length + " " + ((tl) this).field_h);
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((tl) this).finalize();
                            ((tl) this).field_a = 3;
                            // monitorexit var1
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((tl) this).finalize();
                            ((tl) this).field_a = ((tl) this).field_a + 1;
                            // monitorexit var2_ref
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return;
                    }
                    case 16: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 18: {
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

    final synchronized boolean d(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((tl) this).field_a >= 2) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    if (0 == ((tl) this).field_a) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null != ((tl) this).field_g) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((tl) this).field_g = ((tl) this).field_f.a(-18, ((tl) this).field_h);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((tl) this).field_g.field_c == 0) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    if (((tl) this).field_g.field_c == -2) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((tl) this).field_g = null;
                    ((tl) this).field_a = ((tl) this).field_a + 1;
                    return false;
                }
                case 12: {
                    if (-2 == ((tl) this).field_a) {
                        statePc = 14;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null != ((tl) this).field_n) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((tl) this).field_n = ((tl) this).field_f.a(-114, 443, ((tl) this).field_h.getHost());
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((tl) this).field_n.field_c != 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return false;
                }
                case 18: {
                    if ((((tl) this).field_n.field_c ^ -1) != -2) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((tl) this).field_n = null;
                    ((tl) this).field_a = ((tl) this).field_a + 1;
                    return false;
                }
                case 21: {
                    if (null != ((tl) this).field_o) {
                        statePc = 41;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (((tl) this).field_a == 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((tl) this).field_o = (DataInputStream) ((tl) this).field_g.field_f;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (1 == ((tl) this).field_a) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4 = (java.net.Socket) ((tl) this).field_n.field_f;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((tl) this).field_h.getFile() + "\n\n");
                        var3.write(n.a(var5, -14553));
                        ((tl) this).field_o = new DataInputStream(var4.getInputStream());
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((tl) this).field_j.field_o = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    if (((tl) this).field_b != null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ((tl) this).field_b = ((tl) this).field_f.a(-21432, 5, (Runnable) this);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (0 == ((tl) this).field_b.field_c) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return false;
                }
                case 34: {
                    if (1 != ((tl) this).field_b.field_c) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((tl) this).finalize();
                    ((tl) this).field_a = ((tl) this).field_a + 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (param0 > 13) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((tl) this).finalize();
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return false;
                }
                case 40: {
                    var2 = (IOException) (Object) caughtException;
                    ((tl) this).finalize();
                    ((tl) this).field_a = ((tl) this).field_a + 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (((tl) this).field_b != null) {
                        statePc = 52;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((tl) this).field_b = ((tl) this).field_f.a(-21432, 5, (Runnable) this);
                    if (0 == ((tl) this).field_b.field_c) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return false;
                }
                case 45: {
                    if (1 != ((tl) this).field_b.field_c) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((tl) this).finalize();
                    ((tl) this).field_a = ((tl) this).field_a + 1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (param0 > 13) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ((tl) this).finalize();
                    return false;
                }
                case 50: {
                    return false;
                }
                case 52: {
                    if (0 == ((tl) this).field_b.field_c) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return false;
                }
                case 55: {
                    if (1 != ((tl) this).field_b.field_c) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ((tl) this).finalize();
                    ((tl) this).field_a = ((tl) this).field_a + 1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (param0 <= 13) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    return false;
                }
                case 60: {
                    ((tl) this).finalize();
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    tl(qg param0, java.net.URL param1, int param2) {
        ((tl) this).field_h = param1;
        ((tl) this).field_f = param0;
        ((tl) this).field_j = new ec(param2);
    }

    final static String b(int param0) {
        if ((dk.field_c ^ -1) > param0) {
            return to.field_g;
        }
        if (ia.field_U != null) {
            if (!(ia.field_U.a(-14354))) {
                return ec.field_r;
            }
            return ki.field_c;
        }
        if (!fi.field_u.a(-14354)) {
            return qk.field_c;
        }
        if (!fi.field_u.a(false, "commonui")) {
            return sa.field_w + " - " + fi.field_u.b("commonui", -1) + "%";
        }
        if (!kg.field_b.a(param0 ^ 14355)) {
            return rf.field_L;
        }
        if (!kg.field_b.a(false, "commonui")) {
            return mp.field_c + " - " + kg.field_b.b("commonui", param0 ^ 2) + "%";
        }
        if (!ib.field_b.a(param0 + -14351)) {
            return fg.field_m;
        }
        if (!(ib.field_b.a((byte) 59))) {
            return kj.field_m + " - " + ib.field_b.b(100) + "%";
        }
        return p.field_K;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_m = new String[]{"Modifiers", "Some things are capable of changing the skill levels of your raider, or a dungeon room. If any of these effects are present on a raider or room, a symbol will be displayed in the corner of its portrait. A <col=00FF00>green</col> symbol means a skill level has <col=00FF00>increased</col>; a <col=FF0000>red</col> symbol indicates a skill level has <col=FF0000>decreased</col>. There are also other symbols you will encounter.<br><br><%command>Continue moving your party towards the hoard room.</col>"};
        field_c = "You must have charged <%0> Orb of Mastery in total to earn the title of <%1>.";
        field_l = true;
    }
}
