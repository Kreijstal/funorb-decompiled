/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private int field_a;
    private boolean field_e;
    static int field_d;
    private int field_b;
    static jpa field_j;
    static String field_g;
    int field_i;
    int field_h;
    private int field_f;
    private int field_c;

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            ((ko) this).a(17, 31, 66);
            if (102 != ((ko) this).field_c) {
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
            if (102 != ((ko) this).field_c) {
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

    final boolean a(byte param0) {
        if (param0 >= -126) {
            return true;
        }
        return ((ko) this).field_f != 0 ? true : false;
    }

    final boolean e(int param0) {
        int var2 = 104 / ((param0 - 11) / 57);
        return 97 == ((ko) this).field_c ? true : false;
    }

    final void b(int param0, int param1) {
        int var3 = -96 / ((param1 - 18) / 61);
        if (!(((ko) this).field_f != 0)) {
            ((ko) this).field_h = param0;
            ((ko) this).field_e = false;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (((ko) this).field_i <= param2) {
          throw new IllegalArgumentException();
        } else {
          if (((ko) this).field_i > param0) {
            ((ko) this).field_c = 0;
            ((ko) this).field_b = 0;
            if (hf.field_b == 0) {
              if (-1 != (((ko) this).field_f ^ -1)) {
                if (ksa.field_p != 0) {
                  if (0 < ((ko) this).field_a) {
                    L0: {
                      ((ko) this).field_a = ((ko) this).field_a - 1;
                      if (hf.field_b != 0) {
                        break L0;
                      } else {
                        if (0 == ksa.field_p) {
                          ((ko) this).field_f = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    L1: {
                      var4 = -69 % ((-29 - param1) / 63);
                      if (0 != ((ko) this).field_f) {
                        break L1;
                      } else {
                        L2: {
                          if (((ko) this).field_e) {
                            break L2;
                          } else {
                            if (!qma.field_c) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        if (-1 >= (param2 ^ -1)) {
                          if (param2 != ((ko) this).field_h) {
                            ((ko) this).field_e = true;
                            ((ko) this).field_h = param2;
                            return;
                          } else {
                            ((ko) this).field_e = true;
                            ((ko) this).field_h = param2;
                            return;
                          }
                        } else {
                          if (!((ko) this).field_e) {
                            break L1;
                          } else {
                            ((ko) this).field_h = -1;
                            break L1;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    ((ko) this).field_a = aua.field_b;
                    L3: {
                      ((ko) this).field_a = ((ko) this).field_a - 1;
                      if (hf.field_b != 0) {
                        break L3;
                      } else {
                        if (0 == ksa.field_p) {
                          ((ko) this).field_f = 0;
                          break L3;
                        } else {
                          L4: {
                            var4 = -69 % ((-29 - param1) / 63);
                            if (0 != ((ko) this).field_f) {
                              break L4;
                            } else {
                              L5: {
                                if (((ko) this).field_e) {
                                  break L5;
                                } else {
                                  if (!qma.field_c) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              if (-1 >= (param2 ^ -1)) {
                                if (param2 != ((ko) this).field_h) {
                                  ((ko) this).field_e = true;
                                  ((ko) this).field_h = param2;
                                  return;
                                } else {
                                  ((ko) this).field_e = true;
                                  ((ko) this).field_h = param2;
                                  return;
                                }
                              } else {
                                if (!((ko) this).field_e) {
                                  break L4;
                                } else {
                                  ((ko) this).field_h = -1;
                                  break L4;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L6: {
                      var4 = -69 % ((-29 - param1) / 63);
                      if (0 != ((ko) this).field_f) {
                        break L6;
                      } else {
                        if (((ko) this).field_e) {
                          if (-1 >= (param2 ^ -1)) {
                            if (param2 != ((ko) this).field_h) {
                              ((ko) this).field_e = true;
                              ((ko) this).field_h = param2;
                              return;
                            } else {
                              ((ko) this).field_e = true;
                              ((ko) this).field_h = param2;
                              return;
                            }
                          } else {
                            if (!((ko) this).field_e) {
                              break L6;
                            } else {
                              ((ko) this).field_h = -1;
                              return;
                            }
                          }
                        } else {
                          if (!qma.field_c) {
                            break L6;
                          } else {
                            if (-1 >= (param2 ^ -1)) {
                              if (param2 != ((ko) this).field_h) {
                                ((ko) this).field_e = true;
                                ((ko) this).field_h = param2;
                                return;
                              } else {
                                ((ko) this).field_e = true;
                                ((ko) this).field_h = param2;
                                return;
                              }
                            } else {
                              L7: {
                                if (!((ko) this).field_e) {
                                  break L7;
                                } else {
                                  ((ko) this).field_h = -1;
                                  break L7;
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (hf.field_b != 0) {
                      break L8;
                    } else {
                      if (0 == ksa.field_p) {
                        ((ko) this).field_f = 0;
                        break L8;
                      } else {
                        var4 = -69 % ((-29 - param1) / 63);
                        if (0 == ((ko) this).field_f) {
                          if (((ko) this).field_e) {
                            if (-1 >= (param2 ^ -1)) {
                              if (param2 != ((ko) this).field_h) {
                                ((ko) this).field_e = true;
                                ((ko) this).field_h = param2;
                                return;
                              } else {
                                ((ko) this).field_e = true;
                                ((ko) this).field_h = param2;
                                return;
                              }
                            } else {
                              if (((ko) this).field_e) {
                                ((ko) this).field_h = -1;
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            if (qma.field_c) {
                              if (-1 >= (param2 ^ -1)) {
                                if (param2 != ((ko) this).field_h) {
                                  ((ko) this).field_e = true;
                                  ((ko) this).field_h = param2;
                                  return;
                                } else {
                                  ((ko) this).field_e = true;
                                  ((ko) this).field_h = param2;
                                  return;
                                }
                              } else {
                                if (((ko) this).field_e) {
                                  ((ko) this).field_h = -1;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var4 = -69 % ((-29 - param1) / 63);
                  if (0 == ((ko) this).field_f) {
                    L9: {
                      if (((ko) this).field_e) {
                        if (-1 >= (param2 ^ -1)) {
                          if (param2 != ((ko) this).field_h) {
                            ((ko) this).field_e = true;
                            ((ko) this).field_h = param2;
                            return;
                          } else {
                            ((ko) this).field_e = true;
                            ((ko) this).field_h = param2;
                            return;
                          }
                        } else {
                          if (!((ko) this).field_e) {
                            break L9;
                          } else {
                            ((ko) this).field_h = -1;
                            return;
                          }
                        }
                      } else {
                        if (!qma.field_c) {
                          break L9;
                        } else {
                          if (-1 >= (param2 ^ -1)) {
                            if (param2 != ((ko) this).field_h) {
                              ((ko) this).field_e = true;
                              ((ko) this).field_h = param2;
                              return;
                            } else {
                              ((ko) this).field_e = true;
                              ((ko) this).field_h = param2;
                              return;
                            }
                          } else {
                            if (!((ko) this).field_e) {
                              return;
                            } else {
                              ((ko) this).field_h = -1;
                              return;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L10: {
                  if (hf.field_b != 0) {
                    break L10;
                  } else {
                    if (0 == ksa.field_p) {
                      ((ko) this).field_f = 0;
                      break L10;
                    } else {
                      var4 = -69 % ((-29 - param1) / 63);
                      if (0 == ((ko) this).field_f) {
                        if (((ko) this).field_e) {
                          if (-1 >= (param2 ^ -1)) {
                            if (param2 != ((ko) this).field_h) {
                              ((ko) this).field_e = true;
                              ((ko) this).field_h = param2;
                              return;
                            } else {
                              ((ko) this).field_e = true;
                              ((ko) this).field_h = param2;
                              return;
                            }
                          } else {
                            if (!((ko) this).field_e) {
                              return;
                            } else {
                              ((ko) this).field_h = -1;
                              return;
                            }
                          }
                        } else {
                          if (qma.field_c) {
                            if (-1 >= (param2 ^ -1)) {
                              if (param2 != ((ko) this).field_h) {
                                ((ko) this).field_e = true;
                                ((ko) this).field_h = param2;
                                return;
                              } else {
                                ((ko) this).field_e = true;
                                ((ko) this).field_h = param2;
                                return;
                              }
                            } else {
                              if (((ko) this).field_e) {
                                ((ko) this).field_h = -1;
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                var4 = -69 % ((-29 - param1) / 63);
                if (0 == ((ko) this).field_f) {
                  if (((ko) this).field_e) {
                    if (-1 >= (param2 ^ -1)) {
                      if (param2 != ((ko) this).field_h) {
                        ((ko) this).field_e = true;
                        ((ko) this).field_h = param2;
                        return;
                      } else {
                        ((ko) this).field_e = true;
                        ((ko) this).field_h = param2;
                        return;
                      }
                    } else {
                      if (((ko) this).field_e) {
                        ((ko) this).field_h = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (qma.field_c) {
                      if (-1 >= (param2 ^ -1)) {
                        if (param2 != ((ko) this).field_h) {
                          ((ko) this).field_e = true;
                          ((ko) this).field_h = param2;
                          return;
                        } else {
                          ((ko) this).field_e = true;
                          ((ko) this).field_h = param2;
                          return;
                        }
                      } else {
                        if (!((ko) this).field_e) {
                          return;
                        } else {
                          ((ko) this).field_h = -1;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              ((ko) this).field_b = hf.field_b;
              ((ko) this).field_h = param0;
              ((ko) this).field_f = hf.field_b;
              ((ko) this).field_e = true;
              ((ko) this).field_a = gp.field_m;
              if (-1 != (((ko) this).field_f ^ -1)) {
                if (ksa.field_p != 0) {
                  L11: {
                    if (0 < ((ko) this).field_a) {
                      ((ko) this).field_a = ((ko) this).field_a - 1;
                      break L11;
                    } else {
                      ((ko) this).field_a = aua.field_b;
                      ((ko) this).field_a = ((ko) this).field_a - 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (hf.field_b != 0) {
                      break L12;
                    } else {
                      if (0 == ksa.field_p) {
                        ((ko) this).field_f = 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var4 = -69 % ((-29 - param1) / 63);
                  if (0 == ((ko) this).field_f) {
                    L13: {
                      if (((ko) this).field_e) {
                        break L13;
                      } else {
                        if (qma.field_c) {
                          break L13;
                        } else {
                          return;
                        }
                      }
                    }
                    if (-1 >= (param2 ^ -1)) {
                      if (param2 != ((ko) this).field_h) {
                        ((ko) this).field_e = true;
                        ((ko) this).field_h = param2;
                        return;
                      } else {
                        ((ko) this).field_e = true;
                        ((ko) this).field_h = param2;
                        return;
                      }
                    } else {
                      if (((ko) this).field_e) {
                        ((ko) this).field_h = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L14: {
                    if (hf.field_b != 0) {
                      break L14;
                    } else {
                      if (0 == ksa.field_p) {
                        ((ko) this).field_f = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var4 = -69 % ((-29 - param1) / 63);
                  if (0 == ((ko) this).field_f) {
                    L15: {
                      if (((ko) this).field_e) {
                        break L15;
                      } else {
                        if (qma.field_c) {
                          break L15;
                        } else {
                          return;
                        }
                      }
                    }
                    if (-1 >= (param2 ^ -1)) {
                      if (param2 != ((ko) this).field_h) {
                        ((ko) this).field_e = true;
                        ((ko) this).field_h = param2;
                        return;
                      } else {
                        ((ko) this).field_e = true;
                        ((ko) this).field_h = param2;
                        return;
                      }
                    } else {
                      if (((ko) this).field_e) {
                        ((ko) this).field_h = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L16: {
                  if (hf.field_b != 0) {
                    break L16;
                  } else {
                    if (0 == ksa.field_p) {
                      ((ko) this).field_f = 0;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
                var4 = -69 % ((-29 - param1) / 63);
                if (0 == ((ko) this).field_f) {
                  L17: {
                    if (((ko) this).field_e) {
                      break L17;
                    } else {
                      if (qma.field_c) {
                        break L17;
                      } else {
                        return;
                      }
                    }
                  }
                  if (-1 >= (param2 ^ -1)) {
                    if (param2 != ((ko) this).field_h) {
                      ((ko) this).field_e = true;
                      ((ko) this).field_h = param2;
                      return;
                    } else {
                      ((ko) this).field_e = true;
                      ((ko) this).field_h = param2;
                      return;
                    }
                  } else {
                    if (((ko) this).field_e) {
                      ((ko) this).field_h = -1;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 96) {
          L0: {
            ((ko) this).field_e = false;
            if (((ko) this).field_c != 96) {
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
            if (((ko) this).field_c != 96) {
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

    final boolean f(int param0) {
        int var2 = -76 / ((-64 - param0) / 54);
        return (((ko) this).field_c ^ -1) == -104 ? true : false;
    }

    final void b(byte param0) {
        L0: {
          ((ko) this).field_b = 0;
          ((ko) this).field_c = 0;
          if (0 == ((ko) this).field_f) {
            ((ko) this).field_c = fna.field_h;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -50) {
          ko.b(29);
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != -100) {
            field_d = 50;
            field_g = null;
            field_j = null;
            return;
        }
        field_g = null;
        field_j = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
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
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
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
        ((ko) this).field_e = stackIn_3_1 != 0;
        ((ko) this).field_f = 0;
        if (!((ko) this).field_e) {
          ((ko) this).field_h = param2;
          if (param1 == 29954) {
            return;
          } else {
            ((ko) this).field_c = 83;
            return;
          }
        } else {
          ((ko) this).field_h = param3;
          if (param1 == 29954) {
            return;
          } else {
            ((ko) this).field_c = 83;
            return;
          }
        }
    }

    final static void c(byte param0) {
        afa.field_c = qk.h(122);
        wu.field_a = new jta();
        if (param0 < 10) {
            ko.c((byte) -39);
            kea.b(-114);
            return;
        }
        kea.b(-114);
    }

    final void c(int param0) {
        ((ko) this).field_b = 0;
        ((ko) this).field_c = 0;
        if (((ko) this).field_f != 0) {
          L0: {
            if (param0 > 3) {
              break L0;
            } else {
              ((ko) this).a(-50, 52);
              break L0;
            }
          }
          if (((ko) this).field_f == -1) {
            if (-99 == fna.field_h) {
              if (0 < ((ko) this).field_h) {
                L1: {
                  ((ko) this).field_h = ((ko) this).field_h - 1;
                  ((ko) this).field_e = false;
                  if (0 != ((ko) this).field_f) {
                    break L1;
                  } else {
                    if (fna.field_h != 99) {
                      break L1;
                    } else {
                      L2: {
                        ((ko) this).field_h = ((ko) this).field_h + 1;
                        if (((ko) this).field_h >= ((ko) this).field_i) {
                          ((ko) this).field_h = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ((ko) this).field_e = false;
                      break L1;
                    }
                  }
                }
                return;
              } else {
                ((ko) this).field_h = ((ko) this).field_i;
                L3: {
                  ((ko) this).field_h = ((ko) this).field_h - 1;
                  ((ko) this).field_e = false;
                  if (0 != ((ko) this).field_f) {
                    break L3;
                  } else {
                    if (fna.field_h != 99) {
                      break L3;
                    } else {
                      L4: {
                        ((ko) this).field_h = ((ko) this).field_h + 1;
                        if (((ko) this).field_h >= ((ko) this).field_i) {
                          ((ko) this).field_h = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((ko) this).field_e = false;
                      break L3;
                    }
                  }
                }
                return;
              }
            } else {
              L5: {
                if (0 != ((ko) this).field_f) {
                  break L5;
                } else {
                  if (fna.field_h != 99) {
                    break L5;
                  } else {
                    L6: {
                      ((ko) this).field_h = ((ko) this).field_h + 1;
                      if (((ko) this).field_h >= ((ko) this).field_i) {
                        ((ko) this).field_h = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((ko) this).field_e = false;
                    break L5;
                  }
                }
              }
              return;
            }
          } else {
            L7: {
              if (0 != ((ko) this).field_f) {
                break L7;
              } else {
                if (fna.field_h != 99) {
                  break L7;
                } else {
                  L8: {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    if (((ko) this).field_h >= ((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((ko) this).field_e = false;
                  break L7;
                }
              }
            }
            return;
          }
        } else {
          ((ko) this).field_c = fna.field_h;
          if (param0 <= 3) {
            ((ko) this).a(-50, 52);
            if (((ko) this).field_f == 0) {
              if (-99 == (fna.field_h ^ -1)) {
                if (0 < ((ko) this).field_h) {
                  L9: {
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
                    if (0 != ((ko) this).field_f) {
                      break L9;
                    } else {
                      if (fna.field_h != 99) {
                        break L9;
                      } else {
                        L10: {
                          ((ko) this).field_h = ((ko) this).field_h + 1;
                          if (((ko) this).field_h >= ((ko) this).field_i) {
                            ((ko) this).field_h = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        ((ko) this).field_e = false;
                        break L9;
                      }
                    }
                  }
                  return;
                } else {
                  ((ko) this).field_h = ((ko) this).field_i;
                  L11: {
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
                    if (0 != ((ko) this).field_f) {
                      break L11;
                    } else {
                      if (fna.field_h != 99) {
                        break L11;
                      } else {
                        L12: {
                          ((ko) this).field_h = ((ko) this).field_h + 1;
                          if (((ko) this).field_h >= ((ko) this).field_i) {
                            ((ko) this).field_h = 0;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        ((ko) this).field_e = false;
                        break L11;
                      }
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if (0 != ((ko) this).field_f) {
                    break L13;
                  } else {
                    if (fna.field_h != 99) {
                      break L13;
                    } else {
                      L14: {
                        ((ko) this).field_h = ((ko) this).field_h + 1;
                        if (((ko) this).field_h >= ((ko) this).field_i) {
                          ((ko) this).field_h = 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      ((ko) this).field_e = false;
                      break L13;
                    }
                  }
                }
                return;
              }
            } else {
              L15: {
                if (0 != ((ko) this).field_f) {
                  break L15;
                } else {
                  if (fna.field_h != 99) {
                    break L15;
                  } else {
                    L16: {
                      ((ko) this).field_h = ((ko) this).field_h + 1;
                      if (((ko) this).field_h >= ((ko) this).field_i) {
                        ((ko) this).field_h = 0;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    ((ko) this).field_e = false;
                    break L15;
                  }
                }
              }
              return;
            }
          } else {
            L17: {
              if (((ko) this).field_f != -1) {
                break L17;
              } else {
                if (-99 != fna.field_h) {
                  break L17;
                } else {
                  if (0 < ((ko) this).field_h) {
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
                    break L17;
                  } else {
                    ((ko) this).field_h = ((ko) this).field_i;
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
                    break L17;
                  }
                }
              }
            }
            L18: {
              if (0 != ((ko) this).field_f) {
                break L18;
              } else {
                if (fna.field_h != 99) {
                  break L18;
                } else {
                  L19: {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    if (((ko) this).field_h >= ((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  ((ko) this).field_e = false;
                  break L18;
                }
              }
            }
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (!param0) {
          if (((ko) this).field_b == 0) {
            if (-85 != (((ko) this).field_c ^ -1)) {
              if (((ko) this).field_c == 83) {
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
          boolean discarded$7 = ((ko) this).e(-107);
          if (((ko) this).field_b == 0) {
            if (-85 == (((ko) this).field_c ^ -1)) {
              return true;
            } else {
              L0: {
                if (((ko) this).field_c != 83) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    ko(int param0) {
        ((ko) this).field_h = 0;
        ((ko) this).field_e = false;
        ((ko) this).field_i = param0;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          ((ko) this).field_b = 0;
          var3 = 77 / ((param1 - -33) / 39);
          ((ko) this).field_c = 0;
          if (((ko) this).field_f == 0) {
            ((ko) this).field_c = fna.field_h;
            break L0;
          } else {
            break L0;
          }
        }
        if (((ko) this).field_f == -1) {
          if (fna.field_h == 96) {
            if (-1 > (((ko) this).field_h ^ -1)) {
              L1: {
                ((ko) this).field_e = false;
                ((ko) this).field_h = ((ko) this).field_h - 1;
                if (0 != ((ko) this).field_f) {
                  break L1;
                } else {
                  if (-98 == (fna.field_h ^ -1)) {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    ((ko) this).field_e = false;
                    if (((ko) this).field_h >= ((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L1;
                    } else {
                      if (-1 == (((ko) this).field_f ^ -1)) {
                        L2: {
                          if (fna.field_h == 98) {
                            break L2;
                          } else {
                            if ((fna.field_h ^ -1) == -100) {
                              break L2;
                            } else {
                              return;
                            }
                          }
                        }
                        if (((ko) this).field_h >= 0) {
                          ((ko) this).field_e = false;
                          return;
                        } else {
                          ((ko) this).field_h = param0;
                          ((ko) this).field_e = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (-1 == (((ko) this).field_f ^ -1)) {
                L3: {
                  if (fna.field_h == 98) {
                    break L3;
                  } else {
                    if ((fna.field_h ^ -1) == -100) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                if (((ko) this).field_h >= 0) {
                  ((ko) this).field_e = false;
                  return;
                } else {
                  ((ko) this).field_h = param0;
                  ((ko) this).field_e = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              ((ko) this).field_h = ((ko) this).field_i;
              L4: {
                ((ko) this).field_e = false;
                ((ko) this).field_h = ((ko) this).field_h - 1;
                if (0 != ((ko) this).field_f) {
                  break L4;
                } else {
                  if (-98 == fna.field_h) {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    ((ko) this).field_e = false;
                    if (((ko) this).field_h >= ((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L4;
                    } else {
                      if (-1 == (((ko) this).field_f ^ -1)) {
                        L5: {
                          if (fna.field_h == 98) {
                            break L5;
                          } else {
                            if ((fna.field_h ^ -1) == -100) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        if (((ko) this).field_h >= 0) {
                          ((ko) this).field_e = false;
                          return;
                        } else {
                          ((ko) this).field_h = param0;
                          ((ko) this).field_e = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (-1 == ((ko) this).field_f) {
                      L6: {
                        if (fna.field_h == 98) {
                          break L6;
                        } else {
                          if ((fna.field_h ^ -1) == -100) {
                            break L6;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((ko) this).field_h >= 0) {
                        ((ko) this).field_e = false;
                        return;
                      } else {
                        ((ko) this).field_h = param0;
                        ((ko) this).field_e = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (-1 == (((ko) this).field_f ^ -1)) {
                L7: {
                  if (fna.field_h == 98) {
                    break L7;
                  } else {
                    if ((fna.field_h ^ -1) == -100) {
                      break L7;
                    } else {
                      return;
                    }
                  }
                }
                if (((ko) this).field_h >= 0) {
                  ((ko) this).field_e = false;
                  return;
                } else {
                  ((ko) this).field_h = param0;
                  ((ko) this).field_e = false;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L8: {
              if (0 != ((ko) this).field_f) {
                break L8;
              } else {
                if (-98 == fna.field_h) {
                  ((ko) this).field_h = ((ko) this).field_h + 1;
                  ((ko) this).field_e = false;
                  if (((ko) this).field_h >= ((ko) this).field_i) {
                    ((ko) this).field_h = 0;
                    break L8;
                  } else {
                    if (-1 == (((ko) this).field_f ^ -1)) {
                      L9: {
                        if (fna.field_h == 98) {
                          break L9;
                        } else {
                          if ((fna.field_h ^ -1) == -100) {
                            break L9;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((ko) this).field_h >= 0) {
                        ((ko) this).field_e = false;
                        return;
                      } else {
                        ((ko) this).field_h = param0;
                        ((ko) this).field_e = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (-1 == ((ko) this).field_f) {
                    L10: {
                      if (fna.field_h == 98) {
                        break L10;
                      } else {
                        if ((fna.field_h ^ -1) == -100) {
                          break L10;
                        } else {
                          return;
                        }
                      }
                    }
                    if (((ko) this).field_h >= 0) {
                      ((ko) this).field_e = false;
                      return;
                    } else {
                      ((ko) this).field_h = param0;
                      ((ko) this).field_e = false;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (-1 == (((ko) this).field_f ^ -1)) {
              L11: {
                if (fna.field_h == 98) {
                  break L11;
                } else {
                  if ((fna.field_h ^ -1) == -100) {
                    break L11;
                  } else {
                    return;
                  }
                }
              }
              if (((ko) this).field_h >= 0) {
                ((ko) this).field_e = false;
                return;
              } else {
                ((ko) this).field_h = param0;
                ((ko) this).field_e = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L12: {
            if (0 != ((ko) this).field_f) {
              break L12;
            } else {
              if (-98 == fna.field_h) {
                ((ko) this).field_h = ((ko) this).field_h + 1;
                ((ko) this).field_e = false;
                if (((ko) this).field_h >= ((ko) this).field_i) {
                  ((ko) this).field_h = 0;
                  break L12;
                } else {
                  if (-1 == (((ko) this).field_f ^ -1)) {
                    L13: {
                      if (fna.field_h == 98) {
                        break L13;
                      } else {
                        if ((fna.field_h ^ -1) == -100) {
                          break L13;
                        } else {
                          return;
                        }
                      }
                    }
                    if (((ko) this).field_h >= 0) {
                      ((ko) this).field_e = false;
                      return;
                    } else {
                      ((ko) this).field_h = param0;
                      ((ko) this).field_e = false;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (-1 == (((ko) this).field_f ^ -1)) {
                  L14: {
                    if (fna.field_h == 98) {
                      break L14;
                    } else {
                      if ((fna.field_h ^ -1) == -100) {
                        break L14;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((ko) this).field_h >= 0) {
                    ((ko) this).field_e = false;
                    return;
                  } else {
                    ((ko) this).field_h = param0;
                    ((ko) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (-1 == (((ko) this).field_f ^ -1)) {
            L15: {
              if (fna.field_h == 98) {
                break L15;
              } else {
                if ((fna.field_h ^ -1) == -100) {
                  break L15;
                } else {
                  return;
                }
              }
            }
            if (((ko) this).field_h >= 0) {
              ((ko) this).field_e = false;
              return;
            } else {
              ((ko) this).field_h = param0;
              ((ko) this).field_e = false;
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Checking";
    }
}
