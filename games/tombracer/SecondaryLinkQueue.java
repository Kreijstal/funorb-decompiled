/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SecondaryLinkQueue {
    static String field_c;
    private DualLinkNode sentinel;
    static String[] worldNames;
    static int[] field_a;
    private DualLinkNode cursor;

    final void addFirst(int param0, DualLinkNode param1) {
        try {
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary(-7975);
          }
          int var3_int = 69 % ((6 - param0) / 57);
          param1.secondaryPrevious = this.sentinel;
          param1.secondaryNext = this.sentinel.secondaryNext;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int size(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        DualLinkNode var3 = this.sentinel.secondaryNext;
        while (this.sentinel != var3) {
          var2++;
          var3 = var3.secondaryNext;
        }
        if (param0 < -23) {
          return var2;
        }
        this.sentinel = (DualLinkNode) null;
        return var2;
    }

    final DualLinkNode first(byte param0) {
        if (param0 != 38) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.secondaryNext;
        return var2;
    }

    final DualLinkNode removeFirst(byte param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 <= 110) {
          worldNames = (String[]) null;
          var2 = this.sentinel.secondaryNext;
          if (this.sentinel != var2) {
            var2.unlinkSecondary(-7975);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.secondaryNext;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlinkSecondary(-7975);
          return var2Lifetime1;
        }
        return null;
    }

    final DualLinkNode removeLast(int param0) {
        DualLinkNode var2 = this.sentinel.secondaryPrevious;
        if (this.sentinel == var2) {
          return null;
        }
        if (param0 <= -111) {
          var2.unlinkSecondary(-7975);
          return var2;
        }
        field_a = (int[]) null;
        var2.unlinkSecondary(-7975);
        return var2;
    }

    final void addLast(DualLinkNode param0, byte param1) {
        try {
          if (param0.secondaryPrevious != null) {
            param0.unlinkSecondary(-7975);
          }
          param0.secondaryNext = this.sentinel;
          param0.secondaryPrevious = this.sentinel.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          if (param1 >= -74) {
            DualLinkNode var4 = (DualLinkNode) null;
            this.addFirst(116, (DualLinkNode) null);
          }
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] readFileBytes(File param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -85) {
            field_c = (String) null;
          }
          stackIn_3_0 = gja.readFileBytes((int)param0.length(), param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 >= -69) {
            SecondaryLinkQueue.releaseStatics(10);
          }
          OpenGlBuffer.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 < -1) {
          worldNames = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        SecondaryLinkQueue.a((String) null, 47);
        worldNames = null;
        field_a = null;
    }

    public SecondaryLinkQueue() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    final DualLinkNode next(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 28) {
          SecondaryLinkQueue.releaseStatics(76);
          var2 = this.cursor;
          if (this.sentinel == var2) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.secondaryNext;
          return var2;
        }
        var2Lifetime1 = this.cursor;
        if (this.sentinel == var2Lifetime1) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.secondaryNext;
        return var2Lifetime1;
    }

    static {
        field_c = "Report <%0> for abuse";
        field_a = new int[]{0, 28};
        worldNames = new String[]{"Ziggurat of Zest", "Serpent's Sepulchre", "Abyss of Peril", "Brimstone Catacomb", "Path of Penitence", "Common Pyramid", "Cadaver Caves", "Beacon of Beams", "Crypt of Conclusion"};
    }
}
