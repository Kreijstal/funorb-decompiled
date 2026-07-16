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
            try {
                if (param0 < 36) {
                    field_F = false;
                }
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(lk.a(param1, var2, -110), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
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
                    if ((var2 ^ -1) != -225) {
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
                    if (-226 != (var2 ^ -1)) {
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
                    if (-227 != (var2 ^ -1)) {
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
                    if ((var2 ^ -1) == -194) {
                      break L6;
                    } else {
                      if (var2 == 194) {
                        break L6;
                      } else {
                        if (-197 == (var2 ^ -1)) {
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
                                  if (-235 != (var2 ^ -1)) {
                                    break L14;
                                  } else {
                                    if (var3 == 0) {
                                      break L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if ((var2 ^ -1) == -236) {
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
                                      if ((var2 ^ -1) == -204) {
                                        break L12;
                                      } else {
                                        L16: {
                                          L17: {
                                            if ((var2 ^ -1) != -238) {
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
                                            if ((var2 ^ -1) != -206) {
                                              break L20;
                                            } else {
                                              if (var3 == 0) {
                                                break L16;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          if (-207 == (var2 ^ -1)) {
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
                                                  if (-245 == (var2 ^ -1)) {
                                                    break L21;
                                                  } else {
                                                    if (var2 == 246) {
                                                      break L21;
                                                    } else {
                                                      if (-246 == (var2 ^ -1)) {
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
                                                          if ((var2 ^ -1) != -213) {
                                                            break L25;
                                                          } else {
                                                            if (var3 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        if ((var2 ^ -1) == -215) {
                                                          break L21;
                                                        } else {
                                                          if (213 == var2) {
                                                            break L21;
                                                          } else {
                                                            L26: {
                                                              if (-250 == (var2 ^ -1)) {
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
                                                                      if ((var2 ^ -1) != -218) {
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
                                                                        if ((var2 ^ -1) != -220) {
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
                                                                          if (-232 != (var2 ^ -1)) {
                                                                            if (var2 == 199) {
                                                                              break L30;
                                                                            } else {
                                                                              L31: {
                                                                                if ((var2 ^ -1) != -256) {
                                                                                  if (-377 != (var2 ^ -1)) {
                                                                                    L32: {
                                                                                      if ((var2 ^ -1) != -242) {
                                                                                        if (-210 != (var2 ^ -1)) {
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
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    return 'n';
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L31;
                                                                                    } else {
                                                                                      L33: {
                                                                                        if ((var2 ^ -1) != -242) {
                                                                                          if (-210 != (var2 ^ -1)) {
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
                                                                                    if (-377 != (var2 ^ -1)) {
                                                                                      L34: {
                                                                                        if ((var2 ^ -1) != -242) {
                                                                                          if (-210 != (var2 ^ -1)) {
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
                                                                                    if ((var2 ^ -1) != -256) {
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
                                                                                    if (-377 != (var2 ^ -1)) {
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
                                                                                      if ((var2 ^ -1) != -242) {
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
                                                                                      if (-210 != (var2 ^ -1)) {
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
                                                                              if (-232 != (var2 ^ -1)) {
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
                                                                                  if ((var2 ^ -1) != -256) {
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
                                                                                  if (-377 != (var2 ^ -1)) {
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
                                                                                    if ((var2 ^ -1) != -242) {
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
                                                                                    if (-210 != (var2 ^ -1)) {
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
        if (param0 > -117) {
            of.d((byte) 94);
        }
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
        int var8 = 0;
        dl var9 = null;
        super.a(param0, -111, param2, param3, param4, param5);
        var8 = 58 % ((param1 - -50) / 57);
        var9 = lk.field_e;
        if (var9 != null) {
          if (((of) this).a((byte) 127, param4, param0, param5, param3)) {
            if (!(((of) this).field_v instanceof jh)) {
              if (var9.field_v instanceof jh) {
                ((jh) (Object) var9.field_v).a((of) this, (byte) 107, var9);
                lk.field_e = null;
                if (stellarshard.field_B != 0) {
                  ((jh) (Object) ((of) this).field_v).a((of) this, (byte) 30, var9);
                  lk.field_e = null;
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((jh) (Object) ((of) this).field_v).a((of) this, (byte) 30, var9);
              lk.field_e = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private of(int param0, int param1, int param2, int param3, uk param4, lf param5, rj param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((of) this).field_y = param6;
    }

    final static String a(CharSequence param0, byte param1) {
        if (param1 != 113) {
            field_A = 45;
            return rc.a(false, 10, param0);
        }
        return rc.a(false, 10, param0);
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
