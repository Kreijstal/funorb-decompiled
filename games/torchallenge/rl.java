/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private int field_g;
    static ka[] field_h;
    static int field_c;
    int field_b;
    int field_j;
    static int field_f;
    private int field_a;
    private int field_i;
    private int field_d;
    private boolean field_e;

    final boolean a(byte param0) {
        if (param0 > -46) {
            return false;
        }
        return 0 != ((rl) this).field_i ? true : false;
    }

    final static ka[] a(int param0, int param1, lj param2, byte param3) {
        RuntimeException var4 = null;
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
          if (lk.a(160, param2, param1, param0)) {
            return lb.f(204);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("rl.F(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 17 + 41);
        }
    }

    final boolean c(byte param0) {
        if (param0 >= 35) {
          if (0 == ((rl) this).field_d) {
            if (((rl) this).field_a != 84) {
              if (((rl) this).field_a == 83) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static ka b(boolean param0) {
        int var4_int = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var1 = pg.field_r[0] * lg.field_e[0];
        byte[] var2 = h.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = td.field_m[jh.a((int) var2[var4_int], 255)];
        }
        ka var4 = new ka(ij.field_B, le.field_g, ug.field_e[0], dd.field_t[0], pg.field_r[0], lg.field_e[0], var3);
        p.a(0);
        return var4;
    }

    final void b(int param0) {
        ((rl) this).field_d = 0;
        ((rl) this).field_a = 0;
        if (param0 == 15275) {
          if (((rl) this).field_i == 0) {
            if (b.field_J == 98) {
              if (((rl) this).field_j > 0) {
                L0: {
                  ((rl) this).field_e = false;
                  ((rl) this).field_j = ((rl) this).field_j - 1;
                  if (((rl) this).field_i == 0) {
                    ((rl) this).field_a = b.field_J;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (0 == ((rl) this).field_i) {
                  if (99 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    ((rl) this).field_e = false;
                    if (((rl) this).field_b > ((rl) this).field_j) {
                      return;
                    } else {
                      ((rl) this).field_j = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((rl) this).field_j = ((rl) this).field_b;
                L1: {
                  ((rl) this).field_e = false;
                  ((rl) this).field_j = ((rl) this).field_j - 1;
                  if (((rl) this).field_i == 0) {
                    ((rl) this).field_a = b.field_J;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (0 == ((rl) this).field_i) {
                  if (99 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    ((rl) this).field_e = false;
                    if (((rl) this).field_b > ((rl) this).field_j) {
                      return;
                    } else {
                      ((rl) this).field_j = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L2: {
                if (((rl) this).field_i == 0) {
                  ((rl) this).field_a = b.field_J;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 == ((rl) this).field_i) {
                if (99 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  ((rl) this).field_e = false;
                  if (((rl) this).field_b > ((rl) this).field_j) {
                    return;
                  } else {
                    ((rl) this).field_j = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L3: {
              if (((rl) this).field_i == 0) {
                ((rl) this).field_a = b.field_J;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == ((rl) this).field_i) {
              if (99 == b.field_J) {
                ((rl) this).field_j = ((rl) this).field_j + 1;
                ((rl) this).field_e = false;
                if (((rl) this).field_b > ((rl) this).field_j) {
                  return;
                } else {
                  ((rl) this).field_j = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean d(int param0) {
        if (param0 > -84) {
            return false;
        }
        return ((rl) this).field_a == 103 ? true : false;
    }

    final void b(int param0, int param1) {
        if (param0 >= -119) {
          L0: {
            ((rl) this).field_d = -71;
            if (-1 == ((rl) this).field_i) {
              ((rl) this).field_e = false;
              ((rl) this).field_j = param1;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (-1 == ((rl) this).field_i) {
              ((rl) this).field_e = false;
              ((rl) this).field_j = param1;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        ((rl) this).field_a = param0;
        ((rl) this).field_d = 0;
        if (((rl) this).field_i == 0) {
          if (b.field_J == 96) {
            L0: {
              if (((rl) this).field_j <= 0) {
                ((rl) this).field_j = ((rl) this).field_b;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              ((rl) this).field_j = ((rl) this).field_j - 1;
              ((rl) this).field_e = false;
              if (0 == ((rl) this).field_i) {
                ((rl) this).field_a = b.field_J;
                break L1;
              } else {
                break L1;
              }
            }
            if (0 == ((rl) this).field_i) {
              if (b.field_J != 97) {
                return;
              } else {
                L2: {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (((rl) this).field_b <= ((rl) this).field_j) {
                    ((rl) this).field_j = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((rl) this).field_e = false;
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              if (0 == ((rl) this).field_i) {
                ((rl) this).field_a = b.field_J;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == ((rl) this).field_i) {
              if (b.field_J != 97) {
                return;
              } else {
                L4: {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (((rl) this).field_b <= ((rl) this).field_j) {
                    ((rl) this).field_j = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((rl) this).field_e = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L5: {
            if (0 == ((rl) this).field_i) {
              ((rl) this).field_a = b.field_J;
              break L5;
            } else {
              break L5;
            }
          }
          if (0 == ((rl) this).field_i) {
            if (b.field_J != 97) {
              return;
            } else {
              L6: {
                ((rl) this).field_j = ((rl) this).field_j + 1;
                if (((rl) this).field_b <= ((rl) this).field_j) {
                  ((rl) this).field_j = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              ((rl) this).field_e = false;
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_h = null;
    }

    final void a(int param0, int param1) {
        ((rl) this).field_d = 0;
        ((rl) this).field_a = 0;
        if (((rl) this).field_i == 0) {
          if (b.field_J == 96) {
            L0: {
              if (((rl) this).field_j <= 0) {
                ((rl) this).field_j = ((rl) this).field_b;
                break L0;
              } else {
                break L0;
              }
            }
            ((rl) this).field_e = false;
            ((rl) this).field_j = ((rl) this).field_j - 1;
            if (((rl) this).field_i != param0) {
              if (((rl) this).field_i != 0) {
                if (((rl) this).field_i != 0) {
                  return;
                } else {
                  L1: {
                    if (b.field_J == 98) {
                      break L1;
                    } else {
                      if (b.field_J == 99) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                }
              } else {
                if (97 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (~((rl) this).field_b < ~((rl) this).field_j) {
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i != 0) {
                      return;
                    } else {
                      L2: {
                        if (b.field_J == 98) {
                          break L2;
                        } else {
                          if (b.field_J == 99) {
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    }
                  } else {
                    ((rl) this).field_j = 0;
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i != 0) {
                      return;
                    } else {
                      L3: {
                        if (b.field_J == 98) {
                          break L3;
                        } else {
                          if (b.field_J == 99) {
                            break L3;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    }
                  }
                } else {
                  if (((rl) this).field_i != 0) {
                    return;
                  } else {
                    L4: {
                      if (b.field_J == 98) {
                        break L4;
                      } else {
                        if (b.field_J == 99) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  }
                }
              }
            } else {
              L5: {
                ((rl) this).field_a = b.field_J;
                if (((rl) this).field_i != 0) {
                  break L5;
                } else {
                  if (97 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    if (~((rl) this).field_b < ~((rl) this).field_j) {
                      L6: {
                        ((rl) this).field_e = false;
                        if (((rl) this).field_i != 0) {
                          break L6;
                        } else {
                          L7: {
                            if (b.field_J == 98) {
                              break L7;
                            } else {
                              if (b.field_J == 99) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (((rl) this).field_j >= 0) {
                            ((rl) this).field_e = false;
                            return;
                          } else {
                            ((rl) this).field_j = param1;
                            ((rl) this).field_e = false;
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      ((rl) this).field_j = 0;
                      L8: {
                        ((rl) this).field_e = false;
                        if (((rl) this).field_i != 0) {
                          break L8;
                        } else {
                          L9: {
                            if (b.field_J == 98) {
                              break L9;
                            } else {
                              if (b.field_J == 99) {
                                break L9;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (((rl) this).field_j >= 0) {
                            ((rl) this).field_e = false;
                            return;
                          } else {
                            ((rl) this).field_j = param1;
                            ((rl) this).field_e = false;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              if (((rl) this).field_i != 0) {
                return;
              } else {
                if (b.field_J != 98) {
                  if (b.field_J != 99) {
                    return;
                  } else {
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  }
                } else {
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                }
              }
            }
          } else {
            if (((rl) this).field_i != param0) {
              if (((rl) this).field_i != 0) {
                if (((rl) this).field_i != 0) {
                  return;
                } else {
                  L10: {
                    if (b.field_J == 98) {
                      break L10;
                    } else {
                      if (b.field_J == 99) {
                        break L10;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                }
              } else {
                if (97 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (~((rl) this).field_b < ~((rl) this).field_j) {
                    L11: {
                      ((rl) this).field_e = false;
                      if (((rl) this).field_i != 0) {
                        break L11;
                      } else {
                        L12: {
                          if (b.field_J == 98) {
                            break L12;
                          } else {
                            if (b.field_J == 99) {
                              break L12;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (((rl) this).field_j >= 0) {
                          ((rl) this).field_e = false;
                          return;
                        } else {
                          ((rl) this).field_j = param1;
                          ((rl) this).field_e = false;
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    ((rl) this).field_j = 0;
                    L13: {
                      ((rl) this).field_e = false;
                      if (((rl) this).field_i != 0) {
                        break L13;
                      } else {
                        L14: {
                          if (b.field_J == 98) {
                            break L14;
                          } else {
                            if (b.field_J == 99) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (((rl) this).field_j >= 0) {
                          ((rl) this).field_e = false;
                          return;
                        } else {
                          ((rl) this).field_j = param1;
                          ((rl) this).field_e = false;
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L15: {
                    if (((rl) this).field_i != 0) {
                      break L15;
                    } else {
                      L16: {
                        if (b.field_J == 98) {
                          break L16;
                        } else {
                          if (b.field_J == 99) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L17: {
                ((rl) this).field_a = b.field_J;
                if (((rl) this).field_i != 0) {
                  break L17;
                } else {
                  if (97 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    if (~((rl) this).field_b < ~((rl) this).field_j) {
                      ((rl) this).field_e = false;
                      break L17;
                    } else {
                      ((rl) this).field_j = 0;
                      ((rl) this).field_e = false;
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (((rl) this).field_i != 0) {
                  break L18;
                } else {
                  L19: {
                    if (b.field_J == 98) {
                      break L19;
                    } else {
                      if (b.field_J == 99) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (((rl) this).field_i != param0) {
            if (((rl) this).field_i != 0) {
              if (((rl) this).field_i != 0) {
                return;
              } else {
                L20: {
                  if (b.field_J == 98) {
                    break L20;
                  } else {
                    if (b.field_J == 99) {
                      break L20;
                    } else {
                      return;
                    }
                  }
                }
                if (((rl) this).field_j >= 0) {
                  ((rl) this).field_e = false;
                  return;
                } else {
                  ((rl) this).field_j = param1;
                  ((rl) this).field_e = false;
                  return;
                }
              }
            } else {
              if (97 == b.field_J) {
                ((rl) this).field_j = ((rl) this).field_j + 1;
                if (~((rl) this).field_b < ~((rl) this).field_j) {
                  L21: {
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i != 0) {
                      break L21;
                    } else {
                      L22: {
                        if (b.field_J == 98) {
                          break L22;
                        } else {
                          if (b.field_J == 99) {
                            break L22;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  ((rl) this).field_j = 0;
                  L23: {
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i != 0) {
                      break L23;
                    } else {
                      L24: {
                        if (b.field_J == 98) {
                          break L24;
                        } else {
                          if (b.field_J == 99) {
                            break L24;
                          } else {
                            break L23;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  if (((rl) this).field_i != 0) {
                    break L25;
                  } else {
                    L26: {
                      if (b.field_J == 98) {
                        break L26;
                      } else {
                        if (b.field_J == 99) {
                          break L26;
                        } else {
                          break L25;
                        }
                      }
                    }
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  }
                }
                return;
              }
            }
          } else {
            L27: {
              ((rl) this).field_a = b.field_J;
              if (((rl) this).field_i != 0) {
                break L27;
              } else {
                if (97 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (~((rl) this).field_b < ~((rl) this).field_j) {
                    ((rl) this).field_e = false;
                    break L27;
                  } else {
                    ((rl) this).field_j = 0;
                    ((rl) this).field_e = false;
                    break L27;
                  }
                } else {
                  break L27;
                }
              }
            }
            L28: {
              if (((rl) this).field_i != 0) {
                break L28;
              } else {
                L29: {
                  if (b.field_J == 98) {
                    break L29;
                  } else {
                    if (b.field_J == 99) {
                      break L29;
                    } else {
                      break L28;
                    }
                  }
                }
                if (((rl) this).field_j >= 0) {
                  ((rl) this).field_e = false;
                  return;
                } else {
                  ((rl) this).field_j = param1;
                  ((rl) this).field_e = false;
                  return;
                }
              }
            }
            return;
          }
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        ij.c((byte) -98);
        if (null != bg.field_P) {
          L0: {
            rk.a((byte) -100, bg.field_P);
            var1 = 0;
            cg.a((byte) -102);
            tc.c(-119);
            pa.f((byte) 109);
            if (td.a(20422)) {
              dk.field_s.d(25, 1);
              nb.a(0, -1);
              break L0;
            } else {
              break L0;
            }
          }
          ob.b(-95);
          return;
        } else {
          L1: {
            var1 = 0;
            cg.a((byte) -102);
            tc.c(-119);
            pa.f((byte) 109);
            if (td.a(20422)) {
              dk.field_s.d(25, 1);
              nb.a(0, -1);
              break L1;
            } else {
              break L1;
            }
          }
          ob.b(-95);
          return;
        }
    }

    final void e(int param0) {
        ((rl) this).field_a = 0;
        ((rl) this).field_d = param0;
        if (!(((rl) this).field_i != 0)) {
            ((rl) this).field_a = b.field_J;
        }
    }

    final boolean g(int param0) {
        if (param0 >= -109) {
            return true;
        }
        return ((rl) this).field_a == 97 ? true : false;
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((rl) this).field_i = 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((rl) this).field_e = stackIn_3_1 != 0;
        if (((rl) this).field_e) {
          ((rl) this).field_j = param3;
          var5 = -113 / ((-43 - param0) / 35);
          return;
        } else {
          ((rl) this).field_j = param2;
          var5 = -113 / ((-43 - param0) / 35);
          return;
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 8543) {
          L0: {
            boolean discarded$10 = ((rl) this).c((byte) 30);
            if (((rl) this).field_a != 102) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((rl) this).field_a != 102) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return ((rl) this).field_a == 96 ? true : false;
    }

    final void a(byte param0, int param1, int param2) {
        if (~((rl) this).field_b < ~param1) {
          if (~((rl) this).field_b >= ~param2) {
            throw new IllegalArgumentException();
          } else {
            ((rl) this).field_d = 0;
            ((rl) this).field_a = 0;
            if (vb.field_n != 0) {
              ((rl) this).field_d = vb.field_n;
              ((rl) this).field_i = vb.field_n;
              ((rl) this).field_e = true;
              ((rl) this).field_j = param2;
              ((rl) this).field_g = pl.field_a;
              if (((rl) this).field_i != 0) {
                L0: {
                  if (0 != wh.field_e) {
                    L1: {
                      if (0 >= ((rl) this).field_g) {
                        ((rl) this).field_g = v.field_W;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((rl) this).field_g = ((rl) this).field_g - 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (0 == vb.field_n) {
                  if (wh.field_e == 0) {
                    L2: {
                      ((rl) this).field_i = 0;
                      if (param0 > 1) {
                        break L2;
                      } else {
                        ((rl) this).field_d = 76;
                        break L2;
                      }
                    }
                    L3: {
                      if (((rl) this).field_i != 0) {
                        break L3;
                      } else {
                        L4: {
                          if (((rl) this).field_e) {
                            break L4;
                          } else {
                            if (ek.field_P) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (((rl) this).field_e) {
                            ((rl) this).field_j = -1;
                            break L3;
                          } else {
                            return;
                          }
                        } else {
                          if (~param1 != ~((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            break L3;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    if (param0 > 1) {
                      L5: {
                        if (((rl) this).field_i != 0) {
                          break L5;
                        } else {
                          L6: {
                            if (((rl) this).field_e) {
                              break L6;
                            } else {
                              if (ek.field_P) {
                                break L6;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (((rl) this).field_e) {
                              ((rl) this).field_j = -1;
                              break L5;
                            } else {
                              return;
                            }
                          } else {
                            if (~param1 != ~((rl) this).field_j) {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              return;
                            } else {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L7: {
                        ((rl) this).field_d = 76;
                        if (((rl) this).field_i != 0) {
                          break L7;
                        } else {
                          L8: {
                            if (((rl) this).field_e) {
                              break L8;
                            } else {
                              if (ek.field_P) {
                                break L8;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (((rl) this).field_e) {
                              ((rl) this).field_j = -1;
                              break L7;
                            } else {
                              return;
                            }
                          } else {
                            if (~param1 != ~((rl) this).field_j) {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              return;
                            } else {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              return;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (param0 > 1) {
                    L9: {
                      if (((rl) this).field_i != 0) {
                        break L9;
                      } else {
                        L10: {
                          if (((rl) this).field_e) {
                            break L10;
                          } else {
                            if (ek.field_P) {
                              break L10;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (((rl) this).field_e) {
                            ((rl) this).field_j = -1;
                            break L9;
                          } else {
                            return;
                          }
                        } else {
                          if (~param1 != ~((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L11: {
                      ((rl) this).field_d = 76;
                      if (((rl) this).field_i != 0) {
                        break L11;
                      } else {
                        L12: {
                          if (((rl) this).field_e) {
                            break L12;
                          } else {
                            if (ek.field_P) {
                              break L12;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (((rl) this).field_e) {
                            ((rl) this).field_j = -1;
                            break L11;
                          } else {
                            return;
                          }
                        } else {
                          if (~param1 != ~((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                L13: {
                  if (0 != vb.field_n) {
                    break L13;
                  } else {
                    if (wh.field_e != 0) {
                      break L13;
                    } else {
                      L14: {
                        ((rl) this).field_i = 0;
                        if (param0 > 1) {
                          break L14;
                        } else {
                          ((rl) this).field_d = 76;
                          break L14;
                        }
                      }
                      L15: {
                        if (((rl) this).field_i != 0) {
                          break L15;
                        } else {
                          L16: {
                            if (((rl) this).field_e) {
                              break L16;
                            } else {
                              if (ek.field_P) {
                                break L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (((rl) this).field_e) {
                              ((rl) this).field_j = -1;
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            if (~param1 != ~((rl) this).field_j) {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              break L15;
                            } else {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              break L15;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0 > 1) {
                  L17: {
                    if (((rl) this).field_i != 0) {
                      break L17;
                    } else {
                      L18: {
                        if (((rl) this).field_e) {
                          break L18;
                        } else {
                          if (ek.field_P) {
                            break L18;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param1 < 0) {
                        if (((rl) this).field_e) {
                          ((rl) this).field_j = -1;
                          break L17;
                        } else {
                          return;
                        }
                      } else {
                        if (~param1 != ~((rl) this).field_j) {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          return;
                        } else {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          return;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L19: {
                    ((rl) this).field_d = 76;
                    if (((rl) this).field_i != 0) {
                      break L19;
                    } else {
                      L20: {
                        if (((rl) this).field_e) {
                          break L20;
                        } else {
                          if (ek.field_P) {
                            break L20;
                          } else {
                            break L19;
                          }
                        }
                      }
                      if (param1 < 0) {
                        if (((rl) this).field_e) {
                          ((rl) this).field_j = -1;
                          break L19;
                        } else {
                          break L19;
                        }
                      } else {
                        if (~param1 != ~((rl) this).field_j) {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          break L19;
                        } else {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          break L19;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L21: {
                if (((rl) this).field_i == 0) {
                  break L21;
                } else {
                  if (0 != wh.field_e) {
                    L22: {
                      if (0 >= ((rl) this).field_g) {
                        ((rl) this).field_g = v.field_W;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    ((rl) this).field_g = ((rl) this).field_g - 1;
                    break L21;
                  } else {
                    break L21;
                  }
                }
              }
              L23: {
                if (0 != vb.field_n) {
                  break L23;
                } else {
                  if (wh.field_e != 0) {
                    break L23;
                  } else {
                    L24: {
                      ((rl) this).field_i = 0;
                      if (param0 > 1) {
                        break L24;
                      } else {
                        ((rl) this).field_d = 76;
                        break L24;
                      }
                    }
                    L25: {
                      if (((rl) this).field_i != 0) {
                        break L25;
                      } else {
                        L26: {
                          if (((rl) this).field_e) {
                            break L26;
                          } else {
                            if (ek.field_P) {
                              break L26;
                            } else {
                              break L25;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (((rl) this).field_e) {
                            ((rl) this).field_j = -1;
                            break L25;
                          } else {
                            break L25;
                          }
                        } else {
                          if (~param1 != ~((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            break L25;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            break L25;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (param0 > 1) {
                L27: {
                  if (((rl) this).field_i != 0) {
                    break L27;
                  } else {
                    L28: {
                      if (((rl) this).field_e) {
                        break L28;
                      } else {
                        if (ek.field_P) {
                          break L28;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param1 < 0) {
                      if (((rl) this).field_e) {
                        ((rl) this).field_j = -1;
                        break L27;
                      } else {
                        return;
                      }
                    } else {
                      if (~param1 != ~((rl) this).field_j) {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        return;
                      } else {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                L29: {
                  ((rl) this).field_d = 76;
                  if (((rl) this).field_i != 0) {
                    break L29;
                  } else {
                    L30: {
                      if (((rl) this).field_e) {
                        break L30;
                      } else {
                        if (ek.field_P) {
                          break L30;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (param1 < 0) {
                      if (((rl) this).field_e) {
                        ((rl) this).field_j = -1;
                        break L29;
                      } else {
                        break L29;
                      }
                    } else {
                      if (~param1 != ~((rl) this).field_j) {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        break L29;
                      } else {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        break L29;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    rl(int param0) {
        ((rl) this).field_j = 0;
        ((rl) this).field_e = false;
        ((rl) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
    }
}
