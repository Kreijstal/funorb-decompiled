/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeDeque {
    static String[] stringArrayState0055;
    static ResourceArchive resourceArchiveState0025;
    static int[] integerArrayState0250;
    HashNode hashNodeState0009;
    private HashNode hashNodeState0010;

    final boolean computeBoolean1967(int integerArgument1) {
        if (integerArgument1 >= -1) {
          integerArrayState0250 = (int[]) null;
        }
        return this.hashNodeState0009.previous == this.hashNodeState0009 ? true : false;
    }

    final void performAction1971(int integerArgument1) {
        HashNode hashNodeLocal1;
        int integerLocal2;
        HashNode hashNodeLocal3;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 < 104) {
          hashNodeLocal3 = (HashNode) null;
          this.performAction1963((HashNode) null, 114);
        }
        while (true) {
          hashNodeLocal1 = this.hashNodeState0009.previous;
          if (this.hashNodeState0009 != hashNodeLocal1) {
            hashNodeLocal1.performAction0161((byte) 120);
            continue;
          }
          break;
        }
        this.hashNodeState0010 = null;
        return;
    }

    final HashNode computeHashNode1973(int integerArgument1) {
        if (integerArgument1 >= -23) {
          return (HashNode) null;
        }
        HashNode hashNodeLocal1 = this.hashNodeState0009.next;
        if (this.hashNodeState0009 == hashNodeLocal1) {
          return null;
        }
        hashNodeLocal1.performAction0161((byte) 115);
        return hashNodeLocal1;
    }

    final void performAction1962(int integerArgument1, HashNode hashNodeArgument2, NodeDeque nodeDequeArgument3) {
        HashNode hashNodeLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        try {
          hashNodeLocal1 = this.hashNodeState0009.next;
          this.hashNodeState0009.next = hashNodeArgument2.next;
          hashNodeArgument2.next.previous = this.hashNodeState0009;
          if (integerArgument1 > -95) {
            this.hashNodeState0010 = (HashNode) null;
          }
          if (hashNodeArgument2 != this.hashNodeState0009) {
            hashNodeArgument2.next = nodeDequeArgument3.hashNodeState0009.next;
            hashNodeArgument2.next.previous = hashNodeArgument2;
            hashNodeLocal1.previous = nodeDequeArgument3.hashNodeState0009;
            nodeDequeArgument3.hashNodeState0009.next = hashNodeLocal1;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal7 = caughtParameterLocal9;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal8;
          stackStringBuilderLocal3 = new StringBuilder().append("vj.M(").append(integerArgument1).append(',');
          if (hashNodeArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (nodeDequeArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final HashNode computeHashNode1961(int integerArgument1, HashNode hashNodeArgument2) {
        HashNode hashNodeLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        Object stackObjectLocal3 = null;
        HashNode stackHashNodeLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument1 <= 1) {
            this.computeBoolean1967(-55);
          }
          if (hashNodeArgument2 != null) {
            hashNodeLocal1 = hashNodeArgument2;
          } else {
            hashNodeLocal1 = this.hashNodeState0009.previous;
          }
          if (this.hashNodeState0009 != hashNodeLocal1) {
            this.hashNodeState0010 = hashNodeLocal1.previous;
            stackHashNodeLocal4 = hashNodeLocal1;
            return stackHashNodeLocal4;
          }
          this.hashNodeState0010 = null;
          stackObjectLocal3 = null;
          return (HashNode) (stackObjectLocal3);
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("vj.I(").append(integerArgument1).append(',');
          if (hashNodeArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final static void performAction1965(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RgbSprite rgbSpriteLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        int integerLocal6;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          CollectionSupport001.mixedSupport059State0001.performAction0422(-30693);
          for (integerLocal1 = 0; integerLocal1 < 32; integerLocal1++) {
            MixedSupport120.longArrayState0009[integerLocal1] = 0L;
          }
          for (integerLocal6 = 0; integerLocal6 < 32; integerLocal6++) {
            SceneWidgetPart006.longArrayState0003[integerLocal6] = 0L;
          }
          MixedSupport149.integerState0883 = 0;
          if (!booleanArgument1) {
            rgbSpriteLocal3 = (RgbSprite) null;
            NodeDeque.computeRgbSpriteArray1964((RgbSprite) null, -91);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal4 = caughtParameterLocal7;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal5), "vj.H(" + booleanArgument1 + ')');
        }
    }

    final HashNode computeHashNode1972(boolean booleanArgument1) {
        if (!booleanArgument1) {
          integerArrayState0250 = (int[]) null;
        }
        HashNode hashNodeLocal1 = this.hashNodeState0010;
        if (hashNodeLocal1 == this.hashNodeState0009) {
          this.hashNodeState0010 = null;
          return null;
        }
        this.hashNodeState0010 = hashNodeLocal1.next;
        return hashNodeLocal1;
    }

    public static void performAction1966(byte byteArgument1) {
        if (byteArgument1 != 79) {
          return;
        }
        stringArrayState0055 = null;
        resourceArchiveState0025 = null;
        integerArrayState0250 = null;
    }

    final static RgbSprite[] computeRgbSpriteArray1964(RgbSprite rgbSpriteArgument1, int integerArgument2) {
        RgbSprite[] rgbSpriteArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        RgbSprite[] rgbSpriteArrayLocal3 = null;
        RgbSprite[] stackRgbSpriteArrayLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument2 != 32169) {
            NodeDeque.computeMixedSupport111Array1975(-16);
          }
          rgbSpriteArrayLocal3 = new RgbSprite[9];
          rgbSpriteArrayLocal1 = rgbSpriteArrayLocal3;
          rgbSpriteArrayLocal3[4] = rgbSpriteArgument1;
          stackRgbSpriteArrayLocal4 = rgbSpriteArrayLocal1;
          return stackRgbSpriteArrayLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("vj.A(");
          if (rgbSpriteArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final HashNode computeHashNode1970(byte byteArgument1) {
        int integerLocal1 = -55 / ((byteArgument1 + 17) / 35);
        HashNode hashNodeLocal2 = this.hashNodeState0009.previous;
        if (hashNodeLocal2 == this.hashNodeState0009) {
          this.hashNodeState0010 = null;
          return null;
        }
        this.hashNodeState0010 = hashNodeLocal2.previous;
        return hashNodeLocal2;
    }

    final void performAction1963(HashNode hashNodeArgument1, int integerArgument2) {
        if (hashNodeArgument1.next != null) {
          hashNodeArgument1.performAction0161((byte) 124);
        }
        hashNodeArgument1.previous = this.hashNodeState0009;
        hashNodeArgument1.next = this.hashNodeState0009.next;
        if (integerArgument2 != 2777) {
          return;
        }
        try {
          hashNodeArgument1.next.previous = hashNodeArgument1;
          hashNodeArgument1.previous.next = hashNodeArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "vj.B(" + (hashNodeArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final HashNode computeHashNode1974(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return (HashNode) null;
        }
        HashNode hashNodeLocal1 = this.hashNodeState0010;
        if (hashNodeLocal1 == this.hashNodeState0009) {
          this.hashNodeState0010 = null;
          return null;
        }
        this.hashNodeState0010 = hashNodeLocal1.previous;
        return hashNodeLocal1;
    }

    final HashNode computeHashNode1969(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return (HashNode) null;
        }
        HashNode hashNodeLocal1 = this.hashNodeState0009.next;
        if (this.hashNodeState0009 == hashNodeLocal1) {
          this.hashNodeState0010 = null;
          return null;
        }
        this.hashNodeState0010 = hashNodeLocal1.next;
        return hashNodeLocal1;
    }

    final void performAction1968(HashNode hashNodeArgument1, int integerArgument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (hashNodeArgument1.next != null) {
            hashNodeArgument1.performAction0161((byte) 115);
          }
          hashNodeArgument1.previous = this.hashNodeState0009.previous;
          hashNodeArgument1.next = this.hashNodeState0009;
          hashNodeArgument1.next.previous = hashNodeArgument1;
          hashNodeArgument1.previous.next = hashNodeArgument1;
          if (integerArgument2 != 7143) {
            this.computeHashNode1974(false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("vj.E(");
          if (hashNodeArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final HashNode computeHashNode1960(int integerArgument1) {
        HashNode hashNodeLocal1 = this.hashNodeState0009.previous;
        if (this.hashNodeState0009 == hashNodeLocal1) {
          return null;
        }
        hashNodeLocal1.performAction0161((byte) 108);
        if (integerArgument1 != 4) {
          return (HashNode) null;
        }
        return hashNodeLocal1;
    }

    final int computeInteger1959(byte byteArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal2 = 0;
        int integerLocal3 = 60 % ((byteArgument1 - 13) / 50);
        HashNode hashNodeLocal4 = this.hashNodeState0009.previous;
        while (this.hashNodeState0009 != hashNodeLocal4) {
          integerLocal2++;
          hashNodeLocal4 = hashNodeLocal4.previous;
        }
        return integerLocal2;
    }

    public NodeDeque() {
        this.hashNodeState0009 = new HashNode();
        this.hashNodeState0009.next = this.hashNodeState0009;
        this.hashNodeState0009.previous = this.hashNodeState0009;
    }

    final static MixedSupport111[] computeMixedSupport111Array1975(int integerArgument1) {
        if (integerArgument1 != -23521) {
          NodeDeque.performAction1965(false);
        }
        return new MixedSupport111[]{MixedSupport091.mixedSupport111State0005, MixedSupport124.mixedSupport111State0011, MixedSupport059.mixedSupport111State0004, MixedSupport047.mixedSupport111State0002, MixedSupport138.mixedSupport111State0012, ReturnedShapeCache.mixedSupport111State0007, CollectionSupport003.mixedSupport111State0006, GameplayControls.mixedSupport111State0013, MixedSupport114.mixedSupport111State0010, MouseInput.mixedSupport111State0014, UiComponentPart006.mixedSupport111State0001, MixedSupport111.mixedSupport111State0008, ReturnedShape.mixedSupport111State0009, MixedSupport048.mixedSupport111State0003};
    }

    static {
        integerArrayState0250 = new int[8192];
    }
}
