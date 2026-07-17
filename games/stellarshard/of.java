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
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("of.S(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = stellarshard.field_B;
          if (param0 < -109) {
            break L0;
          } else {
            var4 = null;
            String discarded$1 = of.a((CharSequence) null, (byte) -65);
            break L0;
          }
        }
        var2 = param1;
        if (var2 != 32) {
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
            if (var2 != 95) {
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
          L4: {
            if (var2 == 91) {
              break L4;
            } else {
              L5: {
                if (93 != var2) {
                  break L5;
                } else {
                  if (var3 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (35 == var2) {
                break L4;
              } else {
                L6: {
                  L7: {
                    if (var2 != 224) {
                      break L7;
                    } else {
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var2 != 225) {
                      break L8;
                    } else {
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var2 != 226) {
                      break L9;
                    } else {
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var2 != 228) {
                      break L10;
                    } else {
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (227 == var2) {
                    break L6;
                  } else {
                    L11: {
                      if (192 != var2) {
                        break L11;
                      } else {
                        if (var3 == 0) {
                          break L6;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (var2 == 193) {
                      break L6;
                    } else {
                      if (var2 == 194) {
                        break L6;
                      } else {
                        if (var2 == 196) {
                          break L6;
                        } else {
                          if (var2 == 195) {
                            break L6;
                          } else {
                            L12: {
                              L13: {
                                if (var2 != 232) {
                                  break L13;
                                } else {
                                  if (var3 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var2 == 233) {
                                break L12;
                              } else {
                                L14: {
                                  if (var2 != 234) {
                                    break L14;
                                  } else {
                                    if (var3 == 0) {
                                      break L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (var2 == 235) {
                                  break L12;
                                } else {
                                  if (var2 == 200) {
                                    break L12;
                                  } else {
                                    L15: {
                                      if (201 != var2) {
                                        break L15;
                                      } else {
                                        if (var3 == 0) {
                                          break L12;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (202 == var2) {
                                      break L12;
                                    } else {
                                      if (var2 == 203) {
                                        break L12;
                                      } else {
                                        L16: {
                                          L17: {
                                            if (var2 != 237) {
                                              break L17;
                                            } else {
                                              if (var3 == 0) {
                                                break L16;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var2 != 238) {
                                              break L18;
                                            } else {
                                              if (var3 == 0) {
                                                break L16;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (239 != var2) {
                                              break L19;
                                            } else {
                                              if (var3 == 0) {
                                                break L16;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            if (var2 != 205) {
                                              break L20;
                                            } else {
                                              if (var3 == 0) {
                                                break L16;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          if (var2 == 206) {
                                            break L16;
                                          } else {
                                            if (207 == var2) {
                                              break L16;
                                            } else {
                                              L21: {
                                                L22: {
                                                  if (242 != var2) {
                                                    break L22;
                                                  } else {
                                                    if (var3 == 0) {
                                                      break L21;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                if (var2 == 243) {
                                                  break L21;
                                                } else {
                                                  if (var2 == 244) {
                                                    break L21;
                                                  } else {
                                                    if (var2 == 246) {
                                                      break L21;
                                                    } else {
                                                      if (var2 == 245) {
                                                        break L21;
                                                      } else {
                                                        L23: {
                                                          if (210 != var2) {
                                                            break L23;
                                                          } else {
                                                            if (var3 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        L24: {
                                                          if (211 != var2) {
                                                            break L24;
                                                          } else {
                                                            if (var3 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        L25: {
                                                          if (var2 != 212) {
                                                            break L25;
                                                          } else {
                                                            if (var3 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        if (var2 == 214) {
                                                          break L21;
                                                        } else {
                                                          if (213 == var2) {
                                                            break L21;
                                                          } else {
                                                            L26: {
                                                              if (var2 == 249) {
                                                                break L26;
                                                              } else {
                                                                if (250 == var2) {
                                                                  break L26;
                                                                } else {
                                                                  L27: {
                                                                    if (var2 != 251) {
                                                                      break L27;
                                                                    } else {
                                                                      if (var3 == 0) {
                                                                        break L26;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (252 == var2) {
                                                                    break L26;
                                                                  } else {
                                                                    L28: {
                                                                      if (var2 != 217) {
                                                                        break L28;
                                                                      } else {
                                                                        if (var3 == 0) {
                                                                          break L26;
                                                                        } else {
                                                                          break L28;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (218 == var2) {
                                                                      break L26;
                                                                    } else {
                                                                      L29: {
                                                                        if (var2 != 219) {
                                                                          break L29;
                                                                        } else {
                                                                          if (var3 == 0) {
                                                                            break L26;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var2 != 220) {
                                                                        L30: {
                                                                          if (var2 != 231) {
                                                                            if (var2 == 199) {
                                                                              break L30;
                                                                            } else {
                                                                              L31: {
                                                                                if (var2 != 255) {
                                                                                  if (var2 != 376) {
                                                                                    L32: {
                                                                                      if (var2 != 241) {
                                                                                        if (var2 != 209) {
                                                                                          if (var2 == 223) {
                                                                                            return 'b';
                                                                                          } else {
                                                                                            return Character.toLowerCase(param1);
                                                                                          }
                                                                                        } else {
                                                                                          if (var3 == 0) {
                                                                                            break L32;
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
                                                                                          break L32;
                                                                                        } else {
                                                                                          if (var2 != 209) {
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
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    return 'n';
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L31;
                                                                                    } else {
                                                                                      L33: {
                                                                                        if (var2 != 241) {
                                                                                          if (var2 != 209) {
                                                                                            if (var2 == 223) {
                                                                                              return 'b';
                                                                                            } else {
                                                                                              return Character.toLowerCase(param1);
                                                                                            }
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              break L33;
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
                                                                                            break L33;
                                                                                          } else {
                                                                                            if (var2 != 209) {
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
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      return 'n';
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    break L31;
                                                                                  } else {
                                                                                    if (var2 != 376) {
                                                                                      L34: {
                                                                                        if (var2 != 241) {
                                                                                          if (var2 != 209) {
                                                                                            if (var2 == 223) {
                                                                                              return 'b';
                                                                                            } else {
                                                                                              return Character.toLowerCase(param1);
                                                                                            }
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              break L34;
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
                                                                                            break L34;
                                                                                          } else {
                                                                                            if (var2 != 209) {
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
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      return 'n';
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        return 'y';
                                                                                      } else {
                                                                                        L35: {
                                                                                          L36: {
                                                                                            if (var2 != 241) {
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
                                                                                            if (var2 != 209) {
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
                                                                              }
                                                                              return 'y';
                                                                            }
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L30;
                                                                            } else {
                                                                              if (var2 == 199) {
                                                                                return 'c';
                                                                              } else {
                                                                                L38: {
                                                                                  L39: {
                                                                                    if (var2 != 255) {
                                                                                      break L39;
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L38;
                                                                                      } else {
                                                                                        break L39;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L40: {
                                                                                    if (var2 != 376) {
                                                                                      break L40;
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L38;
                                                                                      } else {
                                                                                        break L40;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L41: {
                                                                                    L42: {
                                                                                      if (var2 != 241) {
                                                                                        break L42;
                                                                                      } else {
                                                                                        if (var3 == 0) {
                                                                                          break L41;
                                                                                        } else {
                                                                                          break L42;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L43: {
                                                                                      if (var2 != 209) {
                                                                                        break L43;
                                                                                      } else {
                                                                                        if (var3 == 0) {
                                                                                          break L41;
                                                                                        } else {
                                                                                          break L43;
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
                                                                        return 'c';
                                                                      } else {
                                                                        if (var3 == 0) {
                                                                          break L26;
                                                                        } else {
                                                                          L44: {
                                                                            L45: {
                                                                              if (var2 != 231) {
                                                                                break L45;
                                                                              } else {
                                                                                if (var3 == 0) {
                                                                                  break L44;
                                                                                } else {
                                                                                  break L45;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var2 == 199) {
                                                                              break L44;
                                                                            } else {
                                                                              L46: {
                                                                                L47: {
                                                                                  if (var2 != 255) {
                                                                                    break L47;
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L46;
                                                                                    } else {
                                                                                      break L47;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L48: {
                                                                                  if (var2 != 376) {
                                                                                    break L48;
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L46;
                                                                                    } else {
                                                                                      break L48;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L49: {
                                                                                  L50: {
                                                                                    if (var2 != 241) {
                                                                                      break L50;
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L49;
                                                                                      } else {
                                                                                        break L50;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L51: {
                                                                                    if (var2 != 209) {
                                                                                      break L51;
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L49;
                                                                                      } else {
                                                                                        break L51;
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
                                                                          return 'c';
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
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            return 'e';
                          }
                        }
                      }
                    }
                  }
                }
                return 'a';
              }
            }
          }
          return param1;
        } else {
          return '_';
        }
    }

    public static void d(byte param0) {
        field_D = null;
        of.d((byte) 94);
    }

    final static String i(int param0) {
        if (param0 != 195) {
            return null;
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
                if (!((of) this).a((byte) 127, param4, param0, param5, param3)) {
                  break L1;
                } else {
                  L2: {
                    if (((of) this).field_v instanceof jh) {
                      break L2;
                    } else {
                      if (var9.field_v instanceof jh) {
                        ((jh) (Object) var9.field_v).a((of) this, (byte) 107, var9);
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
                  ((jh) (Object) ((of) this).field_v).a((of) this, (byte) 30, var9);
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
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("of.U(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private of(int param0, int param1, int param2, int param3, uk param4, lf param5, rj param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((of) this).field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "of.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            field_A = 45;
            stackOut_0_0 = rc.a(false, 10, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("of.K(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -65 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
        field_F = true;
        field_A = 1;
        field_D = "Music: ";
    }
}
