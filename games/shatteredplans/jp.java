/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp extends qr {
    static v field_Cb;
    private qr field_yb;
    private qr field_zb;
    static String field_xb;
    static vk field_Bb;
    private StringBuilder field_Db;
    private int field_Ab;

    final boolean f(byte param0) {
        int var2 = 0;
        if (0 != ((jp) this).field_Ab) {
          return false;
        } else {
          if (oq.field_j == 85) {
            if (((jp) this).field_Db.length() > 0) {
              int discarded$17 = 32;
              StringBuilder discarded$18 = aj.a(((jp) this).field_Db, ((jp) this).field_Db.length() - 1, -121);
              if (((jp) this).field_Db.length() < 12) {
                L0: {
                  var2 = Character.toLowerCase(ho.field_h);
                  if (var2 != 32) {
                    break L0;
                  } else {
                    var2 = 95;
                    break L0;
                  }
                }
                L1: {
                  if (var2 != 95) {
                    break L1;
                  } else {
                    if (((jp) this).field_Db.length() <= 0) {
                      break L1;
                    } else {
                      L2: {
                        StringBuilder discarded$19 = ((jp) this).field_Db.append((char) var2);
                        if (hq.a(-103, (char) var2)) {
                          StringBuilder discarded$20 = ((jp) this).field_Db.append((char) var2);
                          break L2;
                        } else {
                          if (!dk.a((byte) 55, (char) var2)) {
                            break L2;
                          } else {
                            StringBuilder discarded$21 = ((jp) this).field_Db.append((char) var2);
                            break L2;
                          }
                        }
                      }
                      if (oq.field_j != 84) {
                        if (param0 < -93) {
                          L3: {
                            if (13 == oq.field_j) {
                              ((jp) this).field_Ab = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        if (((jp) this).field_Db.length() > 0) {
                          ((jp) this).field_z = ((jp) this).field_Db.toString();
                          ((jp) this).field_Ab = 2;
                          if (param0 < -93) {
                            L4: {
                              if (13 == oq.field_j) {
                                ((jp) this).field_Ab = 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          ((jp) this).field_Ab = 1;
                          if (param0 < -93) {
                            L5: {
                              if (13 == oq.field_j) {
                                ((jp) this).field_Ab = 1;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
                if (hq.a(-103, (char) var2)) {
                  StringBuilder discarded$22 = ((jp) this).field_Db.append((char) var2);
                  if (oq.field_j != 84) {
                    if (param0 < -93) {
                      L6: {
                        if (13 == oq.field_j) {
                          ((jp) this).field_Ab = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    if (((jp) this).field_Db.length() > 0) {
                      ((jp) this).field_z = ((jp) this).field_Db.toString();
                      ((jp) this).field_Ab = 2;
                      if (param0 < -93) {
                        L7: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      ((jp) this).field_Ab = 1;
                      if (param0 < -93) {
                        L8: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return true;
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  if (!dk.a((byte) 55, (char) var2)) {
                    if (oq.field_j != 84) {
                      if (param0 < -93) {
                        L9: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      if (((jp) this).field_Db.length() > 0) {
                        ((jp) this).field_z = ((jp) this).field_Db.toString();
                        ((jp) this).field_Ab = 2;
                        if (param0 < -93) {
                          L10: {
                            if (13 == oq.field_j) {
                              ((jp) this).field_Ab = 1;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        ((jp) this).field_Ab = 1;
                        if (param0 < -93) {
                          L11: {
                            if (13 == oq.field_j) {
                              ((jp) this).field_Ab = 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$23 = ((jp) this).field_Db.append((char) var2);
                    if (oq.field_j != 84) {
                      if (param0 < -93) {
                        L12: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      if (((jp) this).field_Db.length() > 0) {
                        ((jp) this).field_z = ((jp) this).field_Db.toString();
                        ((jp) this).field_Ab = 2;
                        if (param0 < -93) {
                          L13: {
                            if (13 == oq.field_j) {
                              ((jp) this).field_Ab = 1;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        ((jp) this).field_Ab = 1;
                        if (param0 < -93) {
                          L14: {
                            if (13 == oq.field_j) {
                              ((jp) this).field_Ab = 1;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              } else {
                L15: {
                  if (oq.field_j != 84) {
                    break L15;
                  } else {
                    if (((jp) this).field_Db.length() > 0) {
                      ((jp) this).field_z = ((jp) this).field_Db.toString();
                      ((jp) this).field_Ab = 2;
                      break L15;
                    } else {
                      ((jp) this).field_Ab = 1;
                      break L15;
                    }
                  }
                }
                if (param0 < -93) {
                  L16: {
                    if (13 == oq.field_j) {
                      ((jp) this).field_Ab = 1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              if (((jp) this).field_Db.length() < 12) {
                L17: {
                  var2 = Character.toLowerCase(ho.field_h);
                  if (var2 != 32) {
                    break L17;
                  } else {
                    var2 = 95;
                    break L17;
                  }
                }
                L18: {
                  if (var2 != 95) {
                    break L18;
                  } else {
                    if (((jp) this).field_Db.length() <= 0) {
                      break L18;
                    } else {
                      L19: {
                        StringBuilder discarded$24 = ((jp) this).field_Db.append((char) var2);
                        if (hq.a(-103, (char) var2)) {
                          StringBuilder discarded$25 = ((jp) this).field_Db.append((char) var2);
                          break L19;
                        } else {
                          if (!dk.a((byte) 55, (char) var2)) {
                            break L19;
                          } else {
                            StringBuilder discarded$26 = ((jp) this).field_Db.append((char) var2);
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (oq.field_j != 84) {
                          break L20;
                        } else {
                          if (((jp) this).field_Db.length() > 0) {
                            ((jp) this).field_z = ((jp) this).field_Db.toString();
                            ((jp) this).field_Ab = 2;
                            break L20;
                          } else {
                            ((jp) this).field_Ab = 1;
                            break L20;
                          }
                        }
                      }
                      if (param0 < -93) {
                        L21: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        return true;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                if (hq.a(-103, (char) var2)) {
                  L22: {
                    StringBuilder discarded$27 = ((jp) this).field_Db.append((char) var2);
                    if (oq.field_j != 84) {
                      break L22;
                    } else {
                      if (((jp) this).field_Db.length() > 0) {
                        ((jp) this).field_z = ((jp) this).field_Db.toString();
                        ((jp) this).field_Ab = 2;
                        break L22;
                      } else {
                        ((jp) this).field_Ab = 1;
                        break L22;
                      }
                    }
                  }
                  if (param0 < -93) {
                    L23: {
                      if (13 == oq.field_j) {
                        ((jp) this).field_Ab = 1;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (!dk.a((byte) 55, (char) var2)) {
                    if (oq.field_j != 84) {
                      if (param0 < -93) {
                        L24: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      if (((jp) this).field_Db.length() > 0) {
                        ((jp) this).field_z = ((jp) this).field_Db.toString();
                        ((jp) this).field_Ab = 2;
                        if (param0 < -93) {
                          L25: {
                            if (13 == oq.field_j) {
                              ((jp) this).field_Ab = 1;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        ((jp) this).field_Ab = 1;
                        if (param0 < -93) {
                          L26: {
                            if (13 == oq.field_j) {
                              ((jp) this).field_Ab = 1;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                  } else {
                    L27: {
                      StringBuilder discarded$28 = ((jp) this).field_Db.append((char) var2);
                      if (oq.field_j != 84) {
                        break L27;
                      } else {
                        if (((jp) this).field_Db.length() > 0) {
                          ((jp) this).field_z = ((jp) this).field_Db.toString();
                          ((jp) this).field_Ab = 2;
                          break L27;
                        } else {
                          ((jp) this).field_Ab = 1;
                          break L27;
                        }
                      }
                    }
                    if (param0 < -93) {
                      L28: {
                        if (13 == oq.field_j) {
                          ((jp) this).field_Ab = 1;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                L29: {
                  if (oq.field_j != 84) {
                    break L29;
                  } else {
                    if (((jp) this).field_Db.length() > 0) {
                      ((jp) this).field_z = ((jp) this).field_Db.toString();
                      ((jp) this).field_Ab = 2;
                      break L29;
                    } else {
                      ((jp) this).field_Ab = 1;
                      break L29;
                    }
                  }
                }
                if (param0 >= -93) {
                  return false;
                } else {
                  L30: {
                    if (13 == oq.field_j) {
                      ((jp) this).field_Ab = 1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            if (((jp) this).field_Db.length() < 12) {
              L31: {
                var2 = Character.toLowerCase(ho.field_h);
                if (var2 != 32) {
                  break L31;
                } else {
                  var2 = 95;
                  break L31;
                }
              }
              L32: {
                if (var2 != 95) {
                  break L32;
                } else {
                  if (((jp) this).field_Db.length() <= 0) {
                    break L32;
                  } else {
                    L33: {
                      StringBuilder discarded$29 = ((jp) this).field_Db.append((char) var2);
                      if (hq.a(-103, (char) var2)) {
                        StringBuilder discarded$30 = ((jp) this).field_Db.append((char) var2);
                        break L33;
                      } else {
                        if (!dk.a((byte) 55, (char) var2)) {
                          break L33;
                        } else {
                          StringBuilder discarded$31 = ((jp) this).field_Db.append((char) var2);
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (oq.field_j != 84) {
                        break L34;
                      } else {
                        if (((jp) this).field_Db.length() > 0) {
                          ((jp) this).field_z = ((jp) this).field_Db.toString();
                          ((jp) this).field_Ab = 2;
                          break L34;
                        } else {
                          ((jp) this).field_Ab = 1;
                          break L34;
                        }
                      }
                    }
                    if (param0 >= -93) {
                      return false;
                    } else {
                      L35: {
                        if (13 == oq.field_j) {
                          ((jp) this).field_Ab = 1;
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                      return true;
                    }
                  }
                }
              }
              if (hq.a(-103, (char) var2)) {
                L36: {
                  StringBuilder discarded$32 = ((jp) this).field_Db.append((char) var2);
                  if (oq.field_j != 84) {
                    break L36;
                  } else {
                    if (((jp) this).field_Db.length() > 0) {
                      ((jp) this).field_z = ((jp) this).field_Db.toString();
                      ((jp) this).field_Ab = 2;
                      break L36;
                    } else {
                      ((jp) this).field_Ab = 1;
                      break L36;
                    }
                  }
                }
                if (param0 >= -93) {
                  return false;
                } else {
                  L37: {
                    if (13 == oq.field_j) {
                      ((jp) this).field_Ab = 1;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  return true;
                }
              } else {
                if (!dk.a((byte) 55, (char) var2)) {
                  if (oq.field_j != 84) {
                    if (param0 >= -93) {
                      return false;
                    } else {
                      L38: {
                        if (13 == oq.field_j) {
                          ((jp) this).field_Ab = 1;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      return true;
                    }
                  } else {
                    if (((jp) this).field_Db.length() > 0) {
                      ((jp) this).field_z = ((jp) this).field_Db.toString();
                      ((jp) this).field_Ab = 2;
                      if (param0 >= -93) {
                        return false;
                      } else {
                        L39: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        return true;
                      }
                    } else {
                      ((jp) this).field_Ab = 1;
                      if (param0 >= -93) {
                        return false;
                      } else {
                        L40: {
                          if (13 == oq.field_j) {
                            ((jp) this).field_Ab = 1;
                            break L40;
                          } else {
                            break L40;
                          }
                        }
                        return true;
                      }
                    }
                  }
                } else {
                  L41: {
                    StringBuilder discarded$33 = ((jp) this).field_Db.append((char) var2);
                    if (oq.field_j != 84) {
                      break L41;
                    } else {
                      if (((jp) this).field_Db.length() > 0) {
                        ((jp) this).field_z = ((jp) this).field_Db.toString();
                        ((jp) this).field_Ab = 2;
                        break L41;
                      } else {
                        ((jp) this).field_Ab = 1;
                        break L41;
                      }
                    }
                  }
                  if (param0 >= -93) {
                    return false;
                  } else {
                    L42: {
                      if (13 == oq.field_j) {
                        ((jp) this).field_Ab = 1;
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    return true;
                  }
                }
              }
            } else {
              L43: {
                if (oq.field_j != 84) {
                  break L43;
                } else {
                  if (((jp) this).field_Db.length() > 0) {
                    ((jp) this).field_z = ((jp) this).field_Db.toString();
                    ((jp) this).field_Ab = 2;
                    break L43;
                  } else {
                    ((jp) this).field_Ab = 1;
                    break L43;
                  }
                }
              }
              if (param0 < -93) {
                if (13 != oq.field_j) {
                  return true;
                } else {
                  ((jp) this).field_Ab = 1;
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final static boolean a(String param0) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            var3 = (CharSequence) (Object) param0;
            int discarded$2 = 1;
            stackOut_0_0 = ci.field_d.equals((Object) (Object) ji.a(var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("jp.F(");
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
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -105 + ')');
        }
        return stackIn_1_0;
    }

    jp(int param0, int param1, int param2, int param3, String param4, qr param5, qr param6, qr param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((jp) this).field_Ab = 0;
        try {
          L0: {
            ((jp) this).field_yb = new qr(0L, param6, param4);
            ((jp) this).a(4, ((jp) this).field_yb);
            ((jp) this).field_zb = new qr(0L, param7);
            ((jp) this).field_zb.field_x = 16764006;
            ((jp) this).a(4, ((jp) this).field_zb);
            ((jp) this).field_zb.field_u = "|";
            ((jp) this).field_Db = new StringBuilder(12);
            var9_int = ((jp) this).field_yb.e(false);
            ((jp) this).field_yb.a(var9_int, cr.field_c, (byte) 96, 3, 5);
            ((jp) this).field_zb.a(var9_int, cr.field_c, (byte) 76, cr.field_c + 3, 5);
            var10 = 5 + var9_int + 5;
            var11 = 3 + cr.field_c * 2 + 3;
            var12 = uh.a(-57, param0, var10, param2);
            var13 = uq.a(param3, 0, var11, param1);
            ((jp) this).a(var10, var11, (byte) 63, var13, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("jp.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        ((jp) this).a(param1, -20429);
        if (!param1) {
          if (param0 >= -42) {
            L0: {
              jp.g((byte) -50);
              ((jp) this).field_zb.field_z = ((jp) this).field_Db.toString();
              if (!param1) {
                break L0;
              } else {
                if (je.field_d == 0) {
                  break L0;
                } else {
                  if (0 == ((jp) this).field_rb) {
                    ((jp) this).field_Ab = 1;
                    break L0;
                  } else {
                    return ((jp) this).field_Ab;
                  }
                }
              }
            }
            return ((jp) this).field_Ab;
          } else {
            L1: {
              ((jp) this).field_zb.field_z = ((jp) this).field_Db.toString();
              if (!param1) {
                break L1;
              } else {
                if (je.field_d == 0) {
                  break L1;
                } else {
                  if (0 == ((jp) this).field_rb) {
                    ((jp) this).field_Ab = 1;
                    break L1;
                  } else {
                    return ((jp) this).field_Ab;
                  }
                }
              }
            }
            return ((jp) this).field_Ab;
          }
        } else {
          L2: while (true) {
            int discarded$8 = 55;
            if (!cc.e()) {
              if (param0 < -42) {
                ((jp) this).field_zb.field_z = ((jp) this).field_Db.toString();
                if (param1) {
                  if (je.field_d != 0) {
                    if (0 == ((jp) this).field_rb) {
                      ((jp) this).field_Ab = 1;
                      return ((jp) this).field_Ab;
                    } else {
                      return ((jp) this).field_Ab;
                    }
                  } else {
                    return ((jp) this).field_Ab;
                  }
                } else {
                  return ((jp) this).field_Ab;
                }
              } else {
                jp.g((byte) -50);
                ((jp) this).field_zb.field_z = ((jp) this).field_Db.toString();
                if (param1) {
                  if (je.field_d != 0) {
                    if (0 != ((jp) this).field_rb) {
                      return ((jp) this).field_Ab;
                    } else {
                      ((jp) this).field_Ab = 1;
                      return ((jp) this).field_Ab;
                    }
                  } else {
                    return ((jp) this).field_Ab;
                  }
                } else {
                  return ((jp) this).field_Ab;
                }
              }
            } else {
              L3: {
                if (85 != oq.field_j) {
                  break L3;
                } else {
                  if (0 < ((jp) this).field_Db.length()) {
                    int discarded$9 = 32;
                    StringBuilder discarded$10 = aj.a(((jp) this).field_Db, ((jp) this).field_Db.length() + -1, 29);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                int discarded$11 = 119;
                if (vi.a(ho.field_h, (CharSequence) (Object) ((jp) this).field_Db)) {
                  StringBuilder discarded$12 = ((jp) this).field_Db.append(ho.field_h);
                  break L4;
                } else {
                  L5: {
                    if (((jp) this).field_Db.length() != -1) {
                      break L5;
                    } else {
                      if (91 == ho.field_h) {
                        StringBuilder discarded$13 = ((jp) this).field_Db.append(ho.field_h);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-2 != ((jp) this).field_Db.length()) {
                      break L6;
                    } else {
                      if (ho.field_h == 35) {
                        StringBuilder discarded$14 = ((jp) this).field_Db.append(ho.field_h);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (ho.field_h != 93) {
                    break L4;
                  } else {
                    StringBuilder discarded$15 = ((jp) this).field_Db.append(ho.field_h);
                    break L4;
                  }
                }
              }
              if (oq.field_j != 84) {
                if (oq.field_j == 13) {
                  return 1;
                } else {
                  continue L2;
                }
              } else {
                if (0 >= ((jp) this).field_Db.length()) {
                  return 1;
                } else {
                  ((jp) this).field_z = ((jp) this).field_Db.toString();
                  return 2;
                }
              }
            }
          }
        }
    }

    final static void a(String param0, float param1, byte param2, boolean param3) {
        try {
            if (ed.field_h == null) {
                ed.field_h = new eo(le.field_e, tl.field_z);
                le.field_e.a(true, (vg) (Object) ed.field_h);
            }
            ed.field_h.a(param3, param0, 65536, param1);
            gf.b();
            og.a(0, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "jp.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 121 + ',' + param3 + ')');
        }
    }

    final static void g(byte param0) {
        dp.field_t = false;
        if (mr.field_h == null) {
          L0: {
            if (0 != em.field_h) {
              int discarded$8 = 0;
              qq.c();
              break L0;
            } else {
              break L0;
            }
          }
          jj.field_m = 0;
          if (param0 >= 83) {
            return;
          } else {
            int discarded$9 = 0;
            jp.a((String[]) null);
            return;
          }
        } else {
          L1: {
            mr.field_h.h(0);
            if (0 != em.field_h) {
              int discarded$10 = 0;
              qq.c();
              break L1;
            } else {
              break L1;
            }
          }
          jj.field_m = 0;
          if (param0 >= 83) {
            return;
          } else {
            int discarded$11 = 0;
            jp.a((String[]) null);
            return;
          }
        }
    }

    final static void a(String[] args) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (null == an.field_b) {
                break L1;
              } else {
                an.field_b.field_D.a(args, 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("jp.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + false + ')');
        }
    }

    public static void g(int param0) {
        field_Bb = null;
        field_xb = null;
        field_Cb = null;
        if (param0 < -71) {
            return;
        }
        jp.g((byte) -83);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_xb = "Unpacking sound effects";
    }
}
