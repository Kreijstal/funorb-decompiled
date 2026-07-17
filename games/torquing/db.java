/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static of[] field_a;
    private int field_c;
    private int field_h;
    int field_i;
    private int field_f;
    private int field_b;
    static String field_d;
    static int field_j;
    boolean field_k;
    int field_g;
    private int field_e;

    final boolean f(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -60) {
          if (((db) this).field_e == 0) {
            if (((db) this).field_h != 84) {
              if (83 == ((db) this).field_h) {
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
          boolean discarded$7 = ((db) this).d((byte) 26);
          if (((db) this).field_e == 0) {
            if (((db) this).field_h == 84) {
              return true;
            } else {
              L0: {
                if (83 != ((db) this).field_h) {
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

    final void a(int param0) {
        ((db) this).field_e = param0;
        ((db) this).field_h = 0;
        ((db) this).field_c = 0;
        if (((db) this).field_b == 0) {
          if (98 == e.field_f) {
            L0: {
              if (0 >= ((db) this).field_g) {
                ((db) this).field_g = ((db) this).field_i;
                break L0;
              } else {
                break L0;
              }
            }
            ((db) this).field_g = ((db) this).field_g - 1;
            ((db) this).field_k = false;
            if (((db) this).field_b != 0) {
              if (((db) this).field_b == 0) {
                if (99 == e.field_f) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  ((db) this).field_k = false;
                  if (((db) this).field_g < ((db) this).field_i) {
                    return;
                  } else {
                    ((db) this).field_g = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((db) this).field_h = e.field_f;
              if (((db) this).field_b == 0) {
                if (99 == e.field_f) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  ((db) this).field_k = false;
                  if (((db) this).field_g >= ((db) this).field_i) {
                    ((db) this).field_g = 0;
                    return;
                  } else {
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
            if (((db) this).field_b != 0) {
              if (((db) this).field_b == 0) {
                if (99 == e.field_f) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  ((db) this).field_k = false;
                  if (((db) this).field_g >= ((db) this).field_i) {
                    ((db) this).field_g = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((db) this).field_h = e.field_f;
              if (((db) this).field_b == 0) {
                if (99 == e.field_f) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  ((db) this).field_k = false;
                  if (((db) this).field_g < ((db) this).field_i) {
                    return;
                  } else {
                    ((db) this).field_g = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (((db) this).field_b != 0) {
            if (((db) this).field_b == 0) {
              if (99 == e.field_f) {
                ((db) this).field_g = ((db) this).field_g + 1;
                ((db) this).field_k = false;
                if (((db) this).field_g < ((db) this).field_i) {
                  return;
                } else {
                  ((db) this).field_g = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            ((db) this).field_h = e.field_f;
            if (((db) this).field_b == 0) {
              if (99 == e.field_f) {
                ((db) this).field_g = ((db) this).field_g + 1;
                ((db) this).field_k = false;
                if (((db) this).field_g < ((db) this).field_i) {
                  return;
                } else {
                  ((db) this).field_g = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1) {
        if (!(param1 != ~((db) this).field_b)) {
            ((db) this).field_k = false;
            ((db) this).field_g = param0;
        }
    }

    final void a(boolean param0) {
        ((db) this).field_e = 0;
        if (!param0) {
          L0: {
            ((db) this).field_c = 0;
            ((db) this).field_h = 0;
            if (((db) this).field_b == 0) {
              ((db) this).field_h = e.field_f;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != ((db) this).field_b) {
              break L1;
            } else {
              if (e.field_f == 96) {
                L2: {
                  if (((db) this).field_g <= 0) {
                    ((db) this).field_g = ((db) this).field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((db) this).field_k = false;
                ((db) this).field_g = ((db) this).field_g - 1;
                break L1;
              } else {
                if (((db) this).field_b == 0) {
                  if (e.field_f == 97) {
                    ((db) this).field_g = ((db) this).field_g + 1;
                    ((db) this).field_k = false;
                    if (((db) this).field_i > ((db) this).field_g) {
                      return;
                    } else {
                      ((db) this).field_g = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (((db) this).field_b == 0) {
            if (e.field_f == 97) {
              ((db) this).field_g = ((db) this).field_g + 1;
              ((db) this).field_k = false;
              if (((db) this).field_i > ((db) this).field_g) {
                return;
              } else {
                ((db) this).field_g = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != -97) {
            boolean discarded$6 = ((db) this).f((byte) -87);
            if (((db) this).field_c != 0) {
                return true;
            }
            if (((db) this).field_h == 84) {
                return true;
            }
            return ((db) this).field_h == 83 ? true : false;
        }
        if (((db) this).field_c != 0) {
            return true;
        }
        if (((db) this).field_h == 84) {
            return true;
        }
        if (((db) this).field_h == 83) {
            return true;
        }
        return false;
    }

    final void a(byte param0, int param1) {
        ((db) this).field_c = 0;
        ((db) this).field_h = 0;
        ((db) this).field_e = 0;
        if (-1 == ((db) this).field_b) {
          L0: {
            if (e.field_f == 96) {
              if (((db) this).field_g > 0) {
                ((db) this).field_k = false;
                ((db) this).field_g = ((db) this).field_g - 1;
                break L0;
              } else {
                ((db) this).field_g = ((db) this).field_i;
                ((db) this).field_k = false;
                ((db) this).field_g = ((db) this).field_g - 1;
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (((db) this).field_b != 0) {
            L1: {
              if (0 != ((db) this).field_b) {
                break L1;
              } else {
                if (e.field_f == 97) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  if (((db) this).field_g < ((db) this).field_i) {
                    ((db) this).field_k = false;
                    break L1;
                  } else {
                    ((db) this).field_g = 0;
                    ((db) this).field_k = false;
                    if (param0 > 44) {
                      if (((db) this).field_b == 0) {
                        if (e.field_f == 98) {
                          ((db) this).field_k = false;
                          if (((db) this).field_g < 0) {
                            ((db) this).field_g = param1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (99 == e.field_f) {
                            ((db) this).field_k = false;
                            if (((db) this).field_g < 0) {
                              ((db) this).field_g = param1;
                              return;
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
                    } else {
                      L2: {
                        boolean discarded$10 = ((db) this).d((byte) -58);
                        if (((db) this).field_b != 0) {
                          break L2;
                        } else {
                          L3: {
                            if (e.field_f == 98) {
                              break L3;
                            } else {
                              if (99 != e.field_f) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          ((db) this).field_k = false;
                          if (((db) this).field_g >= 0) {
                            break L2;
                          } else {
                            ((db) this).field_g = param1;
                            break L2;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L4: {
                    if (param0 > 44) {
                      break L4;
                    } else {
                      boolean discarded$11 = ((db) this).d((byte) -58);
                      break L4;
                    }
                  }
                  L5: {
                    if (((db) this).field_b != 0) {
                      break L5;
                    } else {
                      L6: {
                        if (e.field_f == 98) {
                          break L6;
                        } else {
                          if (99 != e.field_f) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((db) this).field_k = false;
                      if (((db) this).field_g >= 0) {
                        break L5;
                      } else {
                        ((db) this).field_g = param1;
                        break L5;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param0 > 44) {
              if (((db) this).field_b == 0) {
                if (e.field_f == 98) {
                  ((db) this).field_k = false;
                  if (((db) this).field_g >= 0) {
                    return;
                  } else {
                    ((db) this).field_g = param1;
                    return;
                  }
                } else {
                  if (99 == e.field_f) {
                    ((db) this).field_k = false;
                    if (((db) this).field_g >= 0) {
                      return;
                    } else {
                      ((db) this).field_g = param1;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              boolean discarded$12 = ((db) this).d((byte) -58);
              if (((db) this).field_b == 0) {
                if (e.field_f == 98) {
                  ((db) this).field_k = false;
                  if (((db) this).field_g >= 0) {
                    return;
                  } else {
                    ((db) this).field_g = param1;
                    return;
                  }
                } else {
                  if (99 == e.field_f) {
                    ((db) this).field_k = false;
                    if (((db) this).field_g >= 0) {
                      return;
                    } else {
                      ((db) this).field_g = param1;
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
          } else {
            ((db) this).field_h = e.field_f;
            if (0 == ((db) this).field_b) {
              L7: {
                if (e.field_f == 97) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  if (((db) this).field_g >= ((db) this).field_i) {
                    ((db) this).field_g = 0;
                    ((db) this).field_k = false;
                    break L7;
                  } else {
                    L8: {
                      ((db) this).field_k = false;
                      if (param0 > 44) {
                        break L8;
                      } else {
                        boolean discarded$13 = ((db) this).d((byte) -58);
                        break L8;
                      }
                    }
                    L9: {
                      if (((db) this).field_b != 0) {
                        break L9;
                      } else {
                        L10: {
                          if (e.field_f == 98) {
                            break L10;
                          } else {
                            if (99 != e.field_f) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((db) this).field_k = false;
                        if (((db) this).field_g >= 0) {
                          break L9;
                        } else {
                          ((db) this).field_g = param1;
                          break L9;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  break L7;
                }
              }
              if (param0 > 44) {
                L11: {
                  if (((db) this).field_b != 0) {
                    break L11;
                  } else {
                    L12: {
                      if (e.field_f == 98) {
                        break L12;
                      } else {
                        if (99 != e.field_f) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((db) this).field_k = false;
                    if (((db) this).field_g >= 0) {
                      break L11;
                    } else {
                      ((db) this).field_g = param1;
                      break L11;
                    }
                  }
                }
                return;
              } else {
                L13: {
                  boolean discarded$14 = ((db) this).d((byte) -58);
                  if (((db) this).field_b != 0) {
                    break L13;
                  } else {
                    L14: {
                      if (e.field_f == 98) {
                        break L14;
                      } else {
                        if (99 != e.field_f) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    ((db) this).field_k = false;
                    if (((db) this).field_g >= 0) {
                      break L13;
                    } else {
                      ((db) this).field_g = param1;
                      break L13;
                    }
                  }
                }
                return;
              }
            } else {
              L15: {
                if (param0 > 44) {
                  break L15;
                } else {
                  boolean discarded$15 = ((db) this).d((byte) -58);
                  break L15;
                }
              }
              L16: {
                if (((db) this).field_b != 0) {
                  break L16;
                } else {
                  L17: {
                    if (e.field_f == 98) {
                      break L17;
                    } else {
                      if (99 != e.field_f) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  ((db) this).field_k = false;
                  if (((db) this).field_g >= 0) {
                    break L16;
                  } else {
                    ((db) this).field_g = param1;
                    break L16;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (-1 != ((db) this).field_b) {
            L18: {
              if (0 != ((db) this).field_b) {
                break L18;
              } else {
                if (e.field_f == 97) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  if (((db) this).field_g < ((db) this).field_i) {
                    ((db) this).field_k = false;
                    break L18;
                  } else {
                    L19: {
                      ((db) this).field_g = 0;
                      ((db) this).field_k = false;
                      if (param0 > 44) {
                        break L19;
                      } else {
                        boolean discarded$16 = ((db) this).d((byte) -58);
                        break L19;
                      }
                    }
                    L20: {
                      if (((db) this).field_b != 0) {
                        break L20;
                      } else {
                        L21: {
                          if (e.field_f == 98) {
                            break L21;
                          } else {
                            if (99 != e.field_f) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        ((db) this).field_k = false;
                        if (((db) this).field_g >= 0) {
                          break L20;
                        } else {
                          ((db) this).field_g = param1;
                          break L20;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L22: {
                    if (param0 > 44) {
                      break L22;
                    } else {
                      boolean discarded$17 = ((db) this).d((byte) -58);
                      break L22;
                    }
                  }
                  L23: {
                    if (((db) this).field_b != 0) {
                      break L23;
                    } else {
                      L24: {
                        if (e.field_f == 98) {
                          break L24;
                        } else {
                          if (99 != e.field_f) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      ((db) this).field_k = false;
                      if (((db) this).field_g >= 0) {
                        break L23;
                      } else {
                        ((db) this).field_g = param1;
                        break L23;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param0 > 44) {
              if (((db) this).field_b == 0) {
                if (e.field_f == 98) {
                  ((db) this).field_k = false;
                  if (((db) this).field_g < 0) {
                    ((db) this).field_g = param1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (99 == e.field_f) {
                    L25: {
                      ((db) this).field_k = false;
                      if (((db) this).field_g >= 0) {
                        break L25;
                      } else {
                        ((db) this).field_g = param1;
                        break L25;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L26: {
                boolean discarded$18 = ((db) this).d((byte) -58);
                if (((db) this).field_b != 0) {
                  break L26;
                } else {
                  L27: {
                    if (e.field_f == 98) {
                      break L27;
                    } else {
                      if (99 != e.field_f) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  ((db) this).field_k = false;
                  if (((db) this).field_g >= 0) {
                    break L26;
                  } else {
                    ((db) this).field_g = param1;
                    break L26;
                  }
                }
              }
              return;
            }
          } else {
            L28: {
              ((db) this).field_h = e.field_f;
              if (0 != ((db) this).field_b) {
                break L28;
              } else {
                if (e.field_f == 97) {
                  ((db) this).field_g = ((db) this).field_g + 1;
                  if (((db) this).field_g < ((db) this).field_i) {
                    ((db) this).field_k = false;
                    break L28;
                  } else {
                    ((db) this).field_g = 0;
                    ((db) this).field_k = false;
                    break L28;
                  }
                } else {
                  break L28;
                }
              }
            }
            L29: {
              if (param0 > 44) {
                break L29;
              } else {
                boolean discarded$19 = ((db) this).d((byte) -58);
                break L29;
              }
            }
            L30: {
              if (((db) this).field_b != 0) {
                break L30;
              } else {
                L31: {
                  if (e.field_f == 98) {
                    break L31;
                  } else {
                    if (99 != e.field_f) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                ((db) this).field_k = false;
                if (((db) this).field_g >= 0) {
                  break L30;
                } else {
                  ((db) this).field_g = param1;
                  break L30;
                }
              }
            }
            return;
          }
        }
    }

    final boolean e(byte param0) {
        int var2 = -109 % ((-67 - param0) / 33);
        return ((db) this).field_h == 102 ? true : false;
    }

    final boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == -108) {
          L0: {
            if (((db) this).field_c == 2) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L0;
            } else {
              if (((db) this).field_h != 96) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_12_0 != 0;
        } else {
          ((db) this).field_i = -104;
          if (((db) this).field_c != 2) {
            L1: {
              if (((db) this).field_h != 96) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          } else {
            return true;
          }
        }
    }

    final void b(boolean param0) {
        ((db) this).field_c = 0;
        ((db) this).field_h = 0;
        if (param0) {
          ((db) this).field_e = 0;
          if (-1 == ((db) this).field_b) {
            ((db) this).field_h = e.field_f;
            return;
          } else {
            return;
          }
        } else {
          ((db) this).field_k = false;
          ((db) this).field_e = 0;
          if (-1 != ((db) this).field_b) {
            return;
          } else {
            ((db) this).field_h = e.field_f;
            return;
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 >= 81) {
          if (1 != ((db) this).field_c) {
            if (((db) this).field_h != 97) {
              if (((db) this).field_h != 84) {
                if (((db) this).field_h == 83) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final boolean e(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 7632) {
          L0: {
            var3 = null;
            String discarded$8 = db.a((String) null, -6);
            if (-98 != ((db) this).field_h) {
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
            if (-98 != ((db) this).field_h) {
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

    public static void d(int param0) {
        field_d = null;
        field_a = null;
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 106) {
          L0: {
            ((db) this).field_g = 90;
            if (-104 != ((db) this).field_h) {
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
            if (-104 != ((db) this).field_h) {
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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -116) {
          L0: {
            ((db) this).field_b = -116;
            if (0 == ((db) this).field_b) {
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
            if (0 == ((db) this).field_b) {
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

    final void a(boolean param0, int param1, int param2) {
        if (((db) this).field_i <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (((db) this).field_i <= param2) {
            throw new IllegalArgumentException();
          } else {
            ((db) this).field_h = 0;
            ((db) this).field_e = 0;
            ((db) this).field_c = 0;
            if (ta.field_o != 0) {
              L0: {
                ((db) this).field_b = ta.field_o;
                ((db) this).field_c = ta.field_o;
                ((db) this).field_e = ta.field_o;
                ((db) this).field_g = param2;
                ((db) this).field_f = cm.field_n;
                ((db) this).field_k = true;
                if (((db) this).field_b == 0) {
                  break L0;
                } else {
                  if (ul.field_d != 0) {
                    L1: {
                      if (((db) this).field_f <= 0) {
                        ((db) this).field_f = bp.field_d;
                        ((db) this).field_c = ((db) this).field_b;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((db) this).field_f = ((db) this).field_f - 1;
                    break L0;
                  } else {
                    if (ta.field_o == 0) {
                      L2: {
                        if (0 == ul.field_d) {
                          ((db) this).field_b = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0) {
                        if (0 == ((db) this).field_b) {
                          if (((db) this).field_k) {
                            L3: {
                              if (param1 < 0) {
                                if (((db) this).field_k) {
                                  ((db) this).field_g = -1;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              } else {
                                if (((db) this).field_g == param1) {
                                  ((db) this).field_g = param1;
                                  ((db) this).field_k = true;
                                  break L3;
                                } else {
                                  ((db) this).field_g = param1;
                                  ((db) this).field_k = true;
                                  break L3;
                                }
                              }
                            }
                            return;
                          } else {
                            L4: {
                              if (!he.field_a) {
                                break L4;
                              } else {
                                if (param1 < 0) {
                                  if (((db) this).field_k) {
                                    ((db) this).field_g = -1;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  if (((db) this).field_g == param1) {
                                    ((db) this).field_g = param1;
                                    ((db) this).field_k = true;
                                    break L4;
                                  } else {
                                    ((db) this).field_g = param1;
                                    ((db) this).field_k = true;
                                    break L4;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!param0) {
                        return;
                      } else {
                        L5: {
                          if (0 != ((db) this).field_b) {
                            break L5;
                          } else {
                            L6: {
                              if (((db) this).field_k) {
                                break L6;
                              } else {
                                if (!he.field_a) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if (param1 < 0) {
                              if (((db) this).field_k) {
                                ((db) this).field_g = -1;
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              if (((db) this).field_g == param1) {
                                ((db) this).field_g = param1;
                                ((db) this).field_k = true;
                                break L5;
                              } else {
                                ((db) this).field_g = param1;
                                ((db) this).field_k = true;
                                break L5;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              L7: {
                if (ta.field_o != 0) {
                  break L7;
                } else {
                  if (0 == ul.field_d) {
                    ((db) this).field_b = 0;
                    break L7;
                  } else {
                    if (param0) {
                      if (0 == ((db) this).field_b) {
                        L8: {
                          if (((db) this).field_k) {
                            break L8;
                          } else {
                            if (he.field_a) {
                              break L8;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (((db) this).field_k) {
                            ((db) this).field_g = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (((db) this).field_g == param1) {
                            ((db) this).field_g = param1;
                            ((db) this).field_k = true;
                            return;
                          } else {
                            ((db) this).field_g = param1;
                            ((db) this).field_k = true;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param0) {
                if (0 == ((db) this).field_b) {
                  L9: {
                    if (((db) this).field_k) {
                      if (param1 < 0) {
                        if (((db) this).field_k) {
                          ((db) this).field_g = -1;
                          break L9;
                        } else {
                          return;
                        }
                      } else {
                        if (((db) this).field_g == param1) {
                          ((db) this).field_g = param1;
                          ((db) this).field_k = true;
                          return;
                        } else {
                          ((db) this).field_g = param1;
                          ((db) this).field_k = true;
                          return;
                        }
                      }
                    } else {
                      if (!he.field_a) {
                        break L9;
                      } else {
                        if (param1 < 0) {
                          if (((db) this).field_k) {
                            ((db) this).field_g = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (((db) this).field_g == param1) {
                            ((db) this).field_g = param1;
                            ((db) this).field_k = true;
                            return;
                          } else {
                            ((db) this).field_g = param1;
                            ((db) this).field_k = true;
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
              } else {
                return;
              }
            } else {
              L10: {
                if (((db) this).field_b == 0) {
                  break L10;
                } else {
                  if (ul.field_d != 0) {
                    L11: {
                      if (((db) this).field_f <= 0) {
                        ((db) this).field_f = bp.field_d;
                        ((db) this).field_c = ((db) this).field_b;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((db) this).field_f = ((db) this).field_f - 1;
                    break L10;
                  } else {
                    L12: {
                      if (ta.field_o != 0) {
                        break L12;
                      } else {
                        if (0 == ul.field_d) {
                          ((db) this).field_b = 0;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (!param0) {
                      return;
                    } else {
                      L13: {
                        if (0 != ((db) this).field_b) {
                          break L13;
                        } else {
                          L14: {
                            if (((db) this).field_k) {
                              break L14;
                            } else {
                              if (!he.field_a) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (((db) this).field_k) {
                              ((db) this).field_g = -1;
                              break L13;
                            } else {
                              break L13;
                            }
                          } else {
                            if (((db) this).field_g == param1) {
                              ((db) this).field_g = param1;
                              ((db) this).field_k = true;
                              break L13;
                            } else {
                              ((db) this).field_g = param1;
                              ((db) this).field_k = true;
                              break L13;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L15: {
                if (ta.field_o != 0) {
                  break L15;
                } else {
                  if (0 == ul.field_d) {
                    ((db) this).field_b = 0;
                    break L15;
                  } else {
                    if (!param0) {
                      return;
                    } else {
                      L16: {
                        if (0 != ((db) this).field_b) {
                          break L16;
                        } else {
                          L17: {
                            if (((db) this).field_k) {
                              break L17;
                            } else {
                              if (!he.field_a) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (((db) this).field_k) {
                              ((db) this).field_g = -1;
                              break L16;
                            } else {
                              break L16;
                            }
                          } else {
                            if (((db) this).field_g == param1) {
                              ((db) this).field_g = param1;
                              ((db) this).field_k = true;
                              break L16;
                            } else {
                              ((db) this).field_g = param1;
                              ((db) this).field_k = true;
                              break L16;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0) {
                if (0 == ((db) this).field_b) {
                  if (((db) this).field_k) {
                    if (param1 < 0) {
                      if (!((db) this).field_k) {
                        return;
                      } else {
                        ((db) this).field_g = -1;
                        return;
                      }
                    } else {
                      if (((db) this).field_g == param1) {
                        ((db) this).field_g = param1;
                        ((db) this).field_k = true;
                        return;
                      } else {
                        ((db) this).field_g = param1;
                        ((db) this).field_k = true;
                        return;
                      }
                    }
                  } else {
                    if (he.field_a) {
                      L18: {
                        if (param1 < 0) {
                          if (((db) this).field_k) {
                            ((db) this).field_g = -1;
                            break L18;
                          } else {
                            break L18;
                          }
                        } else {
                          if (((db) this).field_g == param1) {
                            ((db) this).field_g = param1;
                            ((db) this).field_k = true;
                            break L18;
                          } else {
                            ((db) this).field_g = param1;
                            ((db) this).field_k = true;
                            break L18;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            if (param1 == 31108) {
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackOut_7_0 = new String(var3);
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var3[-var4 + -1 + var2_int] = param0.charAt(var4);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("db.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    final void a(int param0, byte param1, boolean param2, int param3) {
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
          var5 = -25 / ((param1 - -9) / 58);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
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
        ((db) this).field_k = stackIn_3_1 != 0;
        ((db) this).field_b = 0;
        if (((db) this).field_k) {
          ((db) this).field_g = param0;
          return;
        } else {
          ((db) this).field_g = param3;
          return;
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 31) {
          L0: {
            ((db) this).a(81);
            if (((db) this).field_h != 96) {
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
            if (((db) this).field_h != 96) {
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

    db(int param0) {
        ((db) this).field_k = false;
        ((db) this).field_g = 0;
        ((db) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading graphics";
    }
}
