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
              if (((ko) this).field_f != 0) {
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
                        if (param2 >= 0) {
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
                              if (param2 >= 0) {
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
                          if (param2 >= 0) {
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
                            if (param2 >= 0) {
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
                            if (param2 >= 0) {
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
                              if (param2 >= 0) {
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
                        if (param2 >= 0) {
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
                          if (param2 >= 0) {
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
                          if (param2 >= 0) {
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
                            if (param2 >= 0) {
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
                    if (param2 >= 0) {
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
                      if (param2 >= 0) {
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
              if (((ko) this).field_f != 0) {
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
                    if (param2 >= 0) {
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
                    if (param2 >= 0) {
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
                  if (param2 >= 0) {
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
        return ((ko) this).field_c == 103 ? true : false;
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
          int discarded$4 = -114;
          kea.b();
          return;
        } else {
          int discarded$5 = -114;
          kea.b();
          return;
        }
    }

    final void c(int param0) {
        ((ko) this).field_b = 0;
        ((ko) this).field_c = 0;
        if (((ko) this).field_f != 0) {
          if (param0 > 3) {
            L0: {
              if (((ko) this).field_f != 0) {
                break L0;
              } else {
                if (fna.field_h != 98) {
                  break L0;
                } else {
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
                }
              }
            }
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
          } else {
            L7: {
              ((ko) this).a(-50, 52);
              if (((ko) this).field_f != 0) {
                break L7;
              } else {
                if (fna.field_h != 98) {
                  break L7;
                } else {
                  if (0 < ((ko) this).field_h) {
                    L8: {
                      ((ko) this).field_h = ((ko) this).field_h - 1;
                      ((ko) this).field_e = false;
                      if (0 != ((ko) this).field_f) {
                        break L8;
                      } else {
                        if (fna.field_h != 99) {
                          break L8;
                        } else {
                          L9: {
                            ((ko) this).field_h = ((ko) this).field_h + 1;
                            if (((ko) this).field_h >= ((ko) this).field_i) {
                              ((ko) this).field_h = 0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          ((ko) this).field_e = false;
                          break L8;
                        }
                      }
                    }
                    return;
                  } else {
                    ((ko) this).field_h = ((ko) this).field_i;
                    L10: {
                      ((ko) this).field_h = ((ko) this).field_h - 1;
                      ((ko) this).field_e = false;
                      if (0 != ((ko) this).field_f) {
                        break L10;
                      } else {
                        if (fna.field_h != 99) {
                          break L10;
                        } else {
                          L11: {
                            ((ko) this).field_h = ((ko) this).field_h + 1;
                            if (((ko) this).field_h >= ((ko) this).field_i) {
                              ((ko) this).field_h = 0;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          ((ko) this).field_e = false;
                          break L10;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L12: {
              if (0 != ((ko) this).field_f) {
                break L12;
              } else {
                if (fna.field_h != 99) {
                  break L12;
                } else {
                  L13: {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    if (((ko) this).field_h >= ((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  ((ko) this).field_e = false;
                  break L12;
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
              if (fna.field_h != 98) {
                L14: {
                  if (0 != ((ko) this).field_f) {
                    break L14;
                  } else {
                    if (fna.field_h != 99) {
                      break L14;
                    } else {
                      L15: {
                        ((ko) this).field_h = ((ko) this).field_h + 1;
                        if (((ko) this).field_h >= ((ko) this).field_i) {
                          ((ko) this).field_h = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      ((ko) this).field_e = false;
                      break L14;
                    }
                  }
                }
                return;
              } else {
                if (0 < ((ko) this).field_h) {
                  L16: {
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
                    if (0 != ((ko) this).field_f) {
                      break L16;
                    } else {
                      if (fna.field_h != 99) {
                        break L16;
                      } else {
                        L17: {
                          ((ko) this).field_h = ((ko) this).field_h + 1;
                          if (((ko) this).field_h >= ((ko) this).field_i) {
                            ((ko) this).field_h = 0;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        ((ko) this).field_e = false;
                        break L16;
                      }
                    }
                  }
                  return;
                } else {
                  ((ko) this).field_h = ((ko) this).field_i;
                  L18: {
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
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
            } else {
              L20: {
                if (0 != ((ko) this).field_f) {
                  break L20;
                } else {
                  if (fna.field_h != 99) {
                    break L20;
                  } else {
                    L21: {
                      ((ko) this).field_h = ((ko) this).field_h + 1;
                      if (((ko) this).field_h >= ((ko) this).field_i) {
                        ((ko) this).field_h = 0;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    ((ko) this).field_e = false;
                    break L20;
                  }
                }
              }
              return;
            }
          } else {
            L22: {
              if (((ko) this).field_f != 0) {
                break L22;
              } else {
                if (fna.field_h != 98) {
                  break L22;
                } else {
                  if (0 < ((ko) this).field_h) {
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
                    break L22;
                  } else {
                    ((ko) this).field_h = ((ko) this).field_i;
                    ((ko) this).field_h = ((ko) this).field_h - 1;
                    ((ko) this).field_e = false;
                    break L22;
                  }
                }
              }
            }
            L23: {
              if (0 != ((ko) this).field_f) {
                break L23;
              } else {
                if (fna.field_h != 99) {
                  break L23;
                } else {
                  L24: {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    if (((ko) this).field_h >= ((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  ((ko) this).field_e = false;
                  break L23;
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
            if (((ko) this).field_c != 84) {
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
            if (((ko) this).field_c == 84) {
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
        if (((ko) this).field_f == 0) {
          if (fna.field_h == 96) {
            if (((ko) this).field_h > 0) {
              L1: {
                ((ko) this).field_e = false;
                ((ko) this).field_h = ((ko) this).field_h - 1;
                if (0 != ((ko) this).field_f) {
                  break L1;
                } else {
                  if (fna.field_h == 97) {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    ((ko) this).field_e = false;
                    if (~((ko) this).field_h <= ~((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L1;
                    } else {
                      L2: {
                        if (((ko) this).field_f != 0) {
                          break L2;
                        } else {
                          L3: {
                            if (fna.field_h == 98) {
                              break L3;
                            } else {
                              if (fna.field_h == 99) {
                                break L3;
                              } else {
                                break L2;
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
                        }
                      }
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (((ko) this).field_f != 0) {
                return;
              } else {
                L4: {
                  if (fna.field_h == 98) {
                    break L4;
                  } else {
                    if (fna.field_h == 99) {
                      break L4;
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
              }
            } else {
              ((ko) this).field_h = ((ko) this).field_i;
              L5: {
                ((ko) this).field_e = false;
                ((ko) this).field_h = ((ko) this).field_h - 1;
                if (0 != ((ko) this).field_f) {
                  break L5;
                } else {
                  if (fna.field_h == 97) {
                    ((ko) this).field_h = ((ko) this).field_h + 1;
                    ((ko) this).field_e = false;
                    if (~((ko) this).field_h <= ~((ko) this).field_i) {
                      ((ko) this).field_h = 0;
                      break L5;
                    } else {
                      if (((ko) this).field_f != 0) {
                        return;
                      } else {
                        L6: {
                          if (fna.field_h == 98) {
                            break L6;
                          } else {
                            if (fna.field_h == 99) {
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
                      }
                    }
                  } else {
                    if (((ko) this).field_f == 0) {
                      L7: {
                        if (fna.field_h == 98) {
                          break L7;
                        } else {
                          if (fna.field_h == 99) {
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
                }
              }
              if (((ko) this).field_f != 0) {
                return;
              } else {
                L8: {
                  if (fna.field_h == 98) {
                    break L8;
                  } else {
                    if (fna.field_h == 99) {
                      break L8;
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
              }
            }
          } else {
            L9: {
              if (0 != ((ko) this).field_f) {
                break L9;
              } else {
                if (fna.field_h == 97) {
                  ((ko) this).field_h = ((ko) this).field_h + 1;
                  ((ko) this).field_e = false;
                  if (~((ko) this).field_h <= ~((ko) this).field_i) {
                    ((ko) this).field_h = 0;
                    break L9;
                  } else {
                    L10: {
                      if (((ko) this).field_f != 0) {
                        break L10;
                      } else {
                        L11: {
                          if (fna.field_h == 98) {
                            break L11;
                          } else {
                            if (fna.field_h == 99) {
                              break L11;
                            } else {
                              break L10;
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
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    if (((ko) this).field_f != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (fna.field_h == 98) {
                          break L13;
                        } else {
                          if (fna.field_h == 99) {
                            break L13;
                          } else {
                            break L12;
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
                    }
                  }
                  return;
                }
              }
            }
            if (((ko) this).field_f != 0) {
              return;
            } else {
              L14: {
                if (fna.field_h == 98) {
                  break L14;
                } else {
                  if (fna.field_h == 99) {
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
            }
          }
        } else {
          L15: {
            if (0 != ((ko) this).field_f) {
              break L15;
            } else {
              if (fna.field_h == 97) {
                ((ko) this).field_h = ((ko) this).field_h + 1;
                ((ko) this).field_e = false;
                if (~((ko) this).field_h <= ~((ko) this).field_i) {
                  ((ko) this).field_h = 0;
                  break L15;
                } else {
                  L16: {
                    if (((ko) this).field_f != 0) {
                      break L16;
                    } else {
                      L17: {
                        if (fna.field_h == 98) {
                          break L17;
                        } else {
                          if (fna.field_h == 99) {
                            break L17;
                          } else {
                            break L16;
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
                    }
                  }
                  return;
                }
              } else {
                L18: {
                  if (((ko) this).field_f != 0) {
                    break L18;
                  } else {
                    L19: {
                      if (fna.field_h == 98) {
                        break L19;
                      } else {
                        if (fna.field_h == 99) {
                          break L19;
                        } else {
                          break L18;
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
                  }
                }
                return;
              }
            }
          }
          if (((ko) this).field_f != 0) {
            return;
          } else {
            L20: {
              if (fna.field_h == 98) {
                break L20;
              } else {
                if (fna.field_h == 99) {
                  break L20;
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
