/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    private byte[] field_a;
    static int[] field_c;
    private boolean field_d;
    private int field_b;

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (!((um) this).field_d) {
          if (param0 == -30223) {
            return null;
          } else {
            ((um) this).field_a = null;
            return null;
          }
        } else {
          var3 = ((um) this).field_a;
          var2 = var3;
          ((um) this).field_a = null;
          return var3;
        }
    }

    final void a(ds param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = param0.h(90);
        if (param2) {
          System.out.println("data_len received: " + var4 + " (hex " + Integer.toHexString(var4) + ")");
          if (!((um) this).field_d) {
            L0: {
              if (null == ((um) this).field_a) {
                break L0;
              } else {
                if (((um) this).field_a.length == var4) {
                  L1: {
                    var5 = param0.h(90);
                    if (param2) {
                      System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (!param2) {
                      break L2;
                    } else {
                      if (((um) this).field_b == var5) {
                        break L2;
                      } else {
                        throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
                      }
                    }
                  }
                  var6 = param0.e(1869);
                  if (!param2) {
                    param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                    ((um) this).field_b = ((um) this).field_b + var6;
                    if (((um) this).field_a.length > ((um) this).field_b) {
                      L3: {
                        if (!param2) {
                          break L3;
                        } else {
                          if (((um) this).field_d) {
                            System.out.println("Ready!");
                            break L3;
                          } else {
                            if (param1 > 68) {
                              return;
                            } else {
                              field_c = null;
                              return;
                            }
                          }
                        }
                      }
                      if (param1 > 68) {
                        return;
                      } else {
                        field_c = null;
                        return;
                      }
                    } else {
                      L4: {
                        ((um) this).field_d = true;
                        if (!param2) {
                          break L4;
                        } else {
                          if (((um) this).field_d) {
                            System.out.println("Ready!");
                            break L4;
                          } else {
                            L5: {
                              if (param1 > 68) {
                                break L5;
                              } else {
                                field_c = null;
                                break L5;
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (param1 > 68) {
                        return;
                      } else {
                        field_c = null;
                        return;
                      }
                    }
                  } else {
                    System.out.println("Receiving: " + var6);
                    param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                    ((um) this).field_b = ((um) this).field_b + var6;
                    if (((um) this).field_a.length > ((um) this).field_b) {
                      L6: {
                        if (!param2) {
                          break L6;
                        } else {
                          if (((um) this).field_d) {
                            System.out.println("Ready!");
                            break L6;
                          } else {
                            L7: {
                              if (param1 > 68) {
                                break L7;
                              } else {
                                field_c = null;
                                break L7;
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (param1 <= 68) {
                        field_c = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L8: {
                        ((um) this).field_d = true;
                        if (((um) this).field_d) {
                          System.out.println("Ready!");
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (param1 > 68) {
                          break L9;
                        } else {
                          field_c = null;
                          break L9;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            if (!param2) {
              L10: {
                ((um) this).field_b = 0;
                ((um) this).field_d = false;
                ((um) this).field_a = new byte[var4];
                var5 = param0.h(90);
                if (param2) {
                  System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
                  break L10;
                } else {
                  break L10;
                }
              }
              if (param2) {
                if (((um) this).field_b == var5) {
                  L11: {
                    var6 = param0.e(1869);
                    if (!param2) {
                      break L11;
                    } else {
                      System.out.println("Receiving: " + var6);
                      break L11;
                    }
                  }
                  L12: {
                    param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                    ((um) this).field_b = ((um) this).field_b + var6;
                    if (((um) this).field_a.length > ((um) this).field_b) {
                      break L12;
                    } else {
                      ((um) this).field_d = true;
                      break L12;
                    }
                  }
                  L13: {
                    if (!param2) {
                      break L13;
                    } else {
                      if (((um) this).field_d) {
                        System.out.println("Ready!");
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (param1 > 68) {
                      break L14;
                    } else {
                      field_c = null;
                      break L14;
                    }
                  }
                  return;
                } else {
                  throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
                }
              } else {
                L15: {
                  var6 = param0.e(1869);
                  if (!param2) {
                    break L15;
                  } else {
                    System.out.println("Receiving: " + var6);
                    break L15;
                  }
                }
                L16: {
                  param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                  ((um) this).field_b = ((um) this).field_b + var6;
                  if (((um) this).field_a.length > ((um) this).field_b) {
                    break L16;
                  } else {
                    ((um) this).field_d = true;
                    break L16;
                  }
                }
                L17: {
                  if (!param2) {
                    break L17;
                  } else {
                    if (((um) this).field_d) {
                      System.out.println("Ready!");
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                L18: {
                  if (param1 > 68) {
                    break L18;
                  } else {
                    field_c = null;
                    break L18;
                  }
                }
                return;
              }
            } else {
              System.out.println("allocating new buffer");
              L19: {
                ((um) this).field_b = 0;
                ((um) this).field_d = false;
                ((um) this).field_a = new byte[var4];
                var5 = param0.h(90);
                if (param2) {
                  System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
                  break L19;
                } else {
                  break L19;
                }
              }
              if (param2) {
                if (((um) this).field_b != var5) {
                  throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
                } else {
                  L20: {
                    var6 = param0.e(1869);
                    if (!param2) {
                      break L20;
                    } else {
                      System.out.println("Receiving: " + var6);
                      break L20;
                    }
                  }
                  L21: {
                    param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                    ((um) this).field_b = ((um) this).field_b + var6;
                    if (((um) this).field_a.length > ((um) this).field_b) {
                      break L21;
                    } else {
                      ((um) this).field_d = true;
                      break L21;
                    }
                  }
                  L22: {
                    if (!param2) {
                      break L22;
                    } else {
                      if (((um) this).field_d) {
                        System.out.println("Ready!");
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (param1 > 68) {
                      break L23;
                    } else {
                      field_c = null;
                      break L23;
                    }
                  }
                  return;
                }
              } else {
                L24: {
                  var6 = param0.e(1869);
                  if (!param2) {
                    break L24;
                  } else {
                    System.out.println("Receiving: " + var6);
                    break L24;
                  }
                }
                L25: {
                  param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                  ((um) this).field_b = ((um) this).field_b + var6;
                  if (((um) this).field_a.length > ((um) this).field_b) {
                    break L25;
                  } else {
                    ((um) this).field_d = true;
                    break L25;
                  }
                }
                L26: {
                  if (!param2) {
                    break L26;
                  } else {
                    if (((um) this).field_d) {
                      System.out.println("Ready!");
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                L27: {
                  if (param1 > 68) {
                    break L27;
                  } else {
                    field_c = null;
                    break L27;
                  }
                }
                return;
              }
            }
          } else {
            if (!param2) {
              L28: {
                ((um) this).field_b = 0;
                ((um) this).field_d = false;
                ((um) this).field_a = new byte[var4];
                var5 = param0.h(90);
                if (param2) {
                  System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
                  break L28;
                } else {
                  break L28;
                }
              }
              if (param2) {
                if (((um) this).field_b != var5) {
                  throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
                } else {
                  L29: {
                    var6 = param0.e(1869);
                    if (!param2) {
                      break L29;
                    } else {
                      System.out.println("Receiving: " + var6);
                      break L29;
                    }
                  }
                  L30: {
                    param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                    ((um) this).field_b = ((um) this).field_b + var6;
                    if (((um) this).field_a.length > ((um) this).field_b) {
                      break L30;
                    } else {
                      ((um) this).field_d = true;
                      break L30;
                    }
                  }
                  L31: {
                    if (!param2) {
                      break L31;
                    } else {
                      if (((um) this).field_d) {
                        System.out.println("Ready!");
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                  }
                  L32: {
                    if (param1 > 68) {
                      break L32;
                    } else {
                      field_c = null;
                      break L32;
                    }
                  }
                  return;
                }
              } else {
                L33: {
                  var6 = param0.e(1869);
                  if (!param2) {
                    break L33;
                  } else {
                    System.out.println("Receiving: " + var6);
                    break L33;
                  }
                }
                L34: {
                  param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                  ((um) this).field_b = ((um) this).field_b + var6;
                  if (((um) this).field_a.length > ((um) this).field_b) {
                    break L34;
                  } else {
                    ((um) this).field_d = true;
                    break L34;
                  }
                }
                L35: {
                  if (!param2) {
                    break L35;
                  } else {
                    if (((um) this).field_d) {
                      System.out.println("Ready!");
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                }
                L36: {
                  if (param1 > 68) {
                    break L36;
                  } else {
                    field_c = null;
                    break L36;
                  }
                }
                return;
              }
            } else {
              System.out.println("allocating new buffer");
              L37: {
                ((um) this).field_b = 0;
                ((um) this).field_d = false;
                ((um) this).field_a = new byte[var4];
                var5 = param0.h(90);
                if (param2) {
                  System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
                  break L37;
                } else {
                  break L37;
                }
              }
              if (param2) {
                if (((um) this).field_b == var5) {
                  L38: {
                    var6 = param0.e(1869);
                    if (!param2) {
                      break L38;
                    } else {
                      System.out.println("Receiving: " + var6);
                      break L38;
                    }
                  }
                  L39: {
                    param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                    ((um) this).field_b = ((um) this).field_b + var6;
                    if (((um) this).field_a.length > ((um) this).field_b) {
                      break L39;
                    } else {
                      ((um) this).field_d = true;
                      break L39;
                    }
                  }
                  L40: {
                    if (!param2) {
                      break L40;
                    } else {
                      if (((um) this).field_d) {
                        System.out.println("Ready!");
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                  }
                  L41: {
                    if (param1 > 68) {
                      break L41;
                    } else {
                      field_c = null;
                      break L41;
                    }
                  }
                  return;
                } else {
                  throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
                }
              } else {
                L42: {
                  var6 = param0.e(1869);
                  if (!param2) {
                    break L42;
                  } else {
                    System.out.println("Receiving: " + var6);
                    break L42;
                  }
                }
                L43: {
                  param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                  ((um) this).field_b = ((um) this).field_b + var6;
                  if (((um) this).field_a.length > ((um) this).field_b) {
                    break L43;
                  } else {
                    ((um) this).field_d = true;
                    break L43;
                  }
                }
                L44: {
                  if (!param2) {
                    break L44;
                  } else {
                    if (((um) this).field_d) {
                      System.out.println("Ready!");
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                }
                L45: {
                  if (param1 > 68) {
                    break L45;
                  } else {
                    field_c = null;
                    break L45;
                  }
                }
                return;
              }
            }
          }
        } else {
          L46: {
            if (((um) this).field_d) {
              break L46;
            } else {
              if (null == ((um) this).field_a) {
                break L46;
              } else {
                if (((um) this).field_a.length == var4) {
                  L47: {
                    var5 = param0.h(90);
                    if (param2) {
                      System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
                      break L47;
                    } else {
                      break L47;
                    }
                  }
                  L48: {
                    if (!param2) {
                      break L48;
                    } else {
                      if (((um) this).field_b == var5) {
                        break L48;
                      } else {
                        throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
                      }
                    }
                  }
                  var6 = param0.e(1869);
                  if (!param2) {
                    param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                    ((um) this).field_b = ((um) this).field_b + var6;
                    if (((um) this).field_a.length > ((um) this).field_b) {
                      L49: {
                        if (!param2) {
                          break L49;
                        } else {
                          if (((um) this).field_d) {
                            System.out.println("Ready!");
                            break L49;
                          } else {
                            L50: {
                              if (param1 > 68) {
                                break L50;
                              } else {
                                field_c = null;
                                break L50;
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (param1 <= 68) {
                        field_c = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L51: {
                        ((um) this).field_d = true;
                        if (!param2) {
                          break L51;
                        } else {
                          if (((um) this).field_d) {
                            System.out.println("Ready!");
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                      }
                      L52: {
                        if (param1 > 68) {
                          break L52;
                        } else {
                          field_c = null;
                          break L52;
                        }
                      }
                      return;
                    }
                  } else {
                    L53: {
                      System.out.println("Receiving: " + var6);
                      param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                      ((um) this).field_b = ((um) this).field_b + var6;
                      if (((um) this).field_a.length > ((um) this).field_b) {
                        break L53;
                      } else {
                        ((um) this).field_d = true;
                        break L53;
                      }
                    }
                    L54: {
                      if (!param2) {
                        break L54;
                      } else {
                        if (((um) this).field_d) {
                          System.out.println("Ready!");
                          break L54;
                        } else {
                          break L54;
                        }
                      }
                    }
                    L55: {
                      if (param1 > 68) {
                        break L55;
                      } else {
                        field_c = null;
                        break L55;
                      }
                    }
                    return;
                  }
                } else {
                  break L46;
                }
              }
            }
          }
          if (!param2) {
            ((um) this).field_b = 0;
            ((um) this).field_d = false;
            ((um) this).field_a = new byte[var4];
            var5 = param0.h(90);
            if (param2) {
              if (((um) this).field_b != var5) {
                throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
              } else {
                L56: {
                  var6 = param0.e(1869);
                  if (!param2) {
                    break L56;
                  } else {
                    System.out.println("Receiving: " + var6);
                    break L56;
                  }
                }
                L57: {
                  param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                  ((um) this).field_b = ((um) this).field_b + var6;
                  if (((um) this).field_a.length > ((um) this).field_b) {
                    break L57;
                  } else {
                    ((um) this).field_d = true;
                    break L57;
                  }
                }
                L58: {
                  if (!param2) {
                    break L58;
                  } else {
                    if (((um) this).field_d) {
                      System.out.println("Ready!");
                      break L58;
                    } else {
                      break L58;
                    }
                  }
                }
                L59: {
                  if (param1 > 68) {
                    break L59;
                  } else {
                    field_c = null;
                    break L59;
                  }
                }
                return;
              }
            } else {
              L60: {
                var6 = param0.e(1869);
                if (!param2) {
                  break L60;
                } else {
                  System.out.println("Receiving: " + var6);
                  break L60;
                }
              }
              L61: {
                param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                ((um) this).field_b = ((um) this).field_b + var6;
                if (((um) this).field_a.length > ((um) this).field_b) {
                  break L61;
                } else {
                  ((um) this).field_d = true;
                  break L61;
                }
              }
              L62: {
                if (!param2) {
                  break L62;
                } else {
                  if (((um) this).field_d) {
                    System.out.println("Ready!");
                    break L62;
                  } else {
                    break L62;
                  }
                }
              }
              L63: {
                if (param1 > 68) {
                  break L63;
                } else {
                  field_c = null;
                  break L63;
                }
              }
              return;
            }
          } else {
            System.out.println("allocating new buffer");
            ((um) this).field_b = 0;
            ((um) this).field_d = false;
            ((um) this).field_a = new byte[var4];
            var5 = param0.h(90);
            if (param2) {
              if (((um) this).field_b != var5) {
                throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4);
              } else {
                L64: {
                  var6 = param0.e(1869);
                  if (!param2) {
                    break L64;
                  } else {
                    System.out.println("Receiving: " + var6);
                    break L64;
                  }
                }
                L65: {
                  param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                  ((um) this).field_b = ((um) this).field_b + var6;
                  if (((um) this).field_a.length > ((um) this).field_b) {
                    break L65;
                  } else {
                    ((um) this).field_d = true;
                    break L65;
                  }
                }
                L66: {
                  if (!param2) {
                    break L66;
                  } else {
                    if (((um) this).field_d) {
                      System.out.println("Ready!");
                      break L66;
                    } else {
                      break L66;
                    }
                  }
                }
                L67: {
                  if (param1 > 68) {
                    break L67;
                  } else {
                    field_c = null;
                    break L67;
                  }
                }
                return;
              }
            } else {
              L68: {
                var6 = param0.e(1869);
                if (!param2) {
                  break L68;
                } else {
                  System.out.println("Receiving: " + var6);
                  break L68;
                }
              }
              L69: {
                param0.a(var5, ((um) this).field_a, (byte) -59, var6);
                ((um) this).field_b = ((um) this).field_b + var6;
                if (((um) this).field_a.length > ((um) this).field_b) {
                  break L69;
                } else {
                  ((um) this).field_d = true;
                  break L69;
                }
              }
              L70: {
                if (!param2) {
                  break L70;
                } else {
                  if (((um) this).field_d) {
                    System.out.println("Ready!");
                    break L70;
                  } else {
                    break L70;
                  }
                }
              }
              L71: {
                if (param1 > 68) {
                  break L71;
                } else {
                  field_c = null;
                  break L71;
                }
              }
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 100) {
            return;
        }
        field_c = null;
    }

    final int c(int param0) {
        if (param0 == 0) {
          if (!((um) this).field_d) {
            if (null == ((um) this).field_a) {
              return 0;
            } else {
              return ((um) this).field_b * 100 / ((um) this).field_a.length;
            }
          } else {
            return 0;
          }
        } else {
          return -31;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
