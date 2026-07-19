/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends dg {
    static int field_B;
    static int field_A;
    static volatile boolean field_F;
    static String field_D;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 >= 36) {
                        break L2;
                      } else {
                        field_F = false;
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    param1.getAppletContext().showDocument(lk.a(param1, var2, -110), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("of.S(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static char a(int param0, char param1) {
        String discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        CharSequence var4 = null;
        L0: {
          var3 = stellarshard.field_B;
          if (param0 < -109) {
            break L0;
          } else {
            var4 = (CharSequence) null;
            discarded$1 = of.a((CharSequence) null, (byte) -65);
            break L0;
          }
        }
        var2 = param1;
        if (-33 != (var2 ^ -1)) {
          L1: {
            if (160 != var2) {
              break L1;
            } else {
              if (var3 != 0) {
                break L1;
              } else {
                return '_';
              }
            }
          }
          L2: {
            if ((var2 ^ -1) != -96) {
              break L2;
            } else {
              if (var3 != 0) {
                break L2;
              } else {
                return '_';
              }
            }
          }
          L3: {
            if (45 != var2) {
              break L3;
            } else {
              if (var3 != 0) {
                break L3;
              } else {
                return '_';
              }
            }
          }
          if (var2 != 91) {
            L4: {
              if (93 != var2) {
                break L4;
              } else {
                if (var3 != 0) {
                  break L4;
                } else {
                  return param1;
                }
              }
            }
            if (35 != var2) {
              L5: {
                if ((var2 ^ -1) != -225) {
                  break L5;
                } else {
                  if (var3 != 0) {
                    break L5;
                  } else {
                    return 'a';
                  }
                }
              }
              L6: {
                if (-226 != (var2 ^ -1)) {
                  break L6;
                } else {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    return 'a';
                  }
                }
              }
              L7: {
                if (-227 != (var2 ^ -1)) {
                  break L7;
                } else {
                  if (var3 != 0) {
                    break L7;
                  } else {
                    return 'a';
                  }
                }
              }
              L8: {
                if (var2 != 228) {
                  break L8;
                } else {
                  if (var3 != 0) {
                    break L8;
                  } else {
                    return 'a';
                  }
                }
              }
              if (227 != var2) {
                L9: {
                  if (192 != var2) {
                    break L9;
                  } else {
                    if (var3 != 0) {
                      break L9;
                    } else {
                      return 'a';
                    }
                  }
                }
                if ((var2 ^ -1) != -194) {
                  if (var2 != 194) {
                    if (-197 != (var2 ^ -1)) {
                      if (var2 != 195) {
                        L10: {
                          if (var2 != 232) {
                            break L10;
                          } else {
                            if (var3 != 0) {
                              break L10;
                            } else {
                              return 'e';
                            }
                          }
                        }
                        if (var2 != 233) {
                          L11: {
                            if (-235 != (var2 ^ -1)) {
                              break L11;
                            } else {
                              if (var3 != 0) {
                                break L11;
                              } else {
                                return 'e';
                              }
                            }
                          }
                          if ((var2 ^ -1) != -236) {
                            if (var2 != 200) {
                              L12: {
                                if (201 != var2) {
                                  break L12;
                                } else {
                                  if (var3 != 0) {
                                    break L12;
                                  } else {
                                    return 'e';
                                  }
                                }
                              }
                              if (202 != var2) {
                                if ((var2 ^ -1) != -204) {
                                  L13: {
                                    if ((var2 ^ -1) != -238) {
                                      break L13;
                                    } else {
                                      if (var3 != 0) {
                                        break L13;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var2 != 238) {
                                      break L14;
                                    } else {
                                      if (var3 != 0) {
                                        break L14;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  L15: {
                                    if (239 != var2) {
                                      break L15;
                                    } else {
                                      if (var3 != 0) {
                                        break L15;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      if ((var2 ^ -1) != -206) {
                                        break L17;
                                      } else {
                                        if (var3 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if (-207 == (var2 ^ -1)) {
                                      break L16;
                                    } else {
                                      if (207 == var2) {
                                        break L16;
                                      } else {
                                        L18: {
                                          L19: {
                                            if (242 != var2) {
                                              break L19;
                                            } else {
                                              if (var3 == 0) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          if (var2 == 243) {
                                            break L18;
                                          } else {
                                            if (-245 == (var2 ^ -1)) {
                                              break L18;
                                            } else {
                                              if (var2 == 246) {
                                                break L18;
                                              } else {
                                                if (-246 == (var2 ^ -1)) {
                                                  break L18;
                                                } else {
                                                  L20: {
                                                    if (210 != var2) {
                                                      break L20;
                                                    } else {
                                                      if (var3 == 0) {
                                                        break L18;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    if (211 != var2) {
                                                      break L21;
                                                    } else {
                                                      if (var3 == 0) {
                                                        break L18;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  L22: {
                                                    if ((var2 ^ -1) != -213) {
                                                      break L22;
                                                    } else {
                                                      if (var3 == 0) {
                                                        break L18;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  if ((var2 ^ -1) == -215) {
                                                    break L18;
                                                  } else {
                                                    if (213 == var2) {
                                                      break L18;
                                                    } else {
                                                      L23: {
                                                        if (-250 == (var2 ^ -1)) {
                                                          break L23;
                                                        } else {
                                                          if (250 == var2) {
                                                            break L23;
                                                          } else {
                                                            L24: {
                                                              if (var2 != 251) {
                                                                break L24;
                                                              } else {
                                                                if (var3 == 0) {
                                                                  break L23;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            if (252 == var2) {
                                                              break L23;
                                                            } else {
                                                              L25: {
                                                                if ((var2 ^ -1) != -218) {
                                                                  break L25;
                                                                } else {
                                                                  if (var3 == 0) {
                                                                    break L23;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                              }
                                                              if (218 == var2) {
                                                                break L23;
                                                              } else {
                                                                L26: {
                                                                  if ((var2 ^ -1) != -220) {
                                                                    break L26;
                                                                  } else {
                                                                    if (var3 == 0) {
                                                                      break L23;
                                                                    } else {
                                                                      break L26;
                                                                    }
                                                                  }
                                                                }
                                                                if (var2 != 220) {
                                                                  L27: {
                                                                    if (-232 != (var2 ^ -1)) {
                                                                      if (var2 == 199) {
                                                                        break L27;
                                                                      } else {
                                                                        L28: {
                                                                          if ((var2 ^ -1) != -256) {
                                                                            if (-377 != (var2 ^ -1)) {
                                                                              L29: {
                                                                                if ((var2 ^ -1) != -242) {
                                                                                  if (-210 != (var2 ^ -1)) {
                                                                                    if (var2 == 223) {
                                                                                      return 'b';
                                                                                    } else {
                                                                                      return Character.toLowerCase(param1);
                                                                                    }
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L29;
                                                                                    } else {
                                                                                      if (var2 == 223) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    break L29;
                                                                                  } else {
                                                                                    if (-210 != (var2 ^ -1)) {
                                                                                      if (var2 == 223) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    } else {
                                                                                      if (var2 == 223) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              return 'n';
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L28;
                                                                              } else {
                                                                                if ((var2 ^ -1) != -242) {
                                                                                  if (-210 != (var2 ^ -1)) {
                                                                                    if (var2 == 223) {
                                                                                      return 'b';
                                                                                    } else {
                                                                                      return Character.toLowerCase(param1);
                                                                                    }
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      return 'n';
                                                                                    } else {
                                                                                      if (var2 == 223) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  if (-210 != (var2 ^ -1)) {
                                                                                    if (var2 == 223) {
                                                                                      return 'b';
                                                                                    } else {
                                                                                      return Character.toLowerCase(param1);
                                                                                    }
                                                                                  } else {
                                                                                    if (var2 == 223) {
                                                                                      return 'b';
                                                                                    } else {
                                                                                      return Character.toLowerCase(param1);
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L28;
                                                                            } else {
                                                                              if (-377 != (var2 ^ -1)) {
                                                                                L30: {
                                                                                  if ((var2 ^ -1) != -242) {
                                                                                    if (-210 != (var2 ^ -1)) {
                                                                                      if (var2 == 223) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L30;
                                                                                      } else {
                                                                                        if (var2 == 223) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L30;
                                                                                    } else {
                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                        if (var2 == 223) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      } else {
                                                                                        if (var2 == 223) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'n';
                                                                              } else {
                                                                                L31: {
                                                                                  if ((var2 ^ -1) != -242) {
                                                                                    break L31;
                                                                                  } else {
                                                                                    break L31;
                                                                                  }
                                                                                }
                                                                                L32: {
                                                                                  if (-210 != (var2 ^ -1)) {
                                                                                    break L32;
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      return 'n';
                                                                                    } else {
                                                                                      break L32;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var2 == 223) {
                                                                                  return 'b';
                                                                                } else {
                                                                                  return Character.toLowerCase(param1);
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        return 'y';
                                                                      }
                                                                    } else {
                                                                      if (var3 == 0) {
                                                                        break L27;
                                                                      } else {
                                                                        if (var2 == 199) {
                                                                          return 'c';
                                                                        } else {
                                                                          L33: {
                                                                            if ((var2 ^ -1) != -256) {
                                                                              break L33;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          }
                                                                          L34: {
                                                                            if (-377 != (var2 ^ -1)) {
                                                                              break L34;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                return 'y';
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          L35: {
                                                                            L36: {
                                                                              if ((var2 ^ -1) != -242) {
                                                                                break L36;
                                                                              } else {
                                                                                if (var3 == 0) {
                                                                                  break L35;
                                                                                } else {
                                                                                  break L36;
                                                                                }
                                                                              }
                                                                            }
                                                                            L37: {
                                                                              if (-210 != (var2 ^ -1)) {
                                                                                break L37;
                                                                              } else {
                                                                                if (var3 == 0) {
                                                                                  break L35;
                                                                                } else {
                                                                                  break L37;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var2 == 223) {
                                                                              return 'b';
                                                                            } else {
                                                                              return Character.toLowerCase(param1);
                                                                            }
                                                                          }
                                                                          return 'n';
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'c';
                                                                } else {
                                                                  if (var3 == 0) {
                                                                    break L23;
                                                                  } else {
                                                                    L38: {
                                                                      if (-232 != (var2 ^ -1)) {
                                                                        break L38;
                                                                      } else {
                                                                        break L38;
                                                                      }
                                                                    }
                                                                    if (var2 == 199) {
                                                                      return 'c';
                                                                    } else {
                                                                      L39: {
                                                                        L40: {
                                                                          if ((var2 ^ -1) != -256) {
                                                                            break L40;
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L39;
                                                                            } else {
                                                                              break L40;
                                                                            }
                                                                          }
                                                                        }
                                                                        L41: {
                                                                          if (-377 != (var2 ^ -1)) {
                                                                            break L41;
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L39;
                                                                            } else {
                                                                              break L41;
                                                                            }
                                                                          }
                                                                        }
                                                                        L42: {
                                                                          L43: {
                                                                            if ((var2 ^ -1) != -242) {
                                                                              break L43;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L42;
                                                                              } else {
                                                                                break L43;
                                                                              }
                                                                            }
                                                                          }
                                                                          L44: {
                                                                            if (-210 != (var2 ^ -1)) {
                                                                              break L44;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L42;
                                                                              } else {
                                                                                break L44;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (var2 == 223) {
                                                                            return 'b';
                                                                          } else {
                                                                            return Character.toLowerCase(param1);
                                                                          }
                                                                        }
                                                                        return 'n';
                                                                      }
                                                                      return 'y';
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return 'u';
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        return 'o';
                                      }
                                    }
                                  }
                                  return 'i';
                                } else {
                                  return 'e';
                                }
                              } else {
                                return 'e';
                              }
                            } else {
                              return 'e';
                            }
                          } else {
                            return 'e';
                          }
                        } else {
                          return 'e';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return 'a';
                    }
                  } else {
                    return 'a';
                  }
                } else {
                  return 'a';
                }
              } else {
                return 'a';
              }
            } else {
              return param1;
            }
          } else {
            return param1;
          }
        } else {
          return '_';
        }
    }

    public static void d(byte param0) {
        field_D = null;
        if (param0 > -117) {
            of.d((byte) 94);
        }
    }

    final static String i(int param0) {
        if (param0 != 195) {
            return (String) null;
        }
        if (!(wf.field_b != null)) {
            return "";
        }
        return wf.field_b;
    }

    final void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        dl var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -111, param2, param3, param4, param5);
              var8 = 58 % ((param1 - -50) / 57);
              var9 = lk.field_e;
              if (var9 == null) {
                break L1;
              } else {
                if (!this.a((byte) 127, param4, param0, param5, param3)) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_v instanceof jh) {
                      break L2;
                    } else {
                      if (var9.field_v instanceof jh) {
                        ((jh) ((Object) var9.field_v)).a((of) (this), (byte) 107, var9);
                        lk.field_e = null;
                        if (stellarshard.field_B == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((jh) ((Object) this.field_v)).a((of) (this), (byte) 30, var9);
                  lk.field_e = null;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var7);
            stackOut_8_1 = new StringBuilder().append("of.U(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private of(int param0, int param1, int param2, int param3, uk param4, lf param5, rj param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "of.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 113) {
                break L1;
              } else {
                field_A = 45;
                break L1;
              }
            }
            stackOut_2_0 = rc.a(false, 10, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("of.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_B = 0;
        field_F = true;
        field_A = 1;
        field_D = "Music: ";
    }
}
