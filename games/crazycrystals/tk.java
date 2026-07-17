/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk extends bc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static dl[] field_h;
    private java.awt.image.ImageConsumer field_g;
    private java.awt.image.ColorModel field_j;
    static dl field_l;
    static mk field_k;
    static java.applet.Applet field_i;

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        try {
            int var5_int = -29 / ((83 - param2) / 34);
            this.c(126);
            boolean discarded$0 = param0.drawImage(((tk) this).field_b, param3, param1, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tk.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 != 235) {
          L0: {
            char discarded$1 = tk.a(-103, '');
            var2 = param1;
            if (var2 != 32) {
              if (160 != var2) {
                if (var2 != 95) {
                  if (var2 == 45) {
                    break L0;
                  } else {
                    L1: {
                      if (var2 == 91) {
                        break L1;
                      } else {
                        if (var2 == 93) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if (var2 == 224) {
                                break L2;
                              } else {
                                if (var2 != 225) {
                                  if (var2 == 226) {
                                    break L2;
                                  } else {
                                    if (228 == var2) {
                                      break L2;
                                    } else {
                                      if (var2 == 227) {
                                        break L2;
                                      } else {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (var2 != 193) {
                                            if (var2 == 194) {
                                              break L2;
                                            } else {
                                              if (var2 == 196) {
                                                break L2;
                                              } else {
                                                if (var2 == 195) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (var2 != 232) {
                                                      if (var2 != 233) {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (var2 != 200) {
                                                              if (var2 == 201) {
                                                                break L3;
                                                              } else {
                                                                if (var2 == 202) {
                                                                  break L3;
                                                                } else {
                                                                  if (var2 != 203) {
                                                                    L4: {
                                                                      if (237 == var2) {
                                                                        break L4;
                                                                      } else {
                                                                        if (238 != var2) {
                                                                          if (var2 != 239) {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (206 != var2) {
                                                                                if (var2 == 207) {
                                                                                  break L4;
                                                                                } else {
                                                                                  if (var2 != 242) {
                                                                                    if (var2 != 243) {
                                                                                      L5: {
                                                                                        if (var2 == 244) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (var2 != 246) {
                                                                                            if (var2 != 245) {
                                                                                              if (var2 == 210) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (211 != var2) {
                                                                                                  if (var2 != 212) {
                                                                                                    if (214 == var2) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if (213 == var2) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        if (var2 != 249) {
                                                                                                          if (250 != var2) {
                                                                                                            if (var2 != 251) {
                                                                                                              L6: {
                                                                                                                if (var2 == 252) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (217 != var2) {
                                                                                                                    if (var2 != 218) {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (var2 == 220) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          L7: {
                                                                                                                            if (var2 == 231) {
                                                                                                                              break L7;
                                                                                                                            } else {
                                                                                                                              if (var2 == 199) {
                                                                                                                                break L7;
                                                                                                                              } else {
                                                                                                                                if (255 != var2) {
                                                                                                                                  if (var2 == 376) {
                                                                                                                                    return 'y';
                                                                                                                                  } else {
                                                                                                                                    L8: {
                                                                                                                                      if (241 == var2) {
                                                                                                                                        break L8;
                                                                                                                                      } else {
                                                                                                                                        if (209 == var2) {
                                                                                                                                          break L8;
                                                                                                                                        } else {
                                                                                                                                          if (var2 == 223) {
                                                                                                                                            return 'b';
                                                                                                                                          } else {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
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
                                                                                                      }
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
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        } else {
                                                                          return 'i';
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    return 'e';
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              return 'e';
                                                            }
                                                          }
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
                                              }
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
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return param1;
                  }
                } else {
                  break L0;
                }
              } else {
                return '_';
              }
            } else {
              break L0;
            }
          }
          return '_';
        } else {
          L9: {
            var2 = param1;
            if (var2 != 32) {
              if (160 != var2) {
                if (var2 != 95) {
                  if (var2 != 45) {
                    if (var2 != 91) {
                      if (var2 != 93) {
                        if (var2 != 35) {
                          L10: {
                            if (var2 == 224) {
                              break L10;
                            } else {
                              if (var2 != 225) {
                                if (var2 == 226) {
                                  break L10;
                                } else {
                                  if (228 == var2) {
                                    break L10;
                                  } else {
                                    if (var2 == 227) {
                                      break L10;
                                    } else {
                                      if (var2 == 192) {
                                        break L10;
                                      } else {
                                        if (var2 != 193) {
                                          if (var2 == 194) {
                                            break L10;
                                          } else {
                                            if (var2 == 196) {
                                              break L10;
                                            } else {
                                              if (var2 == 195) {
                                                break L10;
                                              } else {
                                                L11: {
                                                  if (var2 != 232) {
                                                    if (var2 != 233) {
                                                      if (var2 == 234) {
                                                        break L11;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L11;
                                                        } else {
                                                          if (var2 != 200) {
                                                            if (var2 == 201) {
                                                              break L11;
                                                            } else {
                                                              if (var2 == 202) {
                                                                break L11;
                                                              } else {
                                                                if (var2 != 203) {
                                                                  L12: {
                                                                    if (237 == var2) {
                                                                      break L12;
                                                                    } else {
                                                                      if (238 != var2) {
                                                                        if (var2 != 239) {
                                                                          if (var2 == 205) {
                                                                            break L12;
                                                                          } else {
                                                                            if (206 != var2) {
                                                                              if (var2 == 207) {
                                                                                break L12;
                                                                              } else {
                                                                                L13: {
                                                                                  if (var2 != 242) {
                                                                                    if (var2 != 243) {
                                                                                      if (var2 == 244) {
                                                                                        break L13;
                                                                                      } else {
                                                                                        if (var2 != 246) {
                                                                                          if (var2 != 245) {
                                                                                            if (var2 == 210) {
                                                                                              break L13;
                                                                                            } else {
                                                                                              if (211 != var2) {
                                                                                                if (var2 != 212) {
                                                                                                  if (214 == var2) {
                                                                                                    break L13;
                                                                                                  } else {
                                                                                                    if (213 == var2) {
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      L14: {
                                                                                                        if (var2 != 249) {
                                                                                                          if (250 != var2) {
                                                                                                            if (var2 != 251) {
                                                                                                              if (var2 == 252) {
                                                                                                                break L14;
                                                                                                              } else {
                                                                                                                if (217 != var2) {
                                                                                                                  if (var2 != 218) {
                                                                                                                    if (var2 != 219) {
                                                                                                                      if (var2 == 220) {
                                                                                                                        break L14;
                                                                                                                      } else {
                                                                                                                        L15: {
                                                                                                                          if (var2 == 231) {
                                                                                                                            break L15;
                                                                                                                          } else {
                                                                                                                            if (var2 == 199) {
                                                                                                                              break L15;
                                                                                                                            } else {
                                                                                                                              if (255 != var2) {
                                                                                                                                if (var2 == 376) {
                                                                                                                                  return 'y';
                                                                                                                                } else {
                                                                                                                                  L16: {
                                                                                                                                    if (241 == var2) {
                                                                                                                                      break L16;
                                                                                                                                    } else {
                                                                                                                                      if (209 == var2) {
                                                                                                                                        break L16;
                                                                                                                                      } else {
                                                                                                                                        if (var2 == 223) {
                                                                                                                                          return 'b';
                                                                                                                                        } else {
                                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
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
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L14;
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  break L13;
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
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  } else {
                                                                                    break L13;
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              break L12;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L12;
                                                                        }
                                                                      } else {
                                                                        break L12;
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L11;
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
                                                return 'e';
                                              }
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          return 'a';
                        } else {
                          return param1;
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
                } else {
                  break L9;
                }
              } else {
                return '_';
              }
            } else {
              break L9;
            }
          }
          return '_';
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((tk) this).field_g = param0;
            param0.setDimensions(((tk) this).field_d, ((tk) this).field_e);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((tk) this).field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tk.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final synchronized void c(int param0) {
        if (param0 <= 78) {
            Object var3 = null;
            boolean discarded$4 = ((tk) this).isConsumer((java.awt.image.ImageConsumer) null);
            if (!(((tk) this).field_g != null)) {
                return;
            }
            ((tk) this).field_g.setPixels(0, 0, ((tk) this).field_d, ((tk) this).field_e, ((tk) this).field_j, ((tk) this).field_c, 0, ((tk) this).field_d);
            ((tk) this).field_g.imageComplete(2);
            return;
        }
        if (!(((tk) this).field_g != null)) {
            return;
        }
        ((tk) this).field_g.setPixels(0, 0, ((tk) this).field_d, ((tk) this).field_e, ((tk) this).field_j, ((tk) this).field_c, 0, ((tk) this).field_d);
        ((tk) this).field_g.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            ((tk) this).field_c = new int[1 + param1 * param3];
            ((tk) this).field_e = param3;
            ((tk) this).field_d = param1;
            ((tk) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((tk) this).field_b = param2.createImage((java.awt.image.ImageProducer) this);
            int var5_int = -79 % ((50 - param0) / 32);
            this.c(110);
            boolean discarded$0 = param2.prepareImage(((tk) this).field_b, (java.awt.image.ImageObserver) this);
            this.c(108);
            boolean discarded$1 = param2.prepareImage(((tk) this).field_b, (java.awt.image.ImageObserver) this);
            this.c(79);
            boolean discarded$2 = param2.prepareImage(((tk) this).field_b, (java.awt.image.ImageObserver) this);
            ((tk) this).a(6945);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tk.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
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
              if (((tk) this).field_g != param0) {
                break L1;
              } else {
                ((tk) this).field_g = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tk.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((tk) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tk.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    tk() {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((tk) this).field_g == param0;
    }

    public static void a(byte param0) {
        field_k = null;
        field_i = null;
        field_l = null;
        field_h = null;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("tk.imageUpdate(");
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
          throw dn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new mk();
    }
}
