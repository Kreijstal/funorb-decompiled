/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rr {
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6537) {
            field_a = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                            param1.getAppletContext().showDocument(jf.a(param1, var2, -49), "_top");
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
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param0 > -39) {
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
                        field_a = (String) null;
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

    final static char a(char param0, byte param1) {
        int var2 = 0;
        java.applet.Applet var3 = null;
        if (param1 != -70) {
          var3 = (java.applet.Applet) null;
          rr.a((byte) 58, (java.applet.Applet) null);
          var2 = param0;
          if (32 != var2) {
            L0: {
              if ((var2 ^ -1) != -161) {
                if ((var2 ^ -1) == -96) {
                  break L0;
                } else {
                  if ((var2 ^ -1) == -46) {
                    break L0;
                  } else {
                    L1: {
                      if (91 != var2) {
                        if (var2 == 93) {
                          break L1;
                        } else {
                          if (var2 == -36) {
                            break L1;
                          } else {
                            L2: {
                              if (var2 == -225) {
                                break L2;
                              } else {
                                if (-226 != var2) {
                                  if (var2 != 226) {
                                    if (-229 != var2) {
                                      if (var2 == -228) {
                                        break L2;
                                      } else {
                                        if (-193 == var2) {
                                          break L2;
                                        } else {
                                          if ((var2 ^ -1) == -194) {
                                            break L2;
                                          } else {
                                            if (var2 == 194) {
                                              break L2;
                                            } else {
                                              if (196 != var2) {
                                                if (195 != var2) {
                                                  L3: {
                                                    if (232 != var2) {
                                                      if (var2 == 233) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 != -236) {
                                                            if (-201 == var2) {
                                                              break L3;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (var2 != 202) {
                                                                  if (var2 == 203) {
                                                                    break L3;
                                                                  } else {
                                                                    L4: {
                                                                      if (237 == var2) {
                                                                        break L4;
                                                                      } else {
                                                                        if (var2 == 238) {
                                                                          break L4;
                                                                        } else {
                                                                          if (-240 == var2) {
                                                                            break L4;
                                                                          } else {
                                                                            if (205 != var2) {
                                                                              if (-207 == var2) {
                                                                                break L4;
                                                                              } else {
                                                                                if (-208 == var2) {
                                                                                  break L4;
                                                                                } else {
                                                                                  L5: {
                                                                                    if (var2 == 242) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var2 == 243) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (244 == var2) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (-247 != var2) {
                                                                                            if (var2 == 245) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (210 != var2) {
                                                                                                if (211 != var2) {
                                                                                                  if (var2 != 212) {
                                                                                                    if (-215 != (var2 ^ -1)) {
                                                                                                      if (var2 != -214) {
                                                                                                        L6: {
                                                                                                          if (249 == var2) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (var2 != 250) {
                                                                                                              if (-252 != var2) {
                                                                                                                if (var2 == 252) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (217 != var2) {
                                                                                                                    if (-219 != var2) {
                                                                                                                      if (-220 != var2) {
                                                                                                                        if (-221 != (var2 ^ -1)) {
                                                                                                                          if (231 != var2) {
                                                                                                                            if ((var2 ^ -1) == -200) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (var2 != 255) {
                                                                                                                                if (var2 != -377) {
                                                                                                                                  L7: {
                                                                                                                                    if (241 == var2) {
                                                                                                                                      break L7;
                                                                                                                                    } else {
                                                                                                                                      if (-210 == var2) {
                                                                                                                                        break L7;
                                                                                                                                      } else {
                                                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                                        } else {
                                                                                                                                          return 'b';
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  return 'n';
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
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      } else {
                                                                                                        return 'o';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'o';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'o';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'o';
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                }
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  return 'e';
                                                                }
                                                              } else {
                                                                return 'e';
                                                              }
                                                            }
                                                          } else {
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                  return 'e';
                                                } else {
                                                  break L2;
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
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
                              }
                            }
                            return 'a';
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param0;
                  }
                }
              } else {
                break L0;
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param0;
          if (32 != var2) {
            if ((var2 ^ -1) != -161) {
              if ((var2 ^ -1) != -96) {
                if (var2 != -46) {
                  L8: {
                    if (91 != var2) {
                      if (var2 != 93) {
                        if (var2 == -36) {
                          break L8;
                        } else {
                          L9: {
                            if (var2 == -225) {
                              break L9;
                            } else {
                              if (-226 != var2) {
                                if (var2 != 226) {
                                  if (-229 != var2) {
                                    if (var2 == -228) {
                                      break L9;
                                    } else {
                                      if (-193 == var2) {
                                        break L9;
                                      } else {
                                        if ((var2 ^ -1) == -194) {
                                          break L9;
                                        } else {
                                          if (var2 == 194) {
                                            break L9;
                                          } else {
                                            if (196 != var2) {
                                              if (195 != var2) {
                                                L10: {
                                                  if (232 != var2) {
                                                    if (var2 == 233) {
                                                      break L10;
                                                    } else {
                                                      if (var2 == 234) {
                                                        break L10;
                                                      } else {
                                                        if (var2 != -236) {
                                                          if (-201 == var2) {
                                                            break L10;
                                                          } else {
                                                            if (var2 != 201) {
                                                              if (var2 != 202) {
                                                                if (var2 == 203) {
                                                                  break L10;
                                                                } else {
                                                                  L11: {
                                                                    if (237 == var2) {
                                                                      break L11;
                                                                    } else {
                                                                      if (var2 == 238) {
                                                                        break L11;
                                                                      } else {
                                                                        if (-240 == var2) {
                                                                          break L11;
                                                                        } else {
                                                                          if (205 != var2) {
                                                                            if (-207 == var2) {
                                                                              break L11;
                                                                            } else {
                                                                              if (-208 == var2) {
                                                                                break L11;
                                                                              } else {
                                                                                L12: {
                                                                                  if (var2 == 242) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    if (var2 == 243) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      if (244 == var2) {
                                                                                        break L12;
                                                                                      } else {
                                                                                        if (-247 != var2) {
                                                                                          if (var2 == 245) {
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (210 != var2) {
                                                                                              if (211 != var2) {
                                                                                                if (var2 != 212) {
                                                                                                  if (-215 != (var2 ^ -1)) {
                                                                                                    if (var2 != -214) {
                                                                                                      L13: {
                                                                                                        if (249 == var2) {
                                                                                                          break L13;
                                                                                                        } else {
                                                                                                          if (var2 != 250) {
                                                                                                            if (-252 != var2) {
                                                                                                              if (var2 == 252) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                if (217 != var2) {
                                                                                                                  if (-219 != var2) {
                                                                                                                    if (-220 != var2) {
                                                                                                                      if (-221 != (var2 ^ -1)) {
                                                                                                                        if (231 != var2) {
                                                                                                                          if ((var2 ^ -1) == -200) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (var2 != 255) {
                                                                                                                              if (var2 != -377) {
                                                                                                                                L14: {
                                                                                                                                  if (241 == var2) {
                                                                                                                                    break L14;
                                                                                                                                  } else {
                                                                                                                                    if (-210 == var2) {
                                                                                                                                      break L14;
                                                                                                                                    } else {
                                                                                                                                      if (-224 != (var2 ^ -1)) {
                                                                                                                                        return Character.toLowerCase(param0);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                return 'n';
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
                                                                                                                  break L13;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L13;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L13;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
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
                                                                                            } else {
                                                                                              break L12;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L12;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L11;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                break L10;
                                                              }
                                                            } else {
                                                              break L10;
                                                            }
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                return 'e';
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
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
                          }
                          return 'a';
                        }
                      } else {
                        return param0;
                      }
                    } else {
                      break L8;
                    }
                  }
                  return param0;
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

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            ac.field_d = param0;
            try {
                var3 = param2.getParameter("cookieprefix");
                if (param1 > -105) {
                    field_a = (String) null;
                }
                var4 = param2.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (!(0 != param0.length())) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                fe.a(param2, -7012, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            v.a(true, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$0 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$1 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_b = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_a = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$2 = var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$3 = new File(var0);
    }
}
