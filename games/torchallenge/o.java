/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends da {
    int field_o;
    static int field_l;
    static int field_i;
    static String field_n;
    static int[] field_j;
    static jk field_k;
    int field_p;
    static boolean field_m;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        var9 = param5 - -param2;
        var10 = param3 + param6;
        if (param7 == 9) {
          var11 = param8 + param0;
          var12 = param4 + param1;
          if (param6 <= param5) {
            if (param5 >= var10) {
              if (var9 > param6) {
                if (var10 >= var9) {
                  if (param1 > param8) {
                    L0: {
                      if (var11 <= param1) {
                        break L0;
                      } else {
                        if (var11 > var12) {
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    }
                    L1: {
                      if (param5 > param6) {
                        if (param5 >= var10) {
                          break L1;
                        } else {
                          if (var9 < var10) {
                            break L1;
                          } else {
                            L2: {
                              if (param1 < param8) {
                                if (param8 >= var12) {
                                  return false;
                                } else {
                                  if (var11 >= var12) {
                                    break L2;
                                  } else {
                                    return false;
                                  }
                                }
                              } else {
                                if (var11 > param1) {
                                  break L2;
                                } else {
                                  if (param8 >= var12) {
                                    return false;
                                  } else {
                                    if (var11 >= var12) {
                                      return true;
                                    } else {
                                      return false;
                                    }
                                  }
                                }
                              }
                            }
                            return true;
                          }
                        }
                      } else {
                        if (param6 < var9) {
                          L3: {
                            if (param1 < param8) {
                              if (param8 >= var12) {
                                break L1;
                              } else {
                                if (var11 >= var12) {
                                  break L3;
                                } else {
                                  return false;
                                }
                              }
                            } else {
                              if (var11 > param1) {
                                break L3;
                              } else {
                                if (param8 >= var12) {
                                  return false;
                                } else {
                                  if (var11 >= var12) {
                                    return true;
                                  } else {
                                    return false;
                                  }
                                }
                              }
                            }
                          }
                          return true;
                        } else {
                          L4: {
                            if (param5 >= var10) {
                              break L4;
                            } else {
                              if (var9 < var10) {
                                break L4;
                              } else {
                                L5: {
                                  if (param1 < param8) {
                                    if (param8 >= var12) {
                                      break L4;
                                    } else {
                                      if (var11 >= var12) {
                                        break L5;
                                      } else {
                                        return false;
                                      }
                                    }
                                  } else {
                                    if (var11 > param1) {
                                      break L5;
                                    } else {
                                      if (param8 >= var12) {
                                        return false;
                                      } else {
                                        if (var11 >= var12) {
                                          return true;
                                        } else {
                                          return false;
                                        }
                                      }
                                    }
                                  }
                                }
                                return true;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                    return false;
                  } else {
                    if (var12 > param8) {
                      return true;
                    } else {
                      L6: {
                        if (var11 <= param1) {
                          break L6;
                        } else {
                          if (var11 > var12) {
                            break L6;
                          } else {
                            return true;
                          }
                        }
                      }
                      L7: {
                        L8: {
                          L9: {
                            if (param5 > param6) {
                              break L9;
                            } else {
                              if (param6 < var9) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (param5 >= var10) {
                            break L7;
                          } else {
                            if (var9 < var10) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L10: {
                          L11: {
                            if (param1 < param8) {
                              break L11;
                            } else {
                              if (var11 > param1) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (param8 >= var12) {
                            break L7;
                          } else {
                            if (var11 >= var12) {
                              break L10;
                            } else {
                              break L7;
                            }
                          }
                        }
                        return true;
                      }
                      return false;
                    }
                  }
                } else {
                  L12: {
                    if (param5 > param6) {
                      if (param5 >= var10) {
                        break L12;
                      } else {
                        if (var9 < var10) {
                          break L12;
                        } else {
                          L13: {
                            if (param1 < param8) {
                              if (param8 >= var12) {
                                return false;
                              } else {
                                if (var11 >= var12) {
                                  break L13;
                                } else {
                                  return false;
                                }
                              }
                            } else {
                              if (var11 > param1) {
                                break L13;
                              } else {
                                L14: {
                                  if (param8 >= var12) {
                                    break L14;
                                  } else {
                                    if (var11 >= var12) {
                                      return true;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                return false;
                              }
                            }
                          }
                          return true;
                        }
                      }
                    } else {
                      if (param6 < var9) {
                        L15: {
                          if (param1 < param8) {
                            if (param8 >= var12) {
                              break L12;
                            } else {
                              if (var11 >= var12) {
                                break L15;
                              } else {
                                return false;
                              }
                            }
                          } else {
                            if (var11 > param1) {
                              break L15;
                            } else {
                              if (param8 >= var12) {
                                return false;
                              } else {
                                if (var11 >= var12) {
                                  return true;
                                } else {
                                  return false;
                                }
                              }
                            }
                          }
                        }
                        return true;
                      } else {
                        L16: {
                          if (param5 >= var10) {
                            break L16;
                          } else {
                            if (var9 < var10) {
                              break L16;
                            } else {
                              L17: {
                                if (param1 < param8) {
                                  if (param8 >= var12) {
                                    break L16;
                                  } else {
                                    if (var11 >= var12) {
                                      break L17;
                                    } else {
                                      return false;
                                    }
                                  }
                                } else {
                                  if (var11 > param1) {
                                    break L17;
                                  } else {
                                    L18: {
                                      if (param8 >= var12) {
                                        break L18;
                                      } else {
                                        if (var11 >= var12) {
                                          return true;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    return false;
                                  }
                                }
                              }
                              return true;
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                  return false;
                }
              } else {
                L19: {
                  if (param5 > param6) {
                    if (param5 >= var10) {
                      break L19;
                    } else {
                      if (var9 < var10) {
                        break L19;
                      } else {
                        L20: {
                          if (param1 < param8) {
                            if (param8 >= var12) {
                              return false;
                            } else {
                              if (var11 >= var12) {
                                break L20;
                              } else {
                                return false;
                              }
                            }
                          } else {
                            if (var11 > param1) {
                              break L20;
                            } else {
                              L21: {
                                if (param8 >= var12) {
                                  break L21;
                                } else {
                                  if (var11 >= var12) {
                                    return true;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              return false;
                            }
                          }
                        }
                        return true;
                      }
                    }
                  } else {
                    if (param6 < var9) {
                      L22: {
                        if (param1 < param8) {
                          if (param8 >= var12) {
                            break L19;
                          } else {
                            if (var11 >= var12) {
                              break L22;
                            } else {
                              return false;
                            }
                          }
                        } else {
                          if (var11 > param1) {
                            break L22;
                          } else {
                            if (param8 >= var12) {
                              return false;
                            } else {
                              if (var11 >= var12) {
                                return true;
                              } else {
                                return false;
                              }
                            }
                          }
                        }
                      }
                      return true;
                    } else {
                      L23: {
                        if (param5 >= var10) {
                          break L23;
                        } else {
                          if (var9 < var10) {
                            break L23;
                          } else {
                            L24: {
                              if (param1 < param8) {
                                if (param8 >= var12) {
                                  break L23;
                                } else {
                                  if (var11 >= var12) {
                                    break L24;
                                  } else {
                                    return false;
                                  }
                                }
                              } else {
                                if (var11 > param1) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (param8 >= var12) {
                                      break L25;
                                    } else {
                                      if (var11 >= var12) {
                                        return true;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  return false;
                                }
                              }
                            }
                            return true;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              }
            } else {
              if (param1 > param8) {
                L26: {
                  if (var11 <= param1) {
                    break L26;
                  } else {
                    if (var11 > var12) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                L27: {
                  if (param5 > param6) {
                    if (param5 >= var10) {
                      break L27;
                    } else {
                      if (var9 < var10) {
                        break L27;
                      } else {
                        L28: {
                          L29: {
                            if (param1 < param8) {
                              break L29;
                            } else {
                              if (var11 > param1) {
                                break L28;
                              } else {
                                break L29;
                              }
                            }
                          }
                          L30: {
                            if (param8 >= var12) {
                              break L30;
                            } else {
                              if (var11 >= var12) {
                                break L28;
                              } else {
                                break L30;
                              }
                            }
                          }
                          return false;
                        }
                        return true;
                      }
                    }
                  } else {
                    if (param6 < var9) {
                      L31: {
                        if (param1 < param8) {
                          if (param8 >= var12) {
                            break L27;
                          } else {
                            if (var11 >= var12) {
                              break L31;
                            } else {
                              return false;
                            }
                          }
                        } else {
                          if (var11 > param1) {
                            break L31;
                          } else {
                            L32: {
                              if (param8 >= var12) {
                                break L32;
                              } else {
                                if (var11 >= var12) {
                                  return true;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      }
                      return true;
                    } else {
                      L33: {
                        if (param5 >= var10) {
                          break L33;
                        } else {
                          if (var9 < var10) {
                            break L33;
                          } else {
                            L34: {
                              L35: {
                                if (param1 < param8) {
                                  break L35;
                                } else {
                                  if (var11 > param1) {
                                    break L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                              if (param8 >= var12) {
                                break L33;
                              } else {
                                if (var11 >= var12) {
                                  break L34;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            return true;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              } else {
                if (var12 <= param8) {
                  L36: {
                    if (var11 <= param1) {
                      break L36;
                    } else {
                      if (var11 > var12) {
                        break L36;
                      } else {
                        return true;
                      }
                    }
                  }
                  L37: {
                    L38: {
                      if (param5 > param6) {
                        break L38;
                      } else {
                        if (param6 < var9) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    if (param5 < var10) {
                      if (var9 >= var10) {
                        break L37;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                  L39: {
                    L40: {
                      if (param1 < param8) {
                        break L40;
                      } else {
                        if (var11 > param1) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                    L41: {
                      if (param8 >= var12) {
                        break L41;
                      } else {
                        if (var11 >= var12) {
                          break L39;
                        } else {
                          break L41;
                        }
                      }
                    }
                    return false;
                  }
                  return true;
                } else {
                  return true;
                }
              }
            }
          } else {
            L42: {
              if (var9 <= param6) {
                break L42;
              } else {
                if (var10 < var9) {
                  break L42;
                } else {
                  if (param1 > param8) {
                    if (var11 <= param1) {
                      break L42;
                    } else {
                      if (var11 > var12) {
                        break L42;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    if (var12 <= param8) {
                      L43: {
                        if (var11 <= param1) {
                          break L43;
                        } else {
                          if (var11 > var12) {
                            break L43;
                          } else {
                            return true;
                          }
                        }
                      }
                      L44: {
                        L45: {
                          if (param5 > param6) {
                            break L45;
                          } else {
                            if (param6 < var9) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                        if (param5 < var10) {
                          if (var9 >= var10) {
                            break L44;
                          } else {
                            return false;
                          }
                        } else {
                          return false;
                        }
                      }
                      L46: {
                        if (param1 < param8) {
                          break L46;
                        } else {
                          if (var11 <= param1) {
                            break L46;
                          } else {
                            return true;
                          }
                        }
                      }
                      if (param8 < var12) {
                        if (var11 < var12) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            if (param5 > param6) {
              if (param5 < var10) {
                if (var9 >= var10) {
                  L47: {
                    if (param1 < param8) {
                      break L47;
                    } else {
                      if (var11 <= param1) {
                        break L47;
                      } else {
                        return true;
                      }
                    }
                  }
                  if (param8 < var12) {
                    if (var11 >= var12) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (param6 < var9) {
                if (param1 < param8) {
                  if (param8 < var12) {
                    if (var11 < var12) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  if (var11 <= param1) {
                    if (param8 < var12) {
                      if (var11 >= var12) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                if (param5 < var10) {
                  if (var9 >= var10) {
                    L48: {
                      if (param1 < param8) {
                        break L48;
                      } else {
                        if (var11 <= param1) {
                          break L48;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (param8 >= var12) {
                      return false;
                    } else {
                      L49: {
                        if (var11 >= var12) {
                          stackOut_46_0 = 1;
                          stackIn_47_0 = stackOut_46_0;
                          break L49;
                        } else {
                          stackOut_45_0 = 0;
                          stackIn_47_0 = stackOut_45_0;
                          break L49;
                        }
                      }
                      return stackIn_47_0 != 0;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, boolean param2, java.awt.Color param3, String param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = bg.field_P.getGraphics();
                  if (hh.field_a == null) {
                    hh.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param2) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, sd.field_c, fl.field_v);
                    break L3;
                  }
                }
                L4: {
                  if (param3 == null) {
                    param3 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == uf.field_i) {
                        uf.field_i = bg.field_P.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = uf.field_i.getGraphics();
                    var10.setColor(param3);
                    var10.drawRect(0, 0, param1, 33);
                    var10.fillRect(2, 2, 3 * param0, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param0 * 3 + 2, 2, 300 - param0 * 3, 30);
                    var10.setFont(hh.field_a);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param4, (304 + -(param4.length() * 6)) / 2, 22);
                    boolean discarded$1 = var9.drawImage(uf.field_i, sd.field_c / 2 + -152, fl.field_v / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = sd.field_c / 2 + -152;
                    var8 = fl.field_v / 2 + -18;
                    var9.setColor(param3);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 + 2, 2 + var8, 3 * param0, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(3 * param0 + (var7 - -2), 2 + var8, 300 - 3 * param0, 30);
                    var9.setFont(hh.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param4, (304 - 6 * param4.length()) / 2 + var7, var8 + 22);
                    break L7;
                  }
                }
                L8: {
                  if (dk.field_d == null) {
                    break L8;
                  } else {
                    var9.setFont(hh.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(dk.field_d, sd.field_c / 2 - dk.field_d.length() * 6 / 2, fl.field_v / 2 + -26);
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                bg.field_P.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("o.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          L11: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static void a(int param0, int param1) {
        eh.field_o = 21845;
        int var2 = -7 % ((param0 - -81) / 33);
        eh.field_m = 133;
        eh.field_k = 33;
    }

    public static void b() {
        field_j = null;
        field_k = null;
        field_n = null;
    }

    final static void a(int param0, boolean param1) {
        md.field_a = false;
        rj.field_g = param0;
        if (rj.field_g == 0) {
          gh.field_x = false;
          rf.field_ib = 0;
          nd.field_e = s.field_k[1 + rj.field_g];
          bc.field_o = 13;
          bb.field_h = 13;
          int discarded$4 = 0;
          ch.b();
          return;
        } else {
          rf.field_ib = 0;
          nd.field_e = s.field_k[1 + rj.field_g];
          bc.field_o = 13;
          bb.field_h = 13;
          int discarded$5 = 0;
          ch.b();
          return;
        }
    }

    private o() throws Throwable {
        throw new Error();
    }

    final static int a() {
        return fh.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Help posts: OFF";
        field_i = 2;
    }
}
